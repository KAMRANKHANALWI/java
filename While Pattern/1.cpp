#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int nst = (n + 1) / 2;
    int nst2 = (n + 1) / 2;
    int nsp = -1;
    int row = 1;
    while (row <= n) {
        int cst = 0;
        if(row==1|| row==n) {
            cst =1;
        }
        while (cst < nst) {
            cout << "* ";
            cst++;
        }
        int csp = 0;
        while (csp < nsp) {
            cout << "  ";
            csp++;
        }
        int cst2 = 0;
        while (cst2 < nst2) {
            cout << "* ";
            cst2++;
        }
        cout << endl;
        if (row >= (n + 1) / 2) {
            nsp -= 2;
            nst2++;
            nst++;
        } else {
            nsp += 2;
            nst2--;
            nst--;
        }
        row++;
    }
    return 0;
}