package 플라이웨이트패턴;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-06-14        koiw1       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree(10, 20,
                TreeFactory.getTreeType("소나무", "초록색", "pine.png"));

        Tree tree2 = new Tree(30, 40,
                TreeFactory.getTreeType("소나무", "초록색", "pine.png"));

        Tree tree3 = new Tree(50, 60,
                TreeFactory.getTreeType("벚나무", "분홍색", "cherry.png"));

        tree1.draw();
        tree2.draw();
        tree3.draw();
    }
}