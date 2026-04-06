package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class PointerInputChangeEventProducer {

    /* renamed from: a  reason: collision with root package name */
    public final LongSparseArray f16889a = new LongSparseArray(0, 1, (DefaultConstructorMarker) null);

    @Metadata
    public static final class PointerInputData {

        /* renamed from: a  reason: collision with root package name */
        public final long f16890a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16891b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16892c;

        public /* synthetic */ PointerInputData(long j2, long j3, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, z2);
        }

        public final boolean a() {
            return this.f16892c;
        }

        public final long b() {
            return this.f16891b;
        }

        public final long c() {
            return this.f16890a;
        }

        public PointerInputData(long j2, long j3, boolean z2) {
            this.f16890a = j2;
            this.f16891b = j3;
            this.f16892c = z2;
        }
    }

    public final void a() {
        this.f16889a.c();
    }

    public final InternalPointerEvent b(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        boolean z2;
        long j2;
        long j3;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.b().size());
        List b2 = pointerInputEvent.b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputEventData pointerInputEventData = (PointerInputEventData) b2.get(i2);
            PointerInputData pointerInputData = (PointerInputData) this.f16889a.g(pointerInputEventData.d());
            if (pointerInputData == null) {
                j3 = pointerInputEventData.k();
                j2 = pointerInputEventData.f();
                z2 = false;
                PositionCalculator positionCalculator2 = positionCalculator;
            } else {
                long c2 = pointerInputData.c();
                boolean a2 = pointerInputData.a();
                j3 = c2;
                z2 = a2;
                j2 = positionCalculator.w(pointerInputData.b());
            }
            longSparseArray.l(pointerInputEventData.d(), new PointerInputChange(pointerInputEventData.d(), pointerInputEventData.k(), pointerInputEventData.f(), pointerInputEventData.b(), pointerInputEventData.h(), j3, j2, z2, false, pointerInputEventData.j(), pointerInputEventData.c(), pointerInputEventData.i(), pointerInputEventData.e(), (DefaultConstructorMarker) null));
            if (pointerInputEventData.b()) {
                LongSparseArray longSparseArray2 = this.f16889a;
                long d2 = pointerInputEventData.d();
                PointerInputData pointerInputData2 = r11;
                PointerInputData pointerInputData3 = new PointerInputData(pointerInputEventData.k(), pointerInputEventData.g(), pointerInputEventData.b(), (DefaultConstructorMarker) null);
                longSparseArray2.l(d2, pointerInputData2);
            } else {
                this.f16889a.n(pointerInputEventData.d());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }
}
