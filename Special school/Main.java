#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str1,str2,s,rev;
  int k;
  cin>>str1>>str2;
  //s.copy(str1);
  s=str1;
  //cout<<s;
  //str1.reverse();
  rev = string(str1.rbegin(),str1.rend());
  if(rev==str2)
  //k=s.compare(str1);
 // if(k==0)
  cout<<"It is correct";
 else
  cout<<"It is wrong";
      
  
}