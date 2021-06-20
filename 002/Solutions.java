import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solutions {

    public static Integer[] productArray(List<Integer> list) {
        Integer[] integers=new Integer[list.size()];
        Integer product=1;
        for (Integer value : list) {
            product=product*value;

        }
        for(int i=0;i<list.size();i++)
        {
          integers[i]=product/list.get(i);
        }

        return integers;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(Arrays.toString(productArray(list)));

    }
}