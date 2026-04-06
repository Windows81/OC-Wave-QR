package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
final class BottomAppBarStateImpl implements BottomAppBarState {

    /* renamed from: a  reason: collision with root package name */
    public final MutableFloatState f9263a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableFloatState f9264b;

    /* renamed from: c  reason: collision with root package name */
    public MutableFloatState f9265c;

    public BottomAppBarStateImpl(float f2, float f3, float f4) {
        this.f9263a = PrimitiveSnapshotStateKt.a(f2);
        this.f9264b = PrimitiveSnapshotStateKt.a(f4);
        this.f9265c = PrimitiveSnapshotStateKt.a(f3);
    }

    public float a() {
        if (f() == 0.0f) {
            return 0.0f;
        }
        return b() / f();
    }

    public float b() {
        return this.f9265c.c();
    }

    public float c() {
        return this.f9264b.c();
    }

    public void d(float f2) {
        this.f9264b.j(f2);
    }

    public void e(float f2) {
        this.f9265c.j(RangesKt.n(f2, f(), 0.0f));
    }

    public float f() {
        return this.f9263a.c();
    }
}
