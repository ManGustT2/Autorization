package com.mangust.autorization.view.view.view;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mangust.autorization.R;

/**
 * Created by User on 24.03.2017.
 */

public class SignInFragment extends android.support.v4.app.Fragment {

    TextView mTextView;

    public static SignInFragment newInstance(String nameString){
        SignInFragment signInFragment = new SignInFragment();
        Bundle bundle = new Bundle();
        bundle.putString("URL", nameString);
        signInFragment.setArguments(bundle);
        return signInFragment;
    }

    private void getArgs(){
        mTextView.setText(getArguments().getString("URL"));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);
        mTextView = (TextView) rootView.findViewById(R.id.status);
        getArgs();
        return rootView;
    }





}
