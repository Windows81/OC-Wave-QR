package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements PaddingValues {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f8288a = SnapshotStateKt__SnapshotStateKt.e(PaddingKt.a(Dp.m((float) 0)), (SnapshotMutationPolicy) null, 2, (Object) null);

    public float a() {
        return e().a();
    }

    public float b(LayoutDirection layoutDirection) {
        return e().b(layoutDirection);
    }

    public float c(LayoutDirection layoutDirection) {
        return e().c(layoutDirection);
    }

    public float d() {
        return e().d();
    }

    public final PaddingValues e() {
        return (PaddingValues) this.f8288a.getValue();
    }

    public final void f(PaddingValues paddingValues) {
        this.f8288a.setValue(paddingValues);
    }
}
