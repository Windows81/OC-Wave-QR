package androidx.compose.ui.semantics;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AccessibilityAction<T extends Function<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public final String f18017a;

    /* renamed from: b  reason: collision with root package name */
    public final Function f18018b;

    public AccessibilityAction(String str, Function function) {
        this.f18017a = str;
        this.f18018b = function;
    }

    public final Function a() {
        return this.f18018b;
    }

    public final String b() {
        return this.f18017a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        return Intrinsics.d(this.f18017a, accessibilityAction.f18017a) && Intrinsics.d(this.f18018b, accessibilityAction.f18018b);
    }

    public int hashCode() {
        String str = this.f18017a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Function function = this.f18018b;
        if (function != null) {
            i2 = function.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f18017a + ", action=" + this.f18018b + ')';
    }
}
