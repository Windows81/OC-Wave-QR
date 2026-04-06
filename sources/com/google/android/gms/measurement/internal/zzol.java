package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.internal.measurement.zzqn;
import com.google.android.gms.internal.measurement.zzrl;
import com.google.android.gms.internal.measurement.zzrq;
import com.google.android.gms.internal.measurement.zzrw;
import com.google.android.gms.measurement.internal.zzjc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class zzol extends zznr {
    public zzol(zznv zznv) {
        super(zznv);
    }

    public static Bundle B(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgn.zzh zzh = (zzgn.zzh) it.next();
            String a0 = zzh.a0();
            if (zzh.d0()) {
                bundle.putDouble(a0, zzh.J());
            } else if (zzh.e0()) {
                bundle.putFloat(a0, zzh.R());
            } else if (zzh.h0()) {
                bundle.putString(a0, zzh.b0());
            } else if (zzh.f0()) {
                bundle.putLong(a0, zzh.W());
            }
        }
        return bundle;
    }

    public static zzgn.zzh F(zzgn.zzf zzf, String str) {
        for (zzgn.zzh zzh : zzf.Z()) {
            if (zzh.a0().equals(str)) {
                return zzh;
            }
        }
        return null;
    }

    public static zzmk G(zzmk zzmk, byte[] bArr) {
        zzkp a2 = zzkp.a();
        return a2 != null ? zzmk.Q(bArr, a2) : zzmk.A0(bArr);
    }

    public static Object J(zzgn.zzf zzf, String str, Object obj) {
        Object g0 = g0(zzf, str);
        return g0 == null ? obj : g0;
    }

    public static String N(boolean z2, boolean z3, boolean z4) {
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append("Dynamic ");
        }
        if (z3) {
            sb.append("Sequence ");
        }
        if (z4) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static List O(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 << 6) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static void R(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static void S(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String split : strArr) {
            String[] split2 = split.split(",");
            String str = split2[0];
            String str2 = split2[split2.length - 1];
            String string = bundle.getString(str);
            if (string != null) {
                R(builder, str2, string, set);
            }
        }
    }

    public static void T(zzgn.zzf.zza zza, String str, Object obj) {
        List U = zza.U();
        int i2 = 0;
        while (true) {
            if (i2 >= U.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((zzgn.zzh) U.get(i2)).a0())) {
                break;
            } else {
                i2++;
            }
        }
        zzgn.zzh.zza I = zzgn.zzh.Y().I(str);
        if (obj instanceof Long) {
            I.B(((Long) obj).longValue());
        } else if (obj instanceof String) {
            I.K((String) obj);
        } else if (obj instanceof Double) {
            I.z(((Double) obj).doubleValue());
        }
        if (i2 >= 0) {
            zza.B(i2, I);
        } else {
            zza.I(I);
        }
    }

    public static void X(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    public static void Z(StringBuilder sb, int i2, String str, zzfn.zzd zzd) {
        if (zzd != null) {
            X(sb, i2);
            sb.append(str);
            sb.append(" {\n");
            if (zzd.R()) {
                b0(sb, i2, "comparison_type", zzd.J().name());
            }
            if (zzd.T()) {
                b0(sb, i2, "match_as_float", Boolean.valueOf(zzd.P()));
            }
            if (zzd.S()) {
                b0(sb, i2, "comparison_value", zzd.M());
            }
            if (zzd.V()) {
                b0(sb, i2, "min_comparison_value", zzd.O());
            }
            if (zzd.U()) {
                b0(sb, i2, "max_comparison_value", zzd.N());
            }
            X(sb, i2);
            sb.append("}\n");
        }
    }

    public static void a0(StringBuilder sb, int i2, String str, zzgn.zzm zzm) {
        if (zzm != null) {
            X(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (zzm.L() != 0) {
                X(sb, 4);
                sb.append("results: ");
                int i3 = 0;
                for (Long l2 : zzm.Z()) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i3 = i4;
                }
                sb.append(10);
            }
            if (zzm.S() != 0) {
                X(sb, 4);
                sb.append("status: ");
                int i5 = 0;
                for (Long l3 : zzm.b0()) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l3);
                    i5 = i6;
                }
                sb.append(10);
            }
            if (zzm.n() != 0) {
                X(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i7 = 0;
                for (zzgn.zze zze : zzm.Y()) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zze.P() ? Integer.valueOf(zze.n()) : null);
                    sb.append(":");
                    sb.append(zze.O() ? Long.valueOf(zze.L()) : null);
                    i7 = i8;
                }
                sb.append("}\n");
            }
            if (zzm.O() != 0) {
                X(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i9 = 0;
                for (zzgn.zzn zzn : zzm.a0()) {
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzn.R() ? Integer.valueOf(zzn.M()) : null);
                    sb.append(": [");
                    int i11 = 0;
                    for (Long longValue : zzn.P()) {
                        long longValue2 = longValue.longValue();
                        int i12 = i11 + 1;
                        if (i11 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i11 = i12;
                    }
                    sb.append("]");
                    i9 = i10;
                }
                sb.append("}\n");
            }
            X(sb, 3);
            sb.append("}\n");
        }
    }

    public static void b0(StringBuilder sb, int i2, String str, Object obj) {
        if (obj != null) {
            X(sb, i2 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static boolean e0(zzbh zzbh, zzp zzp) {
        Preconditions.m(zzbh);
        Preconditions.m(zzp);
        return !TextUtils.isEmpty(zzp.f26975A) || !TextUtils.isEmpty(zzp.P);
    }

    public static boolean f0(List list, int i2) {
        if (i2 >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i2 % 64)) & ((Long) list.get(i2 / 64)).longValue()) != 0;
    }

    public static Object g0(zzgn.zzf zzf, String str) {
        zzgn.zzh F = F(zzf, str);
        if (F == null) {
            return null;
        }
        if (F.h0()) {
            return F.b0();
        }
        if (F.f0()) {
            return Long.valueOf(F.W());
        }
        if (F.d0()) {
            return Double.valueOf(F.J());
        }
        if (F.U() > 0) {
            return j0(F.c0());
        }
        return null;
    }

    public static boolean h0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] j0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgn.zzh zzh = (zzgn.zzh) it.next();
            if (zzh != null) {
                Bundle bundle = new Bundle();
                for (zzgn.zzh zzh2 : zzh.c0()) {
                    if (zzh2.h0()) {
                        bundle.putString(zzh2.a0(), zzh2.b0());
                    } else if (zzh2.f0()) {
                        bundle.putLong(zzh2.a0(), zzh2.W());
                    } else if (zzh2.d0()) {
                        bundle.putDouble(zzh2.a0(), zzh2.J());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static int y(zzgn.zzk.zza zza, String str) {
        if (zza == null) {
            return -1;
        }
        for (int i2 = 0; i2 < zza.m0(); i2++) {
            if (str.equals(zza.Y0(i2).Y())) {
                return i2;
            }
        }
        return -1;
    }

    public final long A(byte[] bArr) {
        Preconditions.m(bArr);
        j().n();
        MessageDigest V0 = zzop.V0();
        if (V0 != null) {
            return zzop.B(V0.digest(bArr));
        }
        m().G().a("Failed to get MD5");
        return 0;
    }

    public final Bundle C(Map map, boolean z2) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z2) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(C((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        m().G().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable D(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.zzgi r5 = r4.m()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.G()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzol.D(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    public final zzgn.zzf E(zzba zzba) {
        zzgn.zzf.zza H = zzgn.zzf.W().H(zzba.f26233e);
        Iterator it = zzba.f26234f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgn.zzh.zza I = zzgn.zzh.Y().I(str);
            Object m0 = zzba.f26234f.m0(str);
            Preconditions.m(m0);
            U(I, m0);
            H.I(I);
        }
        if (d().t(zzbj.n1) && !TextUtils.isEmpty(zzba.f26231c) && zzba.f26234f.m0("_o") == null) {
            H.J((zzgn.zzh) ((zzlc) zzgn.zzh.Y().I("_o").K(zzba.f26231c).F()));
        }
        return (zzgn.zzf) ((zzlc) H.F());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzbh H(com.google.android.gms.internal.measurement.zzad r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.g()
            r1 = 1
            android.os.Bundle r0 = r8.C(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001d
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = r1.toString()
        L_0x001b:
            r5 = r1
            goto L_0x0020
        L_0x001d:
            java.lang.String r1 = "app"
            goto L_0x001b
        L_0x0020:
            java.lang.String r1 = r9.e()
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzjf.b(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r9.e()
        L_0x002e:
            r3 = r1
            com.google.android.gms.measurement.internal.zzbh r1 = new com.google.android.gms.measurement.internal.zzbh
            com.google.android.gms.measurement.internal.zzbc r4 = new com.google.android.gms.measurement.internal.zzbc
            r4.<init>(r0)
            long r6 = r9.a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzol.H(com.google.android.gms.internal.measurement.zzad):com.google.android.gms.measurement.internal.zzbh");
    }

    public final zznk I(String str, zzgn.zzk.zza zza, zzgn.zzf.zza zza2, String str2) {
        int indexOf;
        if (!zzrl.a() || !d().H(str, zzbj.H0)) {
            return null;
        }
        long a2 = b().a();
        String[] split = d().F(str, zzbj.h0).split(",");
        HashSet hashSet = new HashSet(split.length);
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            String str3 = split[i2];
            Objects.requireNonNull(str3);
            if (hashSet.add(str3)) {
                i2++;
            } else {
                throw new IllegalArgumentException("duplicate element: " + str3);
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        zznq t2 = t();
        String R = t2.r().R(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(t2.d().F(str, zzbj.a0));
        if (!TextUtils.isEmpty(R)) {
            builder.authority(R + "." + t2.d().F(str, zzbj.b0));
        } else {
            builder.authority(t2.d().F(str, zzbj.b0));
        }
        builder.path(t2.d().F(str, zzbj.c0));
        R(builder, "gmp_app_id", zza.v1(), unmodifiableSet);
        R(builder, "gmp_version", "102001", unmodifiableSet);
        String s1 = zza.s1();
        zzah d2 = d();
        zzfz zzfz = zzbj.K0;
        if (d2.H(str, zzfz) && r().b0(str)) {
            s1 = "";
        }
        R(builder, "app_instance_id", s1, unmodifiableSet);
        R(builder, "rdid", zza.x1(), unmodifiableSet);
        R(builder, "bundle_id", zza.r1(), unmodifiableSet);
        String T = zza2.T();
        String a3 = zzjf.a(T);
        if (!TextUtils.isEmpty(a3)) {
            T = a3;
        }
        R(builder, "app_event_name", T, unmodifiableSet);
        R(builder, "app_version", String.valueOf(zza.Z()), unmodifiableSet);
        String w1 = zza.w1();
        if (d().H(str, zzfz) && r().f0(str) && !TextUtils.isEmpty(w1) && (indexOf = w1.indexOf(".")) != -1) {
            w1 = w1.substring(0, indexOf);
        }
        R(builder, "os_version", w1, unmodifiableSet);
        R(builder, "timestamp", String.valueOf(zza2.P()), unmodifiableSet);
        String str4 = "1";
        if (zza.X()) {
            R(builder, "lat", str4, unmodifiableSet);
        }
        R(builder, "privacy_sandbox_version", String.valueOf(zza.y()), unmodifiableSet);
        R(builder, "trigger_uri_source", str4, unmodifiableSet);
        R(builder, "trigger_uri_timestamp", String.valueOf(a2), unmodifiableSet);
        R(builder, "request_uuid", str2, unmodifiableSet);
        List<zzgn.zzh> U = zza2.U();
        Bundle bundle = new Bundle();
        for (zzgn.zzh zzh : U) {
            String a0 = zzh.a0();
            if (zzh.d0()) {
                bundle.putString(a0, String.valueOf(zzh.J()));
            } else if (zzh.e0()) {
                bundle.putString(a0, String.valueOf(zzh.R()));
            } else if (zzh.h0()) {
                bundle.putString(a0, zzh.b0());
            } else if (zzh.f0()) {
                bundle.putString(a0, String.valueOf(zzh.W()));
            }
        }
        S(builder, d().F(str, zzbj.g0).split("\\|"), bundle, unmodifiableSet);
        List<zzgn.zzo> V = zza.V();
        Bundle bundle2 = new Bundle();
        for (zzgn.zzo zzo : V) {
            String Y = zzo.Y();
            if (zzo.a0()) {
                bundle2.putString(Y, String.valueOf(zzo.J()));
            } else if (zzo.b0()) {
                bundle2.putString(Y, String.valueOf(zzo.O()));
            } else if (zzo.e0()) {
                bundle2.putString(Y, zzo.Z());
            } else if (zzo.c0()) {
                bundle2.putString(Y, String.valueOf(zzo.T()));
            }
        }
        S(builder, d().F(str, zzbj.f0).split("\\|"), bundle2, unmodifiableSet);
        if (!zza.W()) {
            str4 = "0";
        }
        R(builder, "dma", str4, unmodifiableSet);
        if (!zza.u1().isEmpty()) {
            R(builder, "dma_cps", zza.u1(), unmodifiableSet);
        }
        if (d().t(zzbj.M0) && zza.Y()) {
            zzgn.zza C0 = zza.C0();
            if (!C0.f0().isEmpty()) {
                R(builder, "dl_gclid", C0.f0(), unmodifiableSet);
            }
            if (!C0.e0().isEmpty()) {
                R(builder, "dl_gbraid", C0.e0(), unmodifiableSet);
            }
            if (!C0.b0().isEmpty()) {
                R(builder, "dl_gs", C0.b0(), unmodifiableSet);
            }
            if (C0.J() > 0) {
                R(builder, "dl_ss_ts", String.valueOf(C0.J()), unmodifiableSet);
            }
            if (!C0.i0().isEmpty()) {
                R(builder, "mr_gclid", C0.i0(), unmodifiableSet);
            }
            if (!C0.h0().isEmpty()) {
                R(builder, "mr_gbraid", C0.h0(), unmodifiableSet);
            }
            if (!C0.g0().isEmpty()) {
                R(builder, "mr_gs", C0.g0(), unmodifiableSet);
            }
            if (C0.N() > 0) {
                R(builder, "mr_click_ts", String.valueOf(C0.N()), unmodifiableSet);
            }
        }
        return new zznk(builder.build().toString(), a2, 1);
    }

    public final String K(zzfn.zzb zzb) {
        if (zzb == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzb.X()) {
            b0(sb, 0, "filter_id", Integer.valueOf(zzb.M()));
        }
        b0(sb, 0, "event_name", h().c(zzb.R()));
        String N = N(zzb.T(), zzb.U(), zzb.V());
        if (!N.isEmpty()) {
            b0(sb, 0, "filter_type", N);
        }
        if (zzb.W()) {
            Z(sb, 1, "event_count_filter", zzb.P());
        }
        if (zzb.n() > 0) {
            sb.append("  filters {\n");
            for (zzfn.zzc Y : zzb.S()) {
                Y(sb, 2, Y);
            }
        }
        X(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String L(zzfn.zze zze) {
        if (zze == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zze.S()) {
            b0(sb, 0, "filter_id", Integer.valueOf(zze.n()));
        }
        b0(sb, 0, "property_name", h().g(zze.N()));
        String N = N(zze.O(), zze.P(), zze.R());
        if (!N.isEmpty()) {
            b0(sb, 0, "filter_type", N);
        }
        Y(sb, 1, zze.K());
        sb.append("}\n");
        return sb.toString();
    }

    public final String M(zzgn.zzj zzj) {
        zzgn.zzc y2;
        if (zzj == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (zzrw.a() && d().t(zzbj.x0) && zzj.n() > 0) {
            j();
            if (zzop.H0(zzj.K(0).C2())) {
                if (zzj.X()) {
                    b0(sb, 0, "upload_subdomain", zzj.U());
                }
                if (zzj.W()) {
                    b0(sb, 0, "sgtm_join_id", zzj.T());
                }
            }
        }
        for (zzgn.zzk zzk : zzj.V()) {
            if (zzk != null) {
                X(sb, 1);
                sb.append("bundle {\n");
                if (zzk.W0()) {
                    b0(sb, 1, "protocol_version", Integer.valueOf(zzk.B1()));
                }
                if (zzrq.a() && d().H(zzk.C2(), zzbj.w0) && zzk.Z0()) {
                    b0(sb, 1, "session_stitching_token", zzk.m0());
                }
                b0(sb, 1, "platform", zzk.k0());
                if (zzk.R0()) {
                    b0(sb, 1, "gmp_version", Long.valueOf(zzk.k2()));
                }
                if (zzk.e1()) {
                    b0(sb, 1, "uploading_gmp_version", Long.valueOf(zzk.w2()));
                }
                if (zzk.P0()) {
                    b0(sb, 1, "dynamite_version", Long.valueOf(zzk.d2()));
                }
                if (zzk.I0()) {
                    b0(sb, 1, "config_version", Long.valueOf(zzk.V1()));
                }
                b0(sb, 1, "gmp_app_id", zzk.h0());
                b0(sb, 1, "admob_app_id", zzk.B2());
                b0(sb, 1, "app_id", zzk.C2());
                b0(sb, 1, "app_version", zzk.a0());
                if (zzk.w0()) {
                    b0(sb, 1, "app_version_major", Integer.valueOf(zzk.y0()));
                }
                b0(sb, 1, "firebase_instance_id", zzk.g0());
                if (zzk.N0()) {
                    b0(sb, 1, "dev_cert_hash", Long.valueOf(zzk.Z1()));
                }
                b0(sb, 1, "app_store", zzk.Z());
                if (zzk.d1()) {
                    b0(sb, 1, "upload_timestamp_millis", Long.valueOf(zzk.u2()));
                }
                if (zzk.a1()) {
                    b0(sb, 1, "start_timestamp_millis", Long.valueOf(zzk.q2()));
                }
                if (zzk.Q0()) {
                    b0(sb, 1, "end_timestamp_millis", Long.valueOf(zzk.h2()));
                }
                if (zzk.V0()) {
                    b0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzk.o2()));
                }
                if (zzk.U0()) {
                    b0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzk.m2()));
                }
                b0(sb, 1, "app_instance_id", zzk.Y());
                b0(sb, 1, "resettable_device_id", zzk.l0());
                b0(sb, 1, "ds_id", zzk.f0());
                if (zzk.T0()) {
                    b0(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzk.t0()));
                }
                b0(sb, 1, "os_version", zzk.j0());
                b0(sb, 1, "device_model", zzk.e0());
                b0(sb, 1, "user_default_language", zzk.n0());
                if (zzk.c1()) {
                    b0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzk.L1()));
                }
                if (zzk.H0()) {
                    b0(sb, 1, "bundle_sequential_index", Integer.valueOf(zzk.f1()));
                }
                if (zzrw.a()) {
                    j();
                    if (zzop.H0(zzk.C2()) && d().t(zzbj.x0) && zzk.M0()) {
                        b0(sb, 1, "delivery_index", Integer.valueOf(zzk.o1()));
                    }
                }
                if (zzk.Y0()) {
                    b0(sb, 1, "service_upload", Boolean.valueOf(zzk.u0()));
                }
                b0(sb, 1, "health_monitor", zzk.i0());
                if (zzk.X0()) {
                    b0(sb, 1, "retry_counter", Integer.valueOf(zzk.G1()));
                }
                if (zzk.K0()) {
                    b0(sb, 1, "consent_signals", zzk.c0());
                }
                if (zzk.S0()) {
                    b0(sb, 1, "is_dma_region", Boolean.valueOf(zzk.s0()));
                }
                if (zzk.L0()) {
                    b0(sb, 1, "core_platform_services", zzk.d0());
                }
                if (zzk.J0()) {
                    b0(sb, 1, "consent_diagnostics", zzk.b0());
                }
                if (zzk.b1()) {
                    b0(sb, 1, "target_os_version", Long.valueOf(zzk.s2()));
                }
                if (zzrl.a() && d().H(zzk.C2(), zzbj.H0)) {
                    b0(sb, 1, "ad_services_version", Integer.valueOf(zzk.n()));
                    if (zzk.x0() && (y2 = zzk.y2()) != null) {
                        X(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        b0(sb, 2, "eligible", Boolean.valueOf(y2.V()));
                        b0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(y2.Y()));
                        b0(sb, 2, "pre_r", Boolean.valueOf(y2.Z()));
                        b0(sb, 2, "r_extensions_too_old", Boolean.valueOf(y2.a0()));
                        b0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(y2.T()));
                        b0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(y2.R()));
                        b0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(y2.X()));
                        X(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (zzqn.a() && d().t(zzbj.U0) && zzk.v0()) {
                    zzgn.zza x2 = zzk.x2();
                    X(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (x2.l0()) {
                        b0(sb, 2, "deep_link_gclid", x2.f0());
                    }
                    if (x2.k0()) {
                        b0(sb, 2, "deep_link_gbraid", x2.e0());
                    }
                    if (x2.j0()) {
                        b0(sb, 2, "deep_link_gad_source", x2.b0());
                    }
                    if (x2.m0()) {
                        b0(sb, 2, "deep_link_session_millis", Long.valueOf(x2.J()));
                    }
                    if (x2.q0()) {
                        b0(sb, 2, "market_referrer_gclid", x2.i0());
                    }
                    if (x2.p0()) {
                        b0(sb, 2, "market_referrer_gbraid", x2.h0());
                    }
                    if (x2.o0()) {
                        b0(sb, 2, "market_referrer_gad_source", x2.g0());
                    }
                    if (x2.n0()) {
                        b0(sb, 2, "market_referrer_click_millis", Long.valueOf(x2.N()));
                    }
                    X(sb, 2);
                    sb.append("}\n");
                }
                List<zzgn.zzo> q0 = zzk.q0();
                if (q0 != null) {
                    for (zzgn.zzo zzo : q0) {
                        if (zzo != null) {
                            X(sb, 2);
                            sb.append("user_property {\n");
                            Double d2 = null;
                            b0(sb, 2, "set_timestamp_millis", zzo.d0() ? Long.valueOf(zzo.V()) : null);
                            b0(sb, 2, "name", h().g(zzo.Y()));
                            b0(sb, 2, "string_value", zzo.Z());
                            b0(sb, 2, "int_value", zzo.c0() ? Long.valueOf(zzo.T()) : null);
                            if (zzo.a0()) {
                                d2 = Double.valueOf(zzo.J());
                            }
                            b0(sb, 2, "double_value", d2);
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzgn.zzd> o0 = zzk.o0();
                zzk.C2();
                if (o0 != null) {
                    for (zzgn.zzd zzd : o0) {
                        if (zzd != null) {
                            X(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzd.T()) {
                                b0(sb, 2, "audience_id", Integer.valueOf(zzd.n()));
                            }
                            if (zzd.U()) {
                                b0(sb, 2, "new_audience", Boolean.valueOf(zzd.S()));
                            }
                            a0(sb, 2, "current_data", zzd.P());
                            if (zzd.V()) {
                                a0(sb, 2, "previous_data", zzd.R());
                            }
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzgn.zzf> p0 = zzk.p0();
                if (p0 != null) {
                    for (zzgn.zzf zzf : p0) {
                        if (zzf != null) {
                            X(sb, 2);
                            sb.append("event {\n");
                            b0(sb, 2, "name", h().c(zzf.Y()));
                            if (zzf.c0()) {
                                b0(sb, 2, "timestamp_millis", Long.valueOf(zzf.V()));
                            }
                            if (zzf.b0()) {
                                b0(sb, 2, "previous_timestamp_millis", Long.valueOf(zzf.U()));
                            }
                            if (zzf.a0()) {
                                b0(sb, 2, "count", Integer.valueOf(zzf.n()));
                            }
                            if (zzf.S() != 0) {
                                c0(sb, 2, zzf.Z());
                            }
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                X(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public final List P(List list, List list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                m().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    m().L().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i2);
    }

    public final Map Q(Bundle bundle, boolean z2) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z3 = obj instanceof Parcelable[];
            if (z3 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    if (z3) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(Q((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(Q((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(Q((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final void U(zzgn.zzh.zza zza, Object obj) {
        Preconditions.m(obj);
        zza.N().L().J().M();
        if (obj instanceof String) {
            zza.K((String) obj);
        } else if (obj instanceof Long) {
            zza.B(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.z(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzgn.zzh.zza Y = zzgn.zzh.Y();
                    for (String next : bundle.keySet()) {
                        zzgn.zzh.zza I = zzgn.zzh.Y().I(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            I.B(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            I.K((String) obj2);
                        } else if (obj2 instanceof Double) {
                            I.z(((Double) obj2).doubleValue());
                        }
                        Y.G(I);
                    }
                    if (Y.y() > 0) {
                        arrayList.add((zzgn.zzh) ((zzlc) Y.F()));
                    }
                }
            }
            zza.H(arrayList);
        } else {
            m().G().b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void V(zzgn.zzk.zza zza) {
        m().K().a("Checking account type status for ad personalization signals");
        if (k0(zza.r1())) {
            m().F().a("Turning off ad personalization due to account type");
            zzgn.zzo zzo = (zzgn.zzo) ((zzlc) zzgn.zzo.W().G("_npa").I(g().u()).B(1).F());
            int i2 = 0;
            while (true) {
                if (i2 >= zza.m0()) {
                    zza.O(zzo);
                    break;
                } else if ("_npa".equals(zza.Y0(i2).Y())) {
                    zza.H(i2, zzo);
                    break;
                } else {
                    i2++;
                }
            }
            zzai a2 = zzai.a(zza.t1());
            a2.d(zzjc.zza.AD_PERSONALIZATION, zzal.CHILD_ACCOUNT);
            zza.B0(a2.toString());
        }
    }

    public final void W(zzgn.zzo.zza zza, Object obj) {
        Preconditions.m(obj);
        zza.K().H().y();
        if (obj instanceof String) {
            zza.J((String) obj);
        } else if (obj instanceof Long) {
            zza.B(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.z(((Double) obj).doubleValue());
        } else {
            m().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void Y(StringBuilder sb, int i2, zzfn.zzc zzc) {
        if (zzc != null) {
            X(sb, i2);
            sb.append("filter {\n");
            if (zzc.R()) {
                b0(sb, i2, "complement", Boolean.valueOf(zzc.P()));
            }
            if (zzc.T()) {
                b0(sb, i2, "param_name", h().f(zzc.O()));
            }
            if (zzc.U()) {
                int i3 = i2 + 1;
                zzfn.zzf N = zzc.N();
                if (N != null) {
                    X(sb, i3);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (N.S()) {
                        b0(sb, i3, "match_type", N.J().name());
                    }
                    if (N.R()) {
                        b0(sb, i3, "expression", N.M());
                    }
                    if (N.P()) {
                        b0(sb, i3, "case_sensitive", Boolean.valueOf(N.O()));
                    }
                    if (N.n() > 0) {
                        X(sb, i2 + 2);
                        sb.append("expression_list {\n");
                        for (String append : N.N()) {
                            X(sb, i2 + 3);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    X(sb, i3);
                    sb.append("}\n");
                }
            }
            if (zzc.S()) {
                Z(sb, i2 + 1, "number_filter", zzc.M());
            }
            X(sb, i2);
            sb.append("}\n");
        }
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final void c0(StringBuilder sb, int i2, List list) {
        if (list != null) {
            int i3 = i2 + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzgn.zzh zzh = (zzgn.zzh) it.next();
                if (zzh != null) {
                    X(sb, i3);
                    sb.append("param {\n");
                    Double d2 = null;
                    b0(sb, i3, "name", zzh.g0() ? h().f(zzh.a0()) : null);
                    b0(sb, i3, "string_value", zzh.h0() ? zzh.b0() : null);
                    b0(sb, i3, "int_value", zzh.f0() ? Long.valueOf(zzh.W()) : null);
                    if (zzh.d0()) {
                        d2 = Double.valueOf(zzh.J());
                    }
                    b0(sb, i3, "double_value", d2);
                    if (zzh.U() > 0) {
                        c0(sb, i3, zzh.c0());
                    }
                    X(sb, i3);
                    sb.append("}\n");
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final boolean d0(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(b().a() - j2) > j3;
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final byte[] i0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            m().G().b("Failed to gzip content", e2);
            throw e2;
        }
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final boolean k0(String str) {
        if (zzpp.a() && d().t(zzbj.W0)) {
            return false;
        }
        Preconditions.m(str);
        zzh L0 = q().L0(str);
        return L0 != null && g().y() && L0.z() && r().W(str);
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final byte[] l0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e2) {
            m().G().b("Failed to ungzip content", e2);
            throw e2;
        }
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final List m0() {
        Map e2 = zzbj.e(this.f26888b.a());
        if (e2 == null || e2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) zzbj.S.a((Object) null)).intValue();
        Iterator it = e2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            m().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e3) {
                    m().L().b("Experiment ID NumberFormatException", e3);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* bridge */ /* synthetic */ zzol o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ zzv p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ zzam q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ zzhg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ zzms s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ zznq t() {
        return super.t();
    }

    public final boolean x() {
        return false;
    }

    public final long z(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return A(str.getBytes(Charset.forName("UTF-8")));
    }
}
