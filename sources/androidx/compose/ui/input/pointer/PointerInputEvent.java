package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class PointerInputEvent {

    /* renamed from: a  reason: collision with root package name */
    public final long f16893a;

    /* renamed from: b  reason: collision with root package name */
    public final List f16894b;

    /* renamed from: c  reason: collision with root package name */
    public final MotionEvent f16895c;

    public PointerInputEvent(long j2, List list, MotionEvent motionEvent) {
        this.f16893a = j2;
        this.f16894b = list;
        this.f16895c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f16895c;
    }

    public final List b() {
        return this.f16894b;
    }
}
