#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t, n, *a;
    cin>>t;
    while(t--) {
        cin>>n;
        a = new int[n];
        for(int i = 0; i < n; ++i) {
            cin>>a[i];
        }
        int l = a[0];
        int r = a[n-1];
        int i = 0, j = n-1;
        while(j > i + 2) {
            if(l < r) {
                i++;
                l += a[i];
            } else {
                j--;
                r += a[j];
            }
        }
        if(l == r) {
            cout<<"YES"<<endl;
        } else {
            cout<<"NO"<<endl;
        }
    }
    return 0;
}
