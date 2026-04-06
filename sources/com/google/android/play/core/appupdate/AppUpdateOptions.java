package com.google.android.play.core.appupdate;

public abstract class AppUpdateOptions {

    public static abstract class Builder {
        public abstract AppUpdateOptions a();

        public abstract Builder b(boolean z2);
    }

    public static AppUpdateOptions c(int i2) {
        return d(i2).a();
    }

    public static Builder d(int i2) {
        zzv zzv = new zzv();
        zzv.c(i2);
        zzv.b(false);
        return zzv;
    }

    public abstract boolean a();

    public abstract int b();
}
