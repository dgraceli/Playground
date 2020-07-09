#include<iostream>
using namespace std;
int main(){
  int n,male=0,fem=0;
  cin>>n;
  int *p,*q;
  p=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
    if(*(p+i)%2==0)
      fem=fem+1;
    else
      male=male+1;
  }
  cout<<male<<'\n'<<fem;
  
    
  
  return 0;
}