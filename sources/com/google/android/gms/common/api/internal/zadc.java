package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Set;

public final class zadc {

    /* renamed from: c  reason: collision with root package name */
    public static final Status f24734c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a  reason: collision with root package name */
    public final Set f24735a;

    /* renamed from: b  reason: collision with root package name */
    public final zadb f24736b;

    public final void a(BasePendingResult basePendingResult) {
        this.f24735a.add(basePendingResult);
        basePendingResult.q(this.f24736b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f24735a.toArray(new BasePendingResult[0])) {
            basePendingResult.q((zadb) null);
            if (basePendingResult.p()) {
                this.f24735a.remove(basePendingResult);
            }
        }
    }
}
