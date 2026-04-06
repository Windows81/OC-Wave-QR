package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f16996A;

    /* renamed from: B  reason: collision with root package name */
    public final Function2 f16997B;

    /* renamed from: z  reason: collision with root package name */
    public final Function3 f16998z;

    /* renamed from: c */
    public ApproachLayoutModifierNodeImpl a() {
        return new ApproachLayoutModifierNodeImpl(this.f16998z, this.f16996A, this.f16997B);
    }

    /* renamed from: d */
    public void b(ApproachLayoutModifierNodeImpl approachLayoutModifierNodeImpl) {
        approachLayoutModifierNodeImpl.Z2(this.f16998z);
        approachLayoutModifierNodeImpl.a3(this.f16996A);
        approachLayoutModifierNodeImpl.b3(this.f16997B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return Intrinsics.d(this.f16998z, approachLayoutElement.f16998z) && Intrinsics.d(this.f16996A, approachLayoutElement.f16996A) && Intrinsics.d(this.f16997B, approachLayoutElement.f16997B);
    }

    public int hashCode() {
        return (((this.f16998z.hashCode() * 31) + this.f16996A.hashCode()) * 31) + this.f16997B.hashCode();
    }

    public String toString() {
        return "ApproachLayoutElement(approachMeasure=" + this.f16998z + ", isMeasurementApproachInProgress=" + this.f16996A + ", isPlacementApproachInProgress=" + this.f16997B + ')';
    }
}
