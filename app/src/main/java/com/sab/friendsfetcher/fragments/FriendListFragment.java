package com.sab.friendsfetcher.fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.sab.friendsfetcher.R;
import com.sab.friendsfetcher.adapters.FriendsListAdapter;
import com.sab.friendsfetcher.databinding.FragmentFriendListBinding;
import com.sab.friendsfetcher.models.Friend;

import java.util.ArrayList;
import java.util.List;

public class FriendListFragment extends Fragment {
    private FragmentFriendListBinding friendListBinding;
    private FriendsListAdapter adapter;
    public FriendListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.friendlist_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.quitAction:
                getActivity().finish();
        break;
        //stub here
            case R.id.logoutAction:
                Navigation.findNavController(getView())
                        .navigate(R.id.action_friendListFragment_to_loginFragment);
    }
        return true;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        friendListBinding = FragmentFriendListBinding.inflate(inflater, container, false);
        adapter = new FriendsListAdapter();
        friendListBinding.friendsList.setLayoutManager(new LinearLayoutManager(getContext()));
        //one more stub
        List<Friend>stubFriends = new ArrayList<>();
        stubFriends.add(new Friend("Uma", "Turman", "Lviv", "Ukraine",
                "https://i.imgur.com/ltgyGY4.jpg"
        ,true));
        stubFriends.add(new Friend("Random", "Guy", "Nevercity", "Neverland",
                "https://i.imgur.com/DvpvklR.png"
                ,false));
        adapter.setFriendList(stubFriends);
        friendListBinding.friendsList.setAdapter(adapter);
        return friendListBinding.getRoot();
    }
}
