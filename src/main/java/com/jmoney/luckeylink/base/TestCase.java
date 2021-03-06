package com.jmoney.luckeylink.base;

import java.util.List;

public class TestCase extends TestBase{
	
	private List<TestStep> steps;

	public List<TestStep> getSteps() {
		return steps;
	}

	public void setSteps(List<TestStep> steps) {
		this.steps = steps;
	}

	@Override
	public String toString() {
		return "TestCase "+super.getName()+" [steps=" + steps + "]";
	}
}
