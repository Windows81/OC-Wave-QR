package androidx.compose.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class KeyedComposedModifier3 extends ComposedModifier {

    /* renamed from: B  reason: collision with root package name */
    public final String f15487B;
    public final Object C;
    public final Object D;
    public final Object E;

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier3) {
            KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
            return Intrinsics.d(this.f15487B, keyedComposedModifier3.f15487B) && Intrinsics.d(this.C, keyedComposedModifier3.C) && Intrinsics.d(this.D, keyedComposedModifier3.D) && Intrinsics.d(this.E, keyedComposedModifier3.E);
        }
    }

    public int hashCode() {
        int hashCode = this.f15487B.hashCode() * 31;
        Object obj = this.C;
        int i2 = 0;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.D;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.E;
        if (obj3 != null) {
            i2 = obj3.hashCode();
        }
        return hashCode3 + i2;
    }
}
