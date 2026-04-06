package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnchoredDraggableState$targetValue$2 extends Lambda implements Function0<T> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3390z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$targetValue$2(AnchoredDraggableState anchoredDraggableState) {
        super(0);
        this.f3390z = anchoredDraggableState;
    }

    public final Object invoke() {
        Object b2 = this.f3390z.p();
        if (b2 != null) {
            return b2;
        }
        AnchoredDraggableState anchoredDraggableState = this.f3390z;
        if (Float.isNaN(anchoredDraggableState.r())) {
            return anchoredDraggableState.n();
        }
        Object b3 = anchoredDraggableState.l().b(anchoredDraggableState.r());
        return b3 == null ? anchoredDraggableState.n() : b3;
    }
}
