package com.lokalise.sdk.api.poko;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BundleResponse {
    @SerializedName("bundle")
    @Expose(deserialize = true, serialize = false)
    private final Bundle bundle;

    public BundleResponse(Bundle bundle2) {
        Intrinsics.i(bundle2, "bundle");
        this.bundle = bundle2;
    }

    public static /* synthetic */ BundleResponse copy$default(BundleResponse bundleResponse, Bundle bundle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bundle2 = bundleResponse.bundle;
        }
        return bundleResponse.copy(bundle2);
    }

    public final Bundle component1() {
        return this.bundle;
    }

    public final BundleResponse copy(Bundle bundle2) {
        Intrinsics.i(bundle2, "bundle");
        return new BundleResponse(bundle2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BundleResponse) && Intrinsics.d(this.bundle, ((BundleResponse) obj).bundle);
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public int hashCode() {
        return this.bundle.hashCode();
    }

    public String toString() {
        Bundle bundle2 = this.bundle;
        return "BundleResponse(bundle=" + bundle2 + ")";
    }
}
