package com.cg.designpattern;

//Strategy Interface
interface PaymentStrategy {
	void pay(int amount);
}

//Concrete Strategies

class PayByCreditCard implements PaymentStrategy {

	private String cardNumber;

	public PayByCreditCard(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " using credit card " + cardNumber);

	}

}

class PayByPayPal implements PaymentStrategy {

	private String email;

	public PayByPayPal(String email) {
		this.email = email;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " using Paypal: " + email);

	}

}

//Context
class ShoppingCart {
	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void checkout(int amount) {
		paymentStrategy.pay(amount);
	}
}

public class StrategyPattern {
	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.setPaymentStrategy(new PayByCreditCard("4445-2222-9999-0007"));
		shoppingCart.checkout(100);

		shoppingCart.setPaymentStrategy(new PayByPayPal("user@example.com"));
		shoppingCart.checkout(50);
	}
}
