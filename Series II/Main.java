#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int i,n,first =11,num,no;
  cout<<pow(11,2)<<" ";
  cin>>n;
  for(i=1;i<n;i++)
  {
    num= (first+4);
    no=pow(num,2);
    cout<<no<<" ";
    first= num;
  }
}

    
    