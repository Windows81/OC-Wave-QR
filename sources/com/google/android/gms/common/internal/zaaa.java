package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;

public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    public static final int b(int i2, int i3, int i4, int i5) {
        if (i2 == 0) {
            return i3;
        }
        if (i2 == 1) {
            return i4;
        }
        if (i2 == 2) {
            return i5;
        }
        throw new IllegalStateException("Unknown color scheme: " + i2);
    }

    public final void a(Resources resources, int i2, int i3) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i4 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i4);
        setMinWidth(i4);
        int i5 = R.drawable.f24351b;
        int i6 = R.drawable.f24352c;
        int b2 = b(i3, i5, i6, i6);
        int i7 = R.drawable.f24353d;
        int i8 = R.drawable.f24354e;
        int b3 = b(i3, i7, i8, i8);
        if (i2 == 0 || i2 == 1) {
            b2 = b3;
        } else if (i2 != 2) {
            throw new IllegalStateException("Unknown button size: " + i2);
        }
        Drawable q2 = DrawableCompat.q(resources.getDrawable(b2));
        DrawableCompat.n(q2, resources.getColorStateList(R.color.f24349c));
        DrawableCompat.o(q2, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(q2);
        int i9 = R.color.f24347a;
        int i10 = R.color.f24348b;
        setTextColor((ColorStateList) Preconditions.m(resources.getColorStateList(b(i3, i9, i10, i10))));
        if (i2 == 0) {
            setText(resources.getString(R.string.f24370p));
        } else if (i2 == 1) {
            setText(resources.getString(R.string.f24371q));
        } else if (i2 == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException("Unknown button size: " + i2);
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.c(getContext())) {
            setGravity(19);
        }
    }
}
