package ApacheCommonsExample;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayIndexOfExample {

    public static void main(String[] args) {

        int[] iArray = new int[]{1, 2, 3, 4, 5};
        System.out.println("int array indexof 2: " + ArrayUtils.indexOf(iArray, 4));
        System.out.println("int array indexof 11: " + ArrayUtils.indexOf(iArray, 11));
    }
}