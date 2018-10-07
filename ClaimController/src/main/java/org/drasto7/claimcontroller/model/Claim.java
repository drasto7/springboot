package org.drasto7.claimcontroller.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name="Claim")
public class Claim implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="claimNumber")
	private String claimNumber;
	
	@Version
	private Integer version;
	
	@Column(name="claimStatus")
	private String claimStatus;
	
	@Column(name="claimAmount")
	private String claimAmount;
	
	@Column(name="claimStartDate")
	private String claimStartDate;
	
	@Column(name="claimEndDate")
	private String claimEndDate;

	@Column(name="subjectId")
	private String subjectId;
	
	@Column(name="authNumber")
	private String authNumber;
	
	
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


	
}
