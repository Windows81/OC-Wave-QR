package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;

public final class zzgd extends zzbu implements zzgb {
    public zzgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void B0(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        P(18, J);
    }

    public final List D2(String str, String str2, boolean z2, zzp zzp) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbw.e(J, z2);
        zzbw.d(J, zzp);
        Parcel N = N(14, J);
        ArrayList<zzok> createTypedArrayList = N.createTypedArrayList(zzok.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    public final void G2(zzok zzok, zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzok);
        zzbw.d(J, zzp);
        P(2, J);
    }

    public final zzak N0(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        Parcel N = N(21, J);
        zzak zzak = (zzak) zzbw.a(N, zzak.CREATOR);
        N.recycle();
        return zzak;
    }

    public final void P1(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        P(6, J);
    }

    public final void R2(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        P(26, J);
    }

    public final List S0(zzp zzp, boolean z2) {
        Parcel J = J();
        zzbw.d(J, zzp);
        zzbw.e(J, z2);
        Parcel N = N(7, J);
        ArrayList<zzok> createTypedArrayList = N.createTypedArrayList(zzok.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    public final void V(zzbh zzbh, String str, String str2) {
        Parcel J = J();
        zzbw.d(J, zzbh);
        J.writeString(str);
        J.writeString(str2);
        P(5, J);
    }

    public final void W(Bundle bundle, zzp zzp) {
        Parcel J = J();
        zzbw.d(J, bundle);
        zzbw.d(J, zzp);
        P(19, J);
    }

    public final byte[] X(zzbh zzbh, String str) {
        Parcel J = J();
        zzbw.d(J, zzbh);
        J.writeString(str);
        Parcel N = N(9, J);
        byte[] createByteArray = N.createByteArray();
        N.recycle();
        return createByteArray;
    }

    public final void Y(zzbh zzbh, zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzbh);
        zzbw.d(J, zzp);
        P(1, J);
    }

    public final void Z(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        P(27, J);
    }

    public final void d0(zzaf zzaf, zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzaf);
        zzbw.d(J, zzp);
        P(12, J);
    }

    public final void e1(long j2, String str, String str2, String str3) {
        Parcel J = J();
        J.writeLong(j2);
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        P(10, J);
    }

    public final List f1(zzp zzp, Bundle bundle) {
        Parcel J = J();
        zzbw.d(J, zzp);
        zzbw.d(J, bundle);
        Parcel N = N(24, J);
        ArrayList<zznk> createTypedArrayList = N.createTypedArrayList(zznk.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    public final void g1(zzaf zzaf) {
        Parcel J = J();
        zzbw.d(J, zzaf);
        P(13, J);
    }

    public final String k1(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        Parcel N = N(11, J);
        String readString = N.readString();
        N.recycle();
        return readString;
    }

    public final List l1(String str, String str2, String str3) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        Parcel N = N(17, J);
        ArrayList<zzaf> createTypedArrayList = N.createTypedArrayList(zzaf.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    public final void m1(Bundle bundle, zzp zzp) {
        Parcel J = J();
        zzbw.d(J, bundle);
        zzbw.d(J, zzp);
        P(28, J);
    }

    public final void m2(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        P(25, J);
    }

    public final List n0(String str, String str2, zzp zzp) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbw.d(J, zzp);
        Parcel N = N(16, J);
        ArrayList<zzaf> createTypedArrayList = N.createTypedArrayList(zzaf.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    public final List u0(String str, String str2, String str3, boolean z2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        zzbw.e(J, z2);
        Parcel N = N(15, J);
        ArrayList<zzok> createTypedArrayList = N.createTypedArrayList(zzok.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    public final void z0(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        P(4, J);
    }

    public final void z2(zzp zzp) {
        Parcel J = J();
        zzbw.d(J, zzp);
        P(20, J);
    }
}
