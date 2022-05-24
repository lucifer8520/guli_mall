import org.junit.Test;

/**
 * @author: James Yan
 * @create: 2022-05-24
 */
public class Test01 {
    @Test
    public void test() {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
