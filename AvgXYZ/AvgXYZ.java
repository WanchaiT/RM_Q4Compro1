import java.util.Scanner;
public class AvgXYZ{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dataNum = new int[scan.nextInt()];

        for (int i = 0;i < dataNum.length ; i++){
            dataNum[i] = scan.nextInt();
        }
        int x = scan.nextInt() ;int y = scan.nextInt();
        double sum = 0.0;
        int count = 0;

        for (int i = 0;i < dataNum.length ;i++ ) {
            if (dataNum[i] >= x && dataNum[i] <= y) {
                sum += dataNum[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("none");
        }else{
            System.out.println(count);
            System.out.printf("%.2f",sum / count );
        }
    }
}
