package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DrawWithContentElement extends ModifierNodeElement<DrawWithContentModifier> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f15709z;

    public DrawWithContentElement(Function1 function1) {
        this.f15709z = function1;
    }

    /* renamed from: c */
    public DrawWithContentModifier a() {
        return new DrawWithContentModifier(this.f15709z);
    }

    /* renamed from: d */
    public void b(DrawWithContentModifier drawWithContentModifier) {
        drawWithContentModifier.Z2(this.f15709z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.d(this.f15709z, ((DrawWithContentElement) obj).f15709z);
    }

    public int hashCode() {
        return this.f15709z.hashCode();
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.f15709z + ')';
    }
}
