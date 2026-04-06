package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

class CrashlyticsFileMarker {

    /* renamed from: a  reason: collision with root package name */
    public final String f30050a;

    /* renamed from: b  reason: collision with root package name */
    public final FileStore f30051b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.f30050a = str;
        this.f30051b = fileStore;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e2) {
            Logger f2 = Logger.f();
            f2.e("Error creating marker: " + this.f30050a, e2);
            return false;
        }
    }

    public final File b() {
        return this.f30051b.g(this.f30050a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
