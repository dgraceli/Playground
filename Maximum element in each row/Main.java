#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum1=0;;
  cin>>r>>c;
  int arr[r][c];
  for(i=0;i<r;i++)
  {
   
    for(j=0;j<c;j++)
    {
     cin>>arr[i][j];
    }
  }
  
  for(i=0;i<r;i++)
  {
   sum1=arr[i][0];
    for(j=1;j<c;j++)
    {
      if(arr[i][j]>sum1)
      {
      	sum1=arr[i][j];
      }
     
    
    } 
    
     cout<<sum1<<'\n';
  }
}
   
 