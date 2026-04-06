package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzr extends zzal {

    /* renamed from: B  reason: collision with root package name */
    public final zzv f25838B;

    public zzr(zzv zzv) {
        super("internal.logger");
        this.f25838B = zzv;
        this.f25332A.put("log", new zzu(this, false, true));
        this.f25332A.put("silent", new zzq(this, "silent"));
        ((zzal) this.f25332A.get("silent")).p("log", new zzu(this, true, true));
        this.f25332A.put("unmonitored", new zzt(this, "unmonitored"));
        ((zzal) this.f25332A.get("unmonitored")).p("log", new zzu(this, false, false));
    }

    public final zzaq a(zzh zzh, List list) {
        return zzaq.f25336m;
    }
}
