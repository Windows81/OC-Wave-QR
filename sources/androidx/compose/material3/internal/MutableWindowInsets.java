package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableWindowInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f12305b;

    public MutableWindowInsets(WindowInsets windowInsets) {
        this.f12305b = SnapshotStateKt__SnapshotStateKt.e(windowInsets, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public int a(Density density) {
        return e().a(density);
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return e().b(density, layoutDirection);
    }

    public int c(Density density) {
        return e().c(density);
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return e().d(density, layoutDirection);
    }

    public final WindowInsets e() {
        return (WindowInsets) this.f12305b.getValue();
    }

    public final void f(WindowInsets windowInsets) {
        this.f12305b.setValue(windowInsets);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? WindowInsetsKt.a(0, 0, 0, 0) : windowInsets);
    }
}
