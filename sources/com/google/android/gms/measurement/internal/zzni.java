package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjc;
import java.util.HashMap;
import java.util.Map;

public final class zzni {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f26877b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a  reason: collision with root package name */
    public final Map f26878a;

    public zzni(Map map) {
        HashMap hashMap = new HashMap();
        this.f26878a = hashMap;
        hashMap.putAll(map);
    }

    public static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static zzni c(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        String f2 = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(f2) && f2.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(f2.charAt(754)));
        }
        int a2 = a(sharedPreferences, "IABTCF_gdprApplies");
        if (a2 != -1) {
            hashMap.put("gdprApplies", String.valueOf(a2));
        }
        int a3 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (a3 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(a3));
        }
        int a4 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (a4 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(a4));
        }
        String f3 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(f3)) {
            hashMap.put("PurposeConsents", f3);
        }
        int a5 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (a5 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(a5));
        }
        return new zzni(hashMap);
    }

    public static String d(String str, boolean z2) {
        if (!z2 || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i2 = 1;
        while (true) {
            if (i2 >= 64) {
                i2 = 0;
                break;
            } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2)) {
                break;
            } else {
                i2++;
            }
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i2);
        return String.valueOf(charArray);
    }

    public static String f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    public final Bundle b() {
        if (!"1".equals(this.f26878a.get("GoogleConsent")) || !"1".equals(this.f26878a.get("gdprApplies")) || !"1".equals(this.f26878a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int i2 = i();
        if (i2 < 0) {
            return Bundle.EMPTY;
        }
        String str = (String) this.f26878a.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        String str2 = "denied";
        if (str.length() > 0) {
            bundle.putString(zzjc.zza.AD_STORAGE.f26598z, str.charAt(0) == '1' ? "granted" : str2);
        }
        if (str.length() > 3) {
            bundle.putString(zzjc.zza.AD_PERSONALIZATION.f26598z, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : str2);
        }
        if (str.length() > 6 && i2 >= 4) {
            String str3 = zzjc.zza.AD_USER_DATA.f26598z;
            if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                str2 = "granted";
            }
            bundle.putString(str3, str2);
        }
        return bundle;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int h2 = h();
        if (h2 < 0 || h2 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((h2 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(h2 & 63));
        }
        int i2 = i();
        if (i2 < 0 || i2 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2));
        }
        Preconditions.a(true);
        int i3 = "1".equals(this.f26878a.get("gdprApplies")) ? 2 : 0;
        int i4 = i3 | 4;
        if ("1".equals(this.f26878a.get("EnableAdvertiserConsentMode"))) {
            i4 = i3 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzni)) {
            return false;
        }
        return g().equalsIgnoreCase(((zzni) obj).g());
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        for (String str : f26877b) {
            if (this.f26878a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) this.f26878a.get(str));
            }
        }
        return sb.toString();
    }

    public final int h() {
        try {
            String str = (String) this.f26878a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final int i() {
        try {
            String str = (String) this.f26878a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final String toString() {
        return g();
    }
}
