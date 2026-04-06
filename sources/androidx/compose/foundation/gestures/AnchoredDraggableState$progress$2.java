package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnchoredDraggableState$progress$2 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3389z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$progress$2(AnchoredDraggableState anchoredDraggableState) {
        super(0);
        this.f3389z = anchoredDraggableState;
    }

    /* renamed from: b */
    public final Float invoke() {
        float c2 = this.f3389z.l().c(this.f3389z.t());
        float c3 = this.f3389z.l().c(this.f3389z.v()) - c2;
        float abs = Math.abs(c3);
        float f2 = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float A2 = (this.f3389z.A() - c2) / c3;
            if (A2 < 1.0E-6f) {
                f2 = 0.0f;
            } else if (A2 <= 0.999999f) {
                f2 = A2;
            }
        }
        return Float.valueOf(f2);
    }
}
