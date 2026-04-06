package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class SwipeableState$animateTo$2<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SwipeableState f8605A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f8606B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f8607z;

    public SwipeableState$animateTo$2(Object obj, SwipeableState swipeableState, AnimationSpec animationSpec) {
        this.f8607z = obj;
        this.f8605A = swipeableState;
        this.f8606B = animationSpec;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.Map r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.material.SwipeableState$animateTo$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.material.SwipeableState$animateTo$2$emit$1 r0 = (androidx.compose.material.SwipeableState$animateTo$2$emit$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$animateTo$2$emit$1 r0 = new androidx.compose.material.SwipeableState$animateTo$2$emit$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r7 = r0.D
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r0 = r0.C
            androidx.compose.material.SwipeableState$animateTo$2 r0 = (androidx.compose.material.SwipeableState$animateTo$2) r0
            kotlin.ResultKt.b(r8)     // Catch:{ all -> 0x0033 }
            goto L_0x005f
        L_0x0033:
            r8 = move-exception
            goto L_0x00c6
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r6.f8607z     // Catch:{ all -> 0x00bb }
            java.lang.Float r8 = androidx.compose.material.SwipeableKt.e(r7, r8)     // Catch:{ all -> 0x00bb }
            if (r8 == 0) goto L_0x00be
            androidx.compose.material.SwipeableState r2 = r6.f8605A     // Catch:{ all -> 0x00bb }
            float r8 = r8.floatValue()     // Catch:{ all -> 0x00bb }
            androidx.compose.animation.core.AnimationSpec r5 = r6.f8606B     // Catch:{ all -> 0x00bb }
            r0.C = r6     // Catch:{ all -> 0x00bb }
            r0.D = r7     // Catch:{ all -> 0x00bb }
            r0.G = r4     // Catch:{ all -> 0x00bb }
            java.lang.Object r8 = r2.i(r8, r5, r0)     // Catch:{ all -> 0x00bb }
            if (r8 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r0 = r6
        L_0x005f:
            androidx.compose.material.SwipeableState r8 = r0.f8605A
            androidx.compose.runtime.MutableFloatState r8 = r8.f8587g
            float r8 = r8.c()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0076:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = r4 - r8
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0076
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r4, r2)
            goto L_0x0076
        L_0x00a1:
            java.util.Collection r7 = r1.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = kotlin.collections.CollectionsKt.f0(r7)
            if (r7 != 0) goto L_0x00b3
            androidx.compose.material.SwipeableState r7 = r0.f8605A
            java.lang.Object r7 = r7.p()
        L_0x00b3:
            androidx.compose.material.SwipeableState r8 = r0.f8605A
            r8.D(r7)
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x00bb:
            r8 = move-exception
            r0 = r6
            goto L_0x00c6
        L_0x00be:
            java.lang.String r8 = "The target value must have an associated anchor."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00bb }
            r0.<init>(r8)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00c6:
            androidx.compose.material.SwipeableState r1 = r0.f8605A
            androidx.compose.runtime.MutableFloatState r1 = r1.f8587g
            float r1 = r1.c()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00dd:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0108
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r1
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00dd
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r2.put(r5, r4)
            goto L_0x00dd
        L_0x0108:
            java.util.Collection r7 = r2.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = kotlin.collections.CollectionsKt.f0(r7)
            if (r7 != 0) goto L_0x011a
            androidx.compose.material.SwipeableState r7 = r0.f8605A
            java.lang.Object r7 = r7.p()
        L_0x011a:
            androidx.compose.material.SwipeableState r0 = r0.f8605A
            r0.D(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$animateTo$2.c(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
