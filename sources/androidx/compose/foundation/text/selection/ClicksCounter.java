package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;

@Metadata
final class ClicksCounter {

    /* renamed from: a  reason: collision with root package name */
    public final ViewConfiguration f6734a;

    /* renamed from: b  reason: collision with root package name */
    public int f6735b;

    /* renamed from: c  reason: collision with root package name */
    public PointerInputChange f6736c;

    public ClicksCounter(ViewConfiguration viewConfiguration) {
        this.f6734a = viewConfiguration;
    }

    public final int a() {
        return this.f6735b;
    }

    public final boolean b(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return SelectionGesturesKt.i(this.f6734a, pointerInputChange, pointerInputChange2);
    }

    public final boolean c(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return pointerInputChange2.o() - pointerInputChange.o() < this.f6734a.a();
    }

    public final void d(PointerEvent pointerEvent) {
        PointerInputChange pointerInputChange = this.f6736c;
        PointerInputChange pointerInputChange2 = (PointerInputChange) pointerEvent.c().get(0);
        if (pointerInputChange == null || !c(pointerInputChange, pointerInputChange2) || !b(pointerInputChange, pointerInputChange2)) {
            this.f6735b = 1;
        } else {
            this.f6735b++;
        }
        this.f6736c = pointerInputChange2;
    }
}
