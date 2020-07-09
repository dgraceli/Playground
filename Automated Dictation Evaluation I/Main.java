#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str1,str2;
  int k;
  cin>>str1>>str2;
   k=str1.compare(str2);
     if(k==0)
   		 cout<<"It is correct";
     else if(k!=0 || k>0 ||k<0)
         cout<<"It is wrong";
}