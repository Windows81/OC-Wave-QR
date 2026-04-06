package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaj;

final class zzt implements TileProvider {

    /* renamed from: b  reason: collision with root package name */
    public final zzaj f26069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TileOverlayOptions f26070c;

    public zzt(TileOverlayOptions tileOverlayOptions) {
        this.f26070c = tileOverlayOptions;
        this.f26069b = tileOverlayOptions.f26061z;
    }

    public final Tile a(int i2, int i3, int i4) {
        try {
            return this.f26069b.Y1(i2, i3, i4);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
