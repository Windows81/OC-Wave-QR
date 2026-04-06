package androidx.compose.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class KeyedComposedModifier1 extends ComposedModifier {

    /* renamed from: B  reason: collision with root package name */
    public final String f15485B;
    public final Object C;

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier1) {
            KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) obj;
            return Intrinsics.d(this.f15485B, keyedComposedModifier1.f15485B) && Intrinsics.d(this.C, keyedComposedModifier1.C);
        }
    }

    public int hashCode() {
        int hashCode = this.f15485B.hashCode() * 31;
        Object obj = this.C;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
