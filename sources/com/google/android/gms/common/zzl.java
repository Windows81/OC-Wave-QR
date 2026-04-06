package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzl extends zzj {

    /* renamed from: n  reason: collision with root package name */
    public static final WeakReference f25165n = new WeakReference((Object) null);

    /* renamed from: m  reason: collision with root package name */
    public WeakReference f25166m = f25165n;

    public zzl(byte[] bArr) {
        super(bArr);
    }

    public abstract byte[] W2();

    public final byte[] u1() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f25166m.get();
                if (bArr == null) {
                    bArr = W2();
                    this.f25166m = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }
}
