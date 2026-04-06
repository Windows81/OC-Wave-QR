package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class Utils {

    /* renamed from: b  reason: collision with root package name */
    public static final long f30803b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f30804c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static Utils f30805d;

    /* renamed from: a  reason: collision with root package name */
    public final Clock f30806a;

    public Utils(Clock clock) {
        this.f30806a = clock;
    }

    public static Utils c() {
        return d(SystemClock.b());
    }

    public static Utils d(Clock clock) {
        if (f30805d == null) {
            f30805d = new Utils(clock);
        }
        return f30805d;
    }

    public static boolean g(String str) {
        return f30804c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f30806a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(PersistedInstallationEntry persistedInstallationEntry) {
        return TextUtils.isEmpty(persistedInstallationEntry.b()) || persistedInstallationEntry.h() + persistedInstallationEntry.c() < b() + f30803b;
    }
}
