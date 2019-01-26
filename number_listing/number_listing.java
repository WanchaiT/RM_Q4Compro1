import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class number_listing{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        //int[] arrNum = new int[Integer.MAX_VALUE];
        int n = scan.nextInt();
        int numInput;

        for (int i = 0;i < n ;i++ ) {
            numInput = scan.nextInt();
            if (arrList.indexOf(numInput) == -1) {
                arrList.add(numInput);
            }
        }

        Collections.sort(arrList);
        for (int data :arrList ) {
            System.out.print(data + " ");
        }
    }
}
