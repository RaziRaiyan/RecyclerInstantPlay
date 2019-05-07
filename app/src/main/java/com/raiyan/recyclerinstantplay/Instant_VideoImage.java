package com.raiyan.recyclerinstantplay;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Instant_VideoImage extends FrameLayout {

    private Instant_CustomVideoView cvv;
    private ImageView iv;

    public Instant_VideoImage( Context context) {
        super(context);
        init();
    }

    public Instant_VideoImage( Context context,AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Instant_VideoImage( Context context,AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public Instant_VideoImage(Context context,AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    public Instant_CustomVideoView getCustomVideoView() {
        return cvv;
    }

    public ImageView getImageView() {
        return iv;
    }

    private void init() {
        this.setTag("aah_vi");
        cvv = new Instant_CustomVideoView(getContext());
        iv = new ImageView(getContext());
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.addView(cvv);
        this.addView(iv);
    }

}
