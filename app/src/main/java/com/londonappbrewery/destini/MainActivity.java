package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
     private TextView mStoryText;
     private Button mTopButton;
     private Button mLowButton;
     private  int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mLowButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((mStoryIndex == 1)||(mStoryIndex == 4)){


                mTopButton.setText(R.string.T3_Ans1);
                mLowButton.setText(R.string.T3_Ans2);
                mStoryText.setText(R.string.T3_Story);
                mStoryIndex +=2;
                }else if ((mStoryIndex == 3)||(mStoryIndex == 6)){
                    mTopButton.setVisibility(View.GONE);
                    mLowButton.setVisibility(View.GONE);
                    mStoryText.setText(R.string.T6_End);



                }

            }
        });






        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mLowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {


                    mLowButton.setText(R.string.T2_Ans2);
                    mTopButton.setText(R.string.T2_Ans1);
                    mStoryText.setText(R.string.T2_Story);
                    mStoryIndex += 3;

                } else if ((mStoryIndex == 3)||(mStoryIndex == 6)) {
                    mLowButton.setVisibility(View.GONE);
                    mTopButton.setVisibility(View.GONE);
                    mStoryText.setText(R.string.T5_End);


                }else if (mStoryIndex ==4){
                    mStoryText.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mLowButton.setVisibility(View.GONE);

                }

            }
        });


    }
}
