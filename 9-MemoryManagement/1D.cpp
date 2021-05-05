#include<iostream>
#include<vector>
using namespace std;

// ################################ 1-D Array #########################################################

//on stack***************************************************************************************************

// void test1(){
//     int n; cin>>n;
//     // int arr[n];     //made in Stack memory
//     int arr[n] = {0};   //to avoid random vals
//     for(int i = 0; i < n ; i++){        //if n = 10 it prints random 10 values  
//         cout<<arr[i]<<endl;
//     }
// }

void test2(int *arr, int n){
    for(int i = 0; i < n ; i++){        //if n = 10 it prints 10  0 values but after that it print random  
        cout<<arr[i]<<endl;
    }
}

void test1(){
    int n; cin>>n;
    int arr[n] = {0}; 
    test2(arr, n);    
}

//on heap***************************************************************************************************

void input1d(int *arr, int n){
    for(int i = 0; i < n ; i++){          
        cin>>arr[i];
    }
}

void output1d(int *arr, int n){
    for(int i = 0; i < n ; i++){          
        cout<<arr[i]<<" ";
    }
}

void test2(){
    int n; cin>>n;
    int* arr = new int[n]; 
    input1d(arr, n); 
    output1d(arr, n);    
}

//creating input file = passing input address (on heap)********************************************************

int* input(int n){          //input file
    int* arr = new int[n];
    for(int i = 0; i < n ; i++){          
        cin>>arr[i];
    }
    return arr;
}

void test3(){
    int n; cin>>n;
    int* arr = input(n);        //catch address of input file in arr
    output1d(arr,n); 
}

//creating input file = passing input address (on stack)*******************************************************

// %%%%%%%%%%%%% WORKS %%%%%%%%%%%%%%%%%%%%%%%%
void inputForStack(int n){         
    int arr[n] = {0};
    for(int i = 0; i < n ; i++){          
        cin>>arr[i];
    }
    output1d(arr,n); 
}

void test4(){
    int n; cin>>n;
    inputForStack(n);       
}

// %%%%%%%%%%%%%%%%% Not Works %%%%%%%%%%%%%%%%%%%%%%

int* inputForStack2(int n){         
    int arr[n] = {0};               // pass ho jyega but data ni milega
    for(int i = 0; i < n ; i++){          
        cin>>arr[i];
    }
    return arr; 
}

void test5(){
    int n; cin>>n;
    int* arr = inputForStack2(n);   
    output1d(arr,n);     
}

// ################################ 2-D / 3-D Array #########################################################

void test6(){
    int n, m ;
    cin>>n>>m;

    //2-D    
    int** arr = new int*[n];        // int* = store int type address
    for(int i = 0; i < n; i++){
        int* ar = new int[n];
        arr[i] = ar;
    }

    //3-D
    int*** arrr = new int**[3];        // int** = store int type address of another address
    for(int i = 0; i < 3; i++){
        arrr[i] = new int*[5];
        for(int j = 0; j < 5; j++){
            arrr[i][j] = new int[7];            //it become difficult so we use vector
            for(int k = 0; k < 7; k++)
                arrr[i][j][k] = 0;
        }
    }
}

// VECTOR # VECTOR # VECTOR # VECTOR # VECTOR 

void test7(){
    vector<int> arr(10,0);
    for(int i = 0; i < 100 ; i++){          //it runs for 100 #no boundries     
        cout<<arr[i]<<endl;                 //if we use arr.at(i) // throus exception for i > n (test8)
    }    
}

void test8(){
    vector<int> arr(10,0);
    for(int i = 0; i < 100 ; i++){          
        cout<<arr.at(i)<<endl;                 //but we wont use it , so use size fn (test9)
    }    
}

void test9(){
    vector<int> arr(10,0);
    for(int i = 0; i < arr.size() ; i++){          //it runs for 100 #no boundries     
        cout<<arr[i]<<endl;                 //if we use arr.at(i) // throus exception for i > n (test8)
    }    
}

// %%%%%%%%%%%% ON STACK %%%%%%%%%%%%%%%%%%%%

//copy constructor is used

void inputVector(vector<int> arr){
     for(int i = 0; i < arr.size() ; i++){         //ip      
        cin>>arr[i];                
    } 
    for(int i = 0; i < arr.size() ; i++){          //op  
        cout<<arr[i]<<" ";               
    } 
    cout<<endl;
}

void test10(){
    vector<int> arr(10,0);
    inputVector(arr);       //args pass copy constructor fire COMPLEXITY = O(n)
    for(int i = 0; i < arr.size() ; i++){           // changes wont reflect prints 0      
        cout<<arr[i]<<" ";               
    } 
}

/*
o/p
n = 5

 2 4 6 8 10
 0 0 0 0 0

*/


// %%%%%%%%%%%% ON HEAP %%%%%%%%%%%%%%%%%%%%

void inputVectorb(vector<int> arrb){
     for(int i = 0; i < arr->size() ; i++){         //ip      
        cin>>arr->at(i);                
    } 
    for(int i = 0; i < arr->size() ; i++){          //op  
        cout<<arr->at(i)<<" ";               
    } 
    cout<<endl;
}

void test10b(){
    vector<int> *arr = new vector<int>(10,0);
    inputVectorb(arr);       //COMPLEXITY = O(1)
    for(int i = 0; i < arr->size() ; i++){           // changes reflect       
        cout<<arr->at(i)<<" ";               
    } 
}

// &

int **test&()
{
    int a = 10;
    int *b = &a;
    int **c = &b;

    cout << a << " " << &a << endl;
    cout << b << " " << &b << endl;
    cout << c << " " << &c << endl;
}

int main()
{
    test&();
    
    return 0;
}

//############# defrerence ####################
int **test5()
{
    int a = 10;
    int *b = &a;
    int **c = &b;

    cout << a << " " << &a << endl;
    cout << *b << " " << &b << endl;
    cout << **c << " " << &c << endl;

    int **arr = new int *[1];
    arr[0] = &a;
    return arr;
}

int main()
{
    int **arr = test5();
    test1();
    cout << *arr[0] << endl;
    return 0;
}

// *********************************************************************************************

int main(){
    test1();
    test2();
    test3();
    test4();
    return 0;
}