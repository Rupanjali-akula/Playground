#include<iostream>
using namespace std;
int main()
{
int a;
  cin>>a;
if(a%400==0)
  cout<<"Vicky can celebrate his birthday.";
  else if(a%100==0)
    cout<<"Vicky can't celebrate.";
  else if(a%4==0)
    cout<<"Vicky can celebrate his birthday.";
  else 
    cout<<"Vicky can't celebrate.";

}