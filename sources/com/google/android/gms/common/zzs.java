package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* renamed from: A  reason: collision with root package name */
    public final zzj f25181A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f25182B;
    public final boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final String f25183z;

    public zzs(String str, zzj zzj, boolean z2, boolean z3) {
        this.f25183z = str;
        this.f25181A = zzj;
        this.f25182B = z2;
        this.C = z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f25183z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, str, false);
        zzj zzj = this.f25181A;
        if (zzj == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzj = null;
        }
        SafeParcelWriter.m(parcel, 2, zzj, false);
        SafeParcelWriter.c(parcel, 3, this.f25182B);
        SafeParcelWriter.c(parcel, 4, this.C);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzs(String str, IBinder iBinder, boolean z2, boolean z3) {
        byte[] bArr;
        this.f25183z = str;
        zzk zzk = null;
        if (iBinder != null) {
            try {
                IObjectWrapper e2 = zzz.N(iBinder).e();
                if (e2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) ObjectWrapper.P(e2);
                }
                if (bArr != null) {
                    zzk = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e3) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e3);
            }
        }
        this.f25181A = zzk;
        this.f25182B = z2;
        this.C = z3;
    }
}
