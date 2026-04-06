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
final class VerticalScrollLayoutModifier implements LayoutModifier {

    /* renamed from: A  reason: collision with root package name */
    public final int f6032A;

    /* renamed from: B  reason: collision with root package name */
    public final TransformedText f6033B;
    public final Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final TextFieldScrollerPosition f6034z;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i2, TransformedText transformedText, Function0 function0) {
        this.f6034z = textFieldScrollerPosition;
        this.f6032A = i2;
        this.f6033B = transformedText;
        this.C = function0;
    }

    public final int a() {
        return this.f6032A;
    }

    public final TextFieldScrollerPosition b() {
        return this.f6034z;
    }

    public final Function0 c() {
        return this.C;
    }

    public final TransformedText d() {
        return this.f6033B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return Intrinsics.d(this.f6034z, verticalScrollLayoutModifier.f6034z) && this.f6032A == verticalScrollLayoutModifier.f6032A && Intrinsics.d(this.f6033B, verticalScrollLayoutModifier.f6033B) && Intrinsics.d(this.C, verticalScrollLayoutModifier.C);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(Constraints.d(j2, 0, 0, 0, Integer.MAX_VALUE, 7, (Object) null));
        int min = Math.min(c0.C0(), Constraints.k(j2));
        return MeasureScope.R1(measureScope, c0.L0(), min, (Map) null, new VerticalScrollLayoutModifier$measure$1(measureScope, this, c0, min), 4, (Object) null);
    }

    public int hashCode() {
        return (((((this.f6034z.hashCode() * 31) + Integer.hashCode(this.f6032A)) * 31) + this.f6033B.hashCode()) * 31) + this.C.hashCode();
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f6034z + ", cursorOffset=" + this.f6032A + ", transformedText=" + this.f6033B + ", textLayoutResultProvider=" + this.C + ')';
    }
}
