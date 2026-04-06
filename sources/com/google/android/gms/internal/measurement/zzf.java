package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhg;
import java.util.concurrent.Callable;

public final class zzf {

    /* renamed from: a  reason: collision with root package name */
    public final zzbb f25437a;

    /* renamed from: b  reason: collision with root package name */
    public final zzh f25438b;

    /* renamed from: c  reason: collision with root package name */
    public final zzh f25439c;

    /* renamed from: d  reason: collision with root package name */
    public final zzl f25440d;

    public zzf() {
        zzbb zzbb = new zzbb();
        this.f25437a = zzbb;
        zzh zzh = new zzh((zzh) null, zzbb);
        this.f25439c = zzh;
        this.f25438b = zzh.d();
        zzl zzl = new zzl();
        this.f25440d = zzl;
        zzh.h("require", new zzz(zzl));
        zzl.b("internal.platform", new zze());
        zzh.h("runtime.counter", new zzai(Double.valueOf(0.0d)));
    }

    public final zzaq a(zzh zzh, zzhg.zzd... zzdArr) {
        zzaq zzaq = zzaq.f25336m;
        for (zzhg.zzd a2 : zzdArr) {
            zzaq = zzj.a(a2);
            zzg.b(this.f25439c);
            if ((zzaq instanceof zzat) || (zzaq instanceof zzar)) {
                zzaq = this.f25437a.a(zzh, zzaq);
            }
        }
        return zzaq;
    }

    public final void b(String str, Callable callable) {
        this.f25440d.b(str, callable);
    }
}
