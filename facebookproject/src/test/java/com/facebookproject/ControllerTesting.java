package com.facebookproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.facebookproject.controller.FacebookController;
import com.facebookproject.controller.FacebookControllerInterface;
import com.facebookproject.entity.FacebookUser;

public class ControllerTesting {
	
	FacebookControllerInterface fc=null;

	@Before
	public void setUp() throws Exception {
		fc=new FacebookController();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateProfileController() {
		int i=fc.createProfileController();
		assert i>0:"test case failed";
	}

	@Test
	public void testViewAllProfileController() {
		int i=fc.viewAllProfileController();
		assert i>0:"test case failed";
	}

	@Test
	public void testViewProfileController() {
		int i=fc.viewProfileController();
		assert i>0:"test case failed";
	}

	@Test
	public void testDeleteProfileController() {
		int i=fc.deleteProfileController();
		assert i>0:"test case failed";
	}

	@Test
	public void testSearchProfileController() {
		int i = fc.searchProfileController();
		assert i>0:"test case failed";
	}

	@Test
	public void testEditProfileController() {
		int i=fc.editProfileController();
		assert i>0:"test case failed";
	}

	@Test
	public void testSignIN() {
		
		FacebookUser i=fc.signIN();
		assert i!=null:"test case failed";
	}

	@Test
	public void testCreateTimeline() {
		
	}

}
