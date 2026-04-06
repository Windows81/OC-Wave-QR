package com.google.android.play.core.install;

import android.content.Intent;
import com.google.android.play.core.appupdate.internal.zzm;

public abstract class InstallState {
    public static InstallState f(int i2, long j2, long j3, int i3, String str) {
        return new zza(i2, j2, j3, i3, str);
    }

    public static InstallState g(Intent intent, zzm zzm) {
        zzm.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        zzm.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        zzm.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0), intent.getLongExtra("total.bytes.to.download", 0), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
    }

    public abstract long a();

    public abstract int b();

    public abstract int c();

    public abstract String d();

    public abstract long e();
}
