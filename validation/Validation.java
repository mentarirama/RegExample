/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class Validation {
public static void main(String[] args)
	{
		ArrayList<String> validEmailList = new ArrayList<>();
		validEmailList.add("mamen@yahoo.com");
		validEmailList.add("mamen@yahoo.net");
		validEmailList.add("mamen.50@yahoo.com");
		validEmailList.add("mamen-100@yahoo.com");
		validEmailList.add("mamen@gmail.com");

		EmailValidator emailValidator = new EmailValidator();
		
		for (String email : validEmailList)
		{
			System.out.println(email + " is Valid = " + emailValidator.validate(email));
		}

			
		System.out.println("--------------------------------------");
		
		ArrayList<String> inValidEmailList = new ArrayList<>();
		inValidEmailList.add("tariyahoo.com"); // @ Symbol missing
		inValidEmailList.add("tari.50@.yahoo.com"); //. after @ symbol is not allowed
		inValidEmailList.add("tari.@yahoo.com");//. before @ symbol is not allowed
		inValidEmailList.add("tari@gmail@com");// two @ symbols are not allowed
		inValidEmailList.add("tari..900@oracle.com");// two dots are not allowed
		
		for (String email : inValidEmailList)
		{
			System.out.println(email + " is Valid = " + emailValidator.validate(email));
		}	

	}
}
    

