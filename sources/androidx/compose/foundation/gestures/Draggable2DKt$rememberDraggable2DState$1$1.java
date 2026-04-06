package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class Draggable2DKt$rememberDraggable2DState$1$1 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f3507z;

    public final void b(long j2) {
        ((Function1) this.f3507z.getValue()).invoke(Offset.d(j2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
