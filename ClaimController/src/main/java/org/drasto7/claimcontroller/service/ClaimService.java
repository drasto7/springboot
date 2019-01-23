package org.drasto7.claimcontroller.service;

import java.util.List;

import org.drasto7.claimcontroller.dao.ClaimJPARepository;
import org.drasto7.claimcontroller.dao.IClaimDao;
import org.drasto7.claimcontroller.model.Claim;
import org.drasto7.claimcontrolller.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimService implements IClaimService{
	
	@Autowired
	private IClaimDao claimDao;
	
	@Autowired
	private ClaimJPARepository claimRepository;

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
	
	@Override
	public Claim saveClaim(Claim claim){
		return claimRepository.save(claim);
		
	}
	
	@Override
	public void deleteClaimByClaimNumber(String claimNumber) throws ResourceNotFoundException{
		claimRepository.findById(claimNumber).orElseThrow(()->new ResourceNotFoundException("Claim Not found for this claim Number "+claimNumber ));
		claimRepository.deleteById(claimNumber);
		
	}

}
