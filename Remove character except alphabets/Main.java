#include<iostream>
#include<string>
#include<ctype.h>
using namespace std;
int main()
{
  string str1,str2;
  
  cin>>str1;
  for(int i=0;i<str1.length();i++)
  {
  if(isalpha(str1[i]))
    cout<<str1[i];
  }
}