package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExternalPRequestContext;

final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f23937a;

    public static final class Builder extends ExternalPRequestContext.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Integer f23938a;

        public ExternalPRequestContext a() {
            return new AutoValue_ExternalPRequestContext(this.f23938a);
        }

        public ExternalPRequestContext.Builder b(Integer num) {
            this.f23938a = num;
            return this;
        }
    }

    public Integer b() {
        return this.f23937a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.f23937a;
        Integer b2 = ((ExternalPRequestContext) obj).b();
        return num == null ? b2 == null : num.equals(b2);
    }

    public int hashCode() {
        Integer num = this.f23937a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f23937a + "}";
    }

    public AutoValue_ExternalPRequestContext(Integer num) {
        this.f23937a = num;
    }
}
