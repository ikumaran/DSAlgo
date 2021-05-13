import java.util.Arrays;

public class Execute {

    /**
     * 100              <-
     * /       \
     * 50           500     <-
     * /       \
     * 10       75                <-
     * /
     * 60                     <-
     *
     * @param args
     */
    public static void main(String[] args) {
        Lynk.Node node500 = new Lynk.Node(500, null, null);
        Lynk.Node node10 = new Lynk.Node(10, null, null);
        Lynk.Node node60 = new Lynk.Node(60, null, null);
        Lynk.Node node75 = new Lynk.Node(75, node60, null);
        Lynk.Node node50 = new Lynk.Node(50, node10, node75);
        Lynk.Node node100 = new Lynk.Node(100, node50, node500);

        int[] levels = new int[4];
        Arrays.fill(levels, -1);

        Lynk mylynk = new Lynk();
        mylynk.head = node100;
        // head print
        levels[0] = mylynk.head.value;
        // proces right
        print(mylynk.head.right, 1, levels);
        print(mylynk.head.left, 1, levels);
//        // process left
//        print(mylynk.head.left, 1, levels);
        System.out.println(Arrays.asList(levels));
    }

    private static void print(Lynk.Node node, int level, int[] levels) {
        if (node != null) {
            if (levels[level] == -1) {
                levels[level] = node.value;
            }
            print(node.right, level + 1, levels);
            print(node.left, level + 1, levels);
        }
    }
}
