import java.util.*;
class vote{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int applicant[] = new int[scan.nextInt()];
        int numVoter = scan.nextInt();

        for (int i = 0;i < applicant.length ;i++ ) {
            applicant[i] = 0;
        }
        int applicantMax = 0 ,scoreMax = 0;

        for (int i = 0;i < numVoter ;i++ ) {
            applicant[scan.nextInt() - 1]++;
        }
        scoreMax = applicant[0];

        for (int i = 1;i < applicant.length ;i++ ) {
            if (scoreMax < applicant[i]) {
                applicantMax = i;
                scoreMax = applicant[i];
            }
        }
        System.out.println(applicantMax + 1);
        System.out.println(scoreMax);
    }
}
