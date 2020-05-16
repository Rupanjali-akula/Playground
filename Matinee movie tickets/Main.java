#include<iostream>
using namespace std;
int main()
{
  int a;
  float st;
  cin>>a>>st;
  float p=10.15,q=13.30,r=18.00,s=22.00;
  if(a>=13 && st==q||st==r)
  {
    cout<<"$5.00";
  }
  else if (a>=13 && st==p||st==s)
  {
    cout<<"$8.00";
  }
  if(a<13 && st==q||st==r)
  {
    cout<<"$2.00";
  }
  else if(a<13 && st==p||st==s)
  {
    cout<<"$4.00";
  }//Type your code here.
}