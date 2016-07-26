package com.example.android.eyuva;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.dd.CircularProgressButton;

/**
 * Created by vignesh on 26/7/16.
 */
public class LoginFragment extends Fragment {
    RelativeLayout relativeLayout;
    View rootView;
    //CircularProgressButton circularProgressButton = (CircularProgressButton) rootView.findViewById(R.id.login_button);

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /*
        Button b = (Button) rootView.findViewById(R.id.login_button);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

        });
        */
        relativeLayout = (RelativeLayout) rootView.findViewById(R.id.login_relativeLayout);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = (View) inflater.inflate(R.layout.login_main, container, false);
        final CircularProgressButton circularProgressButton = (CircularProgressButton) rootView.findViewById(R.id.login_button);
        circularProgressButton.setIndeterminateProgressMode(true);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //circularProgressButton.setIndeterminateProgressMode(true);
                circularProgressButton.setProgress(0);// set progress > 0 & < 100 to display indeterminate progress
                circularProgressButton.setProgress(100); // set progress to 100 or -1 to indicate complete or error state
                //circularProgressButton.setProgress(0); // set progress to 0 to switch back to normal state

            }
        });


        return rootView;
    }
}
