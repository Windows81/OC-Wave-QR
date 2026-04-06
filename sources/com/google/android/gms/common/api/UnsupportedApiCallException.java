package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: z  reason: collision with root package name */
    public final Feature f24451z;

    public UnsupportedApiCallException(Feature feature) {
        this.f24451z = feature;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f24451z));
    }
}
