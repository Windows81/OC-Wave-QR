package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class InternalPointerEvent {

    /* renamed from: a  reason: collision with root package name */
    public final LongSparseArray f16823a;

    /* renamed from: b  reason: collision with root package name */
    public final PointerInputEvent f16824b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16825c;

    public InternalPointerEvent(LongSparseArray longSparseArray, PointerInputEvent pointerInputEvent) {
        this.f16823a = longSparseArray;
        this.f16824b = pointerInputEvent;
    }

    public final boolean a(long j2) {
        Object obj;
        List b2 = this.f16824b.b();
        int size = b2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = b2.get(i2);
            if (PointerId.c(((PointerInputEventData) obj).d(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (pointerInputEventData != null) {
            return pointerInputEventData.a();
        }
        return false;
    }

    public final LongSparseArray b() {
        return this.f16823a;
    }

    public final MotionEvent c() {
        return this.f16824b.a();
    }

    public final boolean d() {
        return this.f16825c;
    }

    public final void e(boolean z2) {
        this.f16825c = z2;
    }
}
