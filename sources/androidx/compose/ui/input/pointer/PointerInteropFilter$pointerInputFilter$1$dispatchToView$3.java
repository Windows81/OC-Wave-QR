package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 extends Lambda implements Function1<MotionEvent, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter f16922A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 f16923z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.f16923z = pointerInteropFilter$pointerInputFilter$1;
        this.f16922A = pointerInteropFilter;
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f16923z.f16919b = ((Boolean) this.f16922A.b().invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
        } else {
            this.f16922A.b().invoke(motionEvent);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((MotionEvent) obj);
        return Unit.f40552a;
    }
}
