package com.example.android.wearable.takeponto;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A fragment with a Google +1 button.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link WorkRegistratonFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkRegistratonFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private LinearLayout _signInContainer;
    private LinearLayout _signOutContainer;
    private ImageButton _signIn;
    private ImageButton _signOut;
    private Button _toogleButton;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View _view;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WorkRegistratonFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WorkRegistratonFragment newInstance(String param1, String param2) {
        WorkRegistratonFragment fragment = new WorkRegistratonFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public WorkRegistratonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        _view = inflater.inflate(R.layout.fragment_work_registraton, container, false);
        Initialize();

        return _view;
    }

    public void Initialize()
    {
        _signInContainer = (LinearLayout) _view.findViewById(R.id.sign_in);
        _signOutContainer = (LinearLayout) _view.findViewById(R.id.sign_out);
        _signIn = (ImageButton) _view.findViewById(R.id.sign_in_btn);
        _signOut = (ImageButton) _view.findViewById(R.id.sign_out_btn);
        _toogleButton = (Button) _view.findViewById(R.id.toogle_btn);


        _signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Toast.makeText(getActivity(),
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        _signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Toast.makeText(getActivity(),
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        _toogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(_signInContainer.getVisibility() == View.VISIBLE){
                    _signOutContainer.setVisibility(View.VISIBLE);
                    _signInContainer.setVisibility(View.GONE);
                }
                else
                {
                    _signOutContainer.setVisibility(View.GONE);
                    _signInContainer.setVisibility(View.VISIBLE);
                }
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();

    }


}
