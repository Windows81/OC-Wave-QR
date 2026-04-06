package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

public final class zzah extends zza implements zzaj {
    public zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public final Tile Y1(int i2, int i3, int i4) {
        Parcel N = N();
        N.writeInt(i2);
        N.writeInt(i3);
        N.writeInt(i4);
        Parcel J = J(1, N);
        Tile tile = (Tile) zzc.a(J, Tile.CREATOR);
        J.recycle();
        return tile;
    }
}
