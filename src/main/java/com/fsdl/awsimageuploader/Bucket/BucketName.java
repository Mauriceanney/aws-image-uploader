package com.fsdl.awsimageuploader.Bucket;

public enum BucketName {

    PROFILE_IMAGE("fsdl-file-uploader");

    private final String bucketName;



    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
