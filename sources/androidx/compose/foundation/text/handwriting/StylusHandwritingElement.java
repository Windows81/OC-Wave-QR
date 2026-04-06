package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class StylusHandwritingElement extends ModifierNodeElement<StylusHandwritingNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function0 f6046z;

    public StylusHandwritingElement(Function0 function0) {
        this.f6046z = function0;
    }

    /* renamed from: c */
    public StylusHandwritingNode a() {
        return new StylusHandwritingNode(this.f6046z);
    }

    /* renamed from: d */
    public void b(StylusHandwritingNode stylusHandwritingNode) {
        stylusHandwritingNode.h3(this.f6046z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && Intrinsics.d(this.f6046z, ((StylusHandwritingElement) obj).f6046z);
    }

    public int hashCode() {
        return this.f6046z.hashCode();
    }

    public String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.f6046z + ')';
    }
}
