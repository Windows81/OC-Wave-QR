package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", l = {130}, m = "invokeSuspend")
public final class SwitchKt$Switch$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AnchoredDraggableState E;
    public final /* synthetic */ State F;
    public final /* synthetic */ State G;
    public final /* synthetic */ MutableState H;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SwitchKt$Switch$1$1$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ boolean E;

        public final Object A(boolean z2, Continuation continuation) {
            return ((AnonymousClass2) s(Boolean.valueOf(z2), continuation)).x(Unit.f40552a);
        }

        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return A(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(state, state2, mutableState, continuation);
            r0.E = ((Boolean) obj).booleanValue();
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                boolean z2 = this.E;
                if (SwitchKt.e(state) != z2) {
                    Function1 l2 = SwitchKt.d(state2);
                    if (l2 != null) {
                        l2.invoke(Boxing.a(z2));
                    }
                    MutableState mutableState = mutableState;
                    SwitchKt.c(mutableState, !SwitchKt.b(mutableState));
                }
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$1$1(AnchoredDraggableState anchoredDraggableState, State state, State state2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.E = anchoredDraggableState;
        this.F = state;
        this.G = state2;
        this.H = mutableState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SwitchKt$Switch$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SwitchKt$Switch$1$1(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final AnchoredDraggableState anchoredDraggableState = this.E;
            Flow q2 = SnapshotStateKt.q(new Function0<Boolean>() {
                /* renamed from: b */
                public final Boolean invoke() {
                    return (Boolean) anchoredDraggableState.s();
                }
            });
            final State state = this.F;
            final State state2 = this.G;
            final MutableState mutableState = this.H;
            AnonymousClass2 r1 = new AnonymousClass2((Continuation) null);
            this.D = 1;
            if (FlowKt.l(q2, r1, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
