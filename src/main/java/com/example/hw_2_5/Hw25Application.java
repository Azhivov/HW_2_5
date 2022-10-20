package com.example.hw_2_5;

import com.example.hw_2_5.exeption.WrongLoginException;
import com.example.hw_2_5.exeption.WrongPasswordException;

public class Hw25Application {
public static void main(String[] args){
	String login = "Sam7";
	String pass ="qfe_213_213_213_213_213_213_213_213_213";
	String confirmPass ="qfe_13_213_213_213_213_213_213_213_213";
	System.out.println (acceptThreeParametrs(login, pass, confirmPass));
    }
	public static boolean acceptThreeParametrs(String login, String password, String confirmPassword){;
		boolean checkLogin;
		boolean checkPassword;
		boolean checkLengthLogin;
		boolean checkLengthPass;
		boolean checkPasswordMatching;

		try{
			checkLogin = checkValidationCharacter(login);
			checkPassword = checkValidationCharacter(password);
			checkLengthLogin = checkLengthPassword(login);
			checkLengthPass = checkLengthPassword(password);
			checkPasswordMatching= checkPasswordMatching(password, confirmPassword);
		} catch (WrongLoginException | WrongPasswordException exception)
		{
			System.out.println(exception.getMessage());
			return false;
		}
		return checkLogin && checkLengthLogin && checkPassword && checkLengthPass && checkPasswordMatching
				;

	}

	public  static boolean checkValidationCharacter(String checkWord) {
		if (checkWord == null){
			System.out.println("Слово являеися Null");
			return false;

		}
		if(checkWord.matches("\\w+")){
		  return true;
	    }
		System.out.printf("Недопустимые символы в слове!  -%s\n", checkWord);
	  return false;
    }
	public  static boolean checkLengthLogin(String login) throws WrongLoginException {
		if (login.length()>20){
			throw new WrongLoginException("Слишком длинный логин");
		}
		return true;
	}
	public  static boolean checkLengthPassword(String pass) throws WrongPasswordException {
		if (pass.length() > 19) {
			System.out.println("слишком длинный пароль");
			return false;
		}
		return true;
	}
	public  static boolean checkPasswordMatching(String password, String confirmPassword) throws WrongPasswordException {
	if (password.equals(confirmPassword))return true;
	throw new RuntimeException("Пароли не совпадают");
	}
}
