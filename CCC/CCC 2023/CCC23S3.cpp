//4/15

#include <iostream>
using namespace std;
int n,m,r,c;
char poster[2050][2050];
int main() {
  cin >> n >> m >> r >> c;
  bool imp = true;
        // split into different cases
        if (r == 0 && c == 0) {
            for (int j = 0; j < m - 1; j++) {
                poster[0][j] = 'a';
            }
            for (int i = 0; i < n - 1; i++) {
                poster[i][0] = 'a';
            }
            poster[n - 1][m - 1] = 'a';
        }
        // R != N && C!=M
      else if(r == 0 && c != m){
        for (int j = 0; j < c; j++) {
                for (int i = 0; i < n; i++) {
                    poster[i][j] = 'a';
                }
            }
            // second make the row satisfy
                for (int j = c; j < m; j++) {
                    poster[0][j] = 'c';
                }
      }
      else if(c == 0 && r != n){
                for (int i = r; i < n; i++) {
                    poster[i][0] = 'c';
                }
            // second make the row satisfy
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < m; j++) {
                    poster[i][j] = 'a';
                }
            }
      }
       else if (r != n && c != m) {
            // first make the column satisfy
            for (int j = 0; j < c; j++) {
                for (int i = 0; i < n; i++) {
                    poster[i][j] = 'a';
                }
            }
            // second make the row satisfy
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < m; j++) {
                    poster[i][j] = 'a';
                }
            }
        }
        // R=N && C=M (fill the arrays with a)
        else if (r == n && c == m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    poster[i][j] = 'a';
                }
            }
        }
        // R=N && C/2
        else if (r == n && c % 2 == 0) {
            // first make all rows satisfy
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < m; j++) {
                    poster[i][j] = 'a';
                }
            }
            // then make colums satisfy
            // the total number of executive is c/2
            int exec = (m - c) / 2;
            if ((m - c) % 2 == 1)
                exec++;

            for (int j = 0; j < exec; j++) {
                for (int i = 1; i < n; i++) {
                    if (m % 2 != 0)
                        poster[i][m / 2 - j] = poster[i][m / 2 + j] = 'b';
                    else {
                        poster[i][m / 2 - j - 1] = poster[i][m / 2 + j] = 'b'; // exec++;
                    }
                }
            }
        }
        // C=M && R/2
        else if (c == m && r % 2 == 0) {
            // first make all the columns satisfy
            for (int j = 0; j < c; j++) {
                for (int i = 0; i < n; i++) {
                    poster[i][j] = 'a';
                }
            }
            // then make all the row satisfy
            int exec = (n - r) / 2;
            if ((n - r) % 2 == 1)
                exec++;
            for (int i = 0; i < exec; i++) {
                for (int j = 1; j < m; j++) {
                    if (n % 2 != 0)
                        poster[n / 2 - i][j] = poster[n / 2 + i][j] = 'b';
                    else {
                        poster[n / 2 - i - 1][j] = poster[n / 2 + i][j] = 'b'; // exec++;
                    }
                }
            }
        } 
          
         else if (r == n && m>=3) {
           c --;
            // first make all rows satisfy
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < m; j++) {
                    poster[i][j] = 'a';
                }
            }
            // then make colums satisfy
            // the total number of executive is c/2
            int exec = (m - c) / 2;
            if ((m - c) % 2 == 1)
                exec++;

            for (int j = 0; j < exec; j++) {
                for (int i = 1; i < n; i++) {
                    if (m % 2 != 0)
                    {
                        poster[i][m / 2 - j] = poster[i][m / 2 + j] = 'b';}
                    else {
                        poster[i][m / 2 - j - 1] = poster[i][m / 2 + j] = 'b'; // exec++;
                    }
                }
            }
           for(int i = 0 ; i < n ; i ++){
             poster[i][m/2] = 'a';
           }
        }
         else if (c == m && n >= 3) {
           r --;
            // first make all the columns satisfy
            for (int j = 0; j < c; j++) {
                for (int i = 0; i < n; i++) {
                    poster[i][j] = 'a';
                }
            }
            // then make all the row satisfy
            int exec = (n - r) / 2;
            if ((n - r) % 2 == 1)
                exec++;
            for (int i = 0; i < exec; i++) {
                for (int j = 1; j < m; j++) {
                    if (n % 2 != 0){
                        i++;
                        poster[n / 2 - i][j] = poster[n / 2 + i][j] = 'b';
                    }
                    else {
                        poster[n / 2 - i - 1][j] = poster[n / 2 + i][j] = 'b'; // exec++;
                    }
                }
            }
           for(int j = 0 ; j < m ; j ++){
             poster[n/2][j] = 'a';
           }
        } 
        else {
            printf("IMPOSSIBLE\n");
            return 0;
        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (poster[i][j] == '\0') {
                        poster[i][j] = 'b';
                    }
                    printf("%c",poster[i][j]);
                }
                printf("\n");
            }
    }