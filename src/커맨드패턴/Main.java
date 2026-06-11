package 커맨드패턴;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, Runnable> commandMap = new HashMap<>();


    public static void main(String[] args) {
        commandMap.put("CREATE", () -> {
            System.out.println("회원 생성");
        });

        commandMap.put("DELETE", () -> {
            System.out.println("회원 삭제");
        });

        commandMap.put("UPDATE", () -> {
            System.out.println("회원 수정");
        });

        String command = "CREATE";

        if("CREATE".equals(command)) {
            System.out.println("회원 생성");
        } else if("DELETE".equals(command)) {
            System.out.println("회원 삭제");
        } else if("UPDATE".equals(command)) {
            System.out.println("회원 수정");
        }

        command = "DELETE";

        /**
         * 위에 소스처럼 if else if 덕지덕지 붙여쓰는 소스보다 아래 소스가 더 깔끔하고 유지보수에 좋다.
         */
        commandMap.get(command).run();


    }
}
