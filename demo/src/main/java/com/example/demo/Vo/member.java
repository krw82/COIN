package com.example.demo.Vo;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.common.common;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



public class member {
	String MEMBER_NUMBER;
	String NAME;
	String ID;
	String PASSWORD;
	String PHONE_NUMBER;
	String EMAL;

	public String getMEMBER_NUMBER() {
		return MEMBER_NUMBER;
	}
	public void setMEMBER_NUMBER(String mEMBER_NUMBER) {
		MEMBER_NUMBER = mEMBER_NUMBER;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPASSWORD() {
		
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	public String getEMAL() {
		return EMAL;
	}
	public void setEMAL(String eMAL) {
		EMAL = eMAL;
	}
	@Override
	public String toString() {
		return "member [MEMBER_NUMBER=" + MEMBER_NUMBER + ", NAME=" + NAME + ", ID=" + ID + ", PASSWORD=" + PASSWORD
				+ ", PHONE_NUMBER=" + PHONE_NUMBER + ", EMAL=" + EMAL + "]";
	}
	

}
