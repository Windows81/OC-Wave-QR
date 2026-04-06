package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {

    /* renamed from: z  reason: collision with root package name */
    public final Function3 f17052z;

    public LayoutElement(Function3 function3) {
        this.f17052z = function3;
    }

    /* renamed from: c */
    public LayoutModifierImpl a() {
        return new LayoutModifierImpl(this.f17052z);
    }

    /* renamed from: d */
    public void b(LayoutModifierImpl layoutModifierImpl) {
        layoutModifierImpl.Z2(this.f17052z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.d(this.f17052z, ((LayoutElement) obj).f17052z);
    }

    public int hashCode() {
        return this.f17052z.hashCode();
    }

    public String toString() {
        return "LayoutElement(measure=" + this.f17052z + ')';
    }
}
