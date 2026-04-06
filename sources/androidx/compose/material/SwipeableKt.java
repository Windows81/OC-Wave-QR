package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SwipeableKt {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r3 < ((java.lang.Number) r6.m(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5))).floatValue()) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r3 > ((java.lang.Number) r6.m(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0))).floatValue()) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float c(float r3, float r4, java.util.Set r5, kotlin.jvm.functions.Function2 r6, float r7, float r8) {
        /*
            java.util.List r5 = d(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L_0x006c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0062
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0042
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            return r5
        L_0x002b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.m(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x005e
            goto L_0x0060
        L_0x0042:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.m(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
        L_0x005e:
            r4 = r5
            goto L_0x006c
        L_0x0060:
            r4 = r0
            goto L_0x006c
        L_0x0062:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.c(float, float, java.util.Set, kotlin.jvm.functions.Function2, float, float):float");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List d(float r13, java.util.Set r14) {
        /*
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r14.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()
            r5 = r2
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            double r5 = (double) r5
            double r7 = (double) r13
            double r7 = r7 + r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x000b
            r0.add(r2)
            goto L_0x000b
        L_0x002c:
            boolean r1 = r0.isEmpty()
            r2 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0037
            r1 = r5
            goto L_0x0061
        L_0x0037:
            java.lang.Object r1 = r0.get(r2)
            r7 = r1
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r8 = kotlin.collections.CollectionsKt.o(r0)
            if (r6 > r8) goto L_0x0061
            r9 = r6
        L_0x0049:
            java.lang.Object r10 = r0.get(r9)
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            int r12 = java.lang.Float.compare(r7, r11)
            if (r12 >= 0) goto L_0x005c
            r1 = r10
            r7 = r11
        L_0x005c:
            if (r9 == r8) goto L_0x0061
            int r9 = r9 + 1
            goto L_0x0049
        L_0x0061:
            java.lang.Float r1 = (java.lang.Float) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x006c:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x0088
            java.lang.Object r7 = r14.next()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            double r8 = (double) r8
            double r10 = (double) r13
            double r10 = r10 - r3
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L_0x006c
            r0.add(r7)
            goto L_0x006c
        L_0x0088:
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L_0x008f
            goto L_0x00b9
        L_0x008f:
            java.lang.Object r13 = r0.get(r2)
            r14 = r13
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            int r2 = kotlin.collections.CollectionsKt.o(r0)
            if (r6 > r2) goto L_0x00b8
        L_0x00a0:
            java.lang.Object r3 = r0.get(r6)
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r5 = java.lang.Float.compare(r14, r4)
            if (r5 <= 0) goto L_0x00b3
            r13 = r3
            r14 = r4
        L_0x00b3:
            if (r6 == r2) goto L_0x00b8
            int r6 = r6 + 1
            goto L_0x00a0
        L_0x00b8:
            r5 = r13
        L_0x00b9:
            java.lang.Float r5 = (java.lang.Float) r5
            if (r1 != 0) goto L_0x00c2
            java.util.List r13 = kotlin.collections.CollectionsKt.q(r5)
            goto L_0x00dc
        L_0x00c2:
            if (r5 != 0) goto L_0x00c9
            java.util.List r13 = kotlin.collections.CollectionsKt.e(r1)
            goto L_0x00dc
        L_0x00c9:
            boolean r13 = kotlin.jvm.internal.Intrinsics.c(r1, r5)
            if (r13 == 0) goto L_0x00d4
            java.util.List r13 = kotlin.collections.CollectionsKt.e(r1)
            goto L_0x00dc
        L_0x00d4:
            java.lang.Float[] r13 = new java.lang.Float[]{r1, r5}
            java.util.List r13 = kotlin.collections.CollectionsKt.p(r13)
        L_0x00dc:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.d(float, java.util.Set):java.util.List");
    }

    public static final Float e(Map map, Object obj) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier f(androidx.compose.ui.Modifier r12, androidx.compose.material.SwipeableState r13, java.util.Map r14, androidx.compose.foundation.gestures.Orientation r15, boolean r16, boolean r17, androidx.compose.foundation.interaction.MutableInteractionSource r18, kotlin.jvm.functions.Function2 r19, androidx.compose.material.ResistanceConfig r20, float r21) {
        /*
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.b()
            if (r0 == 0) goto L_0x001c
            androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0020
        L_0x001c:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x0020:
            androidx.compose.material.SwipeableKt$swipeable$3 r11 = new androidx.compose.material.SwipeableKt$swipeable$3
            r1 = r11
            r2 = r14
            r3 = r13
            r4 = r20
            r5 = r19
            r6 = r21
            r7 = r15
            r8 = r16
            r9 = r18
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r12
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.b(r12, r0, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.f(androidx.compose.ui.Modifier, androidx.compose.material.SwipeableState, java.util.Map, androidx.compose.foundation.gestures.Orientation, boolean, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.material.ResistanceConfig, float):androidx.compose.ui.Modifier");
    }

    public static /* synthetic */ Modifier g(Modifier modifier, SwipeableState swipeableState, Map map, Orientation orientation, boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource, Function2 function2, ResistanceConfig resistanceConfig, float f2, int i2, Object obj) {
        int i3 = i2;
        return f(modifier, swipeableState, map, orientation, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? null : mutableInteractionSource, (i3 & 64) != 0 ? SwipeableKt$swipeable$1.f8573z : function2, (i3 & 128) != 0 ? SwipeableDefaults.d(SwipeableDefaults.f8558a, map.keySet(), 0.0f, 0.0f, 6, (Object) null) : resistanceConfig, (i3 & 256) != 0 ? SwipeableDefaults.f8558a.b() : f2);
    }
}
