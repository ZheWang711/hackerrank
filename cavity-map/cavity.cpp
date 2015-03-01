#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool cavity(int ar[][100], int n, int i, int j) {
    if(i == 0 || i == n-1 || j == 0 || j == n-1) {
        return false;
    } else {
        return (ar[i][j] > ar[i-1][j] && 
                ar[i][j] > ar[i+1][j] && 
                ar[i][j] > ar[i][j-1] && 
                ar[i][j] > ar[i][j+1]);
    }
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    int ar[100][100];
    cin>>n;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            int x;
            x = cin.get() - 48;
            if(x > 0) {
                ar[i][j] = x;
            } else {
                --j;
            }
        }
    }
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(cavity(ar, n, i, j)) {
                cout<<"X";
            } else {
                cout<<ar[i][j];
            }
        }
        cout<<"\n";
    }
    return 0;
}
