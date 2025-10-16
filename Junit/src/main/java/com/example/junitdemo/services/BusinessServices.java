package com.example.junitdemo.services;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
@Service
@SpringBootApplication
public class BusinessServices {
	public double calculateDiscount(double amount)
	{
		if(amount<0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		}
		if(amount>=1000)
		{
			return amount*0.10;
		}
		else if(amount>=500)
		{
			return amount*0.05;
		}
		else
		{
			return 0;
		}
	}
	public double calculateFinalAmount(double amount)
	{
		double discount=calculateDiscount(amount);
		return amount-discount;
	}

}
