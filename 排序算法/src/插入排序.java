import org.junit.Test;

/**
 * @author zhumengdi E-mail:montyzhu7@163.com
 * @version created：2018/1/17 下午4:44
 */
public class 插入排序 extends 排序 {

    /**
     * O(n2)
     */
    @Test
    public void 直接插入排序() {
        for (int i = 1; i < size; i++) {
            // 需要排序的x
            final int x = after_queue[i];
            // 是否要进入排序
            if (x < after_queue[i - 1]) {
                int j = i - 1;
                while (j > -1 && x < after_queue[j]) {
                    after_queue[j + 1] = after_queue[j];
                    j--;
                }
                after_queue[j + 1] = x;
            }
        }


    }

    @Test
    public void 直接插入排序_递归() {

        直接插入排序_递归实现(after_queue.length - 1);
    }


    private int[] 直接插入排序_递归实现(int i) {
        if (i == 0) {
            return after_queue;
        }
        直接插入排序_递归实现(i - 1);

        final int x = after_queue[i];

        int j = i - 1;

        while (j > -1 && x < after_queue[j]) {
            after_queue[j + 1] = after_queue[j];
            j--;
        }
        after_queue[j + 1] = x;
        return after_queue;
    }


    /**
     * O (1.5)
     *
     * 希尔排序（增量缩减排序）
     */
    @Test
    public void 希尔排序() {

        for (int dk = size / 2; dk >= 1; dk /= 2) {

            for (int i = dk; i < size; i++) {
                int j = i - dk;
                int x = after_queue[i];
                while (j >= 0 && x < after_queue[j]) {

                    after_queue[j + dk] = after_queue[j];
                    j -= dk;
                }
                after_queue[j + dk] = x;
            }

        }

    }


}
