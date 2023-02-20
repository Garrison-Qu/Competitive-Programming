//15/15

import java.io.*;
import java.util.Scanner;

public class CCC18J2 {
    public static void main (String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        String a = st.sval;
        st.nextToken();
        String b = st.sval;*/

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        int counter = 0;

        for (int i = 0; i < N; i++) {
            if (a.charAt(i) == 'C' && b.charAt(i) == 'C') {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
