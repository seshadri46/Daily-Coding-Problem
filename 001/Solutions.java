import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solutions {

    public static Boolean findTwoSum(List<Integer> list, Integer k) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(list);
        for (Integer value : list) {
            if (hashSet.contains(k - value)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 15, 3, 7));
        Integer k = 17;
        System.out.println(findTwoSum(list, k));

    }
}