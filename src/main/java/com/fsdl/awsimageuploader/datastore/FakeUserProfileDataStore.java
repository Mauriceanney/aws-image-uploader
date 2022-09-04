package com.fsdl.awsimageuploader.datastore;

import com.fsdl.awsimageuploader.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("869cc520-4789-401d-bafd-3d1af313a570"), "JanetJones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("47474c19-741a-48b0-aeea-b95e2de1de56"), "AntonioJunior", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
