package com.simon.demoroundimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.simon.demoroundimageview.data_center.DataCenter;
import com.simon.demoroundimageview.utils.PicassoUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_picasso_local)
    ImageView ivPicassoLocal;
    @BindView(R.id.iv_picasso_net)
    ImageView ivPicassoNet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        assignViews();
    }

    private void assignViews() {
        PicassoUtil.picassoLoadLocalImg(this, R.drawable.img1, 10,ivPicassoLocal);
        PicassoUtil.picassoLoadNetImg(this, DataCenter.IMAGE_URL1, ivPicassoNet);
    }
}
