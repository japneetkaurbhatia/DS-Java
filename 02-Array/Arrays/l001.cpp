#include<iostream>
using namespace std;
void test1(){
    int *arr = new int[10];
    for(int i = 0; i < 20; i++){
        cout<<arr[i]<<"\t";
    }
}
int main(){
    test1();
    return 0;
}
// o/p: 1732312	1731816	0	0	0	0	0	0	0	0	-401254984	28321	1736416	1731816	0	0	0	0	0	0	