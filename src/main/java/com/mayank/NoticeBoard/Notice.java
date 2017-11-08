package com.mayank.NoticeBoard;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Notice implements Serializable {
    
	private ArrayList<String> notice;
	
	

	public Notice() {
		super();
	}

	public Notice(ArrayList<String> notice) {
		super();
		this.notice = notice;
	}

	public ArrayList<String> getNotice() {
		return notice;
	}

	public void setNotice(ArrayList<String> notice) {
		this.notice = notice;
	}

	@Override
	public String toString() {
		return "Notice [notice=" + notice + "]";
	}
	
}
