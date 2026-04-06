package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;

@Metadata
public final class BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Orientation f7402A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f7403z;

    public BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        this.f7403z = anchoredDraggableState;
        this.f7402A = orientation;
    }

    private final float a(long j2) {
        return this.f7402A == Orientation.Horizontal ? Offset.m(j2) : Offset.n(j2);
    }

    private final long b(float f2) {
        Orientation orientation = this.f7402A;
        float f3 = orientation == Orientation.Horizontal ? f2 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f2 = 0.0f;
        }
        return OffsetKt.a(f3, f2);
    }

    private final float c(long j2) {
        return this.f7402A == Orientation.Horizontal ? Velocity.h(j2) : Velocity.i(j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object H1(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r6 = r0.C
            kotlin.ResultKt.b(r8)
            goto L_0x0066
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            kotlin.ResultKt.b(r8)
            float r8 = r5.c(r6)
            androidx.compose.material.AnchoredDraggableState r2 = r5.f7403z
            float r2 = r2.A()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0060
            androidx.compose.material.AnchoredDraggableState r4 = r5.f7403z
            androidx.compose.material.DraggableAnchors r4 = r4.o()
            float r4 = r4.d()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0060
            androidx.compose.material.AnchoredDraggableState r2 = r5.f7403z
            r0.C = r6
            r0.F = r3
            java.lang.Object r8 = r2.G(r8, r0)
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0060:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.f19186b
            long r6 = r6.a()
        L_0x0066:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.H1(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long c2(long j2, long j3, int i2) {
        return NestedScrollSource.e(i2, NestedScrollSource.f16795b.b()) ? b(this.f7403z.n(a(j3))) : Offset.f15855b.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q0(long r3, long r5, kotlin.coroutines.Continuation r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.F
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.F = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.D
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r3.F
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r5 = r3.C
            kotlin.ResultKt.b(r4)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0033:
            kotlin.ResultKt.b(r4)
            androidx.compose.material.AnchoredDraggableState r4 = r2.f7403z
            float r0 = r2.c(r5)
            r3.C = r5
            r3.F = r1
            java.lang.Object r3 = r4.G(r0, r3)
            if (r3 != r7) goto L_0x0047
            return r7
        L_0x0047:
            androidx.compose.ui.unit.Velocity r3 = androidx.compose.ui.unit.Velocity.b(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.q0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long t1(long j2, int i2) {
        float a2 = a(j2);
        return (a2 >= 0.0f || !NestedScrollSource.e(i2, NestedScrollSource.f16795b.b())) ? Offset.f15855b.c() : b(this.f7403z.n(a2));
    }
}
