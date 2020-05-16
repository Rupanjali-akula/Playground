#include<iostream>
using namespace std;
int main()
{
 int a1,b1,c1,a2,b2,c2,a3,b3,c3;
  int x,y,z;
  cin>>a1>>b1>>c1>>a2>>b2>>c2>>a3>>b3>>c3;
  x=a1+c1-(b1*a1/100);
  y=a2+c2-(b2*a2/100);
  z=a3+c3-(b3*a3/100);
  cout<<"In Flipkart Rs."<<x<<"\n"<<"In Snapdeal Rs."<<y<<"\n"<<"In Amazon Rs."<<z<<"\n";
  if(x<=y && x<=z)
    cout<<"He will prefer Flipkart";
  else if(y<=x && y<=z)
    cout<<"He will prefer Snapdeal";
  else 
    cout<<"He will prefer Amazon";
  //Type your code here.
}