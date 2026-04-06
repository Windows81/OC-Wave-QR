package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgh {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f26317b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f26318c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference f26319d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final zzgg f26320a;

    public zzgh(zzgg zzgg) {
        this.f26320a = zzgg;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.m(strArr);
        Preconditions.m(strArr2);
        Preconditions.m(atomicReference);
        Preconditions.a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (Objects.equals(str, strArr[i2])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i2] == null) {
                            strArr3[i2] = strArr2[i2] + "(" + strArr[i2] + ")";
                        }
                        str2 = strArr3[i2];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f26320a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(next));
            sb.append("=");
            Object obj = bundle.get(next);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String b(zzbh zzbh) {
        String str = null;
        if (zzbh == null) {
            return null;
        }
        if (!this.f26320a.a()) {
            return zzbh.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzbh.f26255B);
        sb.append(",name=");
        sb.append(c(zzbh.f26256z));
        sb.append(",params=");
        zzbc zzbc = zzbh.f26254A;
        if (zzbc != null) {
            str = !this.f26320a.a() ? zzbc.toString() : a(zzbc.X());
        }
        sb.append(str);
        return sb.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26320a.a() ? str : d(str, zzjf.f26608c, zzjf.f26606a, f26317b);
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            String a2 = bundle instanceof Bundle ? a(bundle) : String.valueOf(bundle);
            if (a2 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(a2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26320a.a() ? str : d(str, zzje.f26603b, zzje.f26602a, f26318c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f26320a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, zzjh.f26611b, zzjh.f26610a, f26319d);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
