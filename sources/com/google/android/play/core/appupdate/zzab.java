package com.google.android.play.core.appupdate;

public final class zzab {

    /* renamed from: a  reason: collision with root package name */
    public zzi f27473a;

    public /* synthetic */ zzab(zzaa zzaa) {
    }

    public final zza a() {
        zzi zzi = this.f27473a;
        if (zzi != null) {
            return new zzz(zzi, (zzy) null);
        }
        throw new IllegalStateException(String.valueOf(zzi.class.getCanonicalName()).concat(" must be set"));
    }

    public final zzab b(zzi zzi) {
        this.f27473a = zzi;
        return this;
    }
}
