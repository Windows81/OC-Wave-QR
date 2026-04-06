package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CustomAccessibilityAction {

    /* renamed from: a  reason: collision with root package name */
    public final String f18028a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f18029b;

    public CustomAccessibilityAction(String str, Function0 function0) {
        this.f18028a = str;
        this.f18029b = function0;
    }

    public final Function0 a() {
        return this.f18029b;
    }

    public final String b() {
        return this.f18028a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return Intrinsics.d(this.f18028a, customAccessibilityAction.f18028a) && this.f18029b == customAccessibilityAction.f18029b;
    }

    public int hashCode() {
        return (this.f18028a.hashCode() * 31) + this.f18029b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f18028a + ", action=" + this.f18029b + ')';
    }
}
