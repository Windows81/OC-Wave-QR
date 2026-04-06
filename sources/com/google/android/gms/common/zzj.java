package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zzj extends zzz {

    /* renamed from: l  reason: collision with root package name */
    public final int f25163l;

    public zzj(byte[] bArr) {
        Preconditions.a(bArr.length == 25);
        this.f25163l = Arrays.hashCode(bArr);
    }

    public static byte[] P(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int c() {
        return this.f25163l;
    }

    public final IObjectWrapper e() {
        return ObjectWrapper.u1(u1());
    }

    public final boolean equals(Object obj) {
        IObjectWrapper e2;
        if (obj != null && (obj instanceof zzaa)) {
            try {
                zzaa zzaa = (zzaa) obj;
                if (zzaa.c() != this.f25163l || (e2 = zzaa.e()) == null) {
                    return false;
                }
                return Arrays.equals(u1(), (byte[]) ObjectWrapper.P(e2));
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f25163l;
    }

    public abstract byte[] u1();
}
