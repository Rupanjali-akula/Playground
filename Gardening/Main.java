#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  if((z>x && z<=2*x) || (z>x*y-2*x && z<=x*y-x) )
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";//Type your code here.
}