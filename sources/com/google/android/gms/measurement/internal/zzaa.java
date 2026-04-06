package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class zzaa {

    /* renamed from: a  reason: collision with root package name */
    public String f26164a;

    /* renamed from: b  reason: collision with root package name */
    public int f26165b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f26166c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f26167d;

    /* renamed from: e  reason: collision with root package name */
    public Long f26168e;

    /* renamed from: f  reason: collision with root package name */
    public Long f26169f;

    public zzaa(String str, int i2) {
        this.f26164a = str;
        this.f26165b = i2;
    }

    public static Boolean b(double d2, zzfn.zzd zzd) {
        try {
            return h(new BigDecimal(d2), zzd, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean c(long j2, zzfn.zzd zzd) {
        try {
            return h(new BigDecimal(j2), zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean d(Boolean bool, boolean z2) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z2);
    }

    public static Boolean e(String str, zzfn.zzd zzd) {
        if (!zzol.h0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean f(String str, zzfn.zzf.zzb zzb, boolean z2, String str2, List list, String str3, zzgi zzgi) {
        if (str == null) {
            return null;
        }
        if (zzb == zzfn.zzf.zzb.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z2 && zzb != zzfn.zzf.zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzu.f26982a[zzb.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z2 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzgi != null) {
                        zzgi.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean g(String str, zzfn.zzf zzf, zzgi zzgi) {
        List list;
        Preconditions.m(zzf);
        if (str == null || !zzf.S() || zzf.J() == zzfn.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzfn.zzf.zzb J = zzf.J();
        zzfn.zzf.zzb zzb = zzfn.zzf.zzb.IN_LIST;
        if (J == zzb) {
            if (zzf.n() == 0) {
                return null;
            }
        } else if (!zzf.R()) {
            return null;
        }
        zzfn.zzf.zzb J2 = zzf.J();
        boolean O = zzf.O();
        String M = (O || J2 == zzfn.zzf.zzb.REGEXP || J2 == zzb) ? zzf.M() : zzf.M().toUpperCase(Locale.ENGLISH);
        if (zzf.n() == 0) {
            list = null;
        } else {
            List<String> N = zzf.N();
            if (!O) {
                ArrayList arrayList = new ArrayList(N.size());
                for (String upperCase : N) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                N = Collections.unmodifiableList(arrayList);
            }
            list = N;
        }
        return f(str, J2, O, M, list, J2 == zzfn.zzf.zzb.REGEXP ? M : null, zzgi);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r3 != null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzfn.zzd r9, double r10) {
        /*
            com.google.android.gms.common.internal.Preconditions.m(r9)
            boolean r0 = r9.R()
            r1 = 0
            if (r0 == 0) goto L_0x0114
            com.google.android.gms.internal.measurement.zzfn$zzd$zzb r0 = r9.J()
            com.google.android.gms.internal.measurement.zzfn$zzd$zzb r2 = com.google.android.gms.internal.measurement.zzfn.zzd.zzb.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0114
        L_0x0014:
            com.google.android.gms.internal.measurement.zzfn$zzd$zzb r0 = r9.J()
            com.google.android.gms.internal.measurement.zzfn$zzd$zzb r2 = com.google.android.gms.internal.measurement.zzfn.zzd.zzb.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r9.V()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r9.U()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r9.S()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.zzfn$zzd$zzb r0 = r9.J()
            com.google.android.gms.internal.measurement.zzfn$zzd$zzb r3 = r9.J()
            if (r3 != r2) goto L_0x0065
            java.lang.String r3 = r9.O()
            boolean r3 = com.google.android.gms.measurement.internal.zzol.h0(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r9.N()
            boolean r3 = com.google.android.gms.measurement.internal.zzol.h0(r3)
            if (r3 != 0) goto L_0x004f
            goto L_0x0064
        L_0x004f:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r4 = r9.O()     // Catch:{ NumberFormatException -> 0x0064 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0064 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r9 = r9.N()     // Catch:{ NumberFormatException -> 0x0064 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0064 }
            r9 = r3
            r3 = r1
            goto L_0x007b
        L_0x0064:
            return r1
        L_0x0065:
            java.lang.String r3 = r9.M()
            boolean r3 = com.google.android.gms.measurement.internal.zzol.h0(r3)
            if (r3 != 0) goto L_0x0070
            return r1
        L_0x0070:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.String r9 = r9.M()     // Catch:{ NumberFormatException -> 0x0114 }
            r3.<init>(r9)     // Catch:{ NumberFormatException -> 0x0114 }
            r9 = r1
            r4 = r9
        L_0x007b:
            if (r0 != r2) goto L_0x0080
            if (r9 != 0) goto L_0x0082
            return r1
        L_0x0080:
            if (r3 == 0) goto L_0x0114
        L_0x0082:
            int[] r2 = com.google.android.gms.measurement.internal.zzu.f26983b
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 0
            r5 = 1
            if (r0 == r5) goto L_0x0106
            r6 = 2
            if (r0 == r6) goto L_0x00f8
            r7 = 3
            if (r0 == r7) goto L_0x00ae
            r10 = 4
            if (r0 == r10) goto L_0x0099
            goto L_0x0114
        L_0x0099:
            if (r9 != 0) goto L_0x009c
            return r1
        L_0x009c:
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00a9
            int r8 = r8.compareTo(r4)
            if (r8 > 0) goto L_0x00a9
            r2 = r5
        L_0x00a9:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ae:
            if (r3 == 0) goto L_0x0114
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00ec
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r3.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00e7
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r3.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00e7
            r2 = r5
        L_0x00e7:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ec:
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00f3
            r2 = r5
        L_0x00f3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f8:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 <= 0) goto L_0x0101
            r2 = r5
        L_0x0101:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0106:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 >= 0) goto L_0x010f
            r2 = r5
        L_0x010f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzfn$zzd, double):java.lang.Boolean");
    }

    public abstract int a();

    public abstract boolean i();

    public abstract boolean j();
}
