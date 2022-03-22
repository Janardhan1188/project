package com.facebookproject.controller;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.facebookproject.entity.FacebookUser;
import com.facebookproject.entity.TimelineDetails;
import com.facebookproject.service.FacebookServiceInterface;
import com.facebookproject.utility.ServiceFactory;
import com.facebookproject.utility.SortbyName;

public class FacebookController implements FacebookControllerInterface {
	Logger log=Logger.getLogger("FacebookController");
	FacebookServiceInterface fs=null;
	public FacebookController(){
	 fs=ServiceFactory.createObject();
	}
	public int createProfileController() {
		Scanner sc=new Scanner(System.in);
		log.info("enter name");
		String name=sc.next();
		log.info("enter password");
		String password=sc.next();
		log.info("enter email");
		String email=sc.next();
		log.info("enter address");
		String address=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);
		
		
		int i=fs.createProfileService(fu);
		if(i>0) {
			System.out.println("profilr created");
		}
		return i;
	}

	public int viewAllProfileController() {
		int i=0;
		List<FacebookUser>ll=fs.viewAllProfileService();
		if(ll!=null) {
			i=1;
		}
		
		ll.forEach(s->{
			System.out.println(s.getName());
			System.out.println(s.getPassword());
			System.out.println(s.getEmail());
			System.out.println(s.getAddress());
			});
		System.out.println("*******after sorting******");
		
		Collections.sort(ll,new SortbyName());
		
		ll.forEach(s->{
			System.out.println(s.getName());
			System.out.println(s.getPassword());
			System.out.println(s.getEmail());
			System.out.println(s.getAddress());
			});
		return i;
		
	}
	public int viewProfileController() {
		Scanner sc=new Scanner(System.in);
		int i=0;
		log.info("enter email to view profile");
		String email=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setEmail(email);
		
		FacebookUser s1= fs.viewProfileService(fu);
		
		if(s1!=null) {
			i=1;
			System.out.println("Name is "+s1.getName());
			System.out.println("password is "+s1.getPassword());
			System.out.println("email is "+s1.getEmail());
			System.out.println("address is "+s1.getAddress());
		}
		else {
			System.out.println("profile not found");
		}
		return i;
	}
	public int deleteProfileController() {
		Scanner sc=new Scanner(System.in);
		
		log.info("enter email to delete profile");
		String email=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setEmail(email);
		
		int s1=fs.deleteProfileService(fu);
		
		if(s1>0) {
			System.out.println("profile deleted");
		}
		else {
			System.out.println("could not delete profile");
		}
		return s1;
	}
	public int searchProfileController() {
		int i=0;
		Scanner sc=new Scanner(System.in);
	
		
		log.info("enter name to search profile");
		String name=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		
		List<FacebookUser>ll=fs.searchProfileService(fu);
		if(ll!=null) {
			i=1;
		}
		
		ll.forEach(s->{
			System.out.println(s.getName());
			System.out.println(s.getPassword());
			System.out.println(s.getEmail());
			System.out.println(s.getAddress());
			
			
			});
		return i;
		
	}
	public int editProfileController() {
		 log.info("your old data");
		 viewProfileController();
		 
		 Scanner sc=new Scanner(System.in);
		 log.info("enter new name");
		 String name=sc.next();
		 log.info("enter new password");
		 String password=sc.next();
		 log.info("enter old email");
		 String email=sc.next();
		 log.info("enter new address");
		 String address=sc.next();
		 FacebookUser fu=new FacebookUser();
		 fu.setName(name);
		 fu.setPassword(password);
		 fu.setEmail(email);
		 fu.setAddress(address);
		 
		 int i=fs.editProfileService(fu);
		 
		 if(i>0) {
			 System.out.println("your profile is edited "+name);
		 }
		 else {
			 System.out.println("your profile is not edited");
		 }
		return i;
	}
	
	public FacebookUser signIN() {

		Scanner sc=new Scanner(System.in);
		
		log.info("enter email to signin profile");
		String email=sc.next();
		
		log.info("enter password to signin profile");
		String password=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setEmail(email);
		fu.setPassword(password);
		
		FacebookUser s1= fs.signINService(fu);
		
		if(s1!=null) {
			System.out.println("You are signed in");
		}
		else {
			System.out.println("unable to signin");
		}
		return s1;
		
	}
	
	
	public int  createTimeline() {
		Scanner sc=new Scanner(System.in);
		
		log.info("Enter Message ID:");
		String messageid=sc.next();
		
		log.info("Enter sender ID:");
		String sender=sc.next();
		
		log.info("Enter receiver ID:");
		String receiver=sc.next();
		
		log.info("Enter Message:");
		String message=sc.next();
		
		log.info("Enter Date1:");
		String date1=sc.next();
		
		TimelineDetails td=new TimelineDetails();
		 
		
		int i=fs.createTimelineService(td);
		
		if(i>0) {
			System.out.println("your timeline updated");
		}
		else {
			System.out.println("Sorry, unable to create profile");
		}
		return i;
		
	}
  
	
	
}
