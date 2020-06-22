package com.sab.friendsfetcher.fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
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
import com.sab.friendsfetcher.models.FriendViewModel;

import java.util.ArrayList;
import java.util.List;

public class FriendListFragment extends Fragment {
    private FragmentFriendListBinding friendListBinding;
    private FriendsListAdapter adapter;

    private FriendViewModel friendViewModel;

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
        stubFriends.add(new Friend("Uma", "Turman", "Athens", "Greece",
                "https://i.imgur.com/ltgyGY4.jpg"
        ,true));
        stubFriends.add(new Friend("Alberto", "Cresswell", "Helsinki", "Finland",
                "https://i.imgur.com/DvpvklR.png"
                ,false));
        stubFriends.add(new Friend("Gabriel", "Cisneros", "Rabat", "Morocco",
                "https://i.imgur.com/DvpvklR.png"
                ,false));
        stubFriends.add(new Friend("Jaidan", "Callahan", "Manila", "Philippines",
                "https://i.imgur.com/DvpvklR.png"
                ,false));
        stubFriends.add(new Friend("Junayd", "Cabrera", "Prague", "Czechia",
                "https://i.imgur.com/ltgyGY4.jpg"
                ,true));
        stubFriends.add(new Friend("Kenan", "Adams", "Denmark", "Copenhagen",
                "https://i.imgur.com/DvpvklR.png"
                ,false));
        stubFriends.add(new Friend("Millie-Mae", "Bull", "Paris", "France",
                "https://i.imgur.com/DvpvklR.png"
                ,false));
        stubFriends.add(new Friend("Kristy", "Lindsay", "Tbilisi", "Georgia",
                "https://i.imgur.com/ltgyGY4.jpg"
                ,true));
        stubFriends.add(new Friend("Nataniel", "Walton", "Budapest", "Hungary",
                "https://i.imgur.com/ltgyGY4.jpg"
                ,true));

        adapter.setFriendList(stubFriends);
        friendListBinding.friendsList.setAdapter(adapter);

//        //viewmodel stub
//        friendViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory
//                .getInstance(this.getActivity().getApplication())).get(FriendViewModel.class);
//        friendViewModel.setFriendList(stubFriends);
//        friendViewModel.getFriendList().observe(getViewLifecycleOwner(), new Observer<List<Friend>>() {
//                    @Override
//                    public void onChanged(List<Friend> friends) {
//                        adapter.setFriendList(friends);
//                    }
//                });

        friendListBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stubFriends.add(new Friend("Rundom", "Guy", "Nevertown", "Neverland",
                        "https://i.imgur.com/ltgyGY4.jpg"
                        ,true));
            }
        });


        return friendListBinding.getRoot();
    }
}
