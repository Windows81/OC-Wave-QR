package androidx.compose.ui;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class KeyedComposedModifierN extends ComposedModifier {

    /* renamed from: B  reason: collision with root package name */
    public final String f15488B;
    public final Object[] C;

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifierN) {
            KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
            return Intrinsics.d(this.f15488B, keyedComposedModifierN.f15488B) && Arrays.equals(this.C, keyedComposedModifierN.C);
        }
    }

    public int hashCode() {
        return (this.f15488B.hashCode() * 31) + Arrays.hashCode(this.C);
    }
}
