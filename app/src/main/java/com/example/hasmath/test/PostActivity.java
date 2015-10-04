package com.example.hasmath.test;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

public class PostActivity extends AppCompatActivity {


    Typeface  futuraTypeface;
    Typeface muktiTypeface;


TextView celebrityIdentity,celebrityType, postTime, celebrityDetails, readMore,totalShareCount,fbCount,twitterCount,googleCount,linkedInCound;
    ImageView celebrityImage,addMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        initialization();
        setDataToView();




        ViewTreeObserver vto = celebrityDetails.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
               celebrityDetails.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                //int width = celebrityDetails.getMeasuredWidth();
                int height = celebrityDetails.getMeasuredHeight();
                int numLineHight=celebrityDetails.getLineHeight();

                int txtHeight=(int)(height/numLineHight);
                // Toast.makeText(getApplicationContext(),numLine+"  "+numLineHight+" "+height,Toast.LENGTH_LONG).show();

                celebrityDetails.setMaxLines(txtHeight);
            }
        });

    }



    public void initialization()
    {
        futuraTypeface=Typeface.createFromAsset(getAssets(), "font/futura.ttf");
       muktiTypeface = Typeface.createFromAsset(getAssets(), "font/mukti.ttf");

        celebrityIdentity=(TextView)findViewById(R.id.celeb_identity);
        celebrityDetails=(TextView)findViewById(R.id.celeb_details);
        readMore=(TextView)findViewById(R.id.more_read);
        celebrityType=(TextView)findViewById(R.id.celeb_type);
        postTime=(TextView)findViewById(R.id.post_time);
        totalShareCount=(TextView)findViewById(R.id.share_count);

        fbCount=(TextView)findViewById(R.id.fb_count);
        twitterCount=(TextView)findViewById(R.id.tw_count);
        googleCount=(TextView)findViewById(R.id.g_count);
        linkedInCound=(TextView)findViewById(R.id.ln_count);


        celebrityIdentity.setTypeface(futuraTypeface);
        celebrityDetails.setTypeface(futuraTypeface);
        readMore.setTypeface(muktiTypeface);
        celebrityType.setTypeface(muktiTypeface);


        totalShareCount.setTypeface(futuraTypeface);
        fbCount.setTypeface(futuraTypeface);
        twitterCount.setTypeface(futuraTypeface);
        googleCount.setTypeface(futuraTypeface);
        linkedInCound.setTypeface(futuraTypeface);



    }



    public void setDataToView()
    {
        celebrityIdentity.setText("আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার এবং আমি যেভাবে কাজ করি");
        celebrityType.setText("আইকন");
        postTime.setText("Thursday, 06 Aug, 2015");
        readMore.setText("আরো পড়ুন");
        celebrityDetails.setText("আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার " +
                "আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার আমি মাসরুফ হোসেন, একজন পুলিশ অফিসার ");

        totalShareCount.setText(translateBangla("10"));
        fbCount.setText(translateBangla("1"));
        twitterCount.setText(translateBangla("2"));
        googleCount.setText(translateBangla("3"));
        linkedInCound.setText(translateBangla("4"));






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
