package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;

@Metadata
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ExitUntilCollapsedScrollBehavior f9933z;

    public long c2(long j2, long j3, int i2) {
        if (!((Boolean) this.f9933z.e().invoke()).booleanValue()) {
            return Offset.f15855b.c();
        }
        TopAppBarState c2 = this.f9933z.c();
        int i3 = (int) (j2 & 4294967295L);
        c2.j(c2.f() + Float.intBitsToFloat(i3));
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) < 0.0f || Float.intBitsToFloat(i3) < 0.0f) {
            float g2 = this.f9933z.c().g();
            this.f9933z.c().k(this.f9933z.c().g() + Float.intBitsToFloat(i3));
            return Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f9933z.c().g() - g2)) & 4294967295L));
        } else if (Float.intBitsToFloat(i4) <= 0.0f) {
            return Offset.f15855b.c();
        } else {
            float g3 = this.f9933z.c().g();
            this.f9933z.c().k(this.f9933z.c().g() + Float.intBitsToFloat(i4));
            float g4 = this.f9933z.c().g() - g3;
            long floatToRawIntBits = (long) Float.floatToRawIntBits(0.0f);
            return Offset.e((((long) Float.floatToRawIntBits(g4)) & 4294967295L) | (floatToRawIntBits << 32));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q0(long r10, long r12, kotlin.coroutines.Continuation r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.D
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r0.F
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 == r2) goto L_0x0036
            if (r1 != r8) goto L_0x002e
            long r10 = r0.C
            kotlin.ResultKt.b(r14)
            goto L_0x0087
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            long r12 = r0.C
            kotlin.ResultKt.b(r14)
            goto L_0x0060
        L_0x003c:
            kotlin.ResultKt.b(r14)
            float r14 = androidx.compose.ui.unit.Velocity.i(r12)
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 <= 0) goto L_0x0051
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r14 = r9.f9933z
            androidx.compose.material3.TopAppBarState r14 = r14.c()
            r14.j(r1)
        L_0x0051:
            r0.C = r12
            r0.F = r2
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = super.q0(r2, r4, r6)
            if (r14 != r7) goto L_0x0060
            return r7
        L_0x0060:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r10 = r14.o()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r14 = r9.f9933z
            androidx.compose.material3.TopAppBarState r14 = r14.c()
            float r12 = androidx.compose.ui.unit.Velocity.i(r12)
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r13 = r9.f9933z
            androidx.compose.animation.core.DecayAnimationSpec r13 = r13.a()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r1 = r9.f9933z
            androidx.compose.animation.core.AnimationSpec r1 = r1.b()
            r0.C = r10
            r0.F = r8
            java.lang.Object r14 = androidx.compose.material3.AppBarKt.P(r14, r12, r13, r1, r0)
            if (r14 != r7) goto L_0x0087
            return r7
        L_0x0087:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r12 = r14.o()
            long r10 = androidx.compose.ui.unit.Velocity.l(r10, r12)
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1.q0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long t1(long j2, int i2) {
        if (((Boolean) this.f9933z.e().invoke()).booleanValue()) {
            int i3 = (int) (4294967295L & j2);
            if (Float.intBitsToFloat(i3) <= 0.0f) {
                float g2 = this.f9933z.c().g();
                this.f9933z.c().k(this.f9933z.c().g() + Float.intBitsToFloat(i3));
                return g2 == this.f9933z.c().g() ? Offset.f15855b.c() : Offset.g(j2, 0.0f, 0.0f, 2, (Object) null);
            }
        }
        return Offset.f15855b.c();
    }
}
