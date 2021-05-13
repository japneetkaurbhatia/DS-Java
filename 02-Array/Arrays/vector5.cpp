#include<iostream>
#include<vector>
using namespace std;
void test1(){
    int n; cin>>n;
    vector<int> arr(n);   
    for(int i = 0; i < arr.size(); i++){            
        cin>>arr[i];
    }              
    for(int i = 0; i < arr.size(); i++){            
        cout<<arr[i]<<"\t";
    }
}
int main(){
    test1();
    return 0;
}