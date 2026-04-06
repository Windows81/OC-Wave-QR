package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzi;

public final class zze extends zza implements zzf {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final void G0(IObjectWrapper iObjectWrapper, int i2) {
        Parcel N = N();
        zzc.e(N, iObjectWrapper);
        N.writeInt(i2);
        P(10, N);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate M0(com.google.android.gms.dynamic.IObjectWrapper r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.N()
            com.google.android.gms.internal.maps.zzc.e(r0, r4)
            r4 = 8
            android.os.Parcel r4 = r3.J(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            if (r2 == 0) goto L_0x0023
            r0 = r1
            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate r0 = (com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) r0
            goto L_0x0029
        L_0x0023:
            com.google.android.gms.maps.internal.zzbw r1 = new com.google.android.gms.maps.internal.zzbw
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zze.M0(com.google.android.gms.dynamic.IObjectWrapper):com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate R1(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.maps.StreetViewPanoramaOptions r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.N()
            com.google.android.gms.internal.maps.zzc.e(r0, r3)
            com.google.android.gms.internal.maps.zzc.c(r0, r4)
            r3 = 7
            android.os.Parcel r3 = r2.J(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate r4 = (com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.internal.zzbx r0 = new com.google.android.gms.maps.internal.zzbx
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zze.R1(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions):com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IMapViewDelegate V1(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.maps.GoogleMapOptions r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.N()
            com.google.android.gms.internal.maps.zzc.e(r0, r3)
            com.google.android.gms.internal.maps.zzc.c(r0, r4)
            r3 = 3
            android.os.Parcel r3 = r2.J(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.internal.IMapViewDelegate
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.internal.IMapViewDelegate r4 = (com.google.android.gms.maps.internal.IMapViewDelegate) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.internal.zzl r0 = new com.google.android.gms.maps.internal.zzl
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zze.V1(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.maps.GoogleMapOptions):com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IMapFragmentDelegate b0(com.google.android.gms.dynamic.IObjectWrapper r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.N()
            com.google.android.gms.internal.maps.zzc.e(r0, r4)
            r4 = 2
            android.os.Parcel r4 = r3.J(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.IMapFragmentDelegate
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.maps.internal.IMapFragmentDelegate r0 = (com.google.android.gms.maps.internal.IMapFragmentDelegate) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.maps.internal.zzk r1 = new com.google.android.gms.maps.internal.zzk
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zze.b0(com.google.android.gms.dynamic.IObjectWrapper):com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    public final int e() {
        Parcel J = J(9, N());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate g() {
        /*
            r4 = this;
            r0 = 4
            android.os.Parcel r1 = r4.N()
            android.os.Parcel r0 = r4.J(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r1 = (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.internal.zzb r2 = new com.google.android.gms.maps.internal.zzb
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zze.g():com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final void j0(IObjectWrapper iObjectWrapper, int i2) {
        Parcel N = N();
        zzc.e(N, iObjectWrapper);
        N.writeInt(i2);
        P(6, N);
    }

    public final zzi m() {
        Parcel J = J(5, N());
        zzi N = zzh.N(J.readStrongBinder());
        J.recycle();
        return N;
    }
}
