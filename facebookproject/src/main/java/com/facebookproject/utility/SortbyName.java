package com.facebookproject.utility;

import java.util.Comparator;

import com.facebookproject.entity.FacebookUser;

public class SortbyName implements Comparator<FacebookUser>{

	@Override
	public int compare(FacebookUser u1, FacebookUser u2) {
		// TODO Auto-generated method stub
		return u1.getName().compareTo(u2.getName());
	}

}
