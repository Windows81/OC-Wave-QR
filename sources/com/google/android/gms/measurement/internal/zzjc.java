package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Map;

public final class zzjc {

    /* renamed from: c  reason: collision with root package name */
    public static final zzjc f26593c = new zzjc((Boolean) null, (Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f26594a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26595b;

    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");
        

        /* renamed from: z  reason: collision with root package name */
        public final String f26598z;

        /* access modifiers changed from: public */
        zza(String str) {
            this.f26598z = str;
        }
    }

    public zzjc(EnumMap enumMap, int i2) {
        EnumMap enumMap2 = new EnumMap(zza.class);
        this.f26594a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f26595b = i2;
    }

    public static char a(zzjb zzjb) {
        if (zzjb == null) {
            return '-';
        }
        int ordinal = zzjb.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static zzjb c(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? zzjb.UNINITIALIZED : zzjb.GRANTED : zzjb.DENIED : zzjb.POLICY;
    }

    public static zzjb d(Boolean bool) {
        return bool == null ? zzjb.UNINITIALIZED : bool.booleanValue() ? zzjb.GRANTED : zzjb.DENIED;
    }

    public static zzjb e(String str) {
        return str == null ? zzjb.UNINITIALIZED : str.equals("granted") ? zzjb.GRANTED : str.equals("denied") ? zzjb.DENIED : zzjb.UNINITIALIZED;
    }

    public static zzjc f(Bundle bundle, int i2) {
        if (bundle == null) {
            return new zzjc((Boolean) null, (Boolean) null, i2);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zza2 : zzjd.STORAGE.f26601z) {
            enumMap.put(zza2, e(bundle.getString(zza2.f26598z)));
        }
        return new zzjc(enumMap, i2);
    }

    public static zzjc g(zzjb zzjb, zzjb zzjb2, int i2) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put(zza.AD_STORAGE, zzjb);
        enumMap.put(zza.ANALYTICS_STORAGE, zzjb2);
        return new zzjc(enumMap, -10);
    }

    public static zzjc i(String str, int i2) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] d2 = zzjd.STORAGE.d();
        for (int i3 = 0; i3 < d2.length; i3++) {
            zza zza2 = d2[i3];
            int i4 = i3 + 2;
            if (i4 < str.length()) {
                enumMap.put(zza2, c(str.charAt(i4)));
            } else {
                enumMap.put(zza2, zzjb.UNINITIALIZED);
            }
        }
        return new zzjc(enumMap, i2);
    }

    public static String j(int i2) {
        return i2 != -30 ? i2 != -20 ? i2 != -10 ? i2 != 0 ? i2 != 30 ? i2 != 90 ? i2 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String k(Bundle bundle) {
        String string;
        zza[] f2 = zzjd.STORAGE.f26601z;
        int length = f2.length;
        int i2 = 0;
        while (true) {
            Boolean bool = null;
            if (i2 >= length) {
                return null;
            }
            zza zza2 = f2[i2];
            if (bundle.containsKey(zza2.f26598z) && (string = bundle.getString(zza2.f26598z)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i2++;
        }
    }

    public static boolean l(int i2, int i3) {
        if (i2 == -20 && i3 == -30) {
            return true;
        }
        return (i2 == -30 && i3 == -20) || i2 == i3 || i2 < i3;
    }

    public static zzjc q(String str) {
        return i(str, 100);
    }

    public static String r(zzjb zzjb) {
        int ordinal = zzjb.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public final boolean A() {
        return m(zza.AD_STORAGE);
    }

    public final boolean B() {
        return m(zza.ANALYTICS_STORAGE);
    }

    public final boolean C() {
        for (zzjb zzjb : this.f26594a.values()) {
            if (zzjb != zzjb.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.f26595b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjc)) {
            return false;
        }
        zzjc zzjc = (zzjc) obj;
        for (zza zza2 : zzjd.STORAGE.f26601z) {
            if (this.f26594a.get(zza2) != zzjc.f26594a.get(zza2)) {
                return false;
            }
        }
        return this.f26595b == zzjc.f26595b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzjc h(com.google.android.gms.measurement.internal.zzjc r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjc$zza> r1 = com.google.android.gms.measurement.internal.zzjc.zza.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjd r1 = com.google.android.gms.measurement.internal.zzjd.STORAGE
            com.google.android.gms.measurement.internal.zzjc$zza[] r1 = r1.f26601z
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x004d
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f26594a
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzjb r5 = (com.google.android.gms.measurement.internal.zzjb) r5
            java.util.EnumMap r6 = r9.f26594a
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.zzjb r6 = (com.google.android.gms.measurement.internal.zzjb) r6
            if (r5 != 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            if (r6 != 0) goto L_0x0029
            goto L_0x0045
        L_0x0029:
            com.google.android.gms.measurement.internal.zzjb r7 = com.google.android.gms.measurement.internal.zzjb.UNINITIALIZED
            if (r5 != r7) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            if (r6 != r7) goto L_0x0031
            goto L_0x0045
        L_0x0031:
            com.google.android.gms.measurement.internal.zzjb r7 = com.google.android.gms.measurement.internal.zzjb.POLICY
            if (r5 != r7) goto L_0x0037
        L_0x0035:
            r5 = r6
            goto L_0x0045
        L_0x0037:
            if (r6 != r7) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            com.google.android.gms.measurement.internal.zzjb r7 = com.google.android.gms.measurement.internal.zzjb.DENIED
            if (r5 == r7) goto L_0x0044
            if (r6 != r7) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            com.google.android.gms.measurement.internal.zzjb r5 = com.google.android.gms.measurement.internal.zzjb.GRANTED
            goto L_0x0045
        L_0x0044:
            r5 = r7
        L_0x0045:
            if (r5 == 0) goto L_0x004a
            r0.put(r4, r5)
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004d:
            com.google.android.gms.measurement.internal.zzjc r9 = new com.google.android.gms.measurement.internal.zzjc
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjc.h(com.google.android.gms.measurement.internal.zzjc):com.google.android.gms.measurement.internal.zzjc");
    }

    public final int hashCode() {
        int i2 = this.f26595b * 17;
        for (zzjb hashCode : this.f26594a.values()) {
            i2 = (i2 * 31) + hashCode.hashCode();
        }
        return i2;
    }

    public final boolean m(zza zza2) {
        return ((zzjb) this.f26594a.get(zza2)) != zzjb.DENIED;
    }

    public final boolean n(zzjc zzjc, zza... zzaArr) {
        for (zza zza2 : zzaArr) {
            if (!zzjc.m(zza2) && m(zza2)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f26594a.entrySet()) {
            String r2 = r((zzjb) entry.getValue());
            if (r2 != null) {
                bundle.putString(((zza) entry.getKey()).f26598z, r2);
            }
        }
        return bundle;
    }

    public final zzjc p(zzjc zzjc) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zza2 : zzjd.STORAGE.f26601z) {
            zzjb zzjb = (zzjb) this.f26594a.get(zza2);
            if (zzjb == zzjb.UNINITIALIZED) {
                zzjb = (zzjb) zzjc.f26594a.get(zza2);
            }
            if (zzjb != null) {
                enumMap.put(zza2, zzjb);
            }
        }
        return new zzjc(enumMap, this.f26595b);
    }

    public final boolean s(zzjc zzjc, zza... zzaArr) {
        for (zza zza2 : zzaArr) {
            zzjb zzjb = (zzjb) this.f26594a.get(zza2);
            zzjb zzjb2 = (zzjb) zzjc.f26594a.get(zza2);
            zzjb zzjb3 = zzjb.DENIED;
            if (zzjb == zzjb3 && zzjb2 != zzjb3) {
                return true;
            }
        }
        return false;
    }

    public final zzjb t() {
        zzjb zzjb = (zzjb) this.f26594a.get(zza.AD_STORAGE);
        return zzjb == null ? zzjb.UNINITIALIZED : zzjb;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(j(this.f26595b));
        for (zza zza2 : zzjd.STORAGE.f26601z) {
            sb.append(",");
            sb.append(zza2.f26598z);
            sb.append("=");
            zzjb zzjb = (zzjb) this.f26594a.get(zza2);
            if (zzjb == null) {
                zzjb = zzjb.UNINITIALIZED;
            }
            sb.append(zzjb);
        }
        return sb.toString();
    }

    public final boolean u(zzjc zzjc) {
        return s(zzjc, (zza[]) this.f26594a.keySet().toArray(new zza[0]));
    }

    public final zzjb v() {
        zzjb zzjb = (zzjb) this.f26594a.get(zza.ANALYTICS_STORAGE);
        return zzjb == null ? zzjb.UNINITIALIZED : zzjb;
    }

    public final Boolean w() {
        zzjb zzjb = (zzjb) this.f26594a.get(zza.AD_STORAGE);
        if (zzjb == null) {
            return null;
        }
        int ordinal = zzjb.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Boolean.FALSE;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean x() {
        zzjb zzjb = (zzjb) this.f26594a.get(zza.ANALYTICS_STORAGE);
        if (zzjb == null) {
            return null;
        }
        int ordinal = zzjb.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Boolean.FALSE;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final String y() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zza2 : zzjd.STORAGE.d()) {
            zzjb zzjb = (zzjb) this.f26594a.get(zza2);
            char c2 = '-';
            if (!(zzjb == null || (ordinal = zzjb.ordinal()) == 0)) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String z() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zza2 : zzjd.STORAGE.d()) {
            sb.append(a((zzjb) this.f26594a.get(zza2)));
        }
        return sb.toString();
    }

    public zzjc(Boolean bool, Boolean bool2, int i2) {
        EnumMap enumMap = new EnumMap(zza.class);
        this.f26594a = enumMap;
        enumMap.put(zza.AD_STORAGE, d(bool));
        enumMap.put(zza.ANALYTICS_STORAGE, d(bool2));
        this.f26595b = i2;
    }
}
