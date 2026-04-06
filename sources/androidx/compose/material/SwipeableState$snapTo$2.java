package androidx.compose.material;

import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
final class SwipeableState$snapTo$2<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SwipeableState f8612A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f8613z;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.Map r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$snapTo$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = (androidx.compose.material.SwipeableState$snapTo$2$emit$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = new androidx.compose.material.SwipeableState$snapTo$2$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            androidx.compose.material.SwipeableState$snapTo$2 r5 = (androidx.compose.material.SwipeableState$snapTo$2) r5
            kotlin.ResultKt.b(r6)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = r4.f8613z
            java.lang.Float r5 = androidx.compose.material.SwipeableKt.e(r5, r6)
            if (r5 == 0) goto L_0x005c
            androidx.compose.material.SwipeableState r6 = r4.f8612A
            float r5 = r5.floatValue()
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r6.H(r5, r0)
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            androidx.compose.material.SwipeableState r6 = r5.f8612A
            java.lang.Object r5 = r5.f8613z
            r6.D(r5)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x005c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The target value must have an associated anchor."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$snapTo$2.c(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
