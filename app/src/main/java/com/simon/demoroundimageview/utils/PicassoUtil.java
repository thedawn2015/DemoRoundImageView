package com.simon.demoroundimageview.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.simon.demoroundimageview.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;

/**
 * Created by TheDawn on 2016/7/3.
 */
public class PicassoUtil {

    /**
     * 加载资源图片
     *
     * @param context
     * @param drawableId
     * @param imageView
     */
    public static void picassoLoadLocalImg(Context context, int drawableId, int radius,ImageView imageView) {
        Picasso
                .with(context)
                .load(drawableId)
                .transform(new RoundedCornersTransformation(radius,0))
                .into(imageView);
    }

    /**
     * 加载网页图片
     *
     * @param context
     * @param url
     * @param imageView
     */
    public static void picassoLoadNetImg(Context context, String url, ImageView imageView) {
        Picasso
                .with(context)
                .load(url)
                .transform(new CropCircleTransformation())
                .into(imageView);
    }

}
