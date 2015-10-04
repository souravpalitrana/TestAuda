package com.example.hasmath.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasmath on 10/3/2015.
 */
public class FlipAdapter extends BaseAdapter implements View.OnClickListener {

    private Callback callback;
    private LayoutInflater inflater;
    private List<Item> items = new ArrayList();

    public FlipAdapter(Context paramContext)
    {
        this.inflater = LayoutInflater.from(paramContext);
        for (int i = 0; i < 10; i++)
            this.items.add(new Item());
    }

    public void addItems(int paramInt)
    {
        for (int i = 0; i < paramInt; i++)
            this.items.add(new Item());
        notifyDataSetChanged();
    }

    public void addItemsBefore(int paramInt)
    {
        for (int i = 0; i < paramInt; i++)
            this.items.add(0, new Item());
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return this.items.size();
    }

    public Object getItem(int paramInt)
    {
        return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
        return ((Item)this.items.get(paramInt)).getId();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
        ViewHolder localViewHolder;
        if (paramView == null)
        {  paramView=this.inflater.inflate(R.layout.page,paramViewGroup,false);

            localViewHolder = new ViewHolder();


            localViewHolder.text = ((TextView)paramView.findViewById(R.id.text));
            localViewHolder.firstPage = ((Button)paramView.findViewById(R.id.first_page));
            localViewHolder.lastPage = ((Button)paramView.findViewById(R.id.last_page));
            localViewHolder.firstPage.setOnClickListener(this);
            localViewHolder.lastPage.setOnClickListener(this);
            paramView.setTag(localViewHolder);
        }

        else{
            localViewHolder=(ViewHolder)paramView.getTag();
        }
        localViewHolder.text.setText(((Item)this.items.get(paramInt)).getId() + ":" + paramInt);

       /* while (true)
        {
            localViewHolder.text.setText(((Item)this.items.get(paramInt)).getId() + ":" + paramInt);
            return paramView;
            localViewHolder = (ViewHolder)paramView.getTag();

        }
        */

        return paramView;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public void onClick(View paramView)
    {
        /*
        switch (paramView.getId())
        {
            case R.id.text:
            default:
            case R.id.first_page:
            case R.id.last_page:
        }
        do
        {
            do
                return;
            while (this.callback == null);
            this.callback.onPageRequested(0);
            return;
        }
        while (this.callback == null);
        this.callback.onPageRequested(-1 + getCount());
        */

    }

    public void setCallback(Callback paramCallback)
    {
        this.callback = paramCallback;
    }

    public static abstract interface Callback
    {
        public abstract void onPageRequested(int paramInt);
    }

    static class Item
    {
        static long id = 0L;
        long mId;

        public Item()
        {
            long l = id;
            id = 1L + l;
            this.mId = l;
        }

        long getId()
        {
            return this.mId;
        }
    }

    static class ViewHolder
    {
        Button firstPage;
        Button lastPage;
        TextView text;
    }
}
