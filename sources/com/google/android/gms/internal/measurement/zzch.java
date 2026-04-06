package com.google.android.gms.internal.measurement;

import java.io.File;

final class zzch implements zzci {
    public final String a(String str, zzcm zzcm, zzcj zzcj) {
        return str;
    }

    public final /* synthetic */ String b(File file, String str) {
        return d(file, str, zzcm.f25394a);
    }

    public final /* synthetic */ String c(String str, zzcm zzcm) {
        return a(str, zzcm, zzcj.RAW_FILE_IO_TYPE);
    }

    public final /* synthetic */ String d(File file, String str, zzcm zzcm) {
        return c(new File(file, str).getPath(), zzcm);
    }

    public final /* synthetic */ String m(String str) {
        return c(str, zzcm.f25394a);
    }
}
