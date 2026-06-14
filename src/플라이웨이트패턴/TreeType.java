package 플라이웨이트패턴;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-06-14        koiw1       최초 생성
 */
public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    // x, y는 객체 내부에 저장하지 않고 외부에서 받음
    public void draw(int x, int y) {
        System.out.println(
                name + " / " + color + " / " + texture + " at " + x + ", " + y
        );
    }
}
