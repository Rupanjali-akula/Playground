#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int b,r,s,bb,x;
  cin>>b>>r>>s>>bb;
  float to,ob,crr,trr;
  to=(float)b/6;
  x=bb/6;;
  ob=(float)(x+(0.1*(bb-(x*6))));
  crr=s/ob;
  trr=r/to;
  cout<<to<<"\n"<<ob<<"\n"<<fixed<<setprecision(1)<<crr<<"\n"<<trr<<"\n";
  if(crr>=trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  //Type your code here.
}