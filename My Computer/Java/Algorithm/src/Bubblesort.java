import java.util.Arrays;

public class Bubblesort {

    public  static void bubblesort(int[] array){
        int n= array.length,temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(array[j-1]>array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }

            }
        }
    }

    public static void main(String[] args){
        int [] array={1,2,3,4,5,1};

//        char[] sms={'s','a','s','a','r'};
//        System.out.println(sms);
//        Arrays.sort(sms);
//        System.out.println(sms);

        System.out.println("Before Bubble Sort..");
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("After Bubble Sort..");
        bubblesort(array);
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
