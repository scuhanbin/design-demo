package com.hanbin.template;

public abstract class AbstractCaculatorService {
	public void caculator(String numStr, String split) {
		int[] nums = parseNums(numStr, split);

		caculator(nums[0], nums[1]);
	}

	protected abstract void caculator(int a, int b);

	private int[] parseNums(String numStr, String split) {
		String[] numstrs = numStr.split(split);

		int[] nums = new int[2];

		nums[0] = Integer.valueOf(numstrs[0]);
		nums[1] = Integer.valueOf(numstrs[1]);
		return nums;
	}
}
