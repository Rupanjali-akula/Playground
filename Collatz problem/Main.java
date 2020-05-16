#include<iostream>
using namespace std;
int main()
{
  int a,b,count=0;
  cin>>a;
  while(a>=1)
  {
    cout<<a<<"\n";
    if(a!=1)
    {
      count++;
      if(a%2==0)
        a/=2;
      else
        a=3*a+1;
    }
    else break;
  }
  cout<<count;
      //Type your code here.
}