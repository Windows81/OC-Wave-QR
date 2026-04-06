package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzbb {

    /* renamed from: a  reason: collision with root package name */
    public Map f25358a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public zzbq f25359b = new zzbq();

    public zzbb() {
        b(new zzaw());
        b(new zzba());
        b(new zzbc());
        b(new zzbg());
        b(new zzbi());
        b(new zzbo());
        b(new zzbt());
    }

    public final zzaq a(zzh zzh, zzaq zzaq) {
        zzg.b(zzh);
        if (!(zzaq instanceof zzat)) {
            return zzaq;
        }
        zzat zzat = (zzat) zzaq;
        ArrayList b2 = zzat.b();
        String a2 = zzat.a();
        return (this.f25358a.containsKey(a2) ? (zzay) this.f25358a.get(a2) : this.f25359b).b(a2, zzh, b2);
    }

    public final void b(zzay zzay) {
        for (zzbv zzbv : zzay.f25352a) {
            this.f25358a.put(zzbv.toString(), zzay);
        }
    }
}
