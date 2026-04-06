package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Ref.ObjectRef F;
    public final /* synthetic */ Recomposer G;
    public final /* synthetic */ LifecycleOwner H;
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 I;
    public final /* synthetic */ View J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef objectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, Continuation continuation) {
        super(2, continuation);
        this.F = objectRef;
        this.G = recomposer;
        this.H = lifecycleOwner;
        this.I = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.J = view;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.F, this.G, this.H, this.I, this.J, continuation);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.E = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r11.D
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r11.E
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x0014 }
            goto L_0x006a
        L_0x0014:
            r12 = move-exception
            goto L_0x0081
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001f:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.E
            r4 = r12
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.jvm.internal.Ref$ObjectRef r12 = r11.F     // Catch:{ all -> 0x0058 }
            java.lang.Object r12 = r12.f40908z     // Catch:{ all -> 0x0058 }
            androidx.compose.ui.platform.MotionDurationScaleImpl r12 = (androidx.compose.ui.platform.MotionDurationScaleImpl) r12     // Catch:{ all -> 0x0058 }
            if (r12 == 0) goto L_0x005b
            android.view.View r1 = r11.J     // Catch:{ all -> 0x0058 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0058 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0058 }
            kotlinx.coroutines.flow.StateFlow r1 = androidx.compose.ui.platform.WindowRecomposer_androidKt.e(r1)     // Catch:{ all -> 0x0058 }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0058 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0058 }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x0058 }
            r12.e(r5)     // Catch:{ all -> 0x0058 }
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch:{ all -> 0x0058 }
            r7.<init>(r1, r12, r3)     // Catch:{ all -> 0x0058 }
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            kotlinx.coroutines.Job r12 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r12 = move-exception
            r0 = r3
            goto L_0x0081
        L_0x005b:
            r12 = r3
        L_0x005c:
            androidx.compose.runtime.Recomposer r1 = r11.G     // Catch:{ all -> 0x007d }
            r11.E = r12     // Catch:{ all -> 0x007d }
            r11.D = r2     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r1.a1(r11)     // Catch:{ all -> 0x007d }
            if (r1 != r0) goto L_0x0069
            return r0
        L_0x0069:
            r0 = r12
        L_0x006a:
            if (r0 == 0) goto L_0x006f
            kotlinx.coroutines.Job.DefaultImpls.a(r0, r3, r2, r3)
        L_0x006f:
            androidx.lifecycle.LifecycleOwner r12 = r11.H
            androidx.lifecycle.Lifecycle r12 = r12.a()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.I
            r12.d(r0)
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x007d:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        L_0x0081:
            if (r0 == 0) goto L_0x0086
            kotlinx.coroutines.Job.DefaultImpls.a(r0, r3, r2, r3)
        L_0x0086:
            androidx.lifecycle.LifecycleOwner r0 = r11.H
            androidx.lifecycle.Lifecycle r0 = r0.a()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.I
            r0.d(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.x(java.lang.Object):java.lang.Object");
    }
}
