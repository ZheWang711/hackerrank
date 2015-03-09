#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

const int T = 100;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    unsigned a[T];
    cin>>n;
    for(int i = 0; i < n; i++) {
        cin>>a[i];
    }
    for(int i = 0; i < n; i++) {
        cout<<~a[i]<<endl;
    }
    return 0;
}
