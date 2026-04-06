package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {

    /* renamed from: A  reason: collision with root package name */
    public final WindowInsets f4199A;

    public UnionInsetsConsumingModifier(WindowInsets windowInsets) {
        super((DefaultConstructorMarker) null);
        this.f4199A = windowInsets;
    }

    public WindowInsets a(WindowInsets windowInsets) {
        return WindowInsetsKt.k(this.f4199A, windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsetsConsumingModifier)) {
            return false;
        }
        return Intrinsics.d(((UnionInsetsConsumingModifier) obj).f4199A, this.f4199A);
    }

    public int hashCode() {
        return this.f4199A.hashCode();
    }
}
