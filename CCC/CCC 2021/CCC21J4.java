//unsolved

import java.io.*;

public class CCC21J4 {
    static int counter = 0;
    static String N = "";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        N = st.sval;
        search();
        System.out.println(counter);
    }

    public static void swap(String N, int prev, int lat) {
        N = N.substring(0, prev - 1) + N.charAt(lat) + N.charAt(prev) + N.substring(lat);
    }

    public static void search() {
        int crt = 0;
        for (int i = 1; i < N.length(); i++) {
            if (N.charAt(i - 1) == 'M' && N.charAt(i) == 'L') {
                swap(N, i - 1, i);
                counter++;
            }

            if (N.charAt(i - 1) == 'S' && N.charAt(i) == 'L') {
                System.out.println("111");
                swap(N, i - 1, i);
                counter++;
            }

            if (N.charAt(i - 1) == 'S' && N.charAt(i) == 'M') {
                swap(N, i - 1, i);
                counter++;
            }

            for (int j = 1; j < N.length(); j++) {
                if (N.charAt(j - 1) == 'L' && N.charAt(j) == 'M') {
                    crt++;
                    break;
                } else if (N.charAt(j - 1) == 'L' && N.charAt(j) == 'S') {
                    crt++;
                    break;
                } else if (N.charAt(j - 1) == 'M' && N.charAt(j) == 'S') {
                    crt++;
                    break;
                }
            }
            if (crt >= 1) {
                search();
            }
        }
    }
}
