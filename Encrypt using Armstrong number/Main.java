#include<iostream>
using namespace std;

int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int temp=n,digit=0,res,sum, m=n;
    while(n!=0)
    {
      digit=digit+1;
      n=n/10;
    }
  	while(temp!=0)
    {
       res=temp%10;
      sum= sum +power(res,digit);
      temp=temp/10;
      
    }
 // cout<<sum<<'\n'<<m;
  if(sum==m)
    return 1;  
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}