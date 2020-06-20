package com.sab.friendsfetcher.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sab.friendsfetcher.databinding.LayoutFriendListItemBinding;
import com.sab.friendsfetcher.models.Friend;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class FriendsListAdapter extends RecyclerView.Adapter<FriendsListAdapter.FriendHolder> {
private List<Friend> friendList = new ArrayList<>();

    @NonNull
    @Override
    public FriendHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutFriendListItemBinding friendListItemBinding = LayoutFriendListItemBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new FriendHolder(friendListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendHolder holder, int position) {
        Friend currentFriend = friendList.get(position);
        holder.friendListItemBinding.username.setText(currentFriend.getName() + " " + currentFriend.getSurname());
        holder.friendListItemBinding.residence.setText(currentFriend.getCity() + ", " + currentFriend.getCountry());
        if (currentFriend.isOnline()) {
            holder.friendListItemBinding.onlineImage.setVisibility(View.VISIBLE);
        } else {
            holder.friendListItemBinding.onlineImage.setVisibility(View.GONE);
        }
        Picasso.get()
                .load(currentFriend.getAvatarUrl())
                .fit()
                .into(holder.friendListItemBinding.avatarImage);
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    public class FriendHolder extends RecyclerView.ViewHolder{
        LayoutFriendListItemBinding friendListItemBinding;

        public FriendHolder(@NonNull LayoutFriendListItemBinding binding) {
            super(binding.getRoot());
            this.friendListItemBinding = binding;
        }
    }
    public void setFriendList(List<Friend> friendList) {
        this.friendList = friendList;
        notifyDataSetChanged();
    }
    }

