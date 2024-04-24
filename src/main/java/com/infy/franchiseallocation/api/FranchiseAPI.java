package com.infy.franchiseallocation.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.infy.franchiseallocation.dto.FranchiseDTO;
import com.infy.franchiseallocation.exception.FranchiseAllocationException;
import com.infy.franchiseallocation.service.FranchiseService;

public class FranchiseAPI {
	private FranchiseService franchiseService;
	
	public ResponseEntity<List<FranchiseDTO>>getFranchiseReport(String location) throws FranchiseAllocationException{
		return null;
		
	}
	public ResponseEntity<FranchiseDTO> allocateFranchise(FranchiseDTO franchiseDTO) throws FranchiseAllocationException{
		return null;
		
	}

}
