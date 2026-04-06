package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;

@Metadata
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SwipeableState f8564z;

    private final long b(float f2) {
        return OffsetKt.a(0.0f, f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object H1(long r7, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r7 = r0.C
            kotlin.ResultKt.b(r9)
            goto L_0x0078
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.ResultKt.b(r9)
            float r9 = androidx.compose.ui.unit.Velocity.h(r7)
            float r2 = androidx.compose.ui.unit.Velocity.i(r7)
            long r4 = androidx.compose.ui.geometry.OffsetKt.a(r9, r2)
            float r9 = r6.a(r4)
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0072
            androidx.compose.material.SwipeableState r2 = r6.f8564z
            androidx.compose.runtime.State r2 = r2.t()
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.material.SwipeableState r4 = r6.f8564z
            float r4 = r4.s()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0072
            androidx.compose.material.SwipeableState r2 = r6.f8564z
            r0.C = r7
            r0.F = r3
            java.lang.Object r9 = r2.z(r9, r0)
            if (r9 != r1) goto L_0x0078
            return r1
        L_0x0072:
            androidx.compose.ui.unit.Velocity$Companion r7 = androidx.compose.ui.unit.Velocity.f19186b
            long r7 = r7.a()
        L_0x0078:
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.ui.unit.Velocity.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.H1(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float a(long j2) {
        return Offset.n(j2);
    }

    public long c2(long j2, long j3, int i2) {
        return NestedScrollSource.e(i2, NestedScrollSource.f16795b.b()) ? b(this.f8564z.y(a(j3))) : Offset.f15855b.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q0(long r5, long r7, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r5 == 0) goto L_0x0013
            r5 = r9
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) r5
            int r6 = r5.F
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L_0x0013
            int r6 = r6 - r0
            r5.F = r6
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            r5.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r6 = r5.D
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r5.F
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r7 = r5.C
            kotlin.ResultKt.b(r6)
            goto L_0x0053
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.b(r6)
            androidx.compose.material.SwipeableState r6 = r4.f8564z
            float r0 = androidx.compose.ui.unit.Velocity.h(r7)
            float r2 = androidx.compose.ui.unit.Velocity.i(r7)
            long r2 = androidx.compose.ui.geometry.OffsetKt.a(r0, r2)
            float r0 = r4.a(r2)
            r5.C = r7
            r5.F = r1
            java.lang.Object r5 = r6.z(r0, r5)
            if (r5 != r9) goto L_0x0053
            return r9
        L_0x0053:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.q0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long t1(long j2, int i2) {
        float a2 = a(j2);
        return (a2 >= 0.0f || !NestedScrollSource.e(i2, NestedScrollSource.f16795b.b())) ? Offset.f15855b.c() : b(this.f8564z.y(a2));
    }
}
