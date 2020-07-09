#include<iostream>
#include<string>
#include<ctype.h>
using namespace std;
int main()
{
  string str1,str2;
  int vow=0,con=0,space=0,sym=0,num=0;
  getline(cin,str1);
 // cout<<str1;
  for(int i=0;i<str1.length();i++)
  {
    if(isalpha(str1[i]))
    {
      if(str1[i]=='a' || str1[i]=='e'|| str1[i]=='i'|| str1[i]=='o'|| str1[i]=='u' || str1[i]=='A' || str1[i]=='E'|| str1[i]=='I'|| str1[i]=='O'|| str1[i]=='U')
      {
        vow+=1;
      //cout<<str1[i];
      
      }
      else
        con+=1;
    }
    else if(str1[i]==' ' )
      space+=1;
   else if(str1[i]>='0' && str1[i]<='9')
     num+=1;
    
   else
     sym+=1;
    
  }
  cout<<"Vowels:"<<vow<<'\n';
  cout<<"Consonants:"<<con<<'\n';
  cout<<"White Spaces:"<<space<<'\n';
  cout<<"Digits:"<<num<<'\n';
  cout<<"Symbols:"<<sym<<'\n';
}