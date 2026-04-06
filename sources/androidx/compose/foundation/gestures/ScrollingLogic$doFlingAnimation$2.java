package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {814}, m = "invokeSuspend")
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public long F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ScrollingLogic I;
    public final /* synthetic */ Ref.LongRef J;
    public final /* synthetic */ long K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j2, Continuation continuation) {
        super(2, continuation);
        this.I = scrollingLogic;
        this.J = longRef;
        this.K = j2;
    }

    /* renamed from: A */
    public final Object m(NestedScrollScope nestedScrollScope, Continuation continuation) {
        return ((ScrollingLogic$doFlingAnimation$2) s(nestedScrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.I, this.J, this.K, continuation);
        scrollingLogic$doFlingAnimation$2.H = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object x(Object obj) {
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        Ref.LongRef longRef;
        long j2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.G;
        if (i2 == 0) {
            ResultKt.b(obj);
            ScrollingLogic$doFlingAnimation$2$reverseScope$1 scrollingLogic$doFlingAnimation$2$reverseScope$1 = new ScrollingLogic$doFlingAnimation$2$reverseScope$1(this.I, (NestedScrollScope) this.H);
            scrollingLogic2 = this.I;
            Ref.LongRef longRef2 = this.J;
            long j3 = this.K;
            FlingBehavior a2 = scrollingLogic2.f3582c;
            long j4 = longRef2.f40907z;
            float x2 = scrollingLogic2.x(scrollingLogic2.E(j3));
            this.H = scrollingLogic2;
            this.D = scrollingLogic2;
            this.E = longRef2;
            this.F = j4;
            this.G = 1;
            Object a3 = a2.a(scrollingLogic$doFlingAnimation$2$reverseScope$1, x2, this);
            if (a3 == f2) {
                return f2;
            }
            longRef = longRef2;
            obj = a3;
            scrollingLogic = scrollingLogic2;
            j2 = j4;
        } else if (i2 == 1) {
            j2 = this.F;
            longRef = (Ref.LongRef) this.E;
            scrollingLogic2 = (ScrollingLogic) this.D;
            scrollingLogic = (ScrollingLogic) this.H;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        longRef.f40907z = scrollingLogic2.J(j2, scrollingLogic.x(((Number) obj).floatValue()));
        return Unit.f40552a;
    }
}
