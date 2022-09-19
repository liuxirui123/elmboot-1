package com.neusoft.elmboot.po;

public class Address {
    private int addressId;
    private double longitudes;//经度
    private double latitudes;//纬度

    private String addressExplain;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    private static final double EARTH_RADIUS = 6378.137;

    public Address(double longitudes, double latitudes) {
        this.longitudes = longitudes;
        this.latitudes = latitudes;
    }

    public Address(double longitudes, double latitudes, String addressExplain) {
        this(longitudes, latitudes);
        this.addressExplain = addressExplain;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", longitudes=" + longitudes +
                ", latitudes=" + latitudes +
                ", addressExplain='" + addressExplain + '\'' +
                '}';
    }

    public static int getDistance(Address p1, Address p2) {//返回两个坐标的距离 /m

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

    public int getAddressId() {
        return addressId;
    }

    public double getLongitudes() {
        return longitudes;
    }

    public double getLatitudes() {
        return latitudes;
    }

    public String getAddressExplain() {
        return addressExplain;
    }
}
