package org.drasto7.claimcontroller.controllers;

import java.util.ArrayList;
import java.util.List;

import org.drasto7.claimcontroller.model.Claim;
import org.drasto7.claimcontroller.response.ClaimResponse;
import org.drasto7.claimcontroller.service.IClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("claim")
public class ClaimController {
	
	@Autowired
	private IClaimService claimService;
	
	
	@GetMapping("claimBySubject/{subjectId}")
	public ResponseEntity<List<ClaimResponse>> getClaimBySubject(@PathVariable("subjectId") String subjectNumber)
	{
		List<Claim> claimList = claimService.getClaimsBySubject(subjectNumber);
		List<ClaimResponse> claimResponseList = new ArrayList<ClaimResponse>();
		for(Claim claim:claimList){
			ClaimResponse claimResponse= new ClaimResponse();
			claimResponse.setAuthNumber(claim.getAuthNumber());
			claimResponse.setClaimAmount(claim.getClaimAmount());
			claimResponse.setClaimEndDate(claim.getClaimEndDate());
			claimResponse.setClaimNumber(claim.getClaimNumber());
			claimResponse.setClaimStartDate(claim.getClaimStartDate());
			claimResponse.setClaimStatus(claim.getClaimStatus());
			claimResponse.setSubjectId(claim.getSubjectId());
			claimResponseList.add(claimResponse);
		}
		ResponseEntity<List<ClaimResponse>> response =
				new ResponseEntity<List<ClaimResponse>>(claimResponseList,HttpStatus.FOUND);
		return response;
	
		
	}

}
