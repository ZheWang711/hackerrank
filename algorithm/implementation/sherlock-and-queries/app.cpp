#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

const long N=100000;
const long M=100000;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    long *A, *B, *C, *D, *V;
    long n, m, x, y = 1000000007;
    cin>>n>>m;
    A = new long[n];
    B = new long[m];
    C = new long[m];
    D = new long[n];
    V = new long[n];
    for (long i = 0; i < n; i++) {
        cin>>A[i];
        V[i] = D[i] = 0;
    }
    for (long i = 0; i < m; i++) {
        cin>>B[i];
    }
    for (long i = 0; i < m; i++) {
        cin>>C[i];
    }
    for(long i = 0; i < m; i++) {
        long key = B[i];
        long j = V[key];
        V[key] = (j == 0) ? C[i] : ((j * C[i]) % y);
    }

    for(int i = 0; i < M; ++i){
        int key = B[i];
        Integer j = map.get(key);
        map.put(key, (j == null) ? C[i] : (int)((((long)j) * C[i]) % MOD));
    }
    /*
    for (long i = 0; i < m; i++) {
        for (long j = 0; j < n; j++) {
            if ((j + 1) % B[i] == 0) {
                x = (A[j] * C[i]) % y;
                A[j] = x;
            }
        }
    }*/
    for (long i = 0; i < n; i++) {
        cout<<A[i]<<" ";
    }
    return 0;
}
