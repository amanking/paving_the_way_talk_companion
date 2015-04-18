package com.amanking.smelly.code;

public class CostlyMethodCall {

	public String stockStatus(String productName) {
		long stockCount;

		// simulating a heavy operation for fetching stock count
		for(int i = 0; i < Long.MAX_VALUE; i++) {}
		stockCount = Math.round(Math.random());

		return stockCount > 0 ? "In Stock" : "Out of Stock";
	}

}
