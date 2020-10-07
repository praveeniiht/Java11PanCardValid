package yaksha;

import java.util.Scanner;

public class MainClass {

	public static String validatePAN(PanCard panCard) {
		if (panCard.getPanCard().matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
			return "valid";
		else
			return "invalid";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter PanCard Number");
		String s1 = in.nextLine();
		PanCard panCard = new PanCard(s1);
		String result = MainClass.validatePAN(panCard);
		if (result.equals("valid")) {
			System.out.println("Valid PanCard");
		} else {
			System.out.println("InValid PanCard");
		}
		in.close();
	}
}
