package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.LayoutModifierNodeKt;
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
@DebugMetadata(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {227}, m = "invokeSuspend")
public final class ThumbNode$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ ThumbNode E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbNode$onAttach$1(ThumbNode thumbNode, Continuation continuation) {
        super(2, continuation);
        this.E = thumbNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ThumbNode$onAttach$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ThumbNode$onAttach$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            Flow c2 = this.E.g3().c();
            final ThumbNode thumbNode = this.E;
            AnonymousClass1 r3 = new FlowCollector() {
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
                    }
                    if (intRef.f40906z <= 0) {
                        z2 = false;
                    }
                    if (thumbNode.Q != z2) {
                        thumbNode.Q = z2;
                        LayoutModifierNodeKt.b(thumbNode);
                    }
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
