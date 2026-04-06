package androidx.compose.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class KeyedComposedModifier2 extends ComposedModifier {

    /* renamed from: B  reason: collision with root package name */
    public final String f15486B;
    public final Object C;
    public final Object D;

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier2) {
            KeyedComposedModifier2 keyedComposedModifier2 = (KeyedComposedModifier2) obj;
            return Intrinsics.d(this.f15486B, keyedComposedModifier2.f15486B) && Intrinsics.d(this.C, keyedComposedModifier2.C) && Intrinsics.d(this.D, keyedComposedModifier2.D);
        }
    }

    public int hashCode() {
        int hashCode = this.f15486B.hashCode() * 31;
        Object obj = this.C;
        int i2 = 0;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.D;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode2 + i2;
    }
}
