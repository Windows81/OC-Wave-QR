package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements PlatformTextInputSessionScope {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputSessionScope f17671A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17672B;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputSessionScope f17673z;

    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(PlatformTextInputSessionScope platformTextInputSessionScope, AtomicReference atomicReference, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.f17671A = platformTextInputSessionScope;
        this.f17672B = atomicReference;
        this.C = chainedPlatformTextInputInterceptor;
        this.f17673z = platformTextInputSessionScope;
    }

    public CoroutineContext getCoroutineContext() {
        return this.f17673z.getCoroutineContext();
    }

    public View r() {
        return this.f17673z.r();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object s(androidx.compose.ui.platform.PlatformTextInputMethodRequest r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002d:
            kotlin.ResultKt.b(r10)
            goto L_0x004b
        L_0x0031:
            kotlin.ResultKt.b(r10)
            java.util.concurrent.atomic.AtomicReference r10 = r8.f17672B
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r2 = androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.f17674z
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 r4 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5 = r8.C
            androidx.compose.ui.platform.PlatformTextInputSessionScope r6 = r8.f17671A
            r7 = 0
            r4.<init>(r5, r9, r6, r7)
            r0.E = r3
            java.lang.Object r9 = androidx.compose.ui.SessionMutex.h(r10, r2, r4, r0)
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1.s(androidx.compose.ui.platform.PlatformTextInputMethodRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
