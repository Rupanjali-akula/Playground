#include<iostream>
using namespace std;
int main()
{
  int n,m,sum=0,rem;
  cin>>n;
  m=n;
  while(n!=0){
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  if((m%sum)==0)
  {
  cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }//Type your code here.
}