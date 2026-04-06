package com.google.android.gms.maps;

import android.graphics.Bitmap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbt;

final class zzq extends zzbt {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ GoogleMap.SnapshotReadyCallback f26139l;

    public final void I2(IObjectWrapper iObjectWrapper) {
        this.f26139l.a((Bitmap) ObjectWrapper.P(iObjectWrapper));
    }

    public final void O0(Bitmap bitmap) {
        this.f26139l.a(bitmap);
    }
}
