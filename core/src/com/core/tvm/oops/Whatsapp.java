package com.core.tvm.oops;

public class Whatsapp {
	void updation(String a) {
		System.out.println(2015+" "+a);
	}
	void updation(String a,String b) {
		System.out.println(2016+" "+a+" "+b);
	}
	void updation(String a,String b,String c) {
		System.out.println(2017+" "+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Whatsapp a=new Whatsapp();
		a.updation("message");
		a.updation("message", "voicecall");
		a.updation("message", "voicecall", "videocall");
	}

}
