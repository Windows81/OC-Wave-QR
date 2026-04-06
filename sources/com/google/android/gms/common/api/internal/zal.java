package com.google.android.gms.common.api.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;

public final class zal {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayMap f24748a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap f24749b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f24750c;

    /* renamed from: d  reason: collision with root package name */
    public int f24751d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24752e;

    public final Set a() {
        return this.f24748a.keySet();
    }

    public final void b(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        this.f24748a.put(apiKey, connectionResult);
        this.f24749b.put(apiKey, str);
        this.f24751d--;
        if (!connectionResult.f0()) {
            this.f24752e = true;
        }
        if (this.f24751d != 0) {
            return;
        }
        if (this.f24752e) {
            this.f24750c.b(new AvailabilityException(this.f24748a));
            return;
        }
        this.f24750c.c(this.f24749b);
    }
}
