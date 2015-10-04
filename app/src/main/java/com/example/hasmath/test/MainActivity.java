package com.example.hasmath.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import se.emilsjolander.flipview.FlipView;
import se.emilsjolander.flipview.OverFlipMode;

public class MainActivity extends AppCompatActivity implements FlipAdapter.Callback, FlipView.OnFlipListener, FlipView.OnOverFlipListener {

    private FlipAdapter mAdapter;
    private FlipView mFlipView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.mFlipView = ((FlipView)findViewById(R.id.flip_view));
        this.mAdapter = new FlipAdapter(this);
        this.mAdapter.setCallback(this);

        this.mFlipView.setAdapter(this.mAdapter);
        this.mFlipView.setOnFlipListener(this);
        this.mFlipView.peakNext(false);
        this.mFlipView.setOverFlipMode(OverFlipMode.RUBBER_BAND);
        this.mFlipView.setEmptyView(findViewById(R.id.empty_view));
        this.mFlipView.setOnOverFlipListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }





    public void onFlippedToPage(FlipView paramFlipView, int paramInt, long paramLong)
    {
      // Log.i("pageflip", "Page: " + paramInt);
        if ((paramInt > -3 + this.mFlipView.getPageCount()) && (this.mFlipView.getPageCount() < 30))
            this.mAdapter.addItems(5);
    }

    public boolean onOptionsItemSelected(MenuItem paramMenuItem)
    {
        switch (paramMenuItem.getItemId())
        {
            default:
                return super.onOptionsItemSelected(paramMenuItem);
            case 2130968585:
        }
        this.mAdapter.addItemsBefore(5);
        return true;
    }

    public void onOverFlip(FlipView paramFlipView, OverFlipMode paramOverFlipMode, boolean paramBoolean, float paramFloat1, float paramFloat2)
    {
      //  Log.i("overflip", "overFlipDistance = " + paramFloat1);
    }

    public void onPageRequested(int paramInt)
    {
        this.mFlipView.smoothFlipTo(paramInt);
    }
}
