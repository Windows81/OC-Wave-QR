package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {

    /* renamed from: A  reason: collision with root package name */
    public final PaddingValues f4124A;

    public PaddingValuesConsumingModifier(PaddingValues paddingValues) {
        super((DefaultConstructorMarker) null);
        this.f4124A = paddingValues;
    }

    public WindowInsets a(WindowInsets windowInsets) {
        return WindowInsetsKt.e(WindowInsetsKt.f(this.f4124A), windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesConsumingModifier)) {
            return false;
        }
        return Intrinsics.d(((PaddingValuesConsumingModifier) obj).f4124A, this.f4124A);
    }

    public int hashCode() {
        return this.f4124A.hashCode();
    }
}
