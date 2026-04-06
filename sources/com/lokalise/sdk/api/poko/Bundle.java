package com.lokalise.sdk.api.poko;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Bundle {
    @SerializedName("file")
    @Expose(deserialize = true, serialize = false)
    private final String file;
    @SerializedName("version")
    @Expose(deserialize = true, serialize = false)
    private final long version;

    public Bundle(String str, long j2) {
        Intrinsics.i(str, "file");
        this.file = str;
        this.version = j2;
    }

    public static /* synthetic */ Bundle copy$default(Bundle bundle, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bundle.file;
        }
        if ((i2 & 2) != 0) {
            j2 = bundle.version;
        }
        return bundle.copy(str, j2);
    }

    public final String component1() {
        return this.file;
    }

    public final long component2() {
        return this.version;
    }

    public final Bundle copy(String str, long j2) {
        Intrinsics.i(str, "file");
        return new Bundle(str, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bundle)) {
            return false;
        }
        Bundle bundle = (Bundle) obj;
        return Intrinsics.d(this.file, bundle.file) && this.version == bundle.version;
    }

    public final String getFile() {
        return this.file;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.file.hashCode() * 31) + Long.hashCode(this.version);
    }

    public String toString() {
        String str = this.file;
        long j2 = this.version;
        return "Bundle(file=" + str + ", version=" + j2 + ")";
    }
}
