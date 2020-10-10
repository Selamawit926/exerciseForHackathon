package com.example.exerciseforhackathon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
class NotficationFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private List<Notification> notificationList;
    private ListView notificationListView;
    private NotificationArrayAdapter notificationArrayAdapter;


    public NotficationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_notfication, container, false);

        notificationList = new ArrayList<>();
        notificationList.add(new Notification("notfocation 1"));
        notificationList.add(new Notification("notfocation 1"));
        notificationList.add(new Notification("notfocation 1"));
        notificationList.add(new Notification("notfocation 1"));


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        notificationListView = (ListView) getActivity().findViewById(R.id.notification_list_view);
        notificationArrayAdapter = new NotificationArrayAdapter(getContext(), R.layout.notification_item, notificationList);
        notificationListView.setAdapter(notificationArrayAdapter);
        // newsListView.setOnItemClickListener(this);

    }

    @Override
    public void onRefresh() {

    }
}
