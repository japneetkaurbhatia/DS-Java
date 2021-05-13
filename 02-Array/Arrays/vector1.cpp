#include<iostream>
#include<vector>
using namespace std;
void test1(){
    vector<int> arr(20);                 
    for(int i = 0; i < 30; i++){            //first 20 ele 0
        cout<<arr[i]<<"\t";
    }
}
int main(){
    test1();
    return 0;
}