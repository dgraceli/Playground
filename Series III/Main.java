#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int i,n,first =6,num;
  cout<<first<<" ";
  cin>>n;
  for(i=1;i<n;i++)
  {
	num=first+5*i;
    cout<<num<<" ";
    first= num;
  }
}