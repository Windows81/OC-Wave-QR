package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class OffsetElement extends ModifierNodeElement<OffsetNode> {

    /* renamed from: A  reason: collision with root package name */
    public final float f4085A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f4086B;
    public final Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final float f4087z;

    public /* synthetic */ OffsetElement(float f2, float f3, boolean z2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, z2, function1);
    }

    /* renamed from: c */
    public OffsetNode a() {
        return new OffsetNode(this.f4087z, this.f4085A, this.f4086B, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(OffsetNode offsetNode) {
        offsetNode.c3(this.f4087z, this.f4085A, this.f4086B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return Dp.o(this.f4087z, offsetElement.f4087z) && Dp.o(this.f4085A, offsetElement.f4085A) && this.f4086B == offsetElement.f4086B;
    }

    public int hashCode() {
        return (((Dp.p(this.f4087z) * 31) + Dp.p(this.f4085A)) * 31) + Boolean.hashCode(this.f4086B);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + Dp.r(this.f4087z) + ", y=" + Dp.r(this.f4085A) + ", rtlAware=" + this.f4086B + ')';
    }

    public OffsetElement(float f2, float f3, boolean z2, Function1 function1) {
        this.f4087z = f2;
        this.f4085A = f3;
        this.f4086B = z2;
        this.C = function1;
    }
}
