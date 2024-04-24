package com.infy.franchiseallocation.service;

import java.util.List;

import com.infy.franchiseallocation.dto.FranchiseDTO;
import com.infy.franchiseallocation.exception.FranchiseAllocationException;
import com.infy.franchiseallocation.repository.FranchiseRepository;

public class FranchiseServiceImpl implements FranchiseService {

	private FranchiseRepository franchiseRepository;
	@Override
	public List<FranchiseDTO> getFranchiseReport(String location) throws FranchiseAllocationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FranchiseDTO allocateFranchise(FranchiseDTO franchiseDTO) throws FranchiseAllocationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculateTenure(Double quotedPrice) {
		// TODO Auto-generated method stub
		return null;
	}

}
