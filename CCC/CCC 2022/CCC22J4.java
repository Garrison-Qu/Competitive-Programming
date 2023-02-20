import java.util.*;

public class CCC22J4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.next());
        String[] X = new String[2 * x];
        for (int i = 0; i < x; i++) {
            String str = in.nextLine();
            String[] arr = str.split(" ");
            X[i*2] = arr[0];
            X[i*2+1] = arr[1];
        }

        int y = Integer.parseInt(in.next());
        String[] Y = new String[2 * y];
        for (int i = 0; i < y; i++) {
            String str = in.nextLine();
            String[] arr = str.split(" ");
            Y[i*2] = arr[0];
            Y[i*2+1] = arr[1];
        }

        int g = Integer.parseInt(in.next());
        String[] G = new String[3 * g];
        for (int i = 0; i < g; i++) {
            String str = in.nextLine();
            String[] arr = str.split(" ");
            X[i*3] = arr[0];
            X[i*3+1] = arr[1];
            X[i*3+2] = arr[2];
        }
        in.close();
        
        int count = 0;

        String[] GR = new String[g];

        for (int i = 0; i < g; i++) {
            for (int j = 0; j < g; j++) {
                GR[i] = G[i * j] + " " + G[i * j + 1] + " " + G[i * j + 2];
            }
        }

        for (int i = 0; i < 2 * x; i++) {
            for (int j = 0; j < 3 * g; j++) {
                if (X[i].equals(G[j])) {
                    if (i % 2 == 0) {
                        if (j % 3 == 0) {
                            if (X[i+1].equals(G[3*j+1]) || X[i+1].equals(G[3*j+2])){
                                count += 0;
                            } else {
                                count++;
                            }
                        } else if (j % 3 == 1) {
                            if (X[i+1].equals(G[3*j-1]) || X[i+1].equals(G[3*j+1])){
                                count += 0;
                            } else {
                                count++;
                            }
                        } else if (j % 3 == 2) {
                            if (X[i+1].equals(G[3*j-2]) || X[i+1].equals(G[3*j-1])){
                                count += 0;
                            } else {
                                count++;
                            }
                        }
                    } else if (i % 2 == 1) {
                        if (j % 3 == 0) {
                            if (X[i+1].equals(G[3*j+1]) || X[i+1].equals(G[3*j+2])){
                                count += 0;
                            } else {
                                count++;
                            }
                        } else if (j % 3 == 1) {
                            if (X[i+1].equals(G[3*j-1]) || X[i+1].equals(G[3*j+1])){
                                count += 0;
                            } else {
                                count++;
                            }
                        } else if (j % 3 == 2) {
                            if (X[i+1].equals(G[3*j-2]) || X[i+1].equals(G[3*j-1])){
                                count += 0;
                            } else {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 2 * x; i++) {
            for (int j = 0; j < 3 * g; j++) {
                if (Y[i].equals(G[j])) {
                    if (i % 2 == 0) {
                        if (j % 3 == 0) {
                            if (Y[i+1].equals(G[3*j+1]) || Y[i+1].equals(G[3*j+2])){
                                count++;
                            } else {
                                count += 0;
                            }
                        } else if (j % 3 == 1) {
                            if (Y[i+1].equals(G[3*j-1]) || Y[i+1].equals(G[3*j+1])){
                                count++;
                            } else {
                                count += 0;
                            }
                        } else if (j % 3 == 2) {
                            if (Y[i+1].equals(G[3*j-2]) || Y[i+1].equals(G[3*j-1])){
                                count++;
                            } else {
                                count += 0;
                            }
                        }
                    } else if (i % 2 == 1) {
                        if (j % 3 == 0) {
                            if (Y[i+1].equals(G[3*j+1]) || Y[i+1].equals(G[3*j+2])){
                                count++;
                            } else {
                                count += 0;
                            }
                        } else if (j % 3 == 1) {
                            if (Y[i+1].equals(G[3*j-1]) || Y[i+1].equals(G[3*j+1])){
                                count++;
                            } else {
                                count += 0;
                            }
                        } else if (j % 3 == 2) {
                            if (Y[i+1].equals(G[3*j-2]) || Y[i+1].equals(G[3*j-1])){
                                count++;
                            } else {
                                count += 0;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}