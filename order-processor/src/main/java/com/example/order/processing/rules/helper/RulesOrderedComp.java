package com.example.order.processing.rules.helper;

import com.example.order.processing.rules.RuleOrder;

import java.util.Comparator;

public class RulesOrderedComp implements Comparator<RuleOrder> {

	@Override
	public int compare(RuleOrder o1, RuleOrder o2) {
		if (o1.order() > o2.order()) {
			return 1;
		}

		else if (o1.order() < o2.order()) {
			return -1;
		}

		return 0;
	}
}
