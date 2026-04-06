package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PainterElement extends ModifierNodeElement<PainterNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f15713A;

    /* renamed from: B  reason: collision with root package name */
    public final Alignment f15714B;
    public final ContentScale C;
    public final float D;
    public final ColorFilter E;

    /* renamed from: z  reason: collision with root package name */
    public final Painter f15715z;

    public PainterElement(Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.f15715z = painter;
        this.f15713A = z2;
        this.f15714B = alignment;
        this.C = contentScale;
        this.D = f2;
        this.E = colorFilter;
    }

    /* renamed from: c */
    public PainterNode a() {
        return new PainterNode(this.f15715z, this.f15713A, this.f15714B, this.C, this.D, this.E);
    }

    /* renamed from: d */
    public void b(PainterNode painterNode) {
        boolean b3 = painterNode.b3();
        boolean z2 = this.f15713A;
        boolean z3 = b3 != z2 || (z2 && !Size.f(painterNode.a3().k(), this.f15715z.k()));
        painterNode.j3(this.f15715z);
        painterNode.k3(this.f15713A);
        painterNode.g3(this.f15714B);
        painterNode.i3(this.C);
        painterNode.d(this.D);
        painterNode.h3(this.E);
        if (z3) {
            LayoutModifierNodeKt.b(painterNode);
        }
        DrawModifierNodeKt.a(painterNode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.d(this.f15715z, painterElement.f15715z) && this.f15713A == painterElement.f15713A && Intrinsics.d(this.f15714B, painterElement.f15714B) && Intrinsics.d(this.C, painterElement.C) && Float.compare(this.D, painterElement.D) == 0 && Intrinsics.d(this.E, painterElement.E);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f15715z.hashCode() * 31) + Boolean.hashCode(this.f15713A)) * 31) + this.f15714B.hashCode()) * 31) + this.C.hashCode()) * 31) + Float.hashCode(this.D)) * 31;
        ColorFilter colorFilter = this.E;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public String toString() {
        return "PainterElement(painter=" + this.f15715z + ", sizeToIntrinsics=" + this.f15713A + ", alignment=" + this.f15714B + ", contentScale=" + this.C + ", alpha=" + this.D + ", colorFilter=" + this.E + ')';
    }
}
