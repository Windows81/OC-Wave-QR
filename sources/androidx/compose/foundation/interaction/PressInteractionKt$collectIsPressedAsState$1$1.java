package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend")
final class PressInteractionKt$collectIsPressedAsState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ InteractionSource E;
    public final /* synthetic */ MutableState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1$1(InteractionSource interactionSource, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.E = interactionSource;
        this.F = mutableState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PressInteractionKt$collectIsPressedAsState$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PressInteractionKt$collectIsPressedAsState$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final ArrayList arrayList = new ArrayList();
            Flow c2 = this.E.c();
            final MutableState mutableState = this.F;
            AnonymousClass1 r3 = new FlowCollector() {
                /* renamed from: a */
                public final Object c(Interaction interaction, Continuation continuation) {
                    if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).a());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).a());
                    }
                    mutableState.setValue(Boxing.a(!arrayList.isEmpty()));
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (c2.a(r3, this) == f2) {
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
