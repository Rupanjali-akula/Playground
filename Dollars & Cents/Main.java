#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  std::cin>>d1>>c1>>d2>>c2;
  int doll=d1+d2;
  int cent=c1+c2;
  while(cent>100)
  {
    doll = doll +1;
    cent =cent -100;
  }
  std::cout<<doll<<"\n"<<cent;
}
        