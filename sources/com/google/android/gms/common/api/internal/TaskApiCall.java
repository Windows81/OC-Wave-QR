package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Feature[] f24526a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24527b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24528c;

    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public RemoteCall f24529a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f24530b = true;

        /* renamed from: c  reason: collision with root package name */
        public Feature[] f24531c;

        /* renamed from: d  reason: collision with root package name */
        public int f24532d = 0;

        public /* synthetic */ Builder(zacw zacw) {
        }

        public TaskApiCall a() {
            Preconditions.b(this.f24529a != null, "execute parameter required");
            return new zacv(this, this.f24531c, this.f24530b, this.f24532d);
        }

        public Builder b(RemoteCall remoteCall) {
            this.f24529a = remoteCall;
            return this;
        }

        public Builder c(boolean z2) {
            this.f24530b = z2;
            return this;
        }

        public Builder d(Feature... featureArr) {
            this.f24531c = featureArr;
            return this;
        }

        public Builder e(int i2) {
            this.f24532d = i2;
            return this;
        }
    }

    public TaskApiCall(Feature[] featureArr, boolean z2, int i2) {
        this.f24526a = featureArr;
        boolean z3 = false;
        if (featureArr != null && z2) {
            z3 = true;
        }
        this.f24527b = z3;
        this.f24528c = i2;
    }

    public static Builder a() {
        return new Builder((zacw) null);
    }

    public abstract void b(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource);

    public boolean c() {
        return this.f24527b;
    }

    public final int d() {
        return this.f24528c;
    }

    public final Feature[] e() {
        return this.f24526a;
    }
}
