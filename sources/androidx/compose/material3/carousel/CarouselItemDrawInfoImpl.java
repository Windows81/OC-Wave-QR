package androidx.compose.material3.carousel;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

@Metadata
public final class CarouselItemDrawInfoImpl implements CarouselItemDrawInfo {

    /* renamed from: a  reason: collision with root package name */
    public final MutableFloatState f11909a = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: b  reason: collision with root package name */
    public final MutableFloatState f11910b = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: c  reason: collision with root package name */
    public final MutableFloatState f11911c = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f11912d = SnapshotStateKt__SnapshotStateKt.e(Rect.f15860e.a(), (SnapshotMutationPolicy) null, 2, (Object) null);

    public Rect a() {
        return b();
    }

    public final Rect b() {
        return (Rect) this.f11912d.getValue();
    }

    public final void c(Rect rect) {
        this.f11912d.setValue(rect);
    }

    public final void d(float f2) {
        this.f11911c.j(f2);
    }

    public final void e(float f2) {
        this.f11910b.j(f2);
    }

    public final void f(float f2) {
        this.f11909a.j(f2);
    }
}
