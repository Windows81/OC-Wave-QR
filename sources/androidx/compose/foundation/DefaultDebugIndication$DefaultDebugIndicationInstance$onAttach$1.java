package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend")
public final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, Continuation continuation) {
        super(2, continuation);
        this.E = defaultDebugIndicationInstance;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            final Ref.IntRef intRef2 = new Ref.IntRef();
            final Ref.IntRef intRef3 = new Ref.IntRef();
            Flow c2 = this.E.N.c();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.E;
            AnonymousClass1 r5 = new FlowCollector() {
                /* renamed from: a */
                public final Object c(Interaction interaction, Continuation continuation) {
                    boolean z2 = true;
                    if (interaction instanceof PressInteraction.Press) {
                        intRef.f40906z++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        Ref.IntRef intRef = intRef;
                        intRef.f40906z--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        Ref.IntRef intRef2 = intRef;
                        intRef2.f40906z--;
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        intRef2.f40906z++;
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        Ref.IntRef intRef3 = intRef2;
                        intRef3.f40906z--;
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        intRef3.f40906z++;
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        Ref.IntRef intRef4 = intRef3;
                        intRef4.f40906z--;
                    }
                    boolean z3 = false;
                    boolean z4 = intRef.f40906z > 0;
                    boolean z5 = intRef2.f40906z > 0;
                    boolean z6 = intRef3.f40906z > 0;
                    if (defaultDebugIndicationInstance.O != z4) {
                        defaultDebugIndicationInstance.O = z4;
                        z3 = true;
                    }
                    if (defaultDebugIndicationInstance.P != z5) {
                        defaultDebugIndicationInstance.P = z5;
                        z3 = true;
                    }
                    if (defaultDebugIndicationInstance.Q != z6) {
                        defaultDebugIndicationInstance.Q = z6;
                    } else {
                        z2 = z3;
                    }
                    if (z2) {
                        DrawModifierNodeKt.a(defaultDebugIndicationInstance);
                    }
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (c2.a(r5, this) == f2) {
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
