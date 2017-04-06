package com.scmaster.cheesemap.vo;

public class MymapTag {

	private String tag_name;
	private String map_id;

	public MymapTag(String tag_name, String map_id) {
		super();
		this.tag_name = tag_name;
		this.map_id = map_id;
	}

	public MymapTag() {
		super();
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public String getMap_id() {
		return map_id;
	}

	public void setMap_id(String map_id) {
		this.map_id = map_id;
	}

	@Override
	public String toString() {
		return "MymapTag [tag_name=" + tag_name + ", map_id=" + map_id + "]";
	}

}
