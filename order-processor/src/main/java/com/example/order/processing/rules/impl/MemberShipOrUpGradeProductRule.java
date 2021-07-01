package com.example.order.processing.rules.impl;

import com.example.order.processing.ProductType;
import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;
import com.example.order.processing.rules.AbstractRule;

public class MemberShipOrUpGradeProductRule extends AbstractRule {

	@Override
	public OrderResponse process(OrderRequest orderRequest) {
		if(orderRequest.isMemberShipOrUpGrade()){
			//Do Processing Here for MEMBERSHIP_OR_UPGRADE Product Rule
			OrderResponse orderResponse = new OrderResponse();
			orderResponse.setProductType(ProductType.MEMBERSHIP_OR_UPGRADE);
			orderResponse.setStatus(Boolean.TRUE);
			return orderResponse;
		}
		return applyNextRuleIfExist(orderRequest);
	}

	@Override
	public int order() {
		return 7;
	}
}
