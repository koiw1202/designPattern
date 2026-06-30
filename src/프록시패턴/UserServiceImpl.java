package 프록시패턴;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-06-30        koiw1       최초 생성
 */
class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("User 저장 비즈니스 로직 실행");
    }
}
