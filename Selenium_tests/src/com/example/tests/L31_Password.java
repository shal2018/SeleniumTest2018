package com.example.tests;

import java.util.Base64;

public class L31_Password {

	//public static void main(String[] args) {
		
		//String password = "123456";
		static String encodedPassword= "MTIzNDU2";	
	
		public static String decodedPassword(){
			return new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
			
		}
		/*String encodedPassword = new String(Base64.getEncoder().encode(password.getBytes()));
		System.out.println(encodedPassword);
		String decodedPassword = new String(Base64.getDecoder().decode(encodedPassword));
		System.out.println(decodedPassword);*/

	//}

}
