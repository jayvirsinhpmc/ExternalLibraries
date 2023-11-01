package ApacheCommonsExample;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;

public class ArrayToArrayListExample {

        public static void main(String[] args) {

            Integer[] array = new Integer[]{1, 2, 3};

            ArrayList<Integer> aList = new ArrayList<>();

            CollectionUtils.addAll(aList, array);

            System.out.println("ArrayList contains:" + aList);
    }
}
