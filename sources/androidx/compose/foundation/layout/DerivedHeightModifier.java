package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {

    /* renamed from: A  reason: collision with root package name */
    public final WindowInsets f3877A;

    /* renamed from: B  reason: collision with root package name */
    public final Function2 f3878B;
    public final MutableState C;

    public void H0(ModifierLocalReadScope modifierLocalReadScope) {
        b(WindowInsetsKt.i(this.f3877A, (WindowInsets) modifierLocalReadScope.b(WindowInsetsPaddingKt.c())));
    }

    public final WindowInsets a() {
        return (WindowInsets) this.C.getValue();
    }

    public final void b(WindowInsets windowInsets) {
        this.C.setValue(windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        return Intrinsics.d(this.f3877A, derivedHeightModifier.f3877A) && this.f3878B == derivedHeightModifier.f3878B;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        int intValue = ((Number) this.f3878B.m(a(), measureScope)).intValue();
        if (intValue == 0) {
            return MeasureScope.R1(measureScope, 0, 0, (Map) null, DerivedHeightModifier$measure$1.f3879z, 4, (Object) null);
        }
        Placeable c0 = measurable.c0(Constraints.d(j2, 0, 0, intValue, intValue, 3, (Object) null));
        return MeasureScope.R1(measureScope, c0.L0(), intValue, (Map) null, new DerivedHeightModifier$measure$2(c0), 4, (Object) null);
    }

    public int hashCode() {
        return (this.f3877A.hashCode() * 31) + this.f3878B.hashCode();
    }
}
