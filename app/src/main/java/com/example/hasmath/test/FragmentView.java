package com.example.hasmath.test;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.flipview.FlipView;
import se.emilsjolander.flipview.OverFlipMode;


public class FragmentView extends Fragment implements FlipAdapter.Callback, FlipView.OnFlipListener, FlipView.OnOverFlipListener  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    Context context;
    Activity activity;
    ListView list;
    MyAdapter adapter;
    Typeface  futuraTypeface;
    Typeface muktiTypeface;

    private List<Item> items ;
    TextView celebrityIdentity,celebrityType, postTime, celebrityDetails, readMore,totalShareCount,fbCount,twitterCount,googleCount,linkedInCound;
    ImageView celebrityImage,addMore;
    ArrayList<String>data;
    View rootView;
    private FlipAdapter2 mAdapter;
    private FlipView mFlipView;
boolean orientationChanged=false;
    static int itemPos=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setRetainInstance(true);

        if(savedInstanceState!=null)
        {
            orientationChanged=true;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


             rootView = inflater.inflate(R.layout.test2, container, false);

             activity = getActivity();
             items = new ArrayList();


             initializeItems();


             this.mFlipView = ((FlipView) rootView.findViewById(R.id.flip_view));
             this.mAdapter = new FlipAdapter2(getActivity(), items);
             //this.mAdapter.setCallback(this);
             this.mFlipView.setAdapter(this.mAdapter);
             this.mFlipView.setOnFlipListener(this);
             this.mFlipView.peakNext(false);
             this.mFlipView.setOverFlipMode(OverFlipMode.RUBBER_BAND);
             this.mFlipView.setEmptyView(rootView.findViewById(R.id.empty_view));
             this.mFlipView.setOnOverFlipListener(this);

//verifyChanged();

        return  rootView;
    }

    private void initializeItems() {
items.clear();

        Item item= new Item();
        item.setImage(R.drawable.mashroof);
        item.setIdentity("আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার এবং আমি যেভাবে কাজ করি");
        item.setType("আইকন");
        item.setDetails(" আমি যেভাবে কাজ করি আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  ");

        items.add(item);


        Item  item2=new Item();
        item2.setImage(R.drawable.parvez);
        item2.setIdentity("আমি পারভেজ আখতার। ThemeXpert এর প্রতিষ্ঠাতাএবং আমি যেভাবে কাজ করি ");
        item2.setType("উদ্যোক্তা");
        item2.setDetails(" আমি যেভাবে কাজ করি আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  ");

        items.add(item2);


        Item  item3=new Item();
        item3.setImage(R.drawable.chamak);
        item3.setIdentity("আমি চমক হাসান। একজন অনলাইন শিক্ষক এবং আমি যেভাবে কাজ করি ");
        item3.setType("আইকন");
        item3.setDetails(" আমি যেভাবে কাজ করি আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  ");

        items.add(item3);


        Item  item4=new Item();
        item4.setImage(R.drawable.namee);
        item4.setIdentity("আমি মাসুদ রায়হান, প্রফেশনাল পারফরম্যান্স এনহ্যাসমেন্ট কাটালিস্ট এবং আমি যেভাবে কাজ করি ");
        item4.setType("অন্যান্য");
        item4.setDetails(" আমি যেভাবে কাজ করি আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  আমি যেভাবে কাজ করি  ");

        items.add(item4);



    }

    // TODO: Rename method, update argument and hook method into UI event

private void verifyChanged()
{
    if(orientationChanged) {
        Toast.makeText(getActivity(),orientationChanged+" "+itemPos, Toast.LENGTH_LONG).show();
       // this.mFlipView.smoothFlipTo(itemPos);

      // onFlippedToPage(mFlipView,itemPos,itemPos);
        mFlipView.flipTo(itemPos);
    }

}



    public void onFlippedToPage(FlipView paramFlipView, int paramInt, long paramLong)
    {
        // Log.i("pageflip", "Page: " + paramInt);
        /*if ((paramInt > -3 + this.mFlipView.getPageCount()) && (this.mFlipView.getPageCount() < 30))
            this.mAdapter.addItems(5);
        */
       Toast.makeText(getActivity(),paramInt+"  "+paramLong+ "list data="+items.size(),Toast.LENGTH_LONG).show();
     itemPos=paramInt;
    }

    public boolean onOptionsItemSelected(MenuItem paramMenuItem)
    {
       /* switch (paramMenuItem.getItemId())
        {
            default:
                return super.onOptionsItemSelected(paramMenuItem);
            case 2130968585:
        }
        this.mAdapter.addItemsBefore(5);
        return true;

        */

        return true;
    }

    public void onOverFlip(FlipView paramFlipView, OverFlipMode paramOverFlipMode, boolean paramBoolean, float paramFloat1, float paramFloat2)
    {
        //  Log.i("overflip", "overFlipDistance = " + paramFloat1);
    }

    public void onPageRequested(int paramInt)
    {
        if (paramInt>=items.size())
            paramInt=items.size()-1;
        this.mFlipView.smoothFlipTo(paramInt);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);


        int currentOrientation = getResources().getConfiguration().orientation;

        if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(getActivity(),"LANDSCAPE",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getActivity(),"LANDSCAPE",Toast.LENGTH_LONG).show();
        }



    }


}
