package com.neusoft.elmboot.po;

public class Position {
	
	private double longitudes;//经度
	private double latitudes;//纬度
	
	private static final double EARTH_RADIUS = 6378.137;
	
	public static final Position TJULibrary = new Position(117.320578, 39.003357);//郑东图书馆
	public static final Position TJUBuilding55 =new Position(117.32064,39.005848);//55教
	public static final Position TJUGym=new Position(117.326274,39.007984);
	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}
	
	
	Position(double longitudes, double latitudes) {
		this.longitudes = longitudes;
		this.latitudes = latitudes;
	}
	
	
	public static int getDistance(Position p1, Position p2) {//返回两个坐标的距离 /m
		
		double patm = 2;
		double radLat1 = rad(p1.latitudes);
		double radLat2 = rad(p2.latitudes);
		double difference = radLat1 - radLat2;
		double m_difference = rad(p1.longitudes) - rad(p2.longitudes);
		double distance = patm * Math.asin(Math.sqrt(Math.pow(Math.sin(difference / patm), patm)
				+ Math.cos(radLat1) * Math.cos(radLat2)
				* Math.pow(Math.sin(m_difference / patm), patm)));
		distance *= EARTH_RADIUS * 1000;
		return (int) distance;
	}
}
