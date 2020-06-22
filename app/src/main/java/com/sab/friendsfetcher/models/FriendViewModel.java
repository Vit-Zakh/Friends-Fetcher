package com.sab.friendsfetcher.models;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;

public class FriendViewModel extends AndroidViewModel {
//    private LiveData<List<Friend>> friendList;
    private List<Friend>friendList;

    public FriendViewModel(@NonNull Application application) {
        super(application);

    }

    public List<Friend> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<Friend> friendList) {
        this.friendList = friendList;
    }

//    public LiveData<List<Friend>> getFriendList() {
//        return friendList;
//    }
//
//    public void setFriendList(LiveData<List<Friend>> friendList) {
//        this.friendList = friendList;
//    }
}
