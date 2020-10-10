package com.example.exerciseforhackathon;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EligibilityCheckFragment extends Fragment {
    View view;
    View proceedView;
    public EligibilityCheckFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.eligibility_check_fragment, container, false);
        proceedView = view.findViewById(R.id.proceed);

        return view;
    }
}
