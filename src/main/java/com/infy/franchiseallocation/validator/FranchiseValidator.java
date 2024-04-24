package com.infy.franchiseallocation.validator;

import java.time.LocalDate;

import com.infy.franchiseallocation.dto.FranchiseDTO;
import com.infy.franchiseallocation.exception.FranchiseAllocationException;

public class FranchiseValidator {
	
	public FranchiseValidator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void validateFranchise(FranchiseDTO franchiseDTO) throws FranchiseAllocationException
	{
		
	}
	
	public static Boolean isValidQuotedPrice(Double quotedPrice)
	{
		return null;
		
		
	}
	public static Boolean isValidDates(LocalDate registrationDate, LocalDate startUpDate)
	{
		return null;
		
	}
	public static Boolean isValidTaxNo(String taxNumber)
	{
		return null;
		
	}

}