package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

public abstract class zag {

    /* renamed from: a  reason: collision with root package name */
    public final zad f24830a;

    /* renamed from: b  reason: collision with root package name */
    public int f24831b;

    public abstract void a(Drawable drawable, boolean z2, boolean z3, boolean z4);

    public final void b(Context context, zam zam, boolean z2) {
        int i2 = this.f24831b;
        a(i2 != 0 ? context.getResources().getDrawable(i2) : null, z2, false, false);
    }

    public final void c(Context context, Bitmap bitmap, boolean z2) {
        Asserts.c(bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
