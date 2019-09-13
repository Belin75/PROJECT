package com.web.dao;

import com.web.model.ProfilePicture;

public interface ProfilePictureDao {
	void uploadProfilePicture(ProfilePicture profilePicture);
	ProfilePicture getProfilePicture(String email);
}
