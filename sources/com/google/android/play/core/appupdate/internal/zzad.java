package com.google.android.play.core.appupdate.internal;

public final class zzad implements zzaf {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f27416c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile zzaf f27417a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f27418b = f27416c;

    public zzad(zzaf zzaf) {
        this.f27417a = zzaf;
    }

    public static zzaf b(zzaf zzaf) {
        zzaf.getClass();
        return zzaf instanceof zzad ? zzaf : new zzad(zzaf);
    }

    public final Object a() {
        Object obj = this.f27418b;
        Object obj2 = f27416c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f27418b;
                    if (obj == obj2) {
                        obj = this.f27417a.a();
                        Object obj3 = this.f27418b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f27418b = obj;
                        this.f27417a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
