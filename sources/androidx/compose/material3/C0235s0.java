package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.s0  reason: case insensitive filesystem */
public final /* synthetic */ class C0235s0 implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClockDialNode f12686z;

    public /* synthetic */ C0235s0(ClockDialNode clockDialNode) {
        this.f12686z = clockDialNode;
    }

    public final Object m(Object obj, Object obj2) {
        return ClockDialNode$pointerInputDragNode$1.d(this.f12686z, (PointerInputChange) obj, (Offset) obj2);
    }
}
