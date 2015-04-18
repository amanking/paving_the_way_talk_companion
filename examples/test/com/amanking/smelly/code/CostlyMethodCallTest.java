package com.amanking.smelly.code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CostlyMethodCallTest {

	@Test
	public void shouldReturnInStockWhenStockGreaterThanZero() {
		CostlyMethodCallTestDouble costlyMethodCall = new CostlyMethodCallTestDouble(20); // ENABLING POINT
		assertEquals("In Stock", costlyMethodCall.stockStatus("Samsung Mobile"));
	}

	@Test
	public void shouldReturnOutOfStockWhenStockIsZero() {
		CostlyMethodCallTestDouble costlyMethodCall = new CostlyMethodCallTestDouble(0);  // ENABLING POINT
		assertEquals("Out of Stock", costlyMethodCall.stockStatus("Samsung Mobile"));
	}

	private class CostlyMethodCallTestDouble extends CostlyMethodCall {
		private long stockCount;

		public CostlyMethodCallTestDouble(long stockCount) {
			this.stockCount = stockCount;
		}

		@Override
		protected long fetchStockCount(String productName) {
			return stockCount;
		}
	}
}
