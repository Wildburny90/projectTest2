package com.scmaster.cheesemap.vo;

public class MyMap {
	private String map_id;
	private String map_name;
	private String map_content;
	private String map_create_date;
	private String map_modify_date;
	private String mem_id;

	public MyMap(String map_id, String map_name, String map_content, String map_create_date, String map_modify_date,
			String mem_id) {
		super();
		this.map_id = map_id;
		this.map_name = map_name;
		this.map_content = map_content;
		this.map_create_date = map_create_date;
		this.map_modify_date = map_modify_date;
		this.mem_id = mem_id;
	}

	public MyMap() {
		super();
	}

	public String getMap_id() {
		return map_id;
	}

	public void setMap_id(String map_id) {
		this.map_id = map_id;
	}

	public String getMap_name() {
		return map_name;
	}

	public void setMap_name(String map_name) {
		this.map_name = map_name;
	}

	public String getMap_content() {
		return map_content;
	}

	public void setMap_content(String map_content) {
		this.map_content = map_content;
	}

	public String getMap_create_date() {
		return map_create_date;
	}

	public void setMap_create_date(String map_create_date) {
		this.map_create_date = map_create_date;
	}

	public String getMap_modify_date() {
		return map_modify_date;
	}

	public void setMap_modify_date(String map_modify_date) {
		this.map_modify_date = map_modify_date;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	@Override
	public String toString() {
		return "MyMap [map_id=" + map_id + ", map_name=" + map_name + ", map_content=" + map_content
				+ ", map_create_date=" + map_create_date + ", map_modify_date=" + map_modify_date + ", mem_id=" + mem_id
				+ "]";
	}

}
