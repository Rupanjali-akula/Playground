#include<iostream>
using namespace std;
int main()
{
  int a,b,c,s,i=1,d;
  cin>>a>>b>>c;
  if(a<b)
  {
    if(a<c && c<b)
      s=c;
    else if(a<c && c>b)
      s=b;
    else if (a>c && c<b)
      s=a;
  }
  else if(a>c && c>b)
    s=c;
  else if (a<c && c>b)
    s=a;
  else if (a>c && c<b)
    s=b;
  while(i<=a && i<=b && i<=c)
  {
    if(a%i==0 && b%i==0 && c%i==0)
      d=i;
    i++;
  }
  cout<<"The treasure is in box which has number "<<s<<"\n"<<"The code to open the box is "<<d;//Type your code here.
}