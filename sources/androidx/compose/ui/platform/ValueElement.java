package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ValueElement {

    /* renamed from: a  reason: collision with root package name */
    public final String f17886a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17887b;

    public ValueElement(String str, Object obj) {
        this.f17886a = str;
        this.f17887b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) obj;
        return Intrinsics.d(this.f17886a, valueElement.f17886a) && Intrinsics.d(this.f17887b, valueElement.f17887b);
    }

    public int hashCode() {
        int hashCode = this.f17886a.hashCode() * 31;
        Object obj = this.f17887b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f17886a + ", value=" + this.f17887b + ')';
    }
}
