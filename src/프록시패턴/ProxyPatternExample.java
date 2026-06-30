package 프록시패턴;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-06-30        koiw1       최초 생성
 */
public class ProxyPatternExample {

    public static void maㄴin(String[] args) {
        System.out.println("=== 1. 원본 객체 직접 호출 ===");

        UserService realService = new UserServiceImpl();
        realService.save();

        System.out.println();

        System.out.println("=== 2. 프록시 객체를 통한 호출 ===");

        UserService proxyService = new TransactionProxy(new UserServiceImpl());
        proxyService.save();
    }
}
