package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public Map N;

    public static final Unit b3(int i2, Placeable placeable, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, MathKt.d(((float) (i2 - placeable.L0())) / 2.0f), MathKt.d(((float) (i3 - placeable.C0())) / 2.0f), 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public final Map a3() {
        Map map = this.N;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        this.N = linkedHashMap;
        return linkedHashMap;
    }

    public final void c3(int i2, Placeable placeable) {
        Map a3 = a3();
        a3.put(InteractiveComponentSizeKt.f(), Integer.valueOf(RangesKt.e(Math.round(((float) (i2 - placeable.L0())) / 2.0f), 0)));
        a3.put(InteractiveComponentSizeKt.g(), Integer.valueOf(RangesKt.e(Math.round(((float) (i2 - placeable.C0())) / 2.0f), 0)));
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        int i2 = 0;
        float f2 = (float) 0;
        float m2 = Dp.m(RangesKt.d(((Dp) CompositionLocalConsumerModifierNodeKt.a(this, InteractiveComponentSizeKt.e())).t(), Dp.m(f2)));
        Placeable c0 = measurable.c0(j2);
        boolean z2 = F2() && !Float.isNaN(m2) && Dp.l(m2, Dp.m(f2)) > 0;
        if (!Float.isNaN(m2)) {
            i2 = measureScope.P1(m2);
        }
        int max = z2 ? Math.max(c0.L0(), i2) : c0.L0();
        int max2 = z2 ? Math.max(c0.C0(), i2) : c0.C0();
        if (z2) {
            c3(i2, c0);
        }
        Map map = this.N;
        if (map == null) {
            map = MapsKt.h();
        }
        return measureScope.y0(max, max2, map, new C0238s3(max, c0, max2));
    }
}
