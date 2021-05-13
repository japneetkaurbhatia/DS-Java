#include<iostream>
#include<vector>
using namespace std;
void test1(){
    vector<int> arr(20,4);                 
    for(int i = 0; i < arr.size(); i++){            
        cout<<arr[i]<<"\t";
    }
}
int main(){
    test1();
    return 0;
}