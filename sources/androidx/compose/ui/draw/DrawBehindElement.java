package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f15706z;

    public DrawBehindElement(Function1 function1) {
        this.f15706z = function1;
    }

    /* renamed from: c */
    public DrawBackgroundModifier a() {
        return new DrawBackgroundModifier(this.f15706z);
    }

    /* renamed from: d */
    public void b(DrawBackgroundModifier drawBackgroundModifier) {
        drawBackgroundModifier.Z2(this.f15706z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && Intrinsics.d(this.f15706z, ((DrawBehindElement) obj).f15706z);
    }

    public int hashCode() {
        return this.f15706z.hashCode();
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.f15706z + ')';
    }
}
