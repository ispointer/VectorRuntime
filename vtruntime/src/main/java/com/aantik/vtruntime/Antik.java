package com.aantik.vtruntime;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.aantik.vtruntime.core.VectorDrawableCompat;

/*
 * Created by aantik
 *
 *   ⋆   ႔ ႔
 *     ᠸ^ ^ ⸝⸝
 *      |、˜〵
 *      じしˍ,)⁐̤ᐷ
 *
 * Fox Mode 🍺
 */

public class Antik {

    private final VectorDrawableCompat mVectorDrawable;

    private Antik(@NonNull VectorDrawableCompat vectorDrawable) {
        this.mVectorDrawable = vectorDrawable;
    }


    public static @Nullable Antik load(@NonNull Context context, @DrawableRes int resId) {
        return load(context.getResources(), resId, context.getTheme());
    }

    public static @Nullable Antik load(@NonNull Resources res, @DrawableRes int resId, @Nullable Resources.Theme theme) {
        VectorDrawableCompat drawable = VectorDrawableCompat.create(res, resId, theme);
        if (drawable != null) {
            return new Antik(drawable);
        }
        return null;
    }

    public @NonNull Drawable getDrawable() {
        return mVectorDrawable;
    }

    public @NonNull VectorDrawableCompat getVectorDrawable() {
        return mVectorDrawable;
    }

    public Antik into(@NonNull ImageView imageView) {
        imageView.setImageDrawable(mVectorDrawable);
        return this;
    }

    public Antik setPathColor(int index, @ColorInt int color) {
        mVectorDrawable.setPathFillColor(index, color);
        return this;
    }

    public Antik setPathColor(@NonNull String pathName, @ColorInt int color) {
        mVectorDrawable.setPathFillColor(pathName, color);
        return this;
    }

    public Antik setStrokeColor(int index, @ColorInt int color) {
        mVectorDrawable.setPathStrokeColor(index, color);
        return this;
    }

    public Antik setStrokeColor(@NonNull String pathName, @ColorInt int color) {
        mVectorDrawable.setPathStrokeColor(pathName, color);
        return this;
    }

    public Antik setStrokeWidth(int index, float width) {
        mVectorDrawable.setPathStrokeWidth(index, width);
        return this;
    }

    public Antik setStrokeWidth(@NonNull String pathName, float width) {
        mVectorDrawable.setPathStrokeWidth(pathName, width);
        return this;
    }

    public int getPathCount() {
        return mVectorDrawable.getPathCount();
    }

    public int getPathColor(int index) {
        return mVectorDrawable.getPathFillColor(index);
    }

    public int getPathColor(@NonNull String pathName) {
        return mVectorDrawable.getPathFillColor(pathName);
    }
}
