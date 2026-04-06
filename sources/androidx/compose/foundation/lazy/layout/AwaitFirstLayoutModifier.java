package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {

    /* renamed from: A  reason: collision with root package name */
    public Continuation f4772A;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4773z;

    public void J(LayoutCoordinates layoutCoordinates) {
        if (!this.f4773z) {
            this.f4773z = true;
            Continuation continuation = this.f4772A;
            if (continuation != null) {
                Result.Companion companion = Result.f40519A;
                continuation.q(Result.b(Unit.f40552a));
            }
            this.f4772A = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.D
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) r0
            kotlin.ResultKt.b(r6)
            goto L_0x0068
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.f4773z
            if (r6 != 0) goto L_0x0075
            kotlin.coroutines.Continuation r6 = r5.f4772A
            r0.C = r5
            r0.D = r6
            r0.G = r3
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r2.<init>(r4, r3)
            r2.G()
            r5.f4772A = r2
            java.lang.Object r2 = r2.A()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r2 != r3) goto L_0x0064
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L_0x0064:
            if (r2 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r1 = r6
        L_0x0068:
            if (r1 == 0) goto L_0x0075
            kotlin.Result$Companion r6 = kotlin.Result.f40519A
            kotlin.Unit r6 = kotlin.Unit.f40552a
            java.lang.Object r6 = kotlin.Result.b(r6)
            r1.q(r6)
        L_0x0075:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
