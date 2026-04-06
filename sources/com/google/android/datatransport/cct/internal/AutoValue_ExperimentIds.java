package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExperimentIds;
import java.util.Arrays;

final class AutoValue_ExperimentIds extends ExperimentIds {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f23933a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f23934b;

    public static final class Builder extends ExperimentIds.Builder {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f23935a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f23936b;

        public ExperimentIds a() {
            return new AutoValue_ExperimentIds(this.f23935a, this.f23936b);
        }

        public ExperimentIds.Builder b(byte[] bArr) {
            this.f23935a = bArr;
            return this;
        }

        public ExperimentIds.Builder c(byte[] bArr) {
            this.f23936b = bArr;
            return this;
        }
    }

    public byte[] b() {
        return this.f23933a;
    }

    public byte[] c() {
        return this.f23934b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExperimentIds)) {
            return false;
        }
        ExperimentIds experimentIds = (ExperimentIds) obj;
        boolean z2 = experimentIds instanceof AutoValue_ExperimentIds;
        if (Arrays.equals(this.f23933a, z2 ? ((AutoValue_ExperimentIds) experimentIds).f23933a : experimentIds.b())) {
            if (Arrays.equals(this.f23934b, z2 ? ((AutoValue_ExperimentIds) experimentIds).f23934b : experimentIds.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f23933a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23934b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f23933a) + ", encryptedBlob=" + Arrays.toString(this.f23934b) + "}";
    }

    public AutoValue_ExperimentIds(byte[] bArr, byte[] bArr2) {
        this.f23933a = bArr;
        this.f23934b = bArr2;
    }
}
