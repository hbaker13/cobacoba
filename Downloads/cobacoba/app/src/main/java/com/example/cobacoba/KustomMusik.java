package com.example.cobacoba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class KustomMusik extends BaseAdapter {

    private Context context;
    private int Layout;
    private ArrayList<Music> arrayList;

    public KustomMusik(Context context, int layout, ArrayList<Music> arrayList) {
        this.context = context;
        Layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView textbacksound;
        ToggleButton button1;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      final ViewHolder viewHolder;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(Layout, null);
            viewHolder.textbacksound = (TextView)convertView.findViewById(R.id.textbacksound);
            viewHolder.button1 = (ToggleButton) convertView.findViewById(R.id.button1);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        } Music music = arrayList.get(position); viewHolder.textbacksound.setText(music.getNama());
       return convertView; }
}

