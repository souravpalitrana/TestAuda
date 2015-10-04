package com.example.hasmath.test;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasmath on 10/3/2015.
 */
public class FlipAdapter2 extends BaseAdapter implements OnClickListener {

    private Callback callback;
    private LayoutInflater inflater;
    private List<Item> items = new ArrayList();
    Typeface  futuraTypeface;
    Typeface muktiTypeface;
    Context context;
    ViewHolder localViewHolder2;
    public FlipAdapter2(Context paramContext,List<Item> items)
    {
        this.items=items;
        this.context=paramContext;
        futuraTypeface= Typeface.createFromAsset(paramContext.getAssets(), "font/futura.ttf");
        muktiTypeface = Typeface.createFromAsset(paramContext.getAssets(), "font/mukti.ttf");
        this.inflater = LayoutInflater.from(paramContext);

    }

    public int getCount()
    {
        return this.items.size();
    }

    public Object getItem(int paramInt)
    {
        Toast.makeText(context, "" + paramInt, Toast.LENGTH_LONG).show();
        return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {

        return ((Item)this.items.get(paramInt)).getId();
    }



    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
     Toast.makeText(context,paramInt+"", Toast.LENGTH_LONG).show();
        Item item=items.get(paramInt);

        final ViewHolder localViewHolder;
        if (paramView == null)
        {  paramView=this.inflater.inflate(R.layout.row_item,paramViewGroup,false);

            localViewHolder = new ViewHolder();


            localViewHolder.celebrityIdentity=(TextView)paramView.findViewById(R.id.celeb_identity);
            localViewHolder.celebrityDetails=(TextView)paramView.findViewById(R.id.celeb_details);
            localViewHolder.readMore=(TextView)paramView.findViewById(R.id.more_read);
            localViewHolder.celebrityType=(TextView)paramView.findViewById(R.id.celeb_type);
            localViewHolder.celebrityImg=(ImageView)paramView.findViewById(R.id.celeb_img);



            localViewHolder.celebrityIdentity.setTypeface(futuraTypeface);
            localViewHolder.celebrityDetails.setTypeface(futuraTypeface);
            localViewHolder.readMore.setTypeface(muktiTypeface);
            localViewHolder.celebrityType.setTypeface(muktiTypeface);


            paramView.setTag(localViewHolder);
        }

        else{
            localViewHolder=(ViewHolder)paramView.getTag();
        }


        localViewHolder.celebrityIdentity.setText(item.getIdentity());
        localViewHolder.celebrityType.setText(item.getType());
        localViewHolder.celebrityDetails.setText(item.getDetails());
        localViewHolder.celebrityImg.setImageResource(item.getImage());

        localViewHolder.readMore.setText("আরো পড়ুন");


        ViewTreeObserver vto = localViewHolder.celebrityDetails.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                localViewHolder.celebrityDetails.getViewTreeObserver().removeGlobalOnLayoutListener(this);

                int height = localViewHolder.celebrityDetails.getMeasuredHeight();
                int numLineHight = localViewHolder.celebrityDetails.getLineHeight();

                int txtHeight = (int) (height / numLineHight);


                localViewHolder.celebrityDetails.setMaxLines(txtHeight);
            }
        });







        return paramView;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public void onClick(View paramView)
    {


    }

    public void setCallback(Callback paramCallback)
    {
        this.callback = paramCallback;
    }

    public static abstract interface Callback
    {
        public abstract void onPageRequested(int paramInt);
    }


    static class ViewHolder
    {
        TextView celebrityIdentity,celebrityType,  celebrityDetails, readMore;
ImageView celebrityImg;
    }

    public String translateBangla(String numberText)
    {
        String numberBan="";
        for(int i=0;i<numberText.length();i++)
        {
            numberBan=numberBan+giveBanglaNum(numberText.charAt(i));
        }

        return numberBan;
    }


    public String giveBanglaNum(char x)
    {
        String txt="";
        switch (x)
        {
            case '0':
                txt="০";
                break;
            case '1':
                txt="১";
                break;
            case '2':
                txt="২";
                break;
            case '3':
                txt="৩";
                break;
            case '4':
                txt="৪";
                break;
            case '5':
                txt="৫";
                break;
            case '6':
                txt="৬";
                break;
            case '7':
                txt="৭";
                break;
            case '8':
                txt="৮";
                break;
            case '9':
                txt="৯";
                break;
            default:
                txt="";
                break;
        }
        return txt;
    }



}
