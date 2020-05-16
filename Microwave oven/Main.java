#include<iostream>
using namespace std;
int main()
{
  int n;
  float t;
  cin>>n>>t;
  if (n<=2)
    cout<<n*t-((t/100)*50);
  else if (n==3)
    cout<<2*t;
  else 
    cout<<"Number of items is more";
  //Type your code here.
}