package com.jsp.hibernate_one_to_many_unidirectional.Service;

import java.util.List;

import com.jsp.hibernate_one_to_many_unidirectional.Branch;
import com.jsp.hibernate_one_to_many_unidirectional.Dao.BranchDao;

public class BranchService {
	BranchDao branchDao = new BranchDao();
	public Branch saveBranch(Branch branch) {
		
		return branchDao.saveBranch(branch);	
	}
	//getBranchById
	public Branch getBranchById(int branchId) {
		return branchDao.getBranchById(branchId);
	}
	//display branch
	public List<Branch> displayBranch(){
		return branchDao.displayBranch();
	}

}
