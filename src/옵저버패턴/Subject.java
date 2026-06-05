package 옵저버패턴;

import java.util.Observer;

public interface Subject {
    void subscribe(옵저버 observer);

    void unsubscribe(옵저버 observer);

    void notifyObservers(String videoTitle);

}
