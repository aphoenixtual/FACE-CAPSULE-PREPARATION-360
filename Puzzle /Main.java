#include<iostream>
using namespace std;
int main()
{
    int r,c,temp;
  cin>>r>>c;
  int a[r][c],trans[c][r];
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cin>>a[i][j]; 
   }
  }
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    trans[j][i]=a[i][j];
   }
   
  }
  for(int i=0;i<c;i++)
  {
   for(int j=0;j<r;j++)
   {
    cout<<trans[i][j]<<" "; 
   }
    cout<<endl;
  }
  
}