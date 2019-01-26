import java.util.Scanner;
class RockPapScis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a == b) {
            System.out.println("0");
        }else if (a == 1 && b == 3) {
            System.out.println("1");
        }else if (a == 3 && b == 1) {
            System.out.println("2");
        }else if (a > b) {
            System.out.println("1");
        }else {
            System.out.println("2");
        }
    }
}
