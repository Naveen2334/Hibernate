package com.jsp.hibernate_one_to_many_unidirectional.Controller;

import com.jsp.hibernate_one_to_many_unidirectional.Branch;
import com.jsp.hibernate_one_to_many_unidirectional.Service.BranchService;

public class BranchInsertController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BranchService branchService = new BranchService();
		Branch branch1 = new Branch(126,"mech","F-Block");
		Branch branch2 = new Branch(124,"EC","B-Block");
		Branch branch3 =  new Branch(125,"Civil","G-Block");
		branchService.saveBranch(branch3);
		branchService.saveBranch(branch2);
		branchService.saveBranch(branch1);
		
	}

}
