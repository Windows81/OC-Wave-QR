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
final class DefaultDraggableState implements DraggableState {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f3427a;

    /* renamed from: b  reason: collision with root package name */
    public final DragScope f3428b = new DefaultDraggableState$dragScope$1(this);

    /* renamed from: c  reason: collision with root package name */
    public final MutatorMutex f3429c = new MutatorMutex();

    public DefaultDraggableState(Function1 function1) {
        this.f3427a = function1;
    }

    public Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new DefaultDraggableState$drag$2(this, mutatePriority, function2, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public void b(float f2) {
        this.f3427a.invoke(Float.valueOf(f2));
    }

    public final Function1 f() {
        return this.f3427a;
    }
}
