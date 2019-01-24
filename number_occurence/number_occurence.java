import java.util.Scanner;
class number_occurence{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] dataNum = new int[num];

        for (int i = 0;i < num ;i++ ) {
            dataNum[i] = scan.nextInt();
        }
        int target = scan.nextInt();

        for (int i = 0;i < num ;i++ ) {
            if (dataNum[i] == target) {
                System.out.println(i+1);
            }
        }
    }
}
