package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {

    /* renamed from: A  reason: collision with root package name */
    public final float f3723A;

    /* renamed from: B  reason: collision with root package name */
    public final float f3724B;
    public final Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final AlignmentLine f3725z;

    public /* synthetic */ AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f2, float f3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, f2, f3, function1);
    }

    /* renamed from: c */
    public AlignmentLineOffsetDpNode a() {
        return new AlignmentLineOffsetDpNode(this.f3725z, this.f3723A, this.f3724B, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(AlignmentLineOffsetDpNode alignmentLineOffsetDpNode) {
        alignmentLineOffsetDpNode.a3(this.f3725z);
        alignmentLineOffsetDpNode.b3(this.f3723A);
        alignmentLineOffsetDpNode.Z2(this.f3724B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return Intrinsics.d(this.f3725z, alignmentLineOffsetDpElement.f3725z) && Dp.o(this.f3723A, alignmentLineOffsetDpElement.f3723A) && Dp.o(this.f3724B, alignmentLineOffsetDpElement.f3724B);
    }

    public int hashCode() {
        return (((this.f3725z.hashCode() * 31) + Dp.p(this.f3723A)) * 31) + Dp.p(this.f3724B);
    }

    public AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f2, float f3, Function1 function1) {
        this.f3725z = alignmentLine;
        this.f3723A = f2;
        this.f3724B = f3;
        this.C = function1;
        boolean z2 = true;
        boolean z3 = f2 >= 0.0f || Float.isNaN(f2);
        if (f3 < 0.0f && !Float.isNaN(f3)) {
            z2 = false;
        }
        if (!z3 || !z2) {
            InlineClassHelperKt.a("Padding from alignment line must be a non-negative number");
        }
    }
}
