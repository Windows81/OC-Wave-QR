package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class HandwritingDetectorElement extends ModifierNodeElement<HandwritingDetectorNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function0 f6042z;

    /* renamed from: c */
    public HandwritingDetectorNode a() {
        return new HandwritingDetectorNode(this.f6042z);
    }

    /* renamed from: d */
    public void b(HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.i3(this.f6042z);
    }

    public boolean equals(Object obj) {
        boolean z2 = false;
        boolean z3 = this == obj;
        if ((obj instanceof HandwritingDetectorElement) && this.f6042z == ((HandwritingDetectorElement) obj).f6042z) {
            z2 = true;
        }
        return z3 | z2;
    }

    public int hashCode() {
        return this.f6042z.hashCode() * 31;
    }
}
