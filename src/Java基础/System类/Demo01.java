package Java基础.System类;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    private static void demo02() {
        int[] src ={1,2,3,4,5};
        int[] dest={6,7,8,9,10};
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));



    }

    private static void demo01() {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }

}

