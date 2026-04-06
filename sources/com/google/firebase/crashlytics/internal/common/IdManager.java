package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

public class IdManager implements InstallIdProvider {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f30088g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f30089h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final InstallerPackageNameProvider f30090a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f30091b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30092c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseInstallationsApi f30093d;

    /* renamed from: e  reason: collision with root package name */
    public final DataCollectionArbiter f30094e;

    /* renamed from: f  reason: collision with root package name */
    public InstallIdProvider.InstallIds f30095f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f30091b = context;
            this.f30092c = str;
            this.f30093d = firebaseInstallationsApi;
            this.f30094e = dataCollectionArbiter;
            this.f30090a = new InstallerPackageNameProvider();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    public static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        return f30088g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    public synchronized InstallIdProvider.InstallIds a() {
        if (!n()) {
            return this.f30095f;
        }
        Logger.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q2 = CommonUtils.q(this.f30091b);
        String string = q2.getString("firebase.installation.id", (String) null);
        Logger f2 = Logger.f();
        f2.i("Cached Firebase Installation ID: " + string);
        if (this.f30094e.d()) {
            FirebaseInstallationId d2 = d(false);
            Logger f3 = Logger.f();
            f3.i("Fetched Firebase Installation ID: " + d2.b());
            if (d2.b() == null) {
                d2 = new FirebaseInstallationId(string == null ? c() : string, (String) null);
            }
            if (Objects.equals(d2.b(), string)) {
                this.f30095f = InstallIdProvider.InstallIds.a(l(q2), d2);
            } else {
                this.f30095f = InstallIdProvider.InstallIds.a(b(d2.b(), q2), d2);
            }
        } else if (k(string)) {
            this.f30095f = InstallIdProvider.InstallIds.b(l(q2));
        } else {
            this.f30095f = InstallIdProvider.InstallIds.b(b(c(), q2));
        }
        Logger f4 = Logger.f();
        f4.i("Install IDs: " + this.f30095f);
        return this.f30095f;
    }

    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e2;
        e2 = e(UUID.randomUUID().toString());
        Logger f2 = Logger.f();
        f2.i("Created new Crashlytics installation ID: " + e2 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e2).putString("firebase.installation.id", str).apply();
        return e2;
    }

    public FirebaseInstallationId d(boolean z2) {
        String str;
        String str2 = null;
        if (z2) {
            try {
                str = ((InstallationTokenResult) Utils.f(this.f30093d.n(false))).b();
            } catch (Exception e2) {
                Logger.f().l("Error getting Firebase authentication token.", e2);
            }
            str2 = (String) Utils.f(this.f30093d.m());
            return new FirebaseInstallationId(str2, str);
        }
        str = null;
        try {
            str2 = (String) Utils.f(this.f30093d.m());
        } catch (Exception e3) {
            Logger.f().l("Error getting Firebase installation id.", e3);
        }
        return new FirebaseInstallationId(str2, str);
    }

    public String f() {
        return this.f30092c;
    }

    public String g() {
        return this.f30090a.a(this.f30091b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", new Object[]{m(Build.MANUFACTURER), m(Build.MODEL)});
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    public final String m(String str) {
        return str.replaceAll(f30089h, "");
    }

    public final boolean n() {
        InstallIdProvider.InstallIds installIds = this.f30095f;
        return installIds == null || (installIds.e() == null && this.f30094e.d());
    }
}
