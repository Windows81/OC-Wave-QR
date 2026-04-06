package androidx.compose.material.pullrefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
final class PullRefreshNestedScrollConnection implements NestedScrollConnection {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f9032A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f9033B;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f9034z;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object H1(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            float r5 = r0.C
            kotlin.ResultKt.b(r7)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.b(r7)
            kotlin.jvm.functions.Function2 r7 = r4.f9032A
            float r5 = androidx.compose.ui.unit.Velocity.i(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.b(r5)
            r6 = 0
            r0.C = r6
            r0.F = r3
            java.lang.Object r7 = r7.m(r5, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r5 = r6
        L_0x004d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.ui.unit.VelocityKt.a(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.H1(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long c2(long j2, long j3, int i2) {
        return !this.f9033B ? Offset.f15855b.c() : (!NestedScrollSource.e(i2, NestedScrollSource.f16795b.b()) || Offset.n(j3) <= 0.0f) ? Offset.f15855b.c() : OffsetKt.a(0.0f, ((Number) this.f9034z.invoke(Float.valueOf(Offset.n(j3)))).floatValue());
    }

    public long t1(long j2, int i2) {
        return !this.f9033B ? Offset.f15855b.c() : (!NestedScrollSource.e(i2, NestedScrollSource.f16795b.b()) || Offset.n(j2) >= 0.0f) ? Offset.f15855b.c() : OffsetKt.a(0.0f, ((Number) this.f9034z.invoke(Float.valueOf(Offset.n(j2)))).floatValue());
    }
}
