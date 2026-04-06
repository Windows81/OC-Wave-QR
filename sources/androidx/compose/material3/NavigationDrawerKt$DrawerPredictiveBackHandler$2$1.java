package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.kt", l = {957, 983, 983, 983}, m = "invokeSuspend")
final class NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements Function2<Flow<? extends BackEventCompat>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ DrawerPredictiveBackState F;
    public final /* synthetic */ CoroutineScope G;
    public final /* synthetic */ DrawerState H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ Ref.FloatRef J;
    public final /* synthetic */ Ref.FloatRef K;
    public final /* synthetic */ Ref.FloatRef L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, CoroutineScope coroutineScope, DrawerState drawerState, boolean z2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.FloatRef floatRef3, Continuation continuation) {
        super(2, continuation);
        this.F = drawerPredictiveBackState;
        this.G = coroutineScope;
        this.H = drawerState;
        this.I = z2;
        this.J = floatRef;
        this.K = floatRef2;
        this.L = floatRef3;
    }

    /* renamed from: A */
    public final Object m(Flow flow, Continuation continuation) {
        return ((NavigationDrawerKt$DrawerPredictiveBackHandler$2$1) s(flow, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(this.F, this.G, this.H, this.I, this.J, this.K, this.L, continuation);
        navigationDrawerKt$DrawerPredictiveBackHandler$2$1.E = obj;
        return navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0073 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r13.D
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0030
            if (r1 == r5) goto L_0x002a
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x0026
            if (r1 == r2) goto L_0x001d
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001d:
            java.lang.Object r0 = r13.E
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.ResultKt.b(r14)
            goto L_0x00c4
        L_0x0026:
            kotlin.ResultKt.b(r14)
            goto L_0x009b
        L_0x002a:
            kotlin.ResultKt.b(r14)     // Catch:{ CancellationException -> 0x0073 }
            goto L_0x0050
        L_0x002e:
            r14 = move-exception
            goto L_0x009e
        L_0x0030:
            kotlin.ResultKt.b(r14)
            java.lang.Object r14 = r13.E
            kotlinx.coroutines.flow.Flow r14 = (kotlinx.coroutines.flow.Flow) r14
            androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$1 r1 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$1     // Catch:{ CancellationException -> 0x0073 }
            androidx.compose.material3.DrawerPredictiveBackState r8 = r13.F     // Catch:{ CancellationException -> 0x0073 }
            boolean r9 = r13.I     // Catch:{ CancellationException -> 0x0073 }
            kotlin.jvm.internal.Ref$FloatRef r10 = r13.J     // Catch:{ CancellationException -> 0x0073 }
            kotlin.jvm.internal.Ref$FloatRef r11 = r13.K     // Catch:{ CancellationException -> 0x0073 }
            kotlin.jvm.internal.Ref$FloatRef r12 = r13.L     // Catch:{ CancellationException -> 0x0073 }
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x0073 }
            r13.D = r5     // Catch:{ CancellationException -> 0x0073 }
            java.lang.Object r14 = r14.a(r1, r13)     // Catch:{ CancellationException -> 0x0073 }
            if (r14 != r0) goto L_0x0050
            return r0
        L_0x0050:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.F
            boolean r14 = r14.d()
            if (r14 == 0) goto L_0x0068
            kotlinx.coroutines.CoroutineScope r7 = r13.G
            androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.F
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r7, r8, r9, r10, r11, r12)
        L_0x0068:
            androidx.compose.material3.DrawerState r14 = r13.H
            r13.D = r4
            java.lang.Object r14 = r14.c(r13)
            if (r14 != r0) goto L_0x009b
            return r0
        L_0x0073:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.F     // Catch:{ all -> 0x002e }
            r14.a()     // Catch:{ all -> 0x002e }
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.F
            boolean r14 = r14.d()
            if (r14 == 0) goto L_0x0090
            kotlinx.coroutines.CoroutineScope r7 = r13.G
            androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.F
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r7, r8, r9, r10, r11, r12)
        L_0x0090:
            androidx.compose.material3.DrawerState r14 = r13.H
            r13.D = r3
            java.lang.Object r14 = r14.c(r13)
            if (r14 != r0) goto L_0x009b
            return r0
        L_0x009b:
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        L_0x009e:
            androidx.compose.material3.DrawerPredictiveBackState r1 = r13.F
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00b6
            kotlinx.coroutines.CoroutineScope r7 = r13.G
            androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r1 = r13.F
            r10.<init>(r1, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r7, r8, r9, r10, r11, r12)
        L_0x00b6:
            androidx.compose.material3.DrawerState r1 = r13.H
            r13.E = r14
            r13.D = r2
            java.lang.Object r1 = r1.c(r13)
            if (r1 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            r0 = r14
        L_0x00c4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.x(java.lang.Object):java.lang.Object");
    }
}
