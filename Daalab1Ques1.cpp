#include<iostream>
using namespace std;

int main()
{
    int t,i;
    cin>>t;
    
    for(i=0;i<t;i++)
    {
        int s,k,count=0;
        cin>>s;
        int A[s];
        for(int i=0;i<s;i++)
        {
            cin>>A[i];
        }
        
        cin>>k;
        for(int i=0;i<s;i++)
        {
            if(A[i]==k)
            {
                count++;
                while(A[i]==A[i+1])
                {
                    count++;
                    i++;
                }
                break;
            }
        }
        if(count==0)
        cout<<"Key Not Present\n";

        else 
        cout<<"Count"<<count<<endl;
    }
    return 0;
}
   