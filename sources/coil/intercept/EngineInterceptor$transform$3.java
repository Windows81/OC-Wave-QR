package coil.intercept;

import coil.EventListener;
import coil.intercept.EngineInterceptor;
import coil.request.ImageRequest;
import coil.request.Options;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {246}, m = "invokeSuspend")
public final class EngineInterceptor$transform$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.ExecuteResult>, Object> {
    public Object D;
    public Object E;
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ EngineInterceptor J;
    public final /* synthetic */ EngineInterceptor.ExecuteResult K;
    public final /* synthetic */ Options L;
    public final /* synthetic */ List M;
    public final /* synthetic */ EventListener N;
    public final /* synthetic */ ImageRequest O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$transform$3(EngineInterceptor engineInterceptor, EngineInterceptor.ExecuteResult executeResult, Options options, List list, EventListener eventListener, ImageRequest imageRequest, Continuation continuation) {
        super(2, continuation);
        this.J = engineInterceptor;
        this.K = executeResult;
        this.L = options;
        this.M = list;
        this.N = eventListener;
        this.O = imageRequest;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$transform$3) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.J, this.K, this.L, this.M, this.N, this.O, continuation);
        engineInterceptor$transform$3.I = obj;
        return engineInterceptor$transform$3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r10.H
            r2 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            int r1 = r10.G
            int r3 = r10.F
            java.lang.Object r4 = r10.E
            coil.request.Options r4 = (coil.request.Options) r4
            java.lang.Object r5 = r10.D
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r10.I
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlin.ResultKt.b(r11)
            goto L_0x0073
        L_0x001f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0027:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.I
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            coil.intercept.EngineInterceptor r1 = r10.J
            coil.intercept.EngineInterceptor$ExecuteResult r3 = r10.K
            android.graphics.drawable.Drawable r3 = r3.e()
            coil.request.Options r4 = r10.L
            java.util.List r5 = r10.M
            android.graphics.Bitmap r1 = r1.h(r3, r4, r5)
            coil.EventListener r3 = r10.N
            coil.request.ImageRequest r4 = r10.O
            r3.p(r4, r1)
            java.util.List r3 = r10.M
            coil.request.Options r4 = r10.L
            int r5 = r3.size()
            r6 = 0
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r5
            r5 = r3
            r3 = r9
        L_0x0054:
            if (r3 >= r1) goto L_0x007a
            java.lang.Object r7 = r5.get(r3)
            coil.transform.Transformation r7 = (coil.transform.Transformation) r7
            coil.size.Size r8 = r4.n()
            r10.I = r6
            r10.D = r5
            r10.E = r4
            r10.F = r3
            r10.G = r1
            r10.H = r2
            java.lang.Object r11 = r7.b(r11, r8, r10)
            if (r11 != r0) goto L_0x0073
            return r0
        L_0x0073:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            kotlinx.coroutines.CoroutineScopeKt.g(r6)
            int r3 = r3 + r2
            goto L_0x0054
        L_0x007a:
            coil.EventListener r0 = r10.N
            coil.request.ImageRequest r1 = r10.O
            r0.g(r1, r11)
            coil.intercept.EngineInterceptor$ExecuteResult r2 = r10.K
            coil.request.ImageRequest r0 = r10.O
            android.content.Context r0 = r0.l()
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            r3.<init>(r0, r11)
            r7 = 14
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            coil.intercept.EngineInterceptor$ExecuteResult r11 = coil.intercept.EngineInterceptor.ExecuteResult.b(r2, r3, r4, r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor$transform$3.x(java.lang.Object):java.lang.Object");
    }
}
