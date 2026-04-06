package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f16784A;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f16785z;

    /* renamed from: c */
    public InterceptedKeyInputNode a() {
        return new InterceptedKeyInputNode(this.f16785z, this.f16784A);
    }

    /* renamed from: d */
    public void b(InterceptedKeyInputNode interceptedKeyInputNode) {
        interceptedKeyInputNode.Z2(this.f16785z);
        interceptedKeyInputNode.a3(this.f16784A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return Intrinsics.d(this.f16785z, softKeyboardInterceptionElement.f16785z) && Intrinsics.d(this.f16784A, softKeyboardInterceptionElement.f16784A);
    }

    public int hashCode() {
        Function1 function1 = this.f16785z;
        int i2 = 0;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function12 = this.f16784A;
        if (function12 != null) {
            i2 = function12.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.f16785z + ", onPreKeyEvent=" + this.f16784A + ')';
    }
}
