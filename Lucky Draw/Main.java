#include<iostream>
using namespace std;
int main()
{
 int a,count=0;
  cin>>a;
  for(int i=1;i<a;i++)
  {
   if(a%i==0)
   {
    count+=1; 
   }
  }
  if(count==1)
  {
   cout<<"Eligible"; 
  }
  else{
   cout<<"Not eligible"; 
  }
}