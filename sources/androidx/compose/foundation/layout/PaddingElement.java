package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class PaddingElement extends ModifierNodeElement<PaddingNode> {

    /* renamed from: A  reason: collision with root package name */
    public float f4104A;

    /* renamed from: B  reason: collision with root package name */
    public float f4105B;
    public float C;
    public boolean D;
    public final Function1 E;

    /* renamed from: z  reason: collision with root package name */
    public float f4106z;

    public /* synthetic */ PaddingElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2, function1);
    }

    /* renamed from: c */
    public PaddingNode a() {
        return new PaddingNode(this.f4106z, this.f4104A, this.f4105B, this.C, this.D, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(PaddingNode paddingNode) {
        paddingNode.f3(this.f4106z);
        paddingNode.g3(this.f4104A);
        paddingNode.d3(this.f4105B);
        paddingNode.c3(this.C);
        paddingNode.e3(this.D);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.o(this.f4106z, paddingElement.f4106z) && Dp.o(this.f4104A, paddingElement.f4104A) && Dp.o(this.f4105B, paddingElement.f4105B) && Dp.o(this.C, paddingElement.C) && this.D == paddingElement.D;
    }

    public int hashCode() {
        return (((((((Dp.p(this.f4106z) * 31) + Dp.p(this.f4104A)) * 31) + Dp.p(this.f4105B)) * 31) + Dp.p(this.C)) * 31) + Boolean.hashCode(this.D);
    }

    public PaddingElement(float f2, float f3, float f4, float f5, boolean z2, Function1 function1) {
        this.f4106z = f2;
        this.f4104A = f3;
        this.f4105B = f4;
        this.C = f5;
        this.D = z2;
        this.E = function1;
        boolean z3 = true;
        boolean z4 = f2 >= 0.0f || Float.isNaN(f2);
        float f6 = this.f4104A;
        boolean z5 = z4 & (f6 >= 0.0f || Float.isNaN(f6));
        float f7 = this.f4105B;
        boolean z6 = z5 & (f7 >= 0.0f || Float.isNaN(f7));
        float f8 = this.C;
        if (f8 < 0.0f && !Float.isNaN(f8)) {
            z3 = false;
        }
        if (!z6 || !z3) {
            InlineClassHelperKt.a("Padding must be non-negative");
        }
    }
}
