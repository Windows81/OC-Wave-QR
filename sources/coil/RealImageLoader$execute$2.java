package coil;

import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.target.ViewTarget;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

@Metadata
@DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {136}, m = "invokeSuspend")
public final class RealImageLoader$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ImageRequest F;
    public final /* synthetic */ RealImageLoader G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(ImageRequest imageRequest, RealImageLoader realImageLoader, Continuation continuation) {
        super(2, continuation);
        this.F = imageRequest;
        this.G = realImageLoader;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.F, this.G, continuation);
        realImageLoader$execute$2.E = obj;
        return realImageLoader$execute$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Deferred b2 = BuildersKt__Builders_commonKt.b((CoroutineScope) this.E, Dispatchers.c().H0(), (CoroutineStart) null, new RealImageLoader$execute$2$job$1(this.G, this.F, (Continuation) null), 2, (Object) null);
            if (this.F.M() instanceof ViewTarget) {
                Utils.m(((ViewTarget) this.F.M()).r()).b(b2);
            }
            this.D = 1;
            obj = b2.G(this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
