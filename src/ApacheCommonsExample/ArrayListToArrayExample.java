package ApacheCommonsExample;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrayExample {

    public static void main(String[] args) {

        ArrayList<Integer> aListNumbers = new ArrayList<>();
        aListNumbers.add(new Integer(1));
        aListNumbers.add(new Integer(2));
        aListNumbers.add(new Integer(3));

        int[] intArray = ArrayUtils.toPrimitive(
                aListNumbers.toArray(new Integer[aListNumbers.size()])
        );

        System.out.println("ArrayList of Integer to int Array: " + Arrays.toString(intArray));
    }

}