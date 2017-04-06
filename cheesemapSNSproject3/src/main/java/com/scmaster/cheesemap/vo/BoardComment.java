package com.scmaster.cheesemap.vo;

public class BoardComment {
	private String com_id;
	private String com_content;
	private String com_create_date;
	private String com_modify_date;
	private String mem_id;
	private String boa_id;

	public BoardComment(String com_id, String com_content, String com_create_date,
			String com_modify_date, String mem_id, String boa_id) {
		super();
		this.com_id = com_id;
		this.com_content = com_content;
		this.com_create_date = com_create_date;
		this.com_modify_date = com_modify_date;
		this.mem_id = mem_id;
		this.boa_id = boa_id;
	}

	public BoardComment() {
		super();
	}

	public String getCom_id() {
		return com_id;
	}

	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}

	public String getCom_content() {
		return com_content;
	}

	public void setCom_content(String com_content) {
		this.com_content = com_content;
	}

	public String getCom_create_date() {
		return com_create_date;
	}

	public void setCom_create_date(String com_create_date) {
		this.com_create_date = com_create_date;
	}

	public String getCom_modify_date() {
		return com_modify_date;
	}

	public void setCom_modify_date(String com_modify_date) {
		this.com_modify_date = com_modify_date;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getBoa_id() {
		return boa_id;
	}

	public void setBoa_id(String boa_id) {
		this.boa_id = boa_id;
	}

	@Override
	public String toString() {
		return "BoardComment [com_id=" + com_id + ", com_content=" + com_content
				+ ", com_create_date=" + com_create_date + ", com_modify_date=" + com_modify_date
				+ ", mem_id=" + mem_id + ", boa_id=" + boa_id + "]";
	}

}
