package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module>{

    private ArrayList<Module> module;
    private Context context;
    private TextView tvModule;
    private ImageView ivModule;

    public ModuleAdapter(Context context,int resource, ArrayList<Module> modules){
        super(context,resource,modules);
        module = modules;
        this.context = context;
    }
    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_second_row, parent, false);
        tvModule = (TextView) rowView.findViewById(R.id.tvModules);
        ivModule = (ImageView) rowView.findViewById(R.id.ivModules);
        Module currentModules = module.get(position);
        tvModule.setText(currentModules.getModule());
        if (currentModules.isImgtype()) {
            ivModule.setImageResource(R.drawable.prog);
        } else {
            ivModule.setImageResource(R.drawable.nonprog);
        }
        return rowView;
    }
}