import java.util.Scanner;

public class CCC20J4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String T = input.nextLine();
    String S = input.nextLine();
    input.close();
    boolean yes = false;
    
    int length = S.length();
    String[] R = new String[length];
    
    for (int i = 0; i < length; i++) {
      R[i] = S.substring(i) + S.substring(0, i);
    }

    for (int j = 0; j < length; j++) {
        if (T.contains(R[j])){
          yes = true;
        }
    }
    if (yes) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}