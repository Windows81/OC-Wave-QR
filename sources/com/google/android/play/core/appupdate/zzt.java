package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

final class zzt {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27505a;

    public zzt(Context context) {
        this.f27505a = context;
    }

    public static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            for (File b2 : listFiles) {
                j2 += b(b2);
            }
        }
        return j2;
    }

    public final long a() {
        return b(new File(this.f27505a.getFilesDir(), "assetpacks"));
    }
}
