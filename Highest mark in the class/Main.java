#include<iostream>
using namespace std;
int main()
{
  int n,maxi;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int j=0;j<n;j++)
  {
    if(arr[0]<arr[j])
    {
      arr[0]=arr[j];
    }
    
    
  }
  cout<<arr[0];
  
}