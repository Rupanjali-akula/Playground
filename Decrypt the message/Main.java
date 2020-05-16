#include<iostream>
using namespace std;
int main()
{
  int e,t,i,n,div,sum=0;
  cin>>e>>t;
  n=e+t;
  for(i=1;i<n;i++)
  {
    div=n%i;
    if(div==0)
      sum=sum+i;
  }
  if(sum==n)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  return 0;
}
    
    