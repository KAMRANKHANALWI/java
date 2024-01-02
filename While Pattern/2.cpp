#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    for(int i=1;i<=n;i++){
        //stars
        for(int j=1; j<= (n + 1) / 2; j++){
            int count = 0;
        if(i==1|| i==n) {
            count =1;
        }
        while (count < j) {
            cout << "* ";
            count++;
        }

        }
    }
}