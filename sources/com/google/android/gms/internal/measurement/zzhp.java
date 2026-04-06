package com.google.android.gms.internal.measurement;

public final class zzhp {

    /* renamed from: a  reason: collision with root package name */
    public static zzhs f25482a;

    public static synchronized zzhs a() {
        zzhs zzhs;
        synchronized (zzhp.class) {
            try {
                if (f25482a == null) {
                    b(new zzhr());
                }
                zzhs = f25482a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return zzhs;
    }

    public static synchronized void b(zzhs zzhs) {
        synchronized (zzhp.class) {
            if (f25482a == null) {
                f25482a = zzhs;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
