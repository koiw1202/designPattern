package 플라이웨이트패턴;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-06-14        koiw1       최초 생성
 */
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> cache = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + ":" + color + ":" + texture;

        // 이미 같은 TreeType이 있으면 새로 만들지 않고 재사용
        if (!cache.containsKey(key)) {
            cache.put(key, new TreeType(name, color, texture));
        }

        return cache.get(key);
    }
}
