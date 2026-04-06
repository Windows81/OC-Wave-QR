package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhg;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    public final zzf f25354a;

    /* renamed from: b  reason: collision with root package name */
    public zzh f25355b;

    /* renamed from: c  reason: collision with root package name */
    public zzac f25356c;

    /* renamed from: d  reason: collision with root package name */
    public final zzaa f25357d;

    public zzb() {
        this(new zzf());
    }

    public final zzac a() {
        return this.f25356c;
    }

    public final void b(zzhg.zzc zzc) {
        zzal zzal;
        try {
            this.f25355b = this.f25354a.f25438b.d();
            if (!(this.f25354a.a(this.f25355b, (zzhg.zzd[]) zzc.L().toArray(new zzhg.zzd[0])) instanceof zzaj)) {
                for (zzhg.zzb zzb : zzc.J().L()) {
                    List L = zzb.L();
                    String K = zzb.K();
                    Iterator it = L.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            zzaq a2 = this.f25354a.a(this.f25355b, (zzhg.zzd) it.next());
                            if (a2 instanceof zzap) {
                                zzh zzh = this.f25355b;
                                if (!zzh.g(K)) {
                                    zzal = null;
                                } else {
                                    zzaq c2 = zzh.c(K);
                                    if (c2 instanceof zzal) {
                                        zzal = (zzal) c2;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: " + K);
                                    }
                                }
                                if (zzal != null) {
                                    zzal.a(this.f25355b, Collections.singletonList(a2));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: " + K);
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final void c(String str, Callable callable) {
        this.f25354a.b(str, callable);
    }

    public final boolean d(zzad zzad) {
        try {
            this.f25356c.b(zzad);
            this.f25354a.f25439c.h("runtime.counter", new zzai(Double.valueOf(0.0d)));
            this.f25357d.b(this.f25355b.d(), this.f25356c);
            return g() || f();
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final /* synthetic */ zzal e() {
        return new zzw(this.f25357d);
    }

    public final boolean f() {
        return !this.f25356c.f().isEmpty();
    }

    public final boolean g() {
        return !this.f25356c.d().equals(this.f25356c.a());
    }

    public zzb(zzf zzf) {
        this.f25354a = zzf;
        this.f25355b = zzf.f25438b.d();
        this.f25356c = new zzac();
        this.f25357d = new zzaa();
        zzf.b("internal.registerCallback", new zza(this));
        zzf.b("internal.eventLogger", new zzd(this));
    }
}
