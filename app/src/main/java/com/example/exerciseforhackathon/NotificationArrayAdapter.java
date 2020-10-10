package com.example.exerciseforhackathon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NotificationArrayAdapter extends ArrayAdapter<Notification> {

    private List<Notification> notificationList;

    private ImageView notificationImageView;
    private TextView notificationTitleView;
    private TextView notificationDateView;
    private TextView notificationDetailView;


    public NotificationArrayAdapter(@NonNull Context context, int resource,  List<Notification> notificationList) {
        super(context, resource, notificationList);
        this.notificationList = notificationList;
    }

    @Override
    public int getCount() {
        return notificationList.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.notification_item, parent, false);
        Notification currentNotification = notificationList.get(position);

        notificationTitleView = convertView.findViewById(R.id.notification_title_view);
        notificationDateView = convertView.findViewById(R.id.notification_date_view);

        notificationTitleView.setText(currentNotification.getNotificationTitle());

        return convertView;
    }
}
