#include<iostream>
using namespace std;

void pppppp(int a){
   return;
}

void ppppp(int a){
    cout<<"Hi"<<a<<endl;
    pppppp(a+1);
    cout<<"Bye"<<a<<endl;
}

void pppp(int a){
    cout<<"Hi"<<a<<endl;
    ppppp(a+1);
    cout<<"Bye"<<a<<endl;
}

void ppp(int a){
    cout<<"Hi"<<a<<endl;
    pppp(a+1);
    cout<<"Bye"<<a<<endl;
}

void pp(int a){
    cout<<"Hi"<<a<<endl;
    ppp(a+1);
    cout<<"Bye"<<a<<endl;
}

void p(int a){
    cout<<"Hi"<<a<<endl;
    pp(a+1);
    cout<<"Bye"<<a<<endl;
}

int main(){
    p(1);
    return 0;
}