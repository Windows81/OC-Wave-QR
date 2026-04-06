package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrl;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzgw {

    /* renamed from: a  reason: collision with root package name */
    public final String f26382a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f26383b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    public Bundle f26384c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzgu f26385d;

    public zzgw(zzgu zzgu, String str, Bundle bundle) {
        this.f26385d = zzgu;
        Preconditions.g(str);
        this.f26382a = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:63|64|75) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r13.f26385d.m().G().a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0128 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0120 A[Catch:{ NumberFormatException | JSONException -> 0x0128 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r13 = this;
            android.os.Bundle r0 = r13.f26384c
            if (r0 != 0) goto L_0x0155
            com.google.android.gms.measurement.internal.zzgu r0 = r13.f26385d
            android.content.SharedPreferences r0 = r0.J()
            java.lang.String r1 = r13.f26382a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x014d
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x013e }
            r1.<init>()     // Catch:{ JSONException -> 0x013e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013e }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x013e }
            r0 = 0
            r3 = r0
        L_0x001f:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x013e }
            if (r3 >= r4) goto L_0x013b
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r8 = 100
            r9 = 2
            r10 = 3
            r11 = 4
            r12 = 1
            if (r7 == r8) goto L_0x007a
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0070
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x0066
            r8 = 3352(0xd18, float:4.697E-42)
            if (r7 == r8) goto L_0x005c
            r8 = 3445(0xd75, float:4.827E-42)
            if (r7 == r8) goto L_0x0052
            goto L_0x0084
        L_0x0052:
            java.lang.String r7 = "la"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r11
            goto L_0x0085
        L_0x005c:
            java.lang.String r7 = "ia"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r10
            goto L_0x0085
        L_0x0066:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r0
            goto L_0x0085
        L_0x0070:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r9
            goto L_0x0085
        L_0x007a:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r7 == 0) goto L_0x0084
            r7 = r12
            goto L_0x0085
        L_0x0084:
            r7 = -1
        L_0x0085:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x0120
            if (r7 == r12) goto L_0x0114
            if (r7 == r9) goto L_0x0108
            if (r7 == r10) goto L_0x00d5
            if (r7 == r11) goto L_0x00a2
            com.google.android.gms.measurement.internal.zzgu r4 = r13.f26385d     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x00a2:
            boolean r6 = com.google.android.gms.internal.measurement.zzrl.a()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r6 == 0) goto L_0x0137
            com.google.android.gms.measurement.internal.zzgu r6 = r13.f26385d     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.zzah r6 = r6.d()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.zzfz r7 = com.google.android.gms.measurement.internal.zzbj.I0     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            boolean r6 = r6.t(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r6 == 0) goto L_0x0137
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r6.<init>(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r4 = r6.length()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            long[] r7 = new long[r4]     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r8 = r0
        L_0x00c6:
            if (r8 >= r4) goto L_0x00d1
            long r9 = r6.optLong(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r7[r8] = r9     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r8 = r8 + 1
            goto L_0x00c6
        L_0x00d1:
            r1.putLongArray(r5, r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x00d5:
            boolean r6 = com.google.android.gms.internal.measurement.zzrl.a()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r6 == 0) goto L_0x0137
            com.google.android.gms.measurement.internal.zzgu r6 = r13.f26385d     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.zzah r6 = r6.d()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            com.google.android.gms.measurement.internal.zzfz r7 = com.google.android.gms.measurement.internal.zzbj.I0     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            boolean r6 = r6.t(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            if (r6 == 0) goto L_0x0137
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r6.<init>(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r4 = r6.length()     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int[] r7 = new int[r4]     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r8 = r0
        L_0x00f9:
            if (r8 >= r4) goto L_0x0104
            int r9 = r6.optInt(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r7[r8] = r9     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            int r8 = r8 + 1
            goto L_0x00f9
        L_0x0104:
            r1.putIntArray(r5, r7)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x0108:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x0114:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x0120:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x0128 }
            goto L_0x0137
        L_0x0128:
            com.google.android.gms.measurement.internal.zzgu r4 = r13.f26385d     // Catch:{ JSONException -> 0x013e }
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()     // Catch:{ JSONException -> 0x013e }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ JSONException -> 0x013e }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.a(r5)     // Catch:{ JSONException -> 0x013e }
        L_0x0137:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x013b:
            r13.f26384c = r1     // Catch:{ JSONException -> 0x013e }
            goto L_0x014d
        L_0x013e:
            com.google.android.gms.measurement.internal.zzgu r0 = r13.f26385d
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.a(r1)
        L_0x014d:
            android.os.Bundle r0 = r13.f26384c
            if (r0 != 0) goto L_0x0155
            android.os.Bundle r0 = r13.f26383b
            r13.f26384c = r0
        L_0x0155:
            android.os.Bundle r0 = r13.f26384c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgw.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f26385d.J().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f26382a);
        } else {
            edit.putString(this.f26382a, c(bundle));
        }
        edit.apply();
        this.f26384c = bundle;
    }

    public final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", next);
                    if (zzrl.a()) {
                        if (this.f26385d.d().t(zzbj.I0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "d");
                            } else {
                                this.f26385d.m().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    }
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("t", "l");
                    } else if (obj instanceof Double) {
                        jSONObject.put("t", "d");
                    } else {
                        this.f26385d.m().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    this.f26385d.m().G().b("Cannot serialize bundle value to SharedPreferences", e2);
                }
            }
        }
        return jSONArray.toString();
    }
}
