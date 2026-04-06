package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class SizeElement extends ModifierNodeElement<SizeNode> {

    /* renamed from: A  reason: collision with root package name */
    public final float f4157A;

    /* renamed from: B  reason: collision with root package name */
    public final float f4158B;
    public final float C;
    public final boolean D;
    public final Function1 E;

    /* renamed from: z  reason: collision with root package name */
    public final float f4159z;

    public /* synthetic */ SizeElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2, function1);
    }

    /* renamed from: c */
    public SizeNode a() {
        return new SizeNode(this.f4159z, this.f4157A, this.f4158B, this.C, this.D, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(SizeNode sizeNode) {
        sizeNode.e3(this.f4159z);
        sizeNode.d3(this.f4157A);
        sizeNode.c3(this.f4158B);
        sizeNode.b3(this.C);
        sizeNode.a3(this.D);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Dp.o(this.f4159z, sizeElement.f4159z) && Dp.o(this.f4157A, sizeElement.f4157A) && Dp.o(this.f4158B, sizeElement.f4158B) && Dp.o(this.C, sizeElement.C) && this.D == sizeElement.D;
    }

    public int hashCode() {
        return (((((((Dp.p(this.f4159z) * 31) + Dp.p(this.f4157A)) * 31) + Dp.p(this.f4158B)) * 31) + Dp.p(this.C)) * 31) + Boolean.hashCode(this.D);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.f19144A.c() : f2, (i2 & 2) != 0 ? Dp.f19144A.c() : f3, (i2 & 4) != 0 ? Dp.f19144A.c() : f4, (i2 & 8) != 0 ? Dp.f19144A.c() : f5, z2, function1, (DefaultConstructorMarker) null);
    }

    public SizeElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1) {
        this.f4159z = f2;
        this.f4157A = f3;
        this.f4158B = f4;
        this.C = f5;
        this.D = z2;
        this.E = function1;
    }
}
