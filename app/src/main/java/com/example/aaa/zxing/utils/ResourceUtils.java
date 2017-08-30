package com.example.aaa.zxing.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

/**
 * Created on 下午9:26.
 *
 * @author ran.huang
 * @version 1.0.0
 */
public class ResourceUtils {

    private static Context mContext;

    public static void init(Context context){
        mContext = context;
    }


    /**
     *
     * @return 获取Resuorce
     */
    public static Resources getResources() {
        return mContext.getResources();
    }


    /**
     *
     * @param resId 资源Id
     * @return 本地资源图片
     */
    public static Drawable getDrawable(int resId) {
        return ContextCompat.getDrawable(mContext, resId);
    }

    /**
     *
     * @param resId 资源Id
     * @return 本地字符串内容
     */
    public static String getString(int resId) {
        return getResources().getString(resId);
    }

    /**
     *
     * @param resId 资源Id
     * @return dimens大小，如果单位不是px,会将单位换算成px返回
     */
    public static int getDimen(int resId) {
        return (int)getResources().getDimension(resId);
    }

    public static int getColor(int colorResId) {
        return getResources().getColor(colorResId);
    }

}
