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
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
public final class ScrollExtensionsKt$scrollBy$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Ref.FloatRef F;
    public final /* synthetic */ float G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(Ref.FloatRef floatRef, float f2, Continuation continuation) {
        super(2, continuation);
        this.F = floatRef;
        this.G = f2;
    }

    /* renamed from: A */
    public final Object m(ScrollScope scrollScope, Continuation continuation) {
        return ((ScrollExtensionsKt$scrollBy$2) s(scrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.F, this.G, continuation);
        scrollExtensionsKt$scrollBy$2.E = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            this.F.f40905z = ((ScrollScope) this.E).g(this.G);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
