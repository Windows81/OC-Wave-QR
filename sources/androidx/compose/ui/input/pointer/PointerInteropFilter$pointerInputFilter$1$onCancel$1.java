package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends Lambda implements Function1<MotionEvent, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter f16924z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.f16924z = pointerInteropFilter;
    }

    public final void b(MotionEvent motionEvent) {
        this.f16924z.b().invoke(motionEvent);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((MotionEvent) obj);
        return Unit.f40552a;
    }
}
