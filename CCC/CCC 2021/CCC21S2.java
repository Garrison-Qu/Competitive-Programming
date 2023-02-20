//10/15
import java.io.*;

public class CCC21S2 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int y = (int) st.nval;
        st.nextToken();
        int x = (int) st.nval;
        boolean[] [] b = new boolean [x+1] [y+1];
        for (int i = 1; i < x+1; i++) {
            for (int j = 1; j < y+1; j++) {
                b [i] [j] = true;
            }
        }

        st.nextToken();
        int k = (int) st.nval;
        String[] c = new String[k+1];
        int[] l = new int[k+1];
        for (int i = 1; i < k+1; i++) {
            st.nextToken();
            c[i] = st.sval;
            st.nextToken();
            l[i] = (int) st.nval;
        }

        for (int i = 1; i < k+1; i++) {
            if (c[i].charAt(0) == 'C') {
                for (int j = 1; j < y+1; j++) {
                    b [l[i]] [j] = !b [l[i]] [j];
                }
            }
            if (c[i].charAt(0) == 'R') {
                for (int j = 1; j < x+1; j++) {
                    b [j] [l[i]] = !b [j] [l[i]];
                }
            }
        }

        int counter = 0;
        for (int i = 1; i < x+1; i++) {
            for (int j = 1; j < y+1; j++) {
                if (b [i] [j] == false) {
                    counter++;
                }
            }
        }
        
        
        System.out.println(counter);
    }
}