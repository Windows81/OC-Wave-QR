package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
final class SaveableStateRegistryImpl implements SaveableStateRegistry {

    /* renamed from: A  reason: collision with root package name */
    public final MutableScatterMap f15205A;

    /* renamed from: B  reason: collision with root package name */
    public MutableScatterMap f15206B;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f15207z;

    public SaveableStateRegistryImpl(Map map, Function1 function1) {
        this.f15207z = function1;
        this.f15205A = (map == null || map.isEmpty()) ? null : SaveableStateRegistryKt.h(map);
    }

    public boolean b(Object obj) {
        return ((Boolean) this.f15207z.invoke(obj)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map d() {
        /*
            r25 = this;
            r0 = r25
            androidx.collection.MutableScatterMap r1 = r0.f15205A
            if (r1 != 0) goto L_0x000f
            androidx.collection.MutableScatterMap r2 = r0.f15206B
            if (r2 != 0) goto L_0x000f
            java.util.Map r1 = kotlin.collections.MapsKt.h()
            return r1
        L_0x000f:
            if (r1 == 0) goto L_0x0016
            int r1 = r1.g()
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            androidx.collection.MutableScatterMap r3 = r0.f15206B
            if (r3 == 0) goto L_0x0020
            int r3 = r3.g()
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            int r1 = r1 + r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r1)
            androidx.collection.MutableScatterMap r1 = r0.f15205A
            r6 = 255(0xff, double:1.26E-321)
            r8 = 7
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r11 = 8
            if (r1 == 0) goto L_0x0099
            java.lang.Object[] r12 = r1.f1960b
            java.lang.Object[] r13 = r1.f1961c
            long[] r1 = r1.f1959a
            int r14 = r1.length
            int r14 = r14 + -2
            if (r14 < 0) goto L_0x0099
            r16 = r3
            r15 = 0
        L_0x0043:
            r2 = r1[r15]
            long r4 = ~r2
            long r4 = r4 << r8
            long r4 = r4 & r2
            long r4 = r4 & r9
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0089
            int r4 = r15 - r14
            int r4 = ~r4
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r5 = 0
        L_0x0055:
            if (r5 >= r4) goto L_0x0084
            long r19 = r2 & r6
            r17 = 128(0x80, double:6.32E-322)
            int r19 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0075
            int r19 = r15 << 3
            int r19 = r19 + r5
            r20 = r12[r19]
            r19 = r13[r19]
            r6 = r19
            java.util.List r6 = (java.util.List) r6
            r7 = r20
            java.lang.String r7 = (java.lang.String) r7
            r9 = r16
            r9.put(r7, r6)
            goto L_0x0077
        L_0x0075:
            r9 = r16
        L_0x0077:
            long r2 = r2 >> r11
            int r5 = r5 + 1
            r16 = r9
            r6 = 255(0xff, double:1.26E-321)
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x0055
        L_0x0084:
            r9 = r16
            if (r4 != r11) goto L_0x009a
            goto L_0x008b
        L_0x0089:
            r9 = r16
        L_0x008b:
            if (r15 == r14) goto L_0x009a
            int r15 = r15 + 1
            r16 = r9
            r6 = 255(0xff, double:1.26E-321)
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x0043
        L_0x0099:
            r9 = r3
        L_0x009a:
            androidx.collection.MutableScatterMap r1 = r0.f15206B
            if (r1 == 0) goto L_0x017c
            java.lang.Object[] r2 = r1.f1960b
            java.lang.Object[] r3 = r1.f1961c
            long[] r1 = r1.f1959a
            int r4 = r1.length
            int r4 = r4 + -2
            if (r4 < 0) goto L_0x017c
            r5 = 0
        L_0x00aa:
            r6 = r1[r5]
            long r12 = ~r6
            long r12 = r12 << r8
            long r12 = r12 & r6
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x016b
            int r10 = r5 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r12 = 0
        L_0x00c1:
            if (r12 >= r10) goto L_0x0161
            r19 = 255(0xff, double:1.26E-321)
            long r21 = r6 & r19
            r16 = 128(0x80, double:6.32E-322)
            int r13 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x0150
            int r13 = r5 << 3
            int r13 = r13 + r12
            r18 = r2[r13]
            r13 = r3[r13]
            java.util.List r13 = (java.util.List) r13
            r8 = r18
            java.lang.String r8 = (java.lang.String) r8
            int r14 = r13.size()
            r15 = 1
            if (r14 != r15) goto L_0x0110
            r14 = 0
            java.lang.Object r13 = r13.get(r14)
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            java.lang.Object r13 = r13.invoke()
            if (r13 == 0) goto L_0x00ff
            boolean r15 = r0.b(r13)
            if (r15 == 0) goto L_0x0102
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.util.ArrayList r13 = kotlin.collections.CollectionsKt.g(r13)
            r9.put(r8, r13)
        L_0x00ff:
            r24 = r1
            goto L_0x014d
        L_0x0102:
            java.lang.String r1 = androidx.compose.runtime.saveable.RememberSaveableKt.d(r13)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0110:
            r14 = 0
            int r15 = r13.size()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r15)
            r11 = 0
        L_0x011b:
            if (r11 >= r15) goto L_0x0148
            java.lang.Object r23 = r13.get(r11)
            kotlin.jvm.functions.Function0 r23 = (kotlin.jvm.functions.Function0) r23
            r24 = r1
            java.lang.Object r1 = r23.invoke()
            if (r1 == 0) goto L_0x0140
            boolean r23 = r0.b(r1)
            if (r23 == 0) goto L_0x0132
            goto L_0x0140
        L_0x0132:
            java.lang.String r1 = androidx.compose.runtime.saveable.RememberSaveableKt.d(r1)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0140:
            r14.add(r1)
            int r11 = r11 + 1
            r1 = r24
            goto L_0x011b
        L_0x0148:
            r24 = r1
            r9.put(r8, r14)
        L_0x014d:
            r1 = 8
            goto L_0x0153
        L_0x0150:
            r24 = r1
            r1 = r11
        L_0x0153:
            long r6 = r6 >> r1
            int r12 = r12 + 1
            r11 = r1
            r1 = r24
            r8 = 7
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00c1
        L_0x0161:
            r24 = r1
            r1 = r11
            r16 = 128(0x80, double:6.32E-322)
            r19 = 255(0xff, double:1.26E-321)
            if (r10 != r1) goto L_0x017c
            goto L_0x0172
        L_0x016b:
            r24 = r1
            r1 = r11
            r16 = 128(0x80, double:6.32E-322)
            r19 = 255(0xff, double:1.26E-321)
        L_0x0172:
            if (r5 == r4) goto L_0x017c
            int r5 = r5 + 1
            r11 = r1
            r1 = r24
            r8 = 7
            goto L_0x00aa
        L_0x017c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.d():java.util.Map");
    }

    public Object e(String str) {
        MutableScatterMap mutableScatterMap;
        MutableScatterMap mutableScatterMap2 = this.f15205A;
        List list = mutableScatterMap2 != null ? (List) mutableScatterMap2.u(str) : null;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (mutableScatterMap = this.f15205A) != null) {
            List list2 = (List) mutableScatterMap.r(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    public SaveableStateRegistry.Entry f(String str, Function0 function0) {
        if (!SaveableStateRegistryKt.f(str)) {
            MutableScatterMap mutableScatterMap = this.f15206B;
            if (mutableScatterMap == null) {
                mutableScatterMap = ScatterMapKt.c();
                this.f15206B = mutableScatterMap;
            }
            Object e2 = mutableScatterMap.e(str);
            if (e2 == null) {
                e2 = new ArrayList();
                mutableScatterMap.x(str, e2);
            }
            ((List) e2).add(function0);
            return new SaveableStateRegistryImpl$registerProvider$3(mutableScatterMap, str, function0);
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
