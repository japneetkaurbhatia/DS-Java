#include<iostream>
using namespace std;

void fun(int a){
    if(a > 4) return;
    a = a + 1;
    return;
}

void fun1(){
    int a = 1;
    cout<<"Hi"<<a<<endl;
    fun(a);
    cout<<a<<endl;
}

int main(){
    fun1();
    return 0;
}