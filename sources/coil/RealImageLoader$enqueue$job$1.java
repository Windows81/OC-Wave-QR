package coil;

import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.util.Logger;
import coil.util.Logs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {113}, m = "invokeSuspend")
public final class RealImageLoader$enqueue$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
    public int D;
    public final /* synthetic */ RealImageLoader E;
    public final /* synthetic */ ImageRequest F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealImageLoader$enqueue$job$1(RealImageLoader realImageLoader, ImageRequest imageRequest, Continuation continuation) {
        super(2, continuation);
        this.E = realImageLoader;
        this.F = imageRequest;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$enqueue$job$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new RealImageLoader$enqueue$job$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Logger i2;
        Object f2 = IntrinsicsKt.f();
        int i3 = this.D;
        if (i3 == 0) {
            ResultKt.b(obj);
            RealImageLoader realImageLoader = this.E;
            ImageRequest imageRequest = this.F;
            this.D = 1;
            obj = realImageLoader.g(imageRequest, 0, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i3 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        RealImageLoader realImageLoader2 = this.E;
        ImageResult imageResult = (ImageResult) obj;
        if ((imageResult instanceof ErrorResult) && (i2 = realImageLoader2.i()) != null) {
            Logs.a(i2, "RealImageLoader", ((ErrorResult) imageResult).c());
        }
        return obj;
    }
}
