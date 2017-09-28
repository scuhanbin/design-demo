package com.hanbin.strategy;

public class BikeTravelStrategy implements TravelStrategy {

	@Override
	public void travel() {
		System.out.println("骑自行车旅游。。。");
	}

}
