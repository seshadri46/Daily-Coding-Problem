import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solutions {

    public static Integer firstMissingPositiveInteger(int[] arr) {
        for(int i=0;i<arr.length;)
        {
            if(arr[i]<0||arr[i]>arr.length||arr[i]-1==i)
            {
                i++;
            }
            else
            {
                swap(arr,i,arr[i]-1);
            }
        }
        for (int i = 0; i < arr.length; i++)
            if (arr[i] - 1 != i)
                return i + 1;

        return -1;
    }



    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositiveInteger(new int[] {40,1,4,5,6,7,3,2,9 }));

    }
}