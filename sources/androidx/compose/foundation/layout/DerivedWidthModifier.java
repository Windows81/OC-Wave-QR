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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DerivedWidthModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {

    /* renamed from: A  reason: collision with root package name */
    public final WindowInsets f3881A;

    /* renamed from: B  reason: collision with root package name */
    public final Function3 f3882B;
    public final MutableState C;

    private final WindowInsets a() {
        return (WindowInsets) this.C.getValue();
    }

    private final void b(WindowInsets windowInsets) {
        this.C.setValue(windowInsets);
    }

    public void H0(ModifierLocalReadScope modifierLocalReadScope) {
        b(WindowInsetsKt.i(this.f3881A, (WindowInsets) modifierLocalReadScope.b(WindowInsetsPaddingKt.c())));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedWidthModifier)) {
            return false;
        }
        DerivedWidthModifier derivedWidthModifier = (DerivedWidthModifier) obj;
        return Intrinsics.d(this.f3881A, derivedWidthModifier.f3881A) && this.f3882B == derivedWidthModifier.f3882B;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        int intValue = ((Number) this.f3882B.d(a(), measureScope.getLayoutDirection(), measureScope)).intValue();
        if (intValue == 0) {
            return MeasureScope.R1(measureScope, 0, 0, (Map) null, DerivedWidthModifier$measure$1.f3883z, 4, (Object) null);
        }
        Placeable c0 = measurable.c0(Constraints.d(j2, intValue, intValue, 0, 0, 12, (Object) null));
        return MeasureScope.R1(measureScope, intValue, c0.C0(), (Map) null, new DerivedWidthModifier$measure$2(c0), 4, (Object) null);
    }

    public int hashCode() {
        return (this.f3881A.hashCode() * 31) + this.f3882B.hashCode();
    }
}
