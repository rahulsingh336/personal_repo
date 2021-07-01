package com.example.order.processing.rules;

import com.example.order.processing.HandleOrder;
import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import org.junit.jupiter.api.Test;

import static com.example.order.processing.ProductType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HandleOrderTest {

	@Test
	public void test_No_Product(){
		HandleOrder handleOrder = new HandleOrder();
		OrderRequest orderRequest = new OrderRequest(null);
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> handleOrder.handleOrder(orderRequest));

		assertEquals("Product Type is not specified", exception.getMessage());

	}

	@Test
	public void test_Physical_Product(){
		OrderRequest orderRequest = new OrderRequest(PHYSICAL);
		HandleOrder handleOrder = new HandleOrder();

		OrderResponse orderResponse = handleOrder.handleOrder(orderRequest);

		assertEquals(true, orderResponse.isStatus());
		assertEquals("1", orderResponse.getProductType().getShortCode());
	}

	@Test
	public void test_Book(){
		OrderRequest orderRequest = new OrderRequest(BOOK);
		HandleOrder handleOrder = new HandleOrder();

		OrderResponse orderResponse = handleOrder.handleOrder(orderRequest);

		assertEquals(true, orderResponse.isStatus());
		assertEquals("2", orderResponse.getProductType().getShortCode());
	}

	@Test
	public void test_Membership(){
		OrderRequest orderRequest = new OrderRequest(MEMBERSHIP);
		HandleOrder handleOrder = new HandleOrder();

		OrderResponse orderResponse = handleOrder.handleOrder(orderRequest);

		assertEquals(true, orderResponse.isStatus());
		assertEquals("3", orderResponse.getProductType().getShortCode());
	}

	@Test
	public void test_Upgrade(){
		OrderRequest orderRequest = new OrderRequest(UPGRADE);
		HandleOrder handleOrder = new HandleOrder();

		OrderResponse orderResponse = handleOrder.handleOrder(orderRequest);

		assertEquals(true, orderResponse.isStatus());
		assertEquals("4", orderResponse.getProductType().getShortCode());
	}

	@Test
	public void test_Membership_Or_Upgrade(){
		OrderRequest orderRequest = new OrderRequest(MEMBERSHIP_OR_UPGRADE);
		HandleOrder handleOrder = new HandleOrder();

		OrderResponse orderResponse = handleOrder.handleOrder(orderRequest);

		assertEquals(true, orderResponse.isStatus());
		assertEquals("5", orderResponse.getProductType().getShortCode());
	}

	@Test
	public void test_Video(){
		OrderRequest orderRequest = new OrderRequest(VIDEO);
		HandleOrder handleOrder = new HandleOrder();

		OrderResponse orderResponse = handleOrder.handleOrder(orderRequest);

		assertEquals(true, orderResponse.isStatus());
		assertEquals("6", orderResponse.getProductType().getShortCode());
	}

	@Test
	public void test_Physical_Or_Book(){
		OrderRequest orderRequest = new OrderRequest(PHYSICAL_OR_BOOK);
		HandleOrder handleOrder = new HandleOrder();

		OrderResponse orderResponse = handleOrder.handleOrder(orderRequest);

		assertEquals(true, orderResponse.isStatus());
		assertEquals("7", orderResponse.getProductType().getShortCode());
	}

}
