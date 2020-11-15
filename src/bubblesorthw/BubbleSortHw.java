package bubblesorthw;
import java.util.Scanner;
public class BubbleSortHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tempStorage =0;
        int sum = 0;
        System.out.println("Choose 10 numbers to be sorted.\n[Press \"ENTER\" after each number]");
        int[] toBeSorted = new int[10];
        for (int i = 0; i < 10; i++) {
            toBeSorted[i] = input.nextInt();
        }
        int loop = 0;
        while (loop < 45){
        for (int j = 0; j < 9; j++) {
            if (toBeSorted[j]>toBeSorted[j+1]) {
                tempStorage = toBeSorted[j+1];
                toBeSorted[j+1] = toBeSorted[j];
                toBeSorted[j] = tempStorage;
                        
                
            }
            
        }
        loop = loop +1;
    }
        for (int i = 0; i < 10; i++) {
            System.out.print(toBeSorted[i]+",");
            sum = sum + toBeSorted[i];
        }
        System.out.println("");
        int average = sum/10;
        System.out.println("The average is : "+average);
        System.out.println("The minimum is : "+toBeSorted[0]);
        System.out.println("The maximum is : "+toBeSorted[9]);
}
}