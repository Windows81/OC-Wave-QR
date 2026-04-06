package androidx.compose.ui.input.pointer;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

@Metadata
public abstract class PointerInputFilter {

    /* renamed from: a  reason: collision with root package name */
    public LayoutCoordinates f16912a;

    public boolean a() {
        return false;
    }

    public final LayoutCoordinates b() {
        return this.f16912a;
    }

    public boolean c() {
        return false;
    }

    public abstract void d();

    public abstract void e(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2);

    public final void f(LayoutCoordinates layoutCoordinates) {
        this.f16912a = layoutCoordinates;
    }
}
