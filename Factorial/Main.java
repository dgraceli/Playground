#include<iostream>
using namespace std;

int main()
{
  int n,fact=1;
  cin>>n;
  if(n==0)
    cout<<"The factorial of 0 is 1";
  else if(n>0){
  for(int i=1;i<=n;i++)
  {
    fact=fact *i;
  }
  cout<<"The factorial of "<<n<< " is " <<fact;}
  return 0;
}