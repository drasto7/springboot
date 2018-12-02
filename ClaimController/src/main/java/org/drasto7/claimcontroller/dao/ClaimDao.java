package org.drasto7.claimcontroller.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.drasto7.claimcontroller.model.Claim;
import org.springframework.stereotype.Repository;

@Repository
public class ClaimDao implements IClaimDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Claim> getClaimsBySubject(String subjectNumber) {
		String hql=" From Claim as claim where claim.subjectId =? Order by claim.claimNumber";
		List<Claim> result = (List<Claim>)entityManager.createQuery(hql)
														.setParameter(1, subjectNumber)
														.getResultList();
		return result;
	}

	@Override
	public Claim getClaimByClaimNumber(String ClaimNumber) {
		String hql=" From Claim as claim where claim.claimNumber =? Order by claim.claimNumber";
		Claim result = (Claim)entityManager.createQuery(hql)
														.setParameter(1, ClaimNumber)
														.getSingleResult();
		return result;
	}
	
	@Override
	public List<Claim> getClaimsByAuthNumber(String authNumber){
		
		String hql=" From Claim as claim where claim.authNumber =? Order by claim.claimNumber";
		List<Claim> result = (List<Claim>)entityManager.createQuery(hql)
														.setParameter(1, authNumber)
														.getResultList();
		return result;

	}


}
