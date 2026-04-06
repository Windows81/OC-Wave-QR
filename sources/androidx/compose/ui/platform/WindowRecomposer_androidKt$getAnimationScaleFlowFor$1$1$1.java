package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {114, 121}, m = "invokeSuspend")
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements Function2<FlowCollector<? super Float>, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ContentResolver G;
    public final /* synthetic */ Uri H;
    public final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 I;
    public final /* synthetic */ Channel J;
    public final /* synthetic */ Context K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, Channel channel, Context context, Continuation continuation) {
        super(2, continuation);
        this.G = contentResolver;
        this.H = uri;
        this.I = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.J = channel;
        this.K = context;
    }

    /* renamed from: A */
    public final Object m(FlowCollector flowCollector, Continuation continuation) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) s(flowCollector, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.G, this.H, this.I, this.J, this.K, continuation);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.F = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[Catch:{ all -> 0x001b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[Catch:{ all -> 0x001b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.E
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r8.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r8.F
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.b(r9)     // Catch:{ all -> 0x001b }
        L_0x0019:
            r9 = r4
            goto L_0x0048
        L_0x001b:
            r9 = move-exception
            goto L_0x008c
        L_0x001d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0025:
            java.lang.Object r1 = r8.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r8.F
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.b(r9)     // Catch:{ all -> 0x001b }
            goto L_0x0058
        L_0x0031:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.F
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            android.content.ContentResolver r1 = r8.G
            android.net.Uri r4 = r8.H
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r8.I
            r1.registerContentObserver(r4, r5, r6)
            kotlinx.coroutines.channels.Channel r1 = r8.J     // Catch:{ all -> 0x001b }
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch:{ all -> 0x001b }
        L_0x0048:
            r8.F = r9     // Catch:{ all -> 0x001b }
            r8.D = r1     // Catch:{ all -> 0x001b }
            r8.E = r3     // Catch:{ all -> 0x001b }
            java.lang.Object r4 = r1.a(r8)     // Catch:{ all -> 0x001b }
            if (r4 != r0) goto L_0x0055
            return r0
        L_0x0055:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x0058:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x001b }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x001b }
            if (r9 == 0) goto L_0x0082
            r1.next()     // Catch:{ all -> 0x001b }
            android.content.Context r9 = r8.K     // Catch:{ all -> 0x001b }
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ all -> 0x001b }
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch:{ all -> 0x001b }
            java.lang.Float r9 = kotlin.coroutines.jvm.internal.Boxing.b(r9)     // Catch:{ all -> 0x001b }
            r8.F = r4     // Catch:{ all -> 0x001b }
            r8.D = r1     // Catch:{ all -> 0x001b }
            r8.E = r2     // Catch:{ all -> 0x001b }
            java.lang.Object r9 = r4.c(r9, r8)     // Catch:{ all -> 0x001b }
            if (r9 != r0) goto L_0x0019
            return r0
        L_0x0082:
            android.content.ContentResolver r9 = r8.G
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r8.I
            r9.unregisterContentObserver(r0)
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        L_0x008c:
            android.content.ContentResolver r0 = r8.G
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r8.I
            r0.unregisterContentObserver(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.x(java.lang.Object):java.lang.Object");
    }
}
