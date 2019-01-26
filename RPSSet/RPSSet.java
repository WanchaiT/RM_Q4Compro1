import java.util.Scanner;
class RPSSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int countA = 0;
        int countB = 0;

        int[] dataA = new int[n];
        int[] dataB = new int[n];

        for (int i = 0;i < n ;i++ ) {
            dataA[i] = scan.nextInt();
        }

        for (int i = 0;i < n ;i++ ) {
            int b = scan.nextInt();

            if (dataA[i] == 1 && b == 3) {
                countA++;
            }else if (dataA[i] == 3 && b == 1) {
                countB++;
            }else if (dataA[i] > b) {
                countA++;
            }else if (dataA[i] < b){
                countB++;
            }
        }
        System.out.println(countA + " " + countB);

        if (countA > countB) {
            System.out.println("1");
        }else if (countA < countB) {
            System.out.println("2");
        }else {
            System.out.println("0");
        }
    }
}
