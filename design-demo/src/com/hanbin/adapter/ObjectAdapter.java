package com.hanbin.adapter;

public class ObjectAdapter implements Source {
	private final Target taget;

	public ObjectAdapter(Target target) {
		this.taget = target;
	}

	@Override
	public void toExecute() {
		taget.execute();
	}
}
