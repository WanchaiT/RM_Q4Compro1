import java.util.Scanner;
class countClosestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] data = new int[n];
        int closeDistance = Integer.MAX_VALUE;
        int countNear = 0;

        for (int i = 0;i < n ;i++ ) {
            data[i] = scan.nextInt();
        }
        int tar = scan.nextInt();

        for (int i = 0;i < n ;i++ ) {
            int distance = tar - data[i];

            if (distance < 0) {
                distance *= -1;
            }

            if (distance < closeDistance) {
                closeDistance = distance;
            }
        }

        for (int i = 0;i < n ;i++ ) {
            int distance = tar - data[i];

            if (distance < 0) {
                distance *= -1;
            }

            if (distance == closeDistance) {
                countNear++;
            }

        }

        System.out.println(closeDistance);
        System.out.println(countNear);
    }
}
