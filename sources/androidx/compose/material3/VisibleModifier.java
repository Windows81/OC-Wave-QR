package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
final class VisibleModifier extends InspectorValueInfo implements LayoutModifier {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f11720A;

    public VisibleModifier(boolean z2, Function1 function1) {
        super(function1);
        this.f11720A = z2;
    }

    /* access modifiers changed from: private */
    public static final Unit c(Placeable.PlacementScope placementScope) {
        return Unit.f40552a;
    }

    public static final Unit d(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public boolean equals(Object obj) {
        VisibleModifier visibleModifier = obj instanceof VisibleModifier ? (VisibleModifier) obj : null;
        return visibleModifier != null && this.f11720A == visibleModifier.f11720A;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        if (!this.f11720A) {
            return MeasureScope.R1(measureScope, 0, 0, (Map) null, new l8(), 4, (Object) null);
        }
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new m8(c0), 4, (Object) null);
    }

    public int hashCode() {
        return Boolean.hashCode(this.f11720A);
    }
}
