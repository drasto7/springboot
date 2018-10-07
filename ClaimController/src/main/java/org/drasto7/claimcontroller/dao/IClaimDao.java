package org.drasto7.claimcontroller.dao;

import java.util.List;

import org.drasto7.claimcontroller.model.Claim;

public interface IClaimDao {
	
	List<Claim> getClaimsBySubject(String subjectNumber);
	Claim getClaimByClaimNumber(String claimNumber);
	List<Claim> getClaimsByAuthNumber(String authNumber);
}
