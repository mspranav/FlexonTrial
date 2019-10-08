import java.util.Arrays;
import java.util.Collections;

public class ArrayMethods {



    public void ascendingsort(int[] numbers){
        int[] arr  = new int[numbers.length];
        arr = numbers.clone();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public void descendingsort(int[] numbers){
        int[] arr  = new int[numbers.length];
        int j = numbers.length - 1;
        Arrays.sort(numbers);
        for(int i = 0 ; i < numbers.length ; i++){
            arr[i] = numbers[j];
            j-=1;
        }
        System.out.println(Arrays.toString(arr));


        
    }

    public void getMaximum(int[] numbers) {
        int[] arr  = new int[numbers.length];
        arr = numbers.clone();
        Arrays.sort(arr);

        System.out.println(arr[numbers.length - 1]);
    }

    public void getMinimum(int[] numbers) {
        int[] arr  = new int[numbers.length];
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

    public void getArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public void getreverse(int[] numbers) {
        int[] arr  = new int[numbers.length];
        int j = numbers.length - 1;
        for(int i = 0 ; i < numbers.length ; i++){
            arr[i] = numbers[j];
            j-=1;
        }
        System.out.println(Arrays.toString(arr));

    }
}
