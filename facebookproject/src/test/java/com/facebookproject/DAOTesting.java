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

public class DAOTesting {
	
	FacebookDAOInterface fd=null;

	@Before
	public void setUp() throws Exception {
		fd=new FacebookDAO();
	}

	@After
	public void tearDown() throws Exception {
		fd=null;
	}

	@Test
	public void testCreateProfileDAO() {
		FacebookUser fu=new FacebookUser();
		fu.setName("janardhan");
		fu.setPassword("jana");
		fu.setEmail("jana@gmail.com");
		fu.setAddress("adoni");
		int i=fd.createProfileDAO(fu);
		assert i>0:"test case failed";
	}

	@Test
	public void testViewAllProfileDAO() {
		FacebookUser fu=new FacebookUser();
		List<FacebookUser> ll=new ArrayList<FacebookUser>();
		ll=fd.viewAllProfileDAO();
		assert ll!=null:"test case failed";
	}

	@Test
	public void testViewProfileDAO() {
		FacebookUser fu=new FacebookUser();
		fu.setEmail("teje@gmail.com");
		FacebookUser v=fd.viewProfileDAO(fu);
		assert v!=null:"test case failed";
	}

	@Test
	public void testDeleteProfileDAO() {
		FacebookUser fu=new FacebookUser();
		fu.setName("janardhan");
		fu.setPassword("jana");
		fu.setEmail("jana@gmail.com");
		fu.setAddress("adoni");
		int i=fd.deleteProfileDAO(fu);
		assert i>0:"test case failed";
	}

	@Test
	public void testSearchprofileDAO() {
		FacebookUser fu=new FacebookUser();
		fu.setName("muni");
		FacebookUser v=null;
		List<FacebookUser> ll=new ArrayList<FacebookUser>();
		ll=fd.searchprofileDAO(fu);
		assert ll!=null:"test case failed";
		
	}

	@Test
	public void testEditProfileDAO() {
		FacebookUser fu=new FacebookUser();
		fu.setName("tejesh");
		fu.setPassword("teje");
		fu.setEmail("teje@gmail.com");
		fu.setAddress("nandyal");
		int i=fd.editProfileDAO(fu);
		assert i>0:"test case failed";
	}

	@Test
	public void testSignINDAO() {
		FacebookUser fu=new FacebookUser();
		fu.setEmail("prud@gmail.com");
		fu.setPassword("prud");
		
		FacebookUser i=fd.signINDAO(fu);
		assert i!=null:"test case failed";
		
	}

	@Test
	public void testCreateTimelineService() {
		
	}

}
