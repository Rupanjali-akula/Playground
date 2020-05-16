#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int count,n;
  float s=(float)0;
  count=0;
  while(count<3)
  {
    cin>>n;
    if(n>0)
    {
      if(n%2!=0)
      {
        count++;
        s=s+1;
      }
      else
      {
        s=s-0.5;
      }
    }
    else
    {
      s=s-1;
      break;
    }
  }
  cout<<fixed<<setprecision(1)<<s;
}