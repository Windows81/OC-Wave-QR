package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
final class SliderDraggableState implements DraggableState {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f8334a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f8335b = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final DragScope f8336c = new SliderDraggableState$dragScope$1(this);

    /* renamed from: d  reason: collision with root package name */
    public final MutatorMutex f8337d = new MutatorMutex();

    public SliderDraggableState(Function1 function1) {
        this.f8334a = function1;
    }

    public Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new SliderDraggableState$drag$2(this, mutatePriority, function2, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public void b(float f2) {
        this.f8334a.invoke(Float.valueOf(f2));
    }

    public final Function1 g() {
        return this.f8334a;
    }

    public final boolean h() {
        return ((Boolean) this.f8335b.getValue()).booleanValue();
    }

    public final void i(boolean z2) {
        this.f8335b.setValue(Boolean.valueOf(z2));
    }
}
