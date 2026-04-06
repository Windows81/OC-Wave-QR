package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IndicatorLineElement extends ModifierNodeElement<IndicatorLineNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f10137A;

    /* renamed from: B  reason: collision with root package name */
    public final InteractionSource f10138B;
    public final TextFieldColors C;
    public final Shape D;
    public final float E;
    public final float F;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f10139z;

    public /* synthetic */ IndicatorLineElement(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, interactionSource, textFieldColors, shape, f2, f3);
    }

    /* renamed from: c */
    public IndicatorLineNode a() {
        return new IndicatorLineNode(this.f10139z, this.f10137A, this.f10138B, this.C, this.D, this.E, this.F, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(IndicatorLineNode indicatorLineNode) {
        indicatorLineNode.z3(this.f10139z, this.f10137A, this.f10138B, this.C, this.D, this.E, this.F);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorLineElement)) {
            return false;
        }
        IndicatorLineElement indicatorLineElement = (IndicatorLineElement) obj;
        return this.f10139z == indicatorLineElement.f10139z && this.f10137A == indicatorLineElement.f10137A && Intrinsics.d(this.f10138B, indicatorLineElement.f10138B) && Intrinsics.d(this.C, indicatorLineElement.C) && Intrinsics.d(this.D, indicatorLineElement.D) && Dp.o(this.E, indicatorLineElement.E) && Dp.o(this.F, indicatorLineElement.F);
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.f10139z) * 31) + Boolean.hashCode(this.f10137A)) * 31) + this.f10138B.hashCode()) * 31;
        TextFieldColors textFieldColors = this.C;
        int i2 = 0;
        int hashCode2 = (hashCode + (textFieldColors == null ? 0 : textFieldColors.hashCode())) * 31;
        Shape shape = this.D;
        if (shape != null) {
            i2 = shape.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + Dp.p(this.E)) * 31) + Dp.p(this.F);
    }

    public String toString() {
        return "IndicatorLineElement(enabled=" + this.f10139z + ", isError=" + this.f10137A + ", interactionSource=" + this.f10138B + ", colors=" + this.C + ", textFieldShape=" + this.D + ", focusedIndicatorLineThickness=" + Dp.r(this.E) + ", unfocusedIndicatorLineThickness=" + Dp.r(this.F) + ')';
    }

    public IndicatorLineElement(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3) {
        this.f10139z = z2;
        this.f10137A = z3;
        this.f10138B = interactionSource;
        this.C = textFieldColors;
        this.D = shape;
        this.E = f2;
        this.F = f3;
    }
}
