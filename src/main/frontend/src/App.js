import React, {useEffect, useState, useCallback} from "react";
import {useDropzone} from 'react-dropzone'
import './App.css';
import axios from "axios";


const UserProfiles = () => {
    const [userProfiles, setUserProfiles] = useState([]);

    const fetchUserProfiles = () => {
        axios.get("http://localhost:8080/api/v1/user-profile")
            .then(res => {
                setUserProfiles(res.data)
            })
    }

    useEffect(() => {
        fetchUserProfiles();
    }, []);

    return userProfiles.map((userProfile, index) => {
        return (
            <div key={index}>
                {/* TODO: profile image her*/}
                <br/>
                <br/>
                <h1>{userProfile.userName}</h1>
                <p>{userProfile.userProfileId}</p>
                <Dropzone/>
                <br/>
            </div>
        )
    })
}

function Dropzone() {
    const onDrop = useCallback(acceptedFiles => {
        console.log(acceptedFiles[0]);
    }, [])
    const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

    return (
        <div {...getRootProps()}>
            <input {...getInputProps()} />
            {
                isDragActive ?
                    <p>Drop the image here ...</p> :
                    <p>Drag 'n' drop profile image  here, or click to select profile image</p>
            }
        </div>
    )
}


function App() {
    return (
        <div className="App">
            <UserProfiles/>
        </div>
    );
}

export default App;
