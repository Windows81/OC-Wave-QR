package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnchoredDraggableState$closestValue$2 extends Lambda implements Function0<T> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f7110z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$closestValue$2(AnchoredDraggableState anchoredDraggableState) {
        super(0);
        this.f7110z = anchoredDraggableState;
    }

    public final Object invoke() {
        Object d2 = this.f7110z.t();
        if (d2 != null) {
            return d2;
        }
        AnchoredDraggableState anchoredDraggableState = this.f7110z;
        float w2 = anchoredDraggableState.w();
        return !Float.isNaN(w2) ? anchoredDraggableState.m(w2, anchoredDraggableState.s()) : anchoredDraggableState.s();
    }
}
