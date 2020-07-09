#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int i,n,first =0,sec= 2,num;
 // cout<<first<<" ";
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      num= i * i -1;
      cout<<num<<" ";
      first= num;
    }
    else
    {
      num=i*i-2;
      cout<<num<<" ";
      first= num;
    }
      
  }
}