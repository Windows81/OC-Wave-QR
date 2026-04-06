package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class CrashlyticsAppQualitySessionsStore {

    /* renamed from: d  reason: collision with root package name */
    public static final FilenameFilter f29962d = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final Comparator f29963e = new c();

    /* renamed from: a  reason: collision with root package name */
    public final FileStore f29964a;

    /* renamed from: b  reason: collision with root package name */
    public String f29965b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f29966c = null;

    public CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.f29964a = fileStore;
    }

    public static void f(FileStore fileStore, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                fileStore.q(str, "aqs." + str2).createNewFile();
            } catch (IOException e2) {
                Logger.f().l("Failed to persist App Quality Sessions session id.", e2);
            }
        }
    }

    public static String g(FileStore fileStore, String str) {
        List r2 = fileStore.r(str, f29962d);
        if (!r2.isEmpty()) {
            return ((File) Collections.min(r2, f29963e)).getName().substring(4);
        }
        Logger.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f29965b, str)) {
            return this.f29966c;
        }
        return g(this.f29964a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f29966c, str)) {
            f(this.f29964a, this.f29965b, str);
            this.f29966c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f29965b, str)) {
            f(this.f29964a, str, this.f29966c);
            this.f29965b = str;
        }
    }
}
