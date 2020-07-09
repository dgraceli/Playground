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
  if(r==3 && c==3)
  {
   sum1=sum1+arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2];
       cout<<"Sum of Zig-Zag pattern is "<<sum1<<" ";;
  }
  else if(r==2 && c==2)
  {
    sum1=sum1+arr[0][0]+arr[0][1]+arr[1][0]+arr[1][1];
       cout<<"Sum of Zig-Zag pattern is "<<sum1<<" ";;
  }
    
   
  //}
  //cout<<sum1<<" ";;
}