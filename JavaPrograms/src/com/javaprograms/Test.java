//Split Number 
package com.javaprograms;

public class Test {

	
		
		public  static void splitNumber(int i)
		{
			if(i>0)
			{
				
			splitNumber(i/10);
			
			
			System.out.println(i%10);
			
			}
		}

		public static void main(String[] args) {
			
			splitNumber(1100);
		}

}
