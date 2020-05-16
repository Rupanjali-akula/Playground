#include<iostream>
using namespace std;
int main()
{
  int x,y,a,b;
  cin>>x>>y;
  if(x>y)
  {
     a=1900+x;
     b=2000+y;
    cout<<b-a;
  }
  else
  {
     a=2000+x;
     b=2000+y;
    cout<<b-a;
  }
  //Type your code here.
}