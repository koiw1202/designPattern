package 옵저버패턴;

public class Main {

    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();

        구독자 kim = new 구독자("김성훈");
        구독자 lee = new 구독자("이순신");

        channel.subscribe(kim);
        channel.subscribe(lee);

        channel.uploadVideo("Spring Boot 강의");
    }


}
