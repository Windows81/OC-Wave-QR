package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
final class DefaultDraggable2DState implements Draggable2DState {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f3420a;

    /* renamed from: b  reason: collision with root package name */
    public final Drag2DScope f3421b;

    /* renamed from: c  reason: collision with root package name */
    public final MutatorMutex f3422c;

    public Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new DefaultDraggable2DState$drag$2(this, mutatePriority, function2, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final Function1 d() {
        return this.f3420a;
    }
}
