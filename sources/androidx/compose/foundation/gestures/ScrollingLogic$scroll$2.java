package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {834}, m = "invokeSuspend")
public final class ScrollingLogic$scroll$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ScrollingLogic F;
    public final /* synthetic */ Function2 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$scroll$2(ScrollingLogic scrollingLogic, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = scrollingLogic;
        this.G = function2;
    }

    /* renamed from: A */
    public final Object m(ScrollScope scrollScope, Continuation continuation) {
        return ((ScrollingLogic$scroll$2) s(scrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ScrollingLogic$scroll$2 scrollingLogic$scroll$2 = new ScrollingLogic$scroll$2(this.F, this.G, continuation);
        scrollingLogic$scroll$2.E = obj;
        return scrollingLogic$scroll$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.F.f3589j = (ScrollScope) this.E;
            Function2 function2 = this.G;
            ScrollingLogic$nestedScrollScope$1 d2 = this.F.f3590k;
            this.D = 1;
            if (function2.m(d2, this) == f2) {
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
