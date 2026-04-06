package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

final class zabs {

    /* renamed from: a  reason: collision with root package name */
    public final ApiKey f24671a;

    /* renamed from: b  reason: collision with root package name */
    public final Feature f24672b;

    public /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabr) {
        this.f24671a = apiKey;
        this.f24672b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zabs)) {
            zabs zabs = (zabs) obj;
            return Objects.a(this.f24671a, zabs.f24671a) && Objects.a(this.f24672b, zabs.f24672b);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f24671a, this.f24672b);
    }

    public final String toString() {
        return Objects.c(this).a("key", this.f24671a).a("feature", this.f24672b).toString();
    }
}
