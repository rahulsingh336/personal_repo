package com.example.order.processing.rules;

import com.example.order.processing.dto.OrderRequest;
import com.example.order.processing.dto.OrderResponse;

public abstract class AbstractRule implements IRule {

	protected IRule nextRule;

	public void setNextRule(IRule nextRule) {
		this.nextRule = nextRule;
	}
/*
	public final OrderResponse applyChain(OrderRequest orderRequest) {
		if (process(orderRequest)) {
			return true;
		}
		return applyNextRuleIfExist(orderRequest);
	}*/

	protected OrderResponse applyNextRuleIfExist(OrderRequest orderRequest) {
		if (this.nextRule != null) {
			return this.nextRule.process(orderRequest);
		}
		return null;
	}
}
