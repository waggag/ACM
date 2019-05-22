package cn.waggag.test;

import java.util.Scanner;

public class Main1471 {
	/**
	 * 聪聪和可可是兄弟俩，他们俩经常为了一些琐事打起来，例如家中只剩下最后一根冰棍而两人都想吃、两个人都想玩儿电脑（可是他们家只有一台电脑）……
	 * 遇到这种问题，一般情况下石头剪刀布就好了，可是他们已经玩儿腻了这种低智商的游戏。他们的爸爸快被他们的争吵烦死了，
	 * 所以他发明了一个新游戏：由爸爸在纸上画n个“点”，并用n-1条“边”把这n个“点”恰好连通（其实这就是一棵树）。并且每条“边”上都有一个数。
	 * 接下来由聪聪和可可分别随即选一个点（当然他们选点时是看不到这棵树的），如果两个点之间所有边上数的和加起来恰好是3的倍数，
	 * 则判聪聪赢，否则可可赢。聪聪非常爱思考问题，在每次游戏后都会仔细研究这棵树，希望知道对于这张图自己的获胜概率是多少。
	 * 现请你帮忙求出这个值以验证聪聪的答案是否正确。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = Integer.parseInt(sc.nextLine());
		String[] data = new String[rows];
		for (int i = 0; i < rows; i++) {
			data[i] = sc.nextLine();
		}
	}
}

class Node {
	
	private Node next;
	private int value;
	private Node pre;
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getPre() {
		return pre;
	}
	public void setPre(Node pre) {
		this.pre = pre;
	}
	
	@Override
	public String toString() {
		return "Node [next=" + next + ", value=" + value + ", pre=" + pre + "]";
	}

}
