package com.facebookproject.service;

import java.util.List;

import com.facebookproject.entity.FacebookUser;
import com.facebookproject.entity.TimelineDetails;

public interface FacebookServiceInterface {

	int createProfileService(FacebookUser fu);

	List<FacebookUser> viewAllProfileService();

	FacebookUser viewProfileService(FacebookUser fu);

	int deleteProfileService(FacebookUser fu);

	List<FacebookUser> searchProfileService(FacebookUser fu);

	int editProfileService(FacebookUser fu);

	FacebookUser signINService(FacebookUser fu);

	int createTimelineService(TimelineDetails td);

}
