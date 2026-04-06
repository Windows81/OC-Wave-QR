package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzad;
import com.google.android.play.core.appupdate.internal.zzaf;

final class zzz implements zza {

    /* renamed from: a  reason: collision with root package name */
    public final zzz f27512a = this;

    /* renamed from: b  reason: collision with root package name */
    public final zzaf f27513b;

    /* renamed from: c  reason: collision with root package name */
    public final zzaf f27514c;

    /* renamed from: d  reason: collision with root package name */
    public final zzaf f27515d;

    /* renamed from: e  reason: collision with root package name */
    public final zzaf f27516e;

    /* renamed from: f  reason: collision with root package name */
    public final zzaf f27517f;

    /* renamed from: g  reason: collision with root package name */
    public final zzaf f27518g;

    public /* synthetic */ zzz(zzi zzi, zzy zzy) {
        zzk zzk = new zzk(zzi);
        this.f27513b = zzk;
        zzaf b2 = zzad.b(new zzu(zzk));
        this.f27514c = b2;
        zzaf b3 = zzad.b(new zzs(zzk, b2));
        this.f27515d = b3;
        zzaf b4 = zzad.b(new zzd(zzk));
        this.f27516e = b4;
        zzaf b5 = zzad.b(new zzh(b3, b4, zzk));
        this.f27517f = b5;
        this.f27518g = zzad.b(new zzj(b5));
    }

    public final AppUpdateManager a() {
        return (AppUpdateManager) this.f27518g.a();
    }
}
