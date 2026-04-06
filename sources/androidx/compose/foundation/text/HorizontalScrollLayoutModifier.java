package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class HorizontalScrollLayoutModifier implements LayoutModifier {

    /* renamed from: A  reason: collision with root package name */
    public final int f5745A;

    /* renamed from: B  reason: collision with root package name */
    public final TransformedText f5746B;
    public final Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final TextFieldScrollerPosition f5747z;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i2, TransformedText transformedText, Function0 function0) {
        this.f5747z = textFieldScrollerPosition;
        this.f5745A = i2;
        this.f5746B = transformedText;
        this.C = function0;
    }

    public final int a() {
        return this.f5745A;
    }

    public final TextFieldScrollerPosition b() {
        return this.f5747z;
    }

    public final Function0 c() {
        return this.C;
    }

    public final TransformedText d() {
        return this.f5746B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return Intrinsics.d(this.f5747z, horizontalScrollLayoutModifier.f5747z) && this.f5745A == horizontalScrollLayoutModifier.f5745A && Intrinsics.d(this.f5746B, horizontalScrollLayoutModifier.f5746B) && Intrinsics.d(this.C, horizontalScrollLayoutModifier.C);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(measurable.a0(Constraints.k(j2)) < Constraints.l(j2) ? j2 : Constraints.d(j2, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null));
        int min = Math.min(c0.L0(), Constraints.l(j2));
        return MeasureScope.R1(measureScope, min, c0.C0(), (Map) null, new HorizontalScrollLayoutModifier$measure$1(measureScope, this, c0, min), 4, (Object) null);
    }

    public int hashCode() {
        return (((((this.f5747z.hashCode() * 31) + Integer.hashCode(this.f5745A)) * 31) + this.f5746B.hashCode()) * 31) + this.C.hashCode();
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f5747z + ", cursorOffset=" + this.f5745A + ", transformedText=" + this.f5746B + ", textLayoutResultProvider=" + this.C + ')';
    }
}
