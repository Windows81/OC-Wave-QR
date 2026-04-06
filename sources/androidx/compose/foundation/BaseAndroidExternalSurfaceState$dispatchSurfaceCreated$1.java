package androidx.compose.foundation;

import android.view.Surface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", l = {130, 136}, m = "invokeSuspend")
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ BaseAndroidExternalSurfaceState F;
    public final /* synthetic */ Surface G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, Surface surface, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.F = baseAndroidExternalSurfaceState;
        this.G = surface;
        this.H = i2;
        this.I = i3;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.F, this.G, this.H, this.I, continuation);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.E = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.CoroutineScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.D
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.b(r10)
            goto L_0x0067
        L_0x0012:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001a:
            java.lang.Object r1 = r9.E
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r10)
            goto L_0x003d
        L_0x0022:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.E
            r1 = r10
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = r9.F
            kotlinx.coroutines.Job r10 = r10.D
            if (r10 == 0) goto L_0x003d
            r9.E = r1
            r9.D = r3
            java.lang.Object r10 = kotlinx.coroutines.JobKt.g(r10, r9)
            if (r10 != r0) goto L_0x003d
            return r0
        L_0x003d:
            androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 r4 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1
            androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = r9.F
            r4.<init>(r10, r1)
            androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = r9.F
            kotlin.jvm.functions.Function5 r3 = r10.f2927A
            if (r3 == 0) goto L_0x0067
            android.view.Surface r5 = r9.G
            int r10 = r9.H
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.c(r10)
            int r10 = r9.I
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.c(r10)
            r10 = 0
            r9.E = r10
            r9.D = r2
            r8 = r9
            java.lang.Object r10 = r3.n(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L_0x0067
            return r0
        L_0x0067:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.x(java.lang.Object):java.lang.Object");
    }
}
