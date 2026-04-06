package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {330}, m = "invokeSuspend")
public final class ScrollableNode$drag$2$1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ ScrollingLogic G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(Function2 function2, ScrollingLogic scrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.F = function2;
        this.G = scrollingLogic;
    }

    /* renamed from: A */
    public final Object m(NestedScrollScope nestedScrollScope, Continuation continuation) {
        return ((ScrollableNode$drag$2$1) s(nestedScrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.F, this.G, continuation);
        scrollableNode$drag$2$1.E = obj;
        return scrollableNode$drag$2$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.E;
            Function2 function2 = this.F;
            final ScrollingLogic scrollingLogic = this.G;
            AnonymousClass1 r3 = new Function1<DragEvent.DragDelta, Unit>() {
                public final void b(DragEvent.DragDelta dragDelta) {
                    nestedScrollScope.a(scrollingLogic.C(dragDelta.a()), NestedScrollSource.f16795b.b());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((DragEvent.DragDelta) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (function2.m(r3, this) == f2) {
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
