import java.util.Scanner;
class array_zone{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        int midRow = row/2 ,midCol = col/2;

        int sum1 = 0,sum2 = 0,sum3 = 0,sum4 = 0;
        //int[][] myArray = new int[row][col];

        for (int i = 0;i < row ;i++ ) {
            for (int j = 0;j < col ;j++ ) {
                int x = scan.nextInt();
                if (i < midRow && j < midCol) {
                    sum1 += x;
                }else if (i < midRow && j >= midCol) {
                    sum2 += x;
                }else if (i >= midRow && j < midCol) {
                    sum3 += x;
                }else {
                    sum4 += x;
                }
            }
        }
        System.out.println("\n"+sum1 + " " + sum2);
        System.out.println(sum3 + " " + sum4);
    }
}
