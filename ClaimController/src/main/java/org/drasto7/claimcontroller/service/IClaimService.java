package org.drasto7.claimcontroller.service;

import java.util.List;

import org.drasto7.claimcontroller.exception.ResourceNotFoundException;
import org.drasto7.claimcontroller.model.Claim;


public interface IClaimService {

	List<Claim> getClaimsBySubject(String subjectNumber);
	Claim getClaimByClaimNumber(String claimNumber);
	List<Claim> getClaimsByAuthNumber(String authNumber);
	
	Claim saveClaim(Claim claim);
	void deleteClaimByClaimNumber(String claimNumber)throws ResourceNotFoundException;

}
