package com.practise.random;


public class CardCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numberString = "123456789";
		int A = 0; //should sum of all odd numbers
		int B=0; //multiply each even number by 2, if the multiple is 2 digits replace with the sum of the 2 digits, return the sum of all the resulting numbers
		
		
		numberString = new StringBuilder(numberString).reverse().toString();
		A = findA_sumOfOdds(numberString );
		B = findB_multipleOfEven(numberString );
		
		System.out.println("A is: "+A);
		System.out.println("B is: "+B);
		if((A+B)%10==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		
	}
	
	public static int findA_sumOfOdds(String s){
		String[] numberArr = new String[100];
		numberArr = s.split("");
		int sum = 0;
		for (String i: numberArr){
			int tmp = Integer.parseInt(i);
			if(tmp%2!=0){
				sum=sum+tmp;
				System.out.println(tmp);
			}
		}
		return sum;
	}
	
	public static int findB_multipleOfEven(String s){
		String[] numberArr = new String[100];
	
		numberArr = s.split("");
		int sum = 0;
		for (String i: numberArr){
			int tmp = Integer.parseInt(i);
			if(tmp%2==0){
				tmp = tmp*2;
				if(tmp > 9){
					String tmpStr = new Integer(tmp).toString();
					//twoDigit = Pattern.matches("\\d[0]]", tmpStr);
					int one = Integer.parseInt(tmpStr.substring(0, 1));
					int two = Integer.parseInt(tmpStr.substring(1, 2));
					System.out.println("number is: "+tmpStr+"and its parts"+one+","+two);
					sum = sum + (one+two);	
				}
				sum=sum+tmp;
			}
		}
		return sum;
	}
}
