package 옵저버패턴;

public class 구독자 implements 옵저버 {

    private String name;

    public 구독자(String name) {
        this.name = name;
    }


    @Override
    public void update(String videoTitle) {
        System.out.println("name" + "님이 알림을 받았습니다.");
        System.out.println("새 영상 : " + videoTitle);
    }
}
