#include<iostream>
#include<vector>
using namespace std;
void test1(){
    vector<int> arr(2,4);     
    arr.push_back(200); //add ele in last            
    for(int i = 0; i < arr.size(); i++){            
        cout<<arr[i]<<"\t";
    }
}
int main(){
    test1();
    return 0;
}