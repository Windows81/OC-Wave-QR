package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

public abstract class zzcv {

    /* renamed from: a  reason: collision with root package name */
    public static zzcv f25408a = new zzcy();

    public static synchronized zzcv a() {
        zzcv zzcv;
        synchronized (zzcv.class) {
            zzcv = f25408a;
        }
        return zzcv;
    }

    public abstract URLConnection b(URL url, String str);
}
