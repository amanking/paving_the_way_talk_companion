package com.amanking.smelly.code;

public class CostlyMethodCall {

	public String stockStatus(String productName) {
		long stockCount;
		stockCount = fetchStockCount(productName); // SEAM
		return stockCount > 0 ? "In Stock" : "Out of Stock";
	}

	protected long fetchStockCount(String productName) {
		// simulating a heavy operation for fetching stock count
		for(int i = 0; i < Long.MAX_VALUE; i++) {}
		return Math.round(Math.random());
	}

}
