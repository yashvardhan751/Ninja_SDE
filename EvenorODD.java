/*
Problem statement
Write a program that uses bitwise AND operator to check if a given positive integer is even or odd.
*/

//Solution

#include<iostream>
using namespace std;

int main() {
	// Write your code here
	int n;
	cin>>n;
	if(n&1){
		cout<<"Odd"<<endl;
	}else{
		cout<<"Even"<<endl;
	}
}
