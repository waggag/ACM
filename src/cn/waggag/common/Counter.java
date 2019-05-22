package cn.waggag.common;

/**
 * 计数器的简单实现
 * @author 王港 2019年3月8日上午2:11:45
 */
public class Counter {

	private final String name;
	private int count;

	public Counter(String name) {
		super();
		this.name = name;
	}

	public void increment() {
		count++;
	}

	public int tally() {
		return count;
	}

	@Override
	public String toString() {
		return count + " " + name;
	}

}
