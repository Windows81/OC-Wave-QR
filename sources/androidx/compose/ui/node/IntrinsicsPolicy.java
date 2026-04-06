package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;

@Metadata
public final class IntrinsicsPolicy {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f17265a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f17266b;

    public IntrinsicsPolicy(LayoutNode layoutNode, MeasurePolicy measurePolicy) {
        this.f17265a = layoutNode;
        this.f17266b = SnapshotStateKt__SnapshotStateKt.e(measurePolicy, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final MeasurePolicy a() {
        return (MeasurePolicy) this.f17266b.getValue();
    }

    public final int b(int i2) {
        return a().i(this.f17265a.y0(), this.f17265a.L(), i2);
    }

    public final int c(int i2) {
        return a().c(this.f17265a.y0(), this.f17265a.L(), i2);
    }

    public final int d(int i2) {
        return a().i(this.f17265a.y0(), this.f17265a.K(), i2);
    }

    public final int e(int i2) {
        return a().c(this.f17265a.y0(), this.f17265a.K(), i2);
    }

    public final int f(int i2) {
        return a().f(this.f17265a.y0(), this.f17265a.L(), i2);
    }

    public final int g(int i2) {
        return a().h(this.f17265a.y0(), this.f17265a.L(), i2);
    }

    public final int h(int i2) {
        return a().f(this.f17265a.y0(), this.f17265a.K(), i2);
    }

    public final int i(int i2) {
        return a().h(this.f17265a.y0(), this.f17265a.K(), i2);
    }

    public final void j(MeasurePolicy measurePolicy) {
        this.f17266b.setValue(measurePolicy);
    }

    public final void k(MeasurePolicy measurePolicy) {
        j(measurePolicy);
    }
}
