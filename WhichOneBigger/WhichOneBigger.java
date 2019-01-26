import java.util.*;
class WhichOneBigger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] data = new int[num];

        for (int i = 0;i < num ;i++ ) {
            data[i] = scan.nextInt();
        }

        int tar = scan.nextInt();
        int more = 0;
        int less = 0;

        for (int i  = 0;i < num ;i++ ) {
            if (data[i] > tar) {
                more += data[i];
            }else {
                less += data[i];
            }
        }

        if (more > less) {
            System.out.println(more);
        }else if (more < less) {
            System.out.println(less);
        }else{
            System.out.println(more);
        }
    }
}
