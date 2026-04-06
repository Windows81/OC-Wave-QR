package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BoxChildDataElement extends ModifierNodeElement<BoxChildDataNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f3777A;

    /* renamed from: B  reason: collision with root package name */
    public final Function1 f3778B;

    /* renamed from: z  reason: collision with root package name */
    public final Alignment f3779z;

    public BoxChildDataElement(Alignment alignment, boolean z2, Function1 function1) {
        this.f3779z = alignment;
        this.f3777A = z2;
        this.f3778B = function1;
    }

    /* renamed from: c */
    public BoxChildDataNode a() {
        return new BoxChildDataNode(this.f3779z, this.f3777A);
    }

    /* renamed from: d */
    public void b(BoxChildDataNode boxChildDataNode) {
        boxChildDataNode.c3(this.f3779z);
        boxChildDataNode.d3(this.f3777A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return Intrinsics.d(this.f3779z, boxChildDataElement.f3779z) && this.f3777A == boxChildDataElement.f3777A;
    }

    public int hashCode() {
        return (this.f3779z.hashCode() * 31) + Boolean.hashCode(this.f3777A);
    }
}
