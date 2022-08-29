package com.fsdl.awsimageuploader.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {

    private UUID userProfileId;
    private String userName;
    private String UserProfileImageLink; // S3 key

    public UserProfile(UUID userProfileId, String userName, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.userName = userName;
        UserProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(UserProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        UserProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, userProfileId)
                && Objects.equals(userName, userName)
                && Objects.equals(UserProfileImageLink, UserProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, userName, UserProfileImageLink);
    }
}
