package com.scmaster.cheesemap.vo;

public class Board {

	private String boa_id;
	private String boa_content;
	private String boa_create_date;
	private String boa_modify_date;
	private String boa_latitude;
	private String boa_longitude;
	private String boa_photo_savefile;
	private String boa_photo_originalfile;
	private String boa_video_originalfile;
	private String boa_video_savefile;
	private String mem_id;

	public Board(String boa_id, String boa_content, String boa_create_date, String boa_modify_date, String boa_latitude,
			String boa_longitude, String boa_photo_savefile, String boa_photo_originalfile,
			String boa_video_originalfile, String boa_video_savefile, String mem_id) {
		super();
		this.boa_id = boa_id;
		this.boa_content = boa_content;
		this.boa_create_date = boa_create_date;
		this.boa_modify_date = boa_modify_date;
		this.boa_latitude = boa_latitude;
		this.boa_longitude = boa_longitude;
		this.boa_photo_savefile = boa_photo_savefile;
		this.boa_photo_originalfile = boa_photo_originalfile;
		this.boa_video_originalfile = boa_video_originalfile;
		this.boa_video_savefile = boa_video_savefile;
		this.mem_id = mem_id;
	}

	public Board() {
		super();
	}

	public String getBoa_id() {
		return boa_id;
	}

	public void setBoa_id(String boa_id) {
		this.boa_id = boa_id;
	}

	public String getBoa_content() {
		return boa_content;
	}

	public void setBoa_content(String boa_content) {
		this.boa_content = boa_content;
	}

	public String getBoa_create_date() {
		return boa_create_date;
	}

	public void setBoa_create_date(String boa_create_date) {
		this.boa_create_date = boa_create_date;
	}

	public String getBoa_modify_date() {
		return boa_modify_date;
	}

	public void setBoa_modify_date(String boa_modify_date) {
		this.boa_modify_date = boa_modify_date;
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

	public String getBoa_photo_savefile() {
		return boa_photo_savefile;
	}

	public void setBoa_photo_savefile(String boa_photo_savefile) {
		this.boa_photo_savefile = boa_photo_savefile;
	}

	public String getBoa_photo_originalfile() {
		return boa_photo_originalfile;
	}

	public void setBoa_photo_originalfile(String boa_photo_originalfile) {
		this.boa_photo_originalfile = boa_photo_originalfile;
	}

	public String getBoa_video_originalfile() {
		return boa_video_originalfile;
	}

	public void setBoa_video_originalfile(String boa_video_originalfile) {
		this.boa_video_originalfile = boa_video_originalfile;
	}

	public String getBoa_video_savefile() {
		return boa_video_savefile;
	}

	public void setBoa_video_savefile(String boa_video_savefile) {
		this.boa_video_savefile = boa_video_savefile;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	@Override
	public String toString() {
		return "Board [boa_id=" + boa_id + ", boa_content=" + boa_content + ", boa_create_date=" + boa_create_date
				+ ", boa_modify_date=" + boa_modify_date + ", boa_latitude=" + boa_latitude + ", boa_longitude="
				+ boa_longitude + ", boa_photo_savefile=" + boa_photo_savefile + ", boa_photo_originalfile="
				+ boa_photo_originalfile + ", boa_video_originalfile=" + boa_video_originalfile
				+ ", boa_video_savefile=" + boa_video_savefile + ", mem_id=" + mem_id + "]";
	}

}
