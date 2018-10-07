package org.drasto7.claimcontroller.service;

import java.util.List;

import org.drasto7.claimcontroller.dao.IClaimDao;
import org.drasto7.claimcontroller.model.Claim;
import org.springframework.beans.factory.annotation.Autowired;

public class ClaimService implements IClaimService{
	
	@Autowired
	private IClaimDao claimDao;

	@Override
	public List<Claim> getClaimsBySubject(String subjectNumber) {
		return claimDao.getClaimsBySubject(subjectNumber);
		
	}

	@Override
	public Claim getClaimByClaimNumber(String claimNumber) {
		
		return claimDao.getClaimByClaimNumber(claimNumber);
	}

	@Override
	public List<Claim> getClaimsByAuthNumber(String authNumber) {
		
		return claimDao.getClaimsByAuthNumber(authNumber);
	}

}