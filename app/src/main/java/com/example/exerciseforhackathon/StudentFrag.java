package com.example.exerciseforhackathon;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudentFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    RadioGroup radiogroup2;
    RadioButton radioButton, radioButton2;
    int id;
    EditText etNameSchool,etLocation, etStudentInfo,etCause;
    View view;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StudentFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Student.
     */
    // TODO: Rename and change types and number of parameters
    public static StudentFrag newInstance(String param1, String param2) {
        StudentFrag fragment = new StudentFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
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
        view= inflater.inflate(R.layout.fragment_student, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        radiogroup2=view.findViewById(R.id.radiogroup2);
        id= radiogroup2.getCheckedRadioButtonId();
        radioButton= (RadioButton) view.findViewById(id) ;
        //radioButton2= (RadioButton) radioButton.getText(); // to be sent to databse

        etCause= view.findViewById(R.id.etCause);

        String etCause2= etCause.getText().toString();// to be sent to databse



    }
}