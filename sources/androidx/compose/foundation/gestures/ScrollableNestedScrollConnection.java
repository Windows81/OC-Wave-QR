package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;

@Metadata
final class ScrollableNestedScrollConnection implements NestedScrollConnection {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3571A;

    /* renamed from: z  reason: collision with root package name */
    public final ScrollingLogic f3572z;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z2) {
        this.f3572z = scrollingLogic;
        this.f3571A = z2;
    }

    public final void a(boolean z2) {
        this.f3571A = z2;
    }

    public long c2(long j2, long j3, int i2) {
        return this.f3571A ? this.f3572z.v(j3) : Offset.f15855b.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q0(long r4, long r6, kotlin.coroutines.Continuation r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r4 == 0) goto L_0x0013
            r4 = r8
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r4 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r4
            int r5 = r4.F
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L_0x0013
            int r5 = r5 - r0
            r4.F = r5
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r4 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r4.<init>(r3, r8)
        L_0x0018:
            java.lang.Object r5 = r4.D
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r4.F
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0036
            if (r0 != r1) goto L_0x002e
            long r6 = r4.C
            kotlin.ResultKt.b(r5)
            goto L_0x0077
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            long r6 = r4.C
            kotlin.ResultKt.b(r5)
            goto L_0x0063
        L_0x003c:
            kotlin.ResultKt.b(r5)
            boolean r5 = r3.f3571A
            if (r5 == 0) goto L_0x0082
            boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.f3044b
            if (r5 == 0) goto L_0x006a
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.f3572z
            boolean r5 = r5.s()
            if (r5 == 0) goto L_0x0056
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.f19186b
            long r4 = r4.a()
            goto L_0x007d
        L_0x0056:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.f3572z
            r4.C = r6
            r4.F = r2
            java.lang.Object r5 = r5.p(r6, r4)
            if (r5 != r8) goto L_0x0063
            return r8
        L_0x0063:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.ui.unit.Velocity) r5
            long r4 = r5.o()
            goto L_0x007d
        L_0x006a:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.f3572z
            r4.C = r6
            r4.F = r1
            java.lang.Object r5 = r5.p(r6, r4)
            if (r5 != r8) goto L_0x0077
            return r8
        L_0x0077:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.ui.unit.Velocity) r5
            long r4 = r5.o()
        L_0x007d:
            long r4 = androidx.compose.ui.unit.Velocity.k(r6, r4)
            goto L_0x0088
        L_0x0082:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.f19186b
            long r4 = r4.a()
        L_0x0088:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.q0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
