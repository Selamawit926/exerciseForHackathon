package com.example.exerciseforhackathon;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SponsorFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SponsorFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    Spinner dropdown;
    EditText etDes;
    RadioGroup radiogroup;
    RadioButton radioButton, radioButton2;
    int id;
    ArrayList<String > arrayList;
    ArrayAdapter<String> arrayAdapter;
    View view;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SponsorFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Sponsor.
     */
    // TODO: Rename and change types and number of parameters
    public static SponsorFrag newInstance(String param1, String param2) {
        SponsorFrag fragment = new SponsorFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public interface ToGetData{
        void OnItemClicked(int position);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

//        dropdown.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String sponsor= parent.getItemAtPosition(position).toString();
//                Toast.makeText(parent.getContext(), sponsor + " selected!", Toast.LENGTH_SHORT).show();// here the chosen item is passed to the database
//            }
//        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_sponsor, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dropdown= view.findViewById(R.id.dropdown);
        etDes= view.findViewById(R.id.etDes);
        radiogroup=view.findViewById(R.id.radiogroup);
        id= radiogroup.getCheckedRadioButtonId();
        radioButton= (RadioButton) view.findViewById(id) ;

        arrayList= new ArrayList<>();
        arrayList.add("Media Sponsor");
        arrayList.add("Promotional Sponsor");
        arrayList.add("Financial Sponsor");
        arrayList.add("In-Kind Sponsor");

        arrayAdapter= new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item,arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(arrayAdapter);
        String sponsor= dropdown.getSelectedItem().toString();//to sent into the database
        String des= etDes.getText().toString();// to be sent to the databse
        //radioButton2= (RadioButton) radioButton.getText(); //to be sent to database


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

}