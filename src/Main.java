import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListNew = new ArrayList<>();
        Collections.sort(intList);
        for (int x : intList) {
            if (x > 0 & x % 2 == 0) {
                Collections.sort(intList);
                System.out.println(x);
            }
        }
    }
}
