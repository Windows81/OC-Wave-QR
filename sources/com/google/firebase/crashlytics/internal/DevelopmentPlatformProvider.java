package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

public class DevelopmentPlatformProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29911a;

    /* renamed from: b  reason: collision with root package name */
    public DevelopmentPlatform f29912b = null;

    public class DevelopmentPlatform {

        /* renamed from: a  reason: collision with root package name */
        public final String f29913a;

        /* renamed from: b  reason: collision with root package name */
        public final String f29914b;

        public DevelopmentPlatform() {
            int p2 = CommonUtils.p(DevelopmentPlatformProvider.this.f29911a, "com.google.firebase.crashlytics.unity_version", "string");
            if (p2 != 0) {
                this.f29913a = "Unity";
                String string = DevelopmentPlatformProvider.this.f29911a.getResources().getString(p2);
                this.f29914b = string;
                Logger f2 = Logger.f();
                f2.i("Unity Editor version is: " + string);
            } else if (DevelopmentPlatformProvider.this.c("flutter_assets/NOTICES.Z")) {
                this.f29913a = "Flutter";
                this.f29914b = null;
                Logger.f().i("Development platform is: Flutter");
            } else {
                this.f29913a = null;
                this.f29914b = null;
            }
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f29911a = context;
    }

    public final boolean c(String str) {
        if (this.f29911a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f29911a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String d() {
        return f().f29913a;
    }

    public String e() {
        return f().f29914b;
    }

    public final DevelopmentPlatform f() {
        if (this.f29912b == null) {
            this.f29912b = new DevelopmentPlatform();
        }
        return this.f29912b;
    }
}
