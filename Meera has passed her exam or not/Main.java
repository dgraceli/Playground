#include<iostream>
using namespace std;
int main()
{
  int n,id,i,flag=0;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>id;
  for(i=0;i<n;i++)
  {
    if(arr[i]==id)
    {
      flag=1;
      break;
    }
  }
    if(flag==1)
      cout<<"She passed her exam";
    else
      cout<<"She failed";
  
  
  
}