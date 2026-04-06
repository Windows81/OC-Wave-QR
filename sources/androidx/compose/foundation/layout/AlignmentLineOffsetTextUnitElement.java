package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {

    /* renamed from: A  reason: collision with root package name */
    public final long f3726A;

    /* renamed from: B  reason: collision with root package name */
    public final long f3727B;

    /* renamed from: z  reason: collision with root package name */
    public final AlignmentLine f3728z;

    /* renamed from: c */
    public AlignmentLineOffsetTextUnitNode a() {
        return new AlignmentLineOffsetTextUnitNode(this.f3728z, this.f3726A, this.f3727B, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(AlignmentLineOffsetTextUnitNode alignmentLineOffsetTextUnitNode) {
        alignmentLineOffsetTextUnitNode.a3(this.f3728z);
        alignmentLineOffsetTextUnitNode.b3(this.f3726A);
        alignmentLineOffsetTextUnitNode.Z2(this.f3727B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null;
        if (alignmentLineOffsetTextUnitElement == null) {
            return false;
        }
        return Intrinsics.d(this.f3728z, alignmentLineOffsetTextUnitElement.f3728z) && TextUnit.e(this.f3726A, alignmentLineOffsetTextUnitElement.f3726A) && TextUnit.e(this.f3727B, alignmentLineOffsetTextUnitElement.f3727B);
    }

    public int hashCode() {
        return (((this.f3728z.hashCode() * 31) + TextUnit.i(this.f3726A)) * 31) + TextUnit.i(this.f3727B);
    }
}
