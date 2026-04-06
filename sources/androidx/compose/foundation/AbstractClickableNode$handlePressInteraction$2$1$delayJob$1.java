package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1257, 1260}, m = "invokeSuspend")
public final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ AbstractClickableNode F;
    public final /* synthetic */ long G;
    public final /* synthetic */ MutableInteractionSource H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode abstractClickableNode, long j2, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
        super(2, continuation);
        this.F = abstractClickableNode;
        this.G = j2;
        this.H = mutableInteractionSource;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        PressInteraction.Press press;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.F.o3()) {
                long a2 = Clickable_androidKt.a();
                this.E = 1;
                if (DelayKt.b(a2, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            press = (PressInteraction.Press) this.D;
            ResultKt.b(obj);
            this.F.Z = press;
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.G, (DefaultConstructorMarker) null);
        MutableInteractionSource mutableInteractionSource = this.H;
        this.D = press2;
        this.E = 2;
        if (mutableInteractionSource.a(press2, this) == f2) {
            return f2;
        }
        press = press2;
        this.F.Z = press;
        return Unit.f40552a;
    }
}
