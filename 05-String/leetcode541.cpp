class Solution {
public:
    void revRange(string& str, int i, int j){
        while(i < j){
            swap(str[i++],str[j--]);
        }
    }
    string reverseStr(string s, int k) {
        if( k==0 || k==1 || s.length()<=1)  return s;
        int i = 0, n = s.length();
        while(i < n){
            if(i + k - 1 < n){
                revRange(s,i,i+k-1);
                i+=k * 2;
            }else{
                revRange(s,i,n-1);
                break;
            }
        }
        return s;
    }
};