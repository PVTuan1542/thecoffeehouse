package com.example.thecoffeehouse;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.zip.Inflater;

public class Detail_fragment extends Fragment {

    TextView tv_toolbar250,tv_title250,tv_text250;
    ImageView img250,img_back250;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment,container,false);
        setBundel(view);
        back(view);
        return view;
    }
    private void setBundel(View view){
        tv_toolbar250 =(TextView) view.findViewById(R.id.tv_toolbar);
        tv_title250 = (TextView) view.findViewById(R.id.tv_title);
        tv_text250 = (TextView) view.findViewById(R.id.tv_text);

        img250 = (ImageView) view.findViewById(R.id.img_news);

        Bundle bundle = getArguments();

        if(bundle != null) {
            tv_toolbar250.setText(bundle.getString("title"));
            tv_title250.setText(bundle.getString("title"));
            img250.setImageResource(bundle.getInt("anh"));
            tv_text250.setText(bundle.getString("text"));
        }
    }
    //Nhấn back thì lùi
    private void back(View view){
        img_back250 = (ImageView) view.findViewById(R.id.img_back);
        img_back250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getFragmentManager().getBackStackEntryCount() > 0) {
                    getFragmentManager().popBackStackImmediate();
                }
            }
        });
    }
}
