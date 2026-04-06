package com.google.android.datatransport;

final class AutoValue_ProductData extends ProductData {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f23823a;

    public Integer a() {
        return this.f23823a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        Integer num = this.f23823a;
        Integer a2 = ((ProductData) obj).a();
        return num == null ? a2 == null : num.equals(a2);
    }

    public int hashCode() {
        Integer num = this.f23823a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f23823a + "}";
    }
}
