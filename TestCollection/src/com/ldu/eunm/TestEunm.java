package com.ldu.eunm;

public class TestEunm {
	public static void main(String[] args) {
		Season[] sea=Season.values();
		for(int i=0;i<sea.length;i++){
			System.out.println(sea[i]);
		}
	}
}

enum Season{
	SPRING("spring","春暖花开"),
	SUMMER("summer","炎炎夏日"),
	AUTUMN("autumn","秋高气爽"),
	WINTER("winter","凛冬将至");
	
	private final String seasonName;
	private final String seasonDesc;
		
	private Season(String seasonName,String seasonDesc){
		this.seasonName=seasonName;
		this.seasonDesc=seasonDesc;
	}
	
	public String getSeasonName() {
		return seasonName;
	}
	public String getSeasonDesc() {
		return seasonDesc;
	}

	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc="
				+ seasonDesc + "]";
	}
}