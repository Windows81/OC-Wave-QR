package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f16782A;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f16783z;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.f16783z = function1;
        this.f16782A = function12;
    }

    /* renamed from: c */
    public KeyInputNode a() {
        return new KeyInputNode(this.f16783z, this.f16782A);
    }

    /* renamed from: d */
    public void b(KeyInputNode keyInputNode) {
        keyInputNode.Z2(this.f16783z);
        keyInputNode.a3(this.f16782A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f16783z == keyInputElement.f16783z && this.f16782A == keyInputElement.f16782A;
    }

    public int hashCode() {
        Function1 function1 = this.f16783z;
        int i2 = 0;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f16782A;
        if (function12 != null) {
            i2 = function12.hashCode();
        }
        return hashCode + i2;
    }
}
