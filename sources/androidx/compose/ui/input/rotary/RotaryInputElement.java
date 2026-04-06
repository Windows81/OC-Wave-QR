package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f16980A;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f16981z;

    public RotaryInputElement(Function1 function1, Function1 function12) {
        this.f16981z = function1;
        this.f16980A = function12;
    }

    /* renamed from: c */
    public RotaryInputNode a() {
        return new RotaryInputNode(this.f16981z, this.f16980A);
    }

    /* renamed from: d */
    public void b(RotaryInputNode rotaryInputNode) {
        rotaryInputNode.Z2(this.f16981z);
        rotaryInputNode.a3(this.f16980A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return Intrinsics.d(this.f16981z, rotaryInputElement.f16981z) && Intrinsics.d(this.f16980A, rotaryInputElement.f16980A);
    }

    public int hashCode() {
        Function1 function1 = this.f16981z;
        int i2 = 0;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function12 = this.f16980A;
        if (function12 != null) {
            i2 = function12.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f16981z + ", onPreRotaryScrollEvent=" + this.f16980A + ')';
    }
}
