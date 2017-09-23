package com.ldu.factory;

public class TestFactory {
	public static void main(String[] args) {
		Provider pro=new MailFactory();
		Sender sen=pro.produce();
		sen.send();
	}
}

interface Sender{
	public void send();
}

class MailSender implements Sender{
	@Override
	public void send() {
		System.out.println("mail sender");
	}
}

class SmsSender implements Sender{
	@Override
	public void send() {
		System.out.println("sms sender");
	}
}

interface Provider{
	public Sender produce();
}

class MailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}
}

class SmsFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}
	
}