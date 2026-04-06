package com.google.android.gms.internal.measurement;

final class zzma implements zzmi {

    /* renamed from: a  reason: collision with root package name */
    public zzmi[] f25649a;

    public zzma(zzmi... zzmiArr) {
        this.f25649a = zzmiArr;
    }

    public final zzmj a(Class cls) {
        for (zzmi zzmi : this.f25649a) {
            if (zzmi.b(cls)) {
                return zzmi.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    public final boolean b(Class cls) {
        for (zzmi b2 : this.f25649a) {
            if (b2.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
