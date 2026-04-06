package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;

@Metadata
final class ChainedPlatformTextInputInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public final ChainedPlatformTextInputInterceptor f17669a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f17670b;

    public ChainedPlatformTextInputInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.f17669a = chainedPlatformTextInputInterceptor;
        this.f17670b = SnapshotStateKt__SnapshotStateKt.e(platformTextInputInterceptor, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final PlatformTextInputInterceptor b() {
        return (PlatformTextInputInterceptor) this.f17670b.getValue();
    }

    public final void c(PlatformTextInputInterceptor platformTextInputInterceptor) {
        this.f17670b.setValue(platformTextInputInterceptor);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(androidx.compose.ui.node.Owner r6, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            kotlin.ResultKt.b(r8)
            goto L_0x0045
        L_0x0031:
            kotlin.ResultKt.b(r8)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r8 = r5.f17669a
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 r2 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2
            r4 = 0
            r2.<init>(r7, r5, r4)
            r0.E = r3
            java.lang.Object r6 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.d(r6, r8, r2, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor.d(androidx.compose.ui.node.Owner, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(PlatformTextInputInterceptor platformTextInputInterceptor) {
        c(platformTextInputInterceptor);
    }
}
