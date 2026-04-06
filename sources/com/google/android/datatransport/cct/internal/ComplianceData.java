package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData;

public abstract class ComplianceData {

    public static abstract class Builder {
        public abstract ComplianceData a();

        public abstract Builder b(ExternalPrivacyContext externalPrivacyContext);

        public abstract Builder c(ProductIdOrigin productIdOrigin);
    }

    public enum ProductIdOrigin {
        NOT_SET(0),
        EVENT_OVERRIDE(5);
        
        public static final SparseArray C = null;

        /* renamed from: z  reason: collision with root package name */
        public final int f23983z;

        static {
            ProductIdOrigin productIdOrigin;
            ProductIdOrigin productIdOrigin2;
            SparseArray sparseArray = new SparseArray();
            C = sparseArray;
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        /* access modifiers changed from: public */
        ProductIdOrigin(int i2) {
            this.f23983z = i2;
        }
    }

    public static Builder a() {
        return new AutoValue_ComplianceData.Builder();
    }

    public abstract ExternalPrivacyContext b();

    public abstract ProductIdOrigin c();
}
