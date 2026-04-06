package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f4097A;

    /* renamed from: B  reason: collision with root package name */
    public final Function1 f4098B;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f4099z;

    public OffsetPxElement(Function1 function1, boolean z2, Function1 function12) {
        this.f4099z = function1;
        this.f4097A = z2;
        this.f4098B = function12;
    }

    /* renamed from: c */
    public OffsetPxNode a() {
        return new OffsetPxNode(this.f4099z, this.f4097A);
    }

    /* renamed from: d */
    public void b(OffsetPxNode offsetPxNode) {
        offsetPxNode.b3(this.f4099z, this.f4097A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return this.f4099z == offsetPxElement.f4099z && this.f4097A == offsetPxElement.f4097A;
    }

    public int hashCode() {
        return (this.f4099z.hashCode() * 31) + Boolean.hashCode(this.f4097A);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f4099z + ", rtlAware=" + this.f4097A + ')';
    }
}
