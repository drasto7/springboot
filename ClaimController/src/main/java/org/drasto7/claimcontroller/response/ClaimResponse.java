package org.drasto7.claimcontroller.response;

import java.io.Serializable;

public class ClaimResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String claimNumber;
	
	
	private String claimStatus;
	
	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimStartDate() {
		return claimStartDate;
	}

	public void setClaimStartDate(String claimStartDate) {
		this.claimStartDate = claimStartDate;
	}

	public String getClaimEndDate() {
		return claimEndDate;
	}

	public void setClaimEndDate(String claimEndDate) {
		this.claimEndDate = claimEndDate;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getAuthNumber() {
		return authNumber;
	}

	public void setAuthNumber(String authNumber) {
		this.authNumber = authNumber;
	}

	private String claimAmount;
	
	private String claimStartDate;
	
	private String claimEndDate;

	private String subjectId;
	
	private String authNumber;
	


}
