package com.facebookproject.controller;

import com.facebookproject.entity.FacebookUser;

public interface FacebookControllerInterface {

	int createProfileController();

	int viewAllProfileController();

	int viewProfileController();

	int deleteProfileController();

	int searchProfileController();

	int editProfileController();

	FacebookUser signIN();

	int createTimeline();

}
