#include<iostream>
using namespace std;
int main()
{
   int r,c,i,j;
   cin>>r>>c;
  int arr[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      cout<<arr[j][i]<<" ";
    }
    cout<<'\n';
  }
  
  
}