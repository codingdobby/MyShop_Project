package Admin;

import java.sql.Date;


public class EventVO {
private int event_num;
private String event_title; 
private String event_content; 
private String event_content_img; 
private Date start_date;
private Date end_date;
private Date regdate;
private int readcount;





public Date getRegdate() {
	return regdate;
}
public void setRegdate(Date regdate) {
	this.regdate = regdate;
}
public int getReadcount() {
	return readcount;
}
public void setReadcount(int readcount) {
	this.readcount = readcount;
}
public int getEvent_num() {
	return event_num;
}
public void setEvent_num(int event_num) {
	this.event_num = event_num;
}
public String getEvent_title() {
	return event_title;
}
public void setEvent_title(String event_title) {
	this.event_title = event_title;
}
public String getEvent_content() {
	return event_content;
}
public void setEvent_content(String event_content) {
	this.event_content = event_content;
}
public String getEvent_content_img() {
	return event_content_img;
}
public void setEvent_content_img(String event_content_img) {
	this.event_content_img = event_content_img;
}
public Date getStart_date() {
	return start_date;
}
public void setStart_date(Date start_date) {
	this.start_date = start_date;
}
public Date getEnd_date() {
	return end_date;
}
public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}




}
