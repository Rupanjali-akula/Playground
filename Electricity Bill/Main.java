#include<iostream>
using namespace std;
int main()
{
  int x,a,b,c,d;
  cin>>x;
  a=0.5*x;
  b=0.65*x+100;
  c=0.8*x+200;
  d=1.25*x+425;
  if(x<=200)
    cout<<"Rs."<<a;
  else if(x<=400)
    cout<<"Rs."<<b;
  else if(x<=600)
    cout<<"Rs."<<c;
  else
    cout<<"Rs."<<d;//Type your code here.
}