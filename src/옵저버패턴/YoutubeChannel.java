package 옵저버패턴;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class YoutubeChannel implements Subject {

    private List<옵저버> observers = new ArrayList<>();

    @Override
    public void subscribe(옵저버 observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(옵저버 observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {

        for (옵저버 observer : observers) {
            observer.update(videoTitle);
        }
    }

    public void uploadVideo(String title) {

        System.out.println("영상 업로드 : " + title);

        notifyObservers(title);
    }
}