package 프록시패턴;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-06-30        koiw1       최초 생성
 */
class TransactionProxy implements UserService {

    private final UserService target;

    public TransactionProxy(UserService target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("트랜잭션 시작");

        try {
            target.save();

            System.out.println("트랜잭션 커밋");
        } catch (RuntimeException e) {
            System.out.println("트랜잭션 롤백");
            throw e;
        }
    }
}
