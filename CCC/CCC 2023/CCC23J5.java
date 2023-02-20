import java.io.*;

public class CCC23J5 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(br);
    public static void main (String[] args) throws IOException {
        

        st.nextToken();
        String target = st.sval;
        st.nextToken();
        int y = (int) st.nval;
        st.nextToken();
        int x = (int) st.nval;
        char [] [] c = new char[x] [y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                st.nextToken();
                c [i] [j] = readCharacter();
            }
        }
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}
