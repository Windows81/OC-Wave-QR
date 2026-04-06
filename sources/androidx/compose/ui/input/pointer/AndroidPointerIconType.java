package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidPointerIconType implements PointerIcon {

    /* renamed from: b  reason: collision with root package name */
    public final int f16804b;

    public AndroidPointerIconType(int i2) {
        this.f16804b = i2;
    }

    public final int a() {
        return this.f16804b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(AndroidPointerIconType.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f16804b == ((AndroidPointerIconType) obj).f16804b;
    }

    public int hashCode() {
        return this.f16804b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f16804b + ')';
    }
}
