import java.util.Scanner;
import java.util.ArrayList;

class KeepNewNumberOnly{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        //int[] arrNum = new int[Integer.MAX_VALUE];
        int countAll = 0;
        int countHave = 0;
        int numInput;

        while ((numInput = scan.nextInt()) > 0) {
            if (arrList.indexOf(numInput) == -1) {
                arrList.add(numInput);
                countHave++;
            }
            countAll++;
        }
        System.out.println(countAll);
        System.out.println(countHave);

        for (int data :arrList ) {
            System.out.print(data + " ");
        }
    }
}
