package com.scmaster.cheesemap.vo;

public class BoardTag {
	private String tag_name;
	private String boa_id;

	public BoardTag(String tag_name, String boa_id) {
		super();
		this.tag_name = tag_name;
		this.boa_id = boa_id;
	}

	public BoardTag() {
		super();
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public String getBoa_id() {
		return boa_id;
	}

	public void setBoa_id(String boa_id) {
		this.boa_id = boa_id;
	}

	@Override
	public String toString() {
		return "BoardTag [tag_name=" + tag_name + ", boa_id=" + boa_id + "]";
	}

}
