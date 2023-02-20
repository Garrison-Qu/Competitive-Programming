import java.io.*;

public class CCC17S2 {
    static int[] N = new int [100];
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int input = (int) st.nval;
        

        for (int i = 0; i < input; i++) {
            st.nextToken();
            N [i] = (int) st.nval;
        }

        for (int i = 1; i <= input; i++) {
            while (N [i-1] >= N[i]){
                for (int j = 1; j <= input; j++) {
                    if (N[j-1] >= N[j]) {
                        swap(j-1,j);
                    }
                }
            }
        }

        if (input % 2 == 0) {
            for (int i = 0; i < input/2; i++) {
                System.out.print(N[i] + " " + N[input-i-1] + " ");
            }
        } else {
            for (int i = 0; i < input/2; i++) {
                System.out.print(N[i] + " " + N[input-i-1] + " ");
            }
            System.out.println(N[1+ (int) input/2]);
        }
    }
    
    public static void swap (int prev, int lat) {
        int alt;
        alt = N[prev];
        N[prev] = N [lat];
        N [lat] = alt;
    }
}
