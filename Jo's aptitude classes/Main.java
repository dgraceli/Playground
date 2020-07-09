#include <iostream>
using namespace std;

int gcd1(int n1,int n2, int n3)
{
  int small=0,gcdnum;
  if(n1<n2 && n1<n3)
    small=n1;
  else if(n2<n1 && n2<n3)
    small=n2;
  else
    small =n3;
  while(small!=0)
  {
    if(n1%small==0 && n2%small==0 && n3%small==0)
      gcdnum=small;
      break;
  }small--;
      return gcdnum;
  
}

int main() 
{
   int a,b,c,d ,num;
  cin>>a>>b>>c>>d;
  num=gcd1(a,b,c);
  if(d==num)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  return 0;
}
    