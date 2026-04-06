package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DraggableKt$rememberDraggableState$1$1 extends Lambda implements Function1<Float, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f3518z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$rememberDraggableState$1$1(State state) {
        super(1);
        this.f3518z = state;
    }

    public final void b(float f2) {
        ((Function1) this.f3518z.getValue()).invoke(Float.valueOf(f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).floatValue());
        return Unit.f40552a;
    }
}
