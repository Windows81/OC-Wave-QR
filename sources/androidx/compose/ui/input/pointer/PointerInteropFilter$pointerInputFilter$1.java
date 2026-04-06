package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {

    /* renamed from: b  reason: collision with root package name */
    public PointerInteropFilter.DispatchToViewState f16919b = PointerInteropFilter.DispatchToViewState.Unknown;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter f16920c;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f16920c = pointerInteropFilter;
    }

    public boolean c() {
        return true;
    }

    public void d() {
        if (this.f16919b == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerInteropUtils_androidKt.a(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.f16920c));
            i();
        }
    }

    public void e(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        boolean z2;
        List c2 = pointerEvent.c();
        int i2 = 0;
        if (!this.f16920c.a()) {
            int size = c2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z2 = false;
                    break;
                }
                PointerInputChange pointerInputChange = (PointerInputChange) c2.get(i3);
                if (PointerEventKt.b(pointerInputChange) || PointerEventKt.d(pointerInputChange)) {
                    break;
                }
                i3++;
            }
        }
        z2 = true;
        if (this.f16919b != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pointerEventPass == PointerEventPass.Initial && z2) {
                h(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.Final && !z2) {
                h(pointerEvent);
            }
        }
        if (pointerEventPass == PointerEventPass.Final) {
            int size2 = c2.size();
            while (i2 < size2) {
                if (PointerEventKt.d((PointerInputChange) c2.get(i2))) {
                    i2++;
                } else {
                    return;
                }
            }
            i();
        }
    }

    public final void h(PointerEvent pointerEvent) {
        List c2 = pointerEvent.c();
        Collection collection = c2;
        int size = collection.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((PointerInputChange) c2.get(i2)).p()) {
                if (this.f16919b == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    LayoutCoordinates b2 = b();
                    if (b2 != null) {
                        PointerInteropUtils_androidKt.b(pointerEvent, b2.o0(Offset.f15855b.c()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.f16920c));
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                }
                this.f16919b = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        LayoutCoordinates b3 = b();
        if (b3 != null) {
            PointerInteropUtils_androidKt.c(pointerEvent, b3.o0(Offset.f15855b.c()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.f16920c));
            if (this.f16919b == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = collection.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((PointerInputChange) c2.get(i3)).a();
                }
                InternalPointerEvent e2 = pointerEvent.e();
                if (e2 != null) {
                    e2.e(!this.f16920c.a());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set");
    }

    public final void i() {
        this.f16919b = PointerInteropFilter.DispatchToViewState.Unknown;
        this.f16920c.c(false);
    }
}
