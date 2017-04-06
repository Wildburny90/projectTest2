package com.scmaster.cheesemap.vo;

public class MapToBoard {
	private int mtb_route;
	private String boa_id;
	private String map_id;

	public MapToBoard(int mtb_route, String boa_id, String map_id) {
		super();
		this.mtb_route = mtb_route;
		this.boa_id = boa_id;
		this.map_id = map_id;
	}

	public MapToBoard() {
		super();
	}

	public int getMtb_route() {
		return mtb_route;
	}

	public void setMtb_route(int mtb_route) {
		this.mtb_route = mtb_route;
	}

	public String getBoa_id() {
		return boa_id;
	}

	public void setBoa_id(String boa_id) {
		this.boa_id = boa_id;
	}

	public String getMap_id() {
		return map_id;
	}

	public void setMap_id(String map_id) {
		this.map_id = map_id;
	}

	@Override
	public String toString() {
		return "MapToBoard [mtb_route=" + mtb_route + ", boa_id=" + boa_id + ", map_id=" + map_id + "]";
	}

}
