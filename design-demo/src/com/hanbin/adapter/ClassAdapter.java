package com.hanbin.adapter;

public class ClassAdapter extends Target implements Source {
	@Override
	public void toExecute() {
		execute();
	}
}
