package androidx.compose.ui.input.pointer;

import android.view.PointerIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidPointerIcon implements PointerIcon {

    /* renamed from: b  reason: collision with root package name */
    public final PointerIcon f16803b;

    public final PointerIcon a() {
        return this.f16803b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(AndroidPointerIcon.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return Intrinsics.d(this.f16803b, ((AndroidPointerIcon) obj).f16803b);
    }

    public int hashCode() {
        return this.f16803b.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f16803b + ')';
    }
}
