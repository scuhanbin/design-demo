package com.hanbin.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {
	private final List<Observer> observers = new ArrayList<>();

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void del(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAll(String text) {
		for (Observer observer : observers) {
			observer.update(text);
		}
	}
}
