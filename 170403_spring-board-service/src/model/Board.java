package model;

import java.util.Date;

public class Board {
	private int num;
	private String pass;
	private String name;
	private String eamil;
	private String title;
	private String content;
	private int readCount;
	private Date writeDate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "Board [num=" + num + ", pass=" + pass + ", name=" + name + ", eamil=" + eamil + ", title=" + title
				+ ", content=" + content + ", readCount=" + readCount + ", writeDate=" + writeDate + "]";
	}
}
