package com.hanbin.strategy;

import org.junit.Test;

/**
 * 策略模式 :定义一系列的算法,把每一个算法封装起来, 并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化
 */
public class StrategyTest {
	@Test
	public void test() {
		PersonContext personContext = new PersonContext(new TrainTravelStrategy());

		personContext.travel();

		PersonContext personContext1 = new PersonContext(new BikeTravelStrategy());

		personContext1.travel();
	}
}
