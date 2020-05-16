#include<iostream>
using namespace std;
int main()
{
int a,b,op;
  cin>>a>>b>>op;
 cout<<"Enter first number :"<<" Enter second number :"<<" Menu"<<"\n";
  cout<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder"<<"\n";
  switch(op)
  {
  case 1:
      cout<<a+b;
       break;
  case 2:
      cout<<a-b;
      break;
  case 3:
      cout<<a*b;
      break;
  case 4:
      cout<<a/b;
      break;
  case 5:
     cout<<a%b;
     break;
  default:
     cout<<"Invalid operation";
     break;
  }
}
  