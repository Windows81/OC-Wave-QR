package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

public final class zal {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f24948a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public GoogleApiAvailabilityLight f24949b;

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        Preconditions.m(googleApiAvailabilityLight);
        this.f24949b = googleApiAvailabilityLight;
    }

    public final int a(Context context, int i2) {
        return this.f24948a.get(i2, -1);
    }

    public final int b(Context context, Api.Client client) {
        Preconditions.m(context);
        Preconditions.m(client);
        int i2 = 0;
        if (!client.m()) {
            return 0;
        }
        int o2 = client.o();
        int a2 = a(context, o2);
        if (a2 == -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f24948a.size()) {
                    i2 = -1;
                    break;
                }
                int keyAt = this.f24948a.keyAt(i3);
                if (keyAt > o2 && this.f24948a.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            a2 = i2 == -1 ? this.f24949b.j(context, o2) : i2;
            this.f24948a.put(o2, a2);
        }
        return a2;
    }

    public final void c() {
        this.f24948a.clear();
    }
}
