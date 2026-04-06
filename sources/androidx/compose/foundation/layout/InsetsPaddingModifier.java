package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InsetsPaddingModifier implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {

    /* renamed from: A  reason: collision with root package name */
    public final MutableState f4047A;

    /* renamed from: B  reason: collision with root package name */
    public final MutableState f4048B;

    /* renamed from: z  reason: collision with root package name */
    public final WindowInsets f4049z;

    public InsetsPaddingModifier(WindowInsets windowInsets) {
        this.f4049z = windowInsets;
        this.f4047A = SnapshotStateKt__SnapshotStateKt.e(windowInsets, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4048B = SnapshotStateKt__SnapshotStateKt.e(windowInsets, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private final WindowInsets b() {
        return (WindowInsets) this.f4047A.getValue();
    }

    private final void e(WindowInsets windowInsets) {
        this.f4047A.setValue(windowInsets);
    }

    public void H0(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.b(WindowInsetsPaddingKt.c());
        e(WindowInsetsKt.i(this.f4049z, windowInsets));
        d(WindowInsetsKt.k(windowInsets, this.f4049z));
    }

    public final WindowInsets a() {
        return (WindowInsets) this.f4048B.getValue();
    }

    /* renamed from: c */
    public WindowInsets getValue() {
        return a();
    }

    public final void d(WindowInsets windowInsets) {
        this.f4048B.setValue(windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingModifier)) {
            return false;
        }
        return Intrinsics.d(((InsetsPaddingModifier) obj).f4049z, this.f4049z);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        int d2 = b().d(measureScope, measureScope.getLayoutDirection());
        int a2 = b().a(measureScope);
        int b2 = b().b(measureScope, measureScope.getLayoutDirection()) + d2;
        int c2 = b().c(measureScope) + a2;
        Placeable c0 = measurable.c0(ConstraintsKt.i(j2, -b2, -c2));
        return MeasureScope.R1(measureScope, ConstraintsKt.g(j2, c0.L0() + b2), ConstraintsKt.f(j2, c0.C0() + c2), (Map) null, new InsetsPaddingModifier$measure$1(c0, d2, a2), 4, (Object) null);
    }

    public ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.c();
    }

    public int hashCode() {
        return this.f4049z.hashCode();
    }
}
