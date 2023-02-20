import java.io.*;

public class CowCollege {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        int[] tuition = new int[N];
        int max = -5;
        for (int i = 0; i < N; i++) {
            st.nextToken();
            tuition[i] = (int) st.nval;
            if (tuition[i] > max) {
                max = tuition[i];
            }
        }
        int prev = -1;
        int counter = 0;
        for (int charged = max; charged >= 0; charged--) {
            counter = 0;
            for (int j = 0; j < N; j++) {
                if (tuition[j] >= charged) {
                    counter++;
                }
            }
            if (counter * charged <= prev) {
                System.out.println(prev + " " + (charged-1));
                break;
            }
            prev = counter * charged;
        }
    }
}