package com.k214110809.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.k214110809.model.Comics;
import com.k214110809.practice_viewintent.R;

import java.util.List;

public class Comics_Adapter extends BaseAdapter {
    Context context;
    int comic_layout;
    List<Comics> ComicList;

    public Comics_Adapter(Context context, int comic_layout, List<Comics> comicList) {
        this.context = context;
        this.comic_layout = comic_layout;
        ComicList = comicList;
    }

    @Override
    public int getCount() {
        return ComicList.size();
    }

    @Override
    public Object getItem(int position) {
        return ComicList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return convertView;

    }
    public static final ViewHolder

    }
}
