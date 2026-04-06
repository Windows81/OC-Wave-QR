package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnchoredDraggableState$trySnapTo$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f7116A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f7117z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$trySnapTo$1(AnchoredDraggableState anchoredDraggableState, Object obj) {
        super(0);
        this.f7117z = anchoredDraggableState;
        this.f7116A = obj;
    }

    public final void invoke() {
        AnchoredDragScope c2 = this.f7117z.f7100o;
        AnchoredDraggableState anchoredDraggableState = this.f7117z;
        Object obj = this.f7116A;
        float c3 = anchoredDraggableState.o().c(obj);
        if (!Float.isNaN(c3)) {
            AnchoredDragScope.b(c2, c3, 0.0f, 2, (Object) null);
            anchoredDraggableState.D((Object) null);
        }
        anchoredDraggableState.C(obj);
    }
}
