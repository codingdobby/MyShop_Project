package Board;

import java.sql.Timestamp;

public class BoardVO {
	private int NUM;
	private String WRITER;
	private String TITLE;
	private int READCOUNT;
	private int REF;
	private int STEP;
	private int DEPTH;
	private Timestamp REGDATE;
	private String CONTENT;
	private String image1;
	private String image2;
	private String image3;

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public int getNUM() {
		return NUM;
	}

	public void setNUM(int nUM) {
		NUM = nUM;
	}

	public String getWRITER() {
		return WRITER;
	}

	public void setWRITER(String wRITER) {
		WRITER = wRITER;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public int getREADCOUNT() {
		return READCOUNT;
	}

	public void setREADCOUNT(int rEADCOUNT) {
		READCOUNT = rEADCOUNT;
	}

	public int getREF() {
		return REF;
	}

	public void setREF(int rEF) {
		REF = rEF;
	}

	public int getSTEP() {
		return STEP;
	}

	public void setSTEP(int sTEP) {
		STEP = sTEP;
	}

	public int getDEPTH() {
		return DEPTH;
	}

	public void setDEPTH(int dEPTH) {
		DEPTH = dEPTH;
	}

	public Timestamp getREGDATE() {
		return REGDATE;
	}

	public void setREGDATE(Timestamp rEGDATE) {
		REGDATE = rEGDATE;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}

}
