package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class AlignmentLineKt {
    public static final MeasureResult c(MeasureScope measureScope, AlignmentLine alignmentLine, float f2, float f3, Measurable measurable, long j2) {
        int i2;
        MeasureScope measureScope2 = measureScope;
        Placeable c0 = measurable.c0(d(alignmentLine) ? Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null) : Constraints.d(j2, 0, 0, 0, 0, 14, (Object) null));
        AlignmentLine alignmentLine2 = alignmentLine;
        int f0 = c0.f0(alignmentLine);
        if (f0 == Integer.MIN_VALUE) {
            f0 = 0;
        }
        int C0 = d(alignmentLine) ? c0.C0() : c0.L0();
        int k2 = d(alignmentLine) ? Constraints.k(j2) : Constraints.l(j2);
        if (!Float.isNaN(f2)) {
            float f4 = f2;
            i2 = measureScope.P1(f2);
        } else {
            float f5 = f2;
            i2 = 0;
        }
        int i3 = k2 - C0;
        int o2 = RangesKt.o(i2 - f0, 0, i3);
        int o3 = RangesKt.o(((!Float.isNaN(f3) ? measureScope.P1(f3) : 0) - C0) + f0, 0, i3 - o2);
        int L0 = d(alignmentLine) ? c0.L0() : Math.max(c0.L0() + o2 + o3, Constraints.n(j2));
        int max = d(alignmentLine) ? Math.max(c0.C0() + o2 + o3, Constraints.m(j2)) : c0.C0();
        return MeasureScope.R1(measureScope, L0, max, (Map) null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f2, o2, L0, o3, c0, max), 4, (Object) null);
    }

    public static final boolean d(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    public static final Modifier e(Modifier modifier, AlignmentLine alignmentLine, float f2, float f3) {
        return modifier.o0(new AlignmentLineOffsetDpElement(alignmentLine, f2, f3, InspectableValueKt.b() ? new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, f2, f3) : InspectableValueKt.a(), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier f(Modifier modifier, AlignmentLine alignmentLine, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.f19144A.c();
        }
        return e(modifier, alignmentLine, f2, f3);
    }

    public static final Modifier g(Modifier modifier, float f2, float f3) {
        return modifier.o0(!Float.isNaN(f2) ? f(Modifier.f15489d, androidx.compose.ui.layout.AlignmentLineKt.a(), f2, 0.0f, 4, (Object) null) : Modifier.f15489d).o0(!Float.isNaN(f3) ? f(Modifier.f15489d, androidx.compose.ui.layout.AlignmentLineKt.b(), 0.0f, f3, 2, (Object) null) : Modifier.f15489d);
    }

    public static /* synthetic */ Modifier h(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.f19144A.c();
        }
        return g(modifier, f2, f3);
    }
}
