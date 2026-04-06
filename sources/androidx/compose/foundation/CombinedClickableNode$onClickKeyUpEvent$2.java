package androidx.compose.foundation;

import androidx.compose.foundation.CombinedClickableNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {908, 912}, m = "invokeSuspend")
public final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public long D;
    public long E;
    public int F;
    public final /* synthetic */ CombinedClickableNode G;
    public final /* synthetic */ long H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j2, Continuation continuation) {
        super(2, continuation);
        this.G = combinedClickableNode;
        this.H = j2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        long j2;
        long j3;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.F;
        if (i2 == 0) {
            ResultKt.b(obj);
            ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.a(this.G, CompositionLocalsKt.t());
            j2 = viewConfiguration.b();
            j3 = viewConfiguration.a();
            this.D = j2;
            this.E = j3;
            this.F = 1;
            if (DelayKt.b(j2, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            j3 = this.E;
            j2 = this.D;
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            this.G.t3().invoke();
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CombinedClickableNode.DoubleKeyClickState doubleKeyClickState = (CombinedClickableNode.DoubleKeyClickState) this.G.n0.b(this.H);
        if (doubleKeyClickState != null) {
            doubleKeyClickState.c(true);
        }
        this.F = 2;
        if (DelayKt.b(j3 - j2, this) == f2) {
            return f2;
        }
        this.G.t3().invoke();
        return Unit.f40552a;
    }
}
