package com.sab.friendsfetcher.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sab.friendsfetcher.R;
import com.sab.friendsfetcher.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment implements View.OnClickListener {
    private FragmentLoginBinding loginBinding;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        loginBinding = FragmentLoginBinding.inflate(inflater, container, false);
        loginBinding.loginButton.setOnClickListener(this::onClick);
        loginBinding.quitButton.setOnClickListener(this::onClick);
        return loginBinding.getRoot();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_button:
                Navigation.findNavController(getView()).navigate(R.id.action_loginFragment_to_friendListFragment);
                break;
            case R.id.quit_button:
                getActivity().finish();
                break;
        }

    }
}
