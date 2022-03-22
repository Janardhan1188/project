package com.facebookproject;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.facebookproject.DAO.FacebookDAO;
import com.facebookproject.DAO.FacebookDAOInterface;
import com.facebookproject.entity.FacebookUser;
import com.facebookproject.entity.TimelineDetails;
import com.facebookproject.service.FacebookService;
import com.facebookproject.service.FacebookServiceInterface;

public class ServiceTesting {
	
	FacebookServiceInterface fs=null;

	@Before
	public void setUp() throws Exception {
		fs=new FacebookService();
	}

	@After
	public void tearDown() throws Exception {
		fs=null;
	}

	@Test
	public void testCreateProfileService() {
		FacebookUser fu=new FacebookUser();
		fu.setName("janardhan");
		fu.setPassword("jana");
		fu.setEmail("jana@gmail.com");
		fu.setAddress("adoni");
		int i=fs.createProfileService(fu);
		assert i>0:"test case failed";
	}

	@Test
	public void testViewAllProfileService() {
		FacebookUser fu=new FacebookUser();
		List<FacebookUser> ll=new ArrayList<FacebookUser>();
		ll=fs.viewAllProfileService();
		assert ll!=null:"test case failed";
	}

	@Test
	public void testViewProfileService() {
		FacebookUser fu=new FacebookUser();
		fu.setEmail("teje@gmail.com");
		FacebookUser v=fs.viewProfileService(fu);
		assert v!=null:"test case failed";
	}

	@Test
	public void testDeleteProfileService() {
		FacebookUser fu=new FacebookUser();
		fu.setName("janardhan");
		fu.setPassword("jana");
		fu.setEmail("jana@gmail.com");
		fu.setAddress("adoni");
		int i=fs.deleteProfileService(fu);
		assert i>0:"test case failed";
	}

	@Test
	public void testSearchProfileService() {
		FacebookUser fu=new FacebookUser();
		fu.setName("muni");
		FacebookUser v=null;
		List<FacebookUser> ll=new ArrayList<FacebookUser>();
		ll=fs.searchProfileService(fu);
		assert ll!=null:"test case failed";
	}

	@Test
	public void testEditProfileService() {
		FacebookUser fu=new FacebookUser();
		fu.setName("tejesh");
		fu.setPassword("teje");
		fu.setEmail("teje@gmail.com");
		fu.setAddress("nandyal");
		int i=fs.editProfileService(fu);
		assert i>0:"test case failed";
	}

	@Test
	public void testSignINService() {
		FacebookUser fu=new FacebookUser();
		fu.setEmail("prud@gmail.com");
		fu.setPassword("prud");
		
		FacebookUser i=fs.signINService(fu);
		assert i!=null:"test case failed";
	}

	@Test
	public void testCreateTimelineService() {
		
	}

}
