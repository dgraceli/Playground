#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int arr[r][c],arr1[r][c],sum[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>arr1[i][j];
      //cout<<arr1[r][c]<<" "<<'\n';
    }
  }
  for(i=0;i<r;i++)
  {
    
    for(j=0;j<c;j++)
    {
      sum[i][j]=arr[i][j] +arr1[i][j];
     cout<<sum[i][j]<<" ";
    }
    cout<<'\n';
  } 
}