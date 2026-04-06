package coil;

import android.graphics.Bitmap;
import coil.intercept.RealInterceptorChain;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.size.Size;
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
@DebugMetadata(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {187}, m = "invokeSuspend")
public final class RealImageLoader$executeMain$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
    public int D;
    public final /* synthetic */ ImageRequest E;
    public final /* synthetic */ RealImageLoader F;
    public final /* synthetic */ Size G;
    public final /* synthetic */ EventListener H;
    public final /* synthetic */ Bitmap I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$result$1(ImageRequest imageRequest, RealImageLoader realImageLoader, Size size, EventListener eventListener, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.E = imageRequest;
        this.F = realImageLoader;
        this.G = size;
        this.H = eventListener;
        this.I = bitmap;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$executeMain$result$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new RealImageLoader$executeMain$result$1(this.E, this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.E, this.F.f23268n, 0, this.E, this.G, this.H, this.I != null);
            ImageRequest imageRequest = this.E;
            this.D = 1;
            obj = realInterceptorChain.h(imageRequest, this);
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
