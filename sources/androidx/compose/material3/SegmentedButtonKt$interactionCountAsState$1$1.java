package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1", f = "SegmentedButton.kt", l = {463}, m = "invokeSuspend")
final class SegmentedButtonKt$interactionCountAsState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ InteractionSource E;
    public final /* synthetic */ MutableIntState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$interactionCountAsState$1$1(InteractionSource interactionSource, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.E = interactionSource;
        this.F = mutableIntState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SegmentedButtonKt$interactionCountAsState$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SegmentedButtonKt$interactionCountAsState$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Flow c2 = this.E.c();
            final MutableIntState mutableIntState = this.F;
            AnonymousClass1 r1 = new FlowCollector() {
                /* renamed from: a */
                public final Object c(Interaction interaction, Continuation continuation) {
                    if ((interaction instanceof PressInteraction.Press) || (interaction instanceof FocusInteraction.Focus)) {
                        MutableIntState mutableIntState = mutableIntState;
                        mutableIntState.k(mutableIntState.e() + 1);
                    } else if ((interaction instanceof PressInteraction.Release) || (interaction instanceof FocusInteraction.Unfocus) || (interaction instanceof PressInteraction.Cancel)) {
                        MutableIntState mutableIntState2 = mutableIntState;
                        mutableIntState2.k(mutableIntState2.e() - 1);
                    }
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (c2.a(r1, this) == f2) {
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
