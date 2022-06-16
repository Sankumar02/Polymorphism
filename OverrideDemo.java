package com.Polymorphism;

class Sports {

	void getName() {
		System.out.println("Generic Sports");
	}

	String getNumberofPlayers() {
		System.out.println("Each team has "+ "n"  + " number of players in Generic sports");
		return "n";
	}
}

class Cricket extends Sports {
	@Override
	void getName() {
		System.out.println("Cricket");
	}

	String getNumberofPlayers() {
		System.out.println("Each team has "+ 11 +" number of players in Cricket");
		return "11";
	}

}

class Soccer extends Sports {
	@Override
	void getName() {

		System.out.println("Soccer");
	}

	String getNumberofPlayers() {

		System.out.println("Each team has "+11+" number of players in Soccer");
		return "11";

	}
}

public class OverrideDemo {
	public static void main(String[] args) {
		Cricket obj1=new Cricket();
		obj1.getName();
		obj1.getNumberofPlayers();
		System.out.println();

		Soccer oSoccer = new Soccer();
		oSoccer.getName();
		oSoccer.getNumberofPlayers();
		System.out.println();
		
		Sports obj=new Sports();
		obj.getName();
		obj.getNumberofPlayers();

	}

}
