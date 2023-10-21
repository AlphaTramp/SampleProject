package com.app.pageexecution;

import com.app.locators.OrderNumLocator;

public class OrderNumExecution extends OrderNumLocator{
	public static void ordernum() {
		try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		String ordrno=((new OrderNumLocator().getOrderno()).getAttribute("value"));
		System.out.println("Order Number Is : ");
		System.err.println(ordrno);
//		BaseClass.inputValue(new BookingPageLocator().getCccvv() , (excelreuse(5,2)));
	    }

}
