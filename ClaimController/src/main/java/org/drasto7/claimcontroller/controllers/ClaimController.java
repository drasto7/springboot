package org.drasto7.claimcontroller.controllers;

import java.util.List;

import org.drasto7.claimcontroller.response.ClaimResponse;
import org.drasto7.claimcontroller.service.IClaimService;
import org.springframework.beans.factory.annotation.Autowired;
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
		claimService.getClaimsBySubject(subjectNumber);
		return null;
	
		
	}

}
