#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int num,i,val;
  cout<<"Enter the value of a "<<'\n';
  cin>>num;
  cout<<"Enter the value of n "<<'\n';
  cin>>i;
  val =pow(num,i);
  cout<<"The value of "<<num<<" power "<<i<< " is "<<val;
  return 0;
}