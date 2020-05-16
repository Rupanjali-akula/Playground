#include<iostream>
using namespace std;
int main()
{
  int a,sum=0,i;
  cin>>a;
  int b=a;
  for(i=0;i<4;i++)
  {
    if((i==0)||(i==3))
      sum=sum+(a%10);
    a=a/10;
  }
  cout<<sum;//Type your code here.
}