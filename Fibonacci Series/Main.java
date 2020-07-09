#include<iostream>
using namespace std;
int fab(int x)
{
  if((x==1)||(x==0))
  {
    return x;
  }
  else
  {
    return(fab(x-1)+fab(x-2));
  }
}
int main()
{
  int n,i=0,val;
  cin>>n;
  while(i<n)
  {
    val=fab(i);
    i++;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<val;
  return 0;
}
  
  