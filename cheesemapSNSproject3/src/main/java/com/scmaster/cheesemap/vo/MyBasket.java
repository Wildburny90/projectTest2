package com.scmaster.cheesemap.vo;

public class MyBasket {

    private String mem_id;
    private String boa_latitude;
    private String boa_longitude;
    private String place_name;

    public MyBasket() {
    }

    public MyBasket(String mem_id, String boa_latitude, String boa_longitude, String place_name) {
        this.mem_id = mem_id;
        this.boa_latitude = boa_latitude;
        this.boa_longitude = boa_longitude;
        this.place_name = place_name;
    }

    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getBoa_latitude() {
        return boa_latitude;
    }

    public void setBoa_latitude(String boa_latitude) {
        this.boa_latitude = boa_latitude;
    }

    public String getBoa_longitude() {
        return boa_longitude;
    }

    public void setBoa_longitude(String boa_longitude) {
        this.boa_longitude = boa_longitude;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    @Override
    public String toString() {
        return "MyBasket{" +
                "mem_id='" + mem_id + '\'' +
                ", boa_latitude='" + boa_latitude + '\'' +
                ", boa_longitude='" + boa_longitude + '\'' +
                ", place_name='" + place_name + '\'' +
                '}';
    }

}
