package com.fsdl.awsimageuploader.Bucket;

public enum BucketName {

    PROFILE_IMAGE("springboot-react-user-profiles-images");

    private final String bucketName;



    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
