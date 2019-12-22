package com.example.festafimdeano.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

import com.example.festafimdeano.R;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mViewHolder.checkParticipate = (CheckBox) findViewById(R.id.check_participate);

    }

    private static class ViewHolder{
        CheckBox checkParticipate;
    }

}
