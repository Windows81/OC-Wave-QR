package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

public final class ApiKey<O extends Api.ApiOptions> {

    /* renamed from: a  reason: collision with root package name */
    public final int f24452a;

    /* renamed from: b  reason: collision with root package name */
    public final Api f24453b;

    /* renamed from: c  reason: collision with root package name */
    public final Api.ApiOptions f24454c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24455d;

    public ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.f24453b = api;
        this.f24454c = apiOptions;
        this.f24455d = str;
        this.f24452a = Objects.b(api, apiOptions, str);
    }

    public static ApiKey a(Api api, Api.ApiOptions apiOptions, String str) {
        return new ApiKey(api, apiOptions, str);
    }

    public final String b() {
        return this.f24453b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.a(this.f24453b, apiKey.f24453b) && Objects.a(this.f24454c, apiKey.f24454c) && Objects.a(this.f24455d, apiKey.f24455d);
    }

    public final int hashCode() {
        return this.f24452a;
    }
}
