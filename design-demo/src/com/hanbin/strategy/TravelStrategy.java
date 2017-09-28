package com.hanbin.strategy;

/**
 * 抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某具体策略定义的算法。
 */
public interface TravelStrategy {
	void travel();
}
