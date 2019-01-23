package org.drasto7.claimcontroller.controllers;

import java.util.List;

import org.drasto7.claimcontroller.exception.ResourceNotFoundException;
import org.drasto7.claimcontroller.model.Claim;
import org.drasto7.claimcontroller.service.IClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("claim/v1")
public class ClaimController {
	
	@Autowired
	private IClaimService claimService;
	
	
	@GetMapping("claimBySubject/{subjectId}")
	public ResponseEntity<List<Claim>> getClaimBySubject(@PathVariable("subjectId") String subjectNumber)
	{
		List<Claim> claimList = claimService.getClaimsBySubject(subjectNumber);
		ResponseEntity<List<Claim>> response =
				new ResponseEntity<List<Claim>>(claimList,HttpStatus.FOUND);
		
		return response;
	
		
	}
	
	@GetMapping("claimByClaimNum/{claimNum}")
	public ResponseEntity<Claim> getClaimByClaimNumber(@PathVariable("claimNum") String claimNum)
	{
		Claim claim = claimService.getClaimByClaimNumber(claimNum);
		ResponseEntity<Claim> response = new ResponseEntity<Claim>(claim,HttpStatus.FOUND);
		return response;
	}
	
	@GetMapping("claimByAuthNum/{authNum}")
	public ResponseEntity<List<Claim>> getClaimByAuthNumber(@PathVariable("authNum") String authNumber)
	{
		List<Claim> claimList = claimService.getClaimsByAuthNumber(authNumber);
		ResponseEntity<List<Claim>> response = new ResponseEntity<List<Claim>>(claimList,HttpStatus.FOUND);
		return response;
	}
	
	@PostMapping(path="saveClaim",produces="application/json" ,consumes="application/json")
	public ResponseEntity<Claim> saveClaim(@RequestBody Claim claim){
		Claim savedclaim = claimService.saveClaim(claim);
		ResponseEntity<Claim> response = new ResponseEntity<Claim>(savedclaim,HttpStatus.CREATED);
		return response;
		
	}
	
	@DeleteMapping("deleteClaimByClaimNum/{claimNumber}")
	public ResponseEntity<?> deleteClaimByClaimNumber(@PathVariable("claimNumber") String claimNumber)
	throws ResourceNotFoundException
	{
		claimService.deleteClaimByClaimNumber(claimNumber);
		ResponseEntity<?> response = new ResponseEntity<>(HttpStatus.OK);
		return response;
	}


}
