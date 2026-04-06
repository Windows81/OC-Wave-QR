package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzqz;
import com.google.android.gms.internal.measurement.zzrw;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class zzop extends zzix {

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f26967i = {"firebase_", "google_", "ga_"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f26968j = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    public SecureRandom f26969c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f26970d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public int f26971e;

    /* renamed from: f  reason: collision with root package name */
    public MeasurementManagerFutures f26972f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f26973g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f26974h = null;

    public zzop(zzhw zzhw) {
        super(zzhw);
    }

    public static long A(zzbc zzbc) {
        long j2 = 0;
        if (zzbc == null) {
            return 0;
        }
        Iterator it = zzbc.iterator();
        while (it.hasNext()) {
            Object m0 = zzbc.m0((String) it.next());
            if (m0 instanceof Parcelable[]) {
                j2 += (long) ((Parcelable[]) m0).length;
            }
        }
        return j2;
    }

    public static long B(byte[] bArr) {
        Preconditions.m(bArr);
        int i2 = 0;
        Preconditions.q(bArr.length > 0);
        int length = bArr.length - 1;
        long j2 = 0;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << i2;
            i2 += 8;
            length--;
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean B0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzop.B0(android.content.Context, java.lang.String):boolean");
    }

    public static Bundle D(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle2.keySet()) {
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static boolean D0(String str) {
        return G0((String) zzbj.e0.a((Object) null), str);
    }

    public static Bundle G(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzok zzok = (zzok) it.next();
            String str = zzok.D;
            if (str != null) {
                bundle.putString(zzok.f26959A, str);
            } else {
                Long l2 = zzok.C;
                if (l2 != null) {
                    bundle.putLong(zzok.f26959A, l2.longValue());
                } else {
                    Double d2 = zzok.F;
                    if (d2 != null) {
                        bundle.putDouble(zzok.f26959A, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static boolean G0(String str, String str2) {
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean H0(String str) {
        return G0((String) zzbj.z0.a((Object) null), str);
    }

    public static String J(String str, int i2, boolean z2) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (!z2) {
            return null;
        }
        String substring = str.substring(0, str.offsetByCodePoints(0, i2));
        return substring + "...";
    }

    public static boolean J0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static void L(Bundle bundle, int i2, String str, Object obj) {
        if (v0(bundle, i2)) {
            bundle.putString("_ev", J(str, 40, true));
            if (obj != null) {
                Preconditions.m(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean L0(String str) {
        Preconditions.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean N0(String str) {
        for (String equals : f26968j) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static int Q0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean T0(String str) {
        Preconditions.m(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static MessageDigest V0() {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void X(zzlh zzlh, Bundle bundle, boolean z2) {
        if (bundle != null && zzlh != null && (!bundle.containsKey("_sc") || z2)) {
            String str = zzlh.f26738a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = zzlh.f26739b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", zzlh.f26740c);
        } else if (bundle != null && zzlh == null && z2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void Y(zzoo zzoo, int i2, String str, String str2, int i3) {
        Z(zzoo, (String) null, i2, str, str2, i3);
    }

    public static void Z(zzoo zzoo, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        v0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", (long) i3);
        }
        zzoo.b(str, "_err", bundle);
    }

    private final boolean Z0() {
        Integer num;
        if (this.f26973g == null) {
            MeasurementManagerFutures S0 = S0();
            boolean z2 = false;
            if (S0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) S0.b().get(10000, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z2 = true;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        num2 = num;
                        m().L().b("Measurement manager api exception", e);
                        this.f26973g = Boolean.FALSE;
                        num = num2;
                        m().K().b("Measurement manager api status result", num);
                        return this.f26973g.booleanValue();
                    } catch (ExecutionException e3) {
                        e = e3;
                        num2 = num;
                        m().L().b("Measurement manager api exception", e);
                        this.f26973g = Boolean.FALSE;
                        num = num2;
                        m().K().b("Measurement manager api status result", num);
                        return this.f26973g.booleanValue();
                    } catch (InterruptedException e4) {
                        e = e4;
                        num2 = num;
                        m().L().b("Measurement manager api exception", e);
                        this.f26973g = Boolean.FALSE;
                        num = num2;
                        m().K().b("Measurement manager api status result", num);
                        return this.f26973g.booleanValue();
                    } catch (TimeoutException e5) {
                        e = e5;
                        num2 = num;
                        m().L().b("Measurement manager api exception", e);
                        this.f26973g = Boolean.FALSE;
                        num = num2;
                        m().K().b("Measurement manager api status result", num);
                        return this.f26973g.booleanValue();
                    }
                }
                this.f26973g = Boolean.valueOf(z2);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                e = e6;
                m().L().b("Measurement manager api exception", e);
                this.f26973g = Boolean.FALSE;
                num = num2;
                m().K().b("Measurement manager api status result", num);
                return this.f26973g.booleanValue();
            }
            m().K().b("Measurement manager api status result", num);
        }
        return this.f26973g.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d0(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.Preconditions.m(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzop.d0(android.content.Context):boolean");
    }

    public static boolean e0(Context context, boolean z2) {
        Preconditions.m(context);
        return B0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean f0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean g0(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    public static boolean h0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean m0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.m(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty || !isEmpty2) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public static boolean n0(String str, String[] strArr) {
        Preconditions.m(strArr);
        for (String equals : strArr) {
            if (Objects.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] q0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList t0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzaf zzaf = (zzaf) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzaf.f26176z);
            bundle.putString("origin", zzaf.f26174A);
            bundle.putLong("creation_timestamp", zzaf.C);
            bundle.putString("name", zzaf.f26175B.f26959A);
            zziz.b(bundle, Preconditions.m(zzaf.f26175B.H()));
            bundle.putBoolean("active", zzaf.D);
            String str = zzaf.E;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbh = zzaf.F;
            if (zzbh != null) {
                bundle.putString("timed_out_event_name", zzbh.f26256z);
                zzbc zzbc = zzbh.f26254A;
                if (zzbc != null) {
                    bundle.putBundle("timed_out_event_params", zzbc.X());
                }
            }
            bundle.putLong("trigger_timeout", zzaf.G);
            zzbh zzbh2 = zzaf.H;
            if (zzbh2 != null) {
                bundle.putString("triggered_event_name", zzbh2.f26256z);
                zzbc zzbc2 = zzbh2.f26254A;
                if (zzbc2 != null) {
                    bundle.putBundle("triggered_event_params", zzbc2.X());
                }
            }
            bundle.putLong("triggered_timestamp", zzaf.f26175B.f26960B);
            bundle.putLong("time_to_live", zzaf.I);
            zzbh zzbh3 = zzaf.J;
            if (zzbh3 != null) {
                bundle.putString("expired_event_name", zzbh3.f26256z);
                zzbc zzbc3 = zzbh3.f26254A;
                if (zzbc3 != null) {
                    bundle.putBundle("expired_event_params", zzbc3.X());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean v0(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i2);
        return true;
    }

    public static Bundle[] x0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static long y(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    public static int y0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public final Object A0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return I(Q0(str), obj, true, false, (String) null);
        }
        return I(Q0(str), obj, false, false, (String) null);
    }

    public final Bundle C(Uri uri, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str9 = uri2.getQueryParameter("utm_campaign");
                str8 = uri2.getQueryParameter("utm_source");
                str7 = uri2.getQueryParameter("utm_medium");
                str6 = uri2.getQueryParameter("gclid");
                str5 = z2 ? uri2.getQueryParameter("gbraid") : null;
                str4 = uri2.getQueryParameter("utm_id");
                str3 = uri2.getQueryParameter("dclid");
                str2 = uri2.getQueryParameter("srsltid");
                str = uri2.getQueryParameter("sfmc_id");
            } else {
                str9 = null;
                str8 = null;
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str9) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && ((!z2 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str9)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str9);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("source", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("medium", str7);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("gclid", str6);
            }
            if (z2 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri2.getQueryParameter("gad_source");
            if (z2 && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri2.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri2.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri2.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri2.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri2.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign_id", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("dclid", str3);
            }
            String queryParameter7 = uri2.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri2.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri2.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("srsltid", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str10, str);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            m().L().b("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    public final boolean C0(String str, String str2) {
        if (str2 == null) {
            m().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            m().H().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                m().H().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    m().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final Bundle E(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object s0 = s0(next, bundle.get(next));
                if (s0 == null) {
                    m().M().b("Param value can't be null", h().f(next));
                } else {
                    O(bundle2, next, s0);
                }
            }
        }
        return bundle2;
    }

    public final boolean E0(String str, String str2) {
        if (zzrw.a() && d().t(zzbj.y0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return d().V().equals(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle F(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzjf.f26609d
            boolean r13 = n0(r10, r0)
            if (r11 == 0) goto L_0x00ea
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.zzah r0 = r19.d()
            int r8 = r0.K()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x002e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0047
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r0 = r17
            goto L_0x0056
        L_0x0047:
            if (r24 != 0) goto L_0x004e
            int r0 = r9.P0(r7)
            goto L_0x0050
        L_0x004e:
            r0 = r17
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            int r0 = r9.O0(r7)
        L_0x0056:
            if (r0 == 0) goto L_0x0066
            r1 = 3
            if (r0 != r1) goto L_0x005d
            r1 = r7
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            L(r15, r0, r7, r1)
            r15.remove(r7)
            r9 = r8
            goto L_0x00a2
        L_0x0066:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r15
            r6 = r23
            r14 = r7
            r7 = r24
            r9 = r8
            r8 = r13
            int r0 = r0.x(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0087
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            L(r15, r0, r14, r1)
            goto L_0x00a6
        L_0x0087:
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00a6
            r1 = 21
            if (r0 != r1) goto L_0x0097
            r7 = r10
            goto L_0x0098
        L_0x0097:
            r7 = r14
        L_0x0098:
            java.lang.Object r1 = r11.get(r14)
            L(r15, r0, r7, r1)
            r15.remove(r14)
        L_0x00a2:
            r8 = r9
            r9 = r19
            goto L_0x002e
        L_0x00a6:
            boolean r0 = L0(r14)
            if (r0 == 0) goto L_0x00a2
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x00e5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Event can't contain more than "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.zzgi r2 = r19.m()
            com.google.android.gms.measurement.internal.zzgk r2 = r2.H()
            com.google.android.gms.measurement.internal.zzgh r3 = r19.h()
            java.lang.String r3 = r3.c(r10)
            com.google.android.gms.measurement.internal.zzgh r4 = r19.h()
            java.lang.String r4 = r4.a(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            v0(r15, r1)
            r15.remove(r14)
        L_0x00e5:
            r18 = r0
            goto L_0x00a2
        L_0x00e8:
            r14 = r15
            goto L_0x00eb
        L_0x00ea:
            r14 = 0
        L_0x00eb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzop.F(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final boolean F0(String str) {
        n();
        if (Wrappers.a(a()).a(str) == 0) {
            return true;
        }
        m().F().b("Permission not granted", str);
        return false;
    }

    public final zzbh H(String str, String str2, Bundle bundle, String str3, long j2, boolean z2, boolean z3) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle F = F(str, str2, bundle3, CollectionUtils.a("_o"), true);
            if (z2) {
                F = E(F, str);
            }
            Preconditions.m(F);
            return new zzbh(str2, new zzbc(F), str3, j2);
        }
        m().G().b("Invalid conditional property event name", h().g(str2));
        throw new IllegalArgumentException();
    }

    public final Object I(int i2, Object obj, boolean z2, boolean z3, String str) {
        Bundle E;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return J(String.valueOf(obj), i2, z2);
            }
            if (!z3 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (E = E((Bundle) parcelable, (String) null)) != null && !E.isEmpty()) {
                    arrayList.add(E);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final int I0() {
        if (this.f26974h == null) {
            this.f26974h = Integer.valueOf(GoogleApiAvailabilityLight.h().b(a()) / 1000);
        }
        return this.f26974h.intValue();
    }

    public final URL K(long j2, String str, String str2, long j3, String str3) {
        try {
            Preconditions.g(str2);
            Preconditions.g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j2), Integer.valueOf(I0())}), str2, str, Long.valueOf(j3)});
            if (str.equals(d().W())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (MalformedURLException e2) {
            e = e2;
            m().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            m().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final long K0() {
        n();
        if (!D0(this.f26587a.B().F())) {
            return 0;
        }
        long j2 = Build.VERSION.SDK_INT < 30 ? 4 : SdkExtensions.getExtensionVersion(30) < 4 ? 8 : y0() < ((Integer) zzbj.Y.a((Object) null)).intValue() ? 16 : 0;
        if (!F0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0 && !Z0()) {
            j2 |= 64;
        }
        if (j2 == 0) {
            return 1;
        }
        return j2;
    }

    public final void M(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            m().L().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r5 = a().getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r5)), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M0(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = r4.a()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r2.<init>(r3, r5)
            java.util.List r5 = r0.queryIntentActivities(r2, r1)
            if (r5 == 0) goto L_0x0029
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0029
            r5 = 1
            return r5
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzop.M0(java.lang.String):boolean");
    }

    public final void N(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    j().O(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    public final void O(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                m().M().c("Not putting event parameter. Invalid value type. name, type", h().f(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final int O0(String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (!o0("event param", (String[]) null, str)) {
            return 14;
        }
        return !j0("event param", 40, str) ? 3 : 0;
    }

    public final void P(zzdl zzdl, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zzdl.u(bundle);
        } catch (RemoteException e2) {
            this.f26587a.m().L().b("Error returning int value to wrapper", e2);
        }
    }

    public final int P0(String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (!o0("event param", (String[]) null, str)) {
            return 14;
        }
        return !j0("event param", 40, str) ? 3 : 0;
    }

    public final void Q(zzdl zzdl, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzdl.u(bundle);
        } catch (RemoteException e2) {
            this.f26587a.m().L().b("Error returning long value to wrapper", e2);
        }
    }

    public final void R(zzdl zzdl, Bundle bundle) {
        try {
            zzdl.u(bundle);
        } catch (RemoteException e2) {
            this.f26587a.m().L().b("Error returning bundle value to wrapper", e2);
        }
    }

    public final long R0() {
        long andIncrement;
        long j2;
        if (this.f26970d.get() == 0) {
            synchronized (this.f26970d) {
                long nextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
                int i2 = this.f26971e + 1;
                this.f26971e = i2;
                j2 = nextLong + ((long) i2);
            }
            return j2;
        }
        synchronized (this.f26970d) {
            this.f26970d.compareAndSet(-1, 1);
            andIncrement = this.f26970d.getAndIncrement();
        }
        return andIncrement;
    }

    public final void S(zzdl zzdl, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzdl.u(bundle);
        } catch (RemoteException e2) {
            this.f26587a.m().L().b("Error returning string value to wrapper", e2);
        }
    }

    public final MeasurementManagerFutures S0() {
        if (this.f26972f == null) {
            this.f26972f = MeasurementManagerFutures.a(a());
        }
        return this.f26972f;
    }

    public final void T(zzdl zzdl, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzdl.u(bundle);
        } catch (RemoteException e2) {
            this.f26587a.m().L().b("Error returning bundle list to wrapper", e2);
        }
    }

    public final void U(zzdl zzdl, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z2);
        try {
            zzdl.u(bundle);
        } catch (RemoteException e2) {
            this.f26587a.m().L().b("Error returning boolean value to wrapper", e2);
        }
    }

    public final String U0() {
        byte[] bArr = new byte[16];
        W0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final void V(zzdl zzdl, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzdl.u(bundle);
        } catch (RemoteException e2) {
            this.f26587a.m().L().b("Error returning byte array to wrapper", e2);
        }
    }

    public final void W(zzgm zzgm, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(zzgm.f26343d.keySet())) {
            if (L0(str) && (i3 = i3 + 1) > i2) {
                m().H().c("Event can't contain more than " + i2 + " params", h().c(zzgm.f26340a), h().a(zzgm.f26343d));
                v0(zzgm.f26343d, 5);
                zzgm.f26343d.remove(str);
            }
        }
    }

    public final SecureRandom W0() {
        n();
        if (this.f26969c == null) {
            this.f26969c = new SecureRandom();
        }
        return this.f26969c;
    }

    public final boolean X0() {
        n();
        return K0() == 1;
    }

    public final boolean Y0() {
        try {
            a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(String str, String str2, String str3, Bundle bundle, List list, boolean z2) {
        int i2;
        String str4;
        int i3;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            int A2 = d().A();
            int i4 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    i2 = !z2 ? P0(str6) : 0;
                    if (i2 == 0) {
                        i2 = O0(str6);
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    L(bundle2, i2, str6, i2 == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (h0(bundle2.get(str6))) {
                        m().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i3 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i3 = x(str, str2, str6, bundle2.get(str6), bundle, list, z2, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str4)) {
                        L(bundle2, i3, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (L0(str4) && !n0(str4, zzje.f26605d)) {
                        int i5 = i4 + 1;
                        if (!c0(231100000, true)) {
                            m().H().c("Item array not supported on client's version of Google Play Services (Android Only)", h().c(str5), h().a(bundle2));
                            v0(bundle2, 23);
                            bundle2.remove(str4);
                        } else if (i5 > A2) {
                            if (!zzqz.a() || !d().t(zzbj.F0)) {
                                m().H().c("Item cannot contain custom parameters", h().c(str5), h().a(bundle2));
                                v0(bundle2, 23);
                                bundle2.remove(str4);
                            } else {
                                zzgk H = m().H();
                                H.c("Item can't contain more than " + A2 + " item-scoped custom params", h().c(str5), h().a(bundle2));
                                v0(bundle2, 28);
                                bundle2.remove(str4);
                            }
                        }
                        i4 = i5;
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final void b0(Parcelable[] parcelableArr, int i2, boolean z2) {
        Preconditions.m(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i3 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (L0(str) && !n0(str, zzje.f26605d) && (i3 = i3 + 1) > i2) {
                    if (z2) {
                        m().H().c("Param can't contain more than " + i2 + " item-scoped custom parameters", h().f(str), h().a(bundle));
                        v0(bundle, 28);
                    } else {
                        m().H().c("Param cannot contain item-scoped custom parameters", h().f(str), h().a(bundle));
                        v0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean c0(int i2, boolean z2) {
        Boolean X = this.f26587a.J().X();
        if (I0() < i2 / 1000) {
            return X != null && !X.booleanValue();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
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

    public final boolean i0(String str, double d2) {
        try {
            SharedPreferences.Editor edit = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (RuntimeException e2) {
            m().G().b("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final boolean j0(String str, int i2, String str2) {
        if (str2 == null) {
            m().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        } else {
            m().H().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final boolean k0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (T0(str)) {
                return true;
            }
            if (this.f26587a.r()) {
                m().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzgi.v(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f26587a.r()) {
                m().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (T0(str2)) {
            return true;
        } else {
            m().H().b("Invalid admob_app_id. Analytics disabled.", zzgi.v(str2));
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final boolean l0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                m().M().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final void o() {
        n();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                m().L().a("Utils falling back to Random for random id");
            }
        }
        this.f26970d.set(nextLong);
    }

    public final boolean o0(String str, String[] strArr, String str2) {
        return p0(str, strArr, (String[]) null, str2);
    }

    public final boolean p0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            m().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.m(str2);
        for (String startsWith : f26967i) {
            if (str2.startsWith(startsWith)) {
                m().H().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !n0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && n0(str2, strArr2)) {
            return true;
        }
        m().H().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final int r0(String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (!o0("user property", zzjh.f26610a, str)) {
            return 15;
        }
        return !j0("user property", 24, str) ? 6 : 0;
    }

    public final Object s0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return I(d().z((String) null, false), obj, true, true, (String) null);
        }
        return I(J0(str) ? d().z((String) null, false) : d().r((String) null, false), obj, false, true, (String) null);
    }

    public final boolean t() {
        return true;
    }

    public final int u(int i2) {
        return GoogleApiAvailabilityLight.h().j(a(), GooglePlayServicesUtilLight.f24398a);
    }

    public final boolean u0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d2 = Wrappers.a(context).d(str, 64);
            if (d2 == null || (signatureArr = d2.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            m().G().b("Error obtaining certificate", e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            m().G().b("Package name not found", e3);
            return true;
        }
    }

    public final int v(String str) {
        if (!w0("event", str)) {
            return 2;
        }
        if (!p0("event", zzjf.f26606a, zzjf.f26607b, str)) {
            return 13;
        }
        return !j0("event", 40, str) ? 2 : 0;
    }

    public final int w(String str, Object obj) {
        return "_ldl".equals(str) ? l0("user property referrer", str, Q0(str), obj) : l0("user property", str, Q0(str), obj) ? 0 : 7;
    }

    public final boolean w0(String str, String str2) {
        if (str2 == null) {
            m().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            m().H().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        m().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            m().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int x(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.n()
            boolean r2 = h0(r17)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x008a
            if (r21 == 0) goto L_0x0087
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzje.f26604c
            boolean r2 = n0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.zzhw r2 = r7.f26587a
            com.google.android.gms.measurement.internal.zzlp r2 = r2.J()
            boolean r2 = r2.i0()
            if (r2 != 0) goto L_0x002f
            r0 = 25
            return r0
        L_0x002f:
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0038
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x0043
        L_0x0038:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x008a
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x0043:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x008a
            com.google.android.gms.measurement.internal.zzgi r9 = r13.m()
            com.google.android.gms.measurement.internal.zzgk r9 = r9.M()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.d(r10, r3, r8, r5)
            if (r2 == 0) goto L_0x006a
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto L_0x0083
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0083
        L_0x006a:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x0083
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x0083
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        L_0x0083:
            r1 = 17
            r9 = r1
            goto L_0x008b
        L_0x0087:
            r0 = 21
            return r0
        L_0x008a:
            r9 = r4
        L_0x008b:
            boolean r1 = J0(r15)
            r2 = 0
            if (r1 != 0) goto L_0x00a2
            boolean r1 = J0(r16)
            if (r1 == 0) goto L_0x0099
            goto L_0x00a2
        L_0x0099:
            com.google.android.gms.measurement.internal.zzah r1 = r13.d()
            int r1 = r1.r(r2, r4)
            goto L_0x00aa
        L_0x00a2:
            com.google.android.gms.measurement.internal.zzah r1 = r13.d()
            int r1 = r1.z(r2, r4)
        L_0x00aa:
            boolean r1 = r13.l0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00b1
            return r9
        L_0x00b1:
            if (r21 == 0) goto L_0x013d
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00c8
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.a0(r1, r2, r3, r4, r5, r6)
            goto L_0x013c
        L_0x00c8:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x00fd
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = r4
        L_0x00d1:
            if (r12 >= r11) goto L_0x013c
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.zzgi r1 = r13.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.M()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x013d
        L_0x00eb:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.a0(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00d1
        L_0x00fd:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x013d
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
        L_0x0108:
            if (r4 >= r11) goto L_0x013c
            java.lang.Object r0 = r10.get(r4)
            int r12 = r4 + 1
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x012b
            com.google.android.gms.measurement.internal.zzgi r1 = r13.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.M()
            if (r0 == 0) goto L_0x0123
            java.lang.Class r0 = r0.getClass()
            goto L_0x0125
        L_0x0123:
            java.lang.String r0 = "null"
        L_0x0125:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x013d
        L_0x012b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.a0(r1, r2, r3, r4, r5, r6)
            r4 = r12
            goto L_0x0108
        L_0x013c:
            return r9
        L_0x013d:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzop.x(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final long z(Context context, String str) {
        n();
        Preconditions.m(context);
        Preconditions.g(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest V0 = V0();
        if (V0 == null) {
            m().G().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!u0(context, str)) {
                    Signature[] signatureArr = Wrappers.a(context).d(a().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return B(V0.digest(signatureArr[0].toByteArray()));
                    }
                    m().L().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                m().G().b("Package name not found", e2);
            }
        }
        return 0;
    }

    public final long z0(String str) {
        if (a().getPackageManager() == null) {
            return 0;
        }
        int i2 = 0;
        try {
            ApplicationInfo b2 = Wrappers.a(a()).b(str, 0);
            if (b2 != null) {
                i2 = b2.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            m().J().b("PackageManager failed to find running app: app_id", str);
        }
        return (long) i2;
    }
}
