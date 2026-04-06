package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Node extends NodeParent {

    /* renamed from: c  reason: collision with root package name */
    public final Modifier.Node f16833c;

    /* renamed from: d  reason: collision with root package name */
    public final PointerIdArray f16834d = new PointerIdArray();

    /* renamed from: e  reason: collision with root package name */
    public final LongSparseArray f16835e = new LongSparseArray(2);

    /* renamed from: f  reason: collision with root package name */
    public LayoutCoordinates f16836f;

    /* renamed from: g  reason: collision with root package name */
    public PointerEvent f16837g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16838h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16839i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16840j = true;

    public Node(Modifier.Node node) {
        this.f16833c = node;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.collection.LongSparseArray r45, androidx.compose.ui.layout.LayoutCoordinates r46, androidx.compose.ui.input.pointer.InternalPointerEvent r47, boolean r48) {
        /*
            r44 = this;
            r0 = r44
            r1 = r45
            r2 = r46
            r3 = r47
            boolean r4 = super.a(r45, r46, r47, r48)
            androidx.compose.ui.Modifier$Node r5 = r0.f16833c
            boolean r5 = r5.F2()
            r6 = 1
            if (r5 != 0) goto L_0x0016
            return r6
        L_0x0016:
            androidx.compose.ui.Modifier$Node r5 = r0.f16833c
            r7 = 16
            int r8 = androidx.compose.ui.node.NodeKind.a(r7)
            r10 = 0
        L_0x001f:
            r11 = 0
            if (r5 == 0) goto L_0x0070
            boolean r12 = r5 instanceof androidx.compose.ui.node.PointerInputModifierNode
            if (r12 == 0) goto L_0x002f
            androidx.compose.ui.node.PointerInputModifierNode r5 = (androidx.compose.ui.node.PointerInputModifierNode) r5
            androidx.compose.ui.layout.LayoutCoordinates r5 = androidx.compose.ui.node.PointerInputModifierNodeKt.a(r5)
            r0.f16836f = r5
            goto L_0x006b
        L_0x002f:
            int r12 = r5.A2()
            r12 = r12 & r8
            if (r12 == 0) goto L_0x006b
            boolean r12 = r5 instanceof androidx.compose.ui.node.DelegatingNode
            if (r12 == 0) goto L_0x006b
            r12 = r5
            androidx.compose.ui.node.DelegatingNode r12 = (androidx.compose.ui.node.DelegatingNode) r12
            androidx.compose.ui.Modifier$Node r12 = r12.a3()
            r13 = r11
        L_0x0042:
            if (r12 == 0) goto L_0x0068
            int r14 = r12.A2()
            r14 = r14 & r8
            if (r14 == 0) goto L_0x0063
            int r13 = r13 + 1
            if (r13 != r6) goto L_0x0051
            r5 = r12
            goto L_0x0063
        L_0x0051:
            if (r10 != 0) goto L_0x005a
            androidx.compose.runtime.collection.MutableVector r10 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r14 = new androidx.compose.ui.Modifier.Node[r7]
            r10.<init>(r14, r11)
        L_0x005a:
            if (r5 == 0) goto L_0x0060
            r10.d(r5)
            r5 = 0
        L_0x0060:
            r10.d(r12)
        L_0x0063:
            androidx.compose.ui.Modifier$Node r12 = r12.w2()
            goto L_0x0042
        L_0x0068:
            if (r13 != r6) goto L_0x006b
            goto L_0x001f
        L_0x006b:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.h(r10)
            goto L_0x001f
        L_0x0070:
            androidx.compose.ui.layout.LayoutCoordinates r5 = r0.f16836f
            if (r5 != 0) goto L_0x0075
            return r6
        L_0x0075:
            int r5 = r45.o()
            r7 = r11
        L_0x007a:
            if (r7 >= r5) goto L_0x0171
            long r12 = r1.k(r7)
            java.lang.Object r8 = r1.p(r7)
            r14 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            androidx.compose.ui.input.pointer.util.PointerIdArray r8 = r0.f16834d
            boolean r8 = r8.c(r12)
            if (r8 == 0) goto L_0x015f
            long r9 = r14.k()
            r33 = r7
            long r6 = r14.h()
            r15 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r17 = r9 & r15
            r19 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r17 = r17 + r19
            r21 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r17 = r17 & r21
            r23 = 0
            int r17 = (r17 > r23 ? 1 : (r17 == r23 ? 0 : -1))
            if (r17 != 0) goto L_0x015a
            long r17 = r6 & r15
            long r17 = r17 + r19
            long r17 = r17 & r21
            int r17 = (r17 > r23 ? 1 : (r17 == r23 ? 0 : -1))
            if (r17 != 0) goto L_0x015a
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.List r17 = r14.e()
            int r11 = r17.size()
            r8.<init>(r11)
            java.util.List r11 = r14.e()
            r17 = r11
            java.util.Collection r17 = (java.util.Collection) r17
            int r15 = r17.size()
            r34 = r5
            r5 = 0
        L_0x00da:
            if (r5 >= r15) goto L_0x0128
            java.lang.Object r16 = r11.get(r5)
            androidx.compose.ui.input.pointer.HistoricalChange r16 = (androidx.compose.ui.input.pointer.HistoricalChange) r16
            r35 = r4
            long r3 = r16.b()
            r17 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r25 = r3 & r17
            long r25 = r25 + r19
            long r25 = r25 & r21
            int r25 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r25 != 0) goto L_0x0119
            r25 = r11
            androidx.compose.ui.input.pointer.HistoricalChange r11 = new androidx.compose.ui.input.pointer.HistoricalChange
            long r37 = r16.c()
            r26 = r15
            androidx.compose.ui.layout.LayoutCoordinates r15 = r0.f16836f
            kotlin.jvm.internal.Intrinsics.f(r15)
            long r39 = r15.N(r2, r3)
            long r41 = r16.a()
            r43 = 0
            r36 = r11
            r36.<init>(r37, r39, r41, r43)
            r8.add(r11)
            goto L_0x011d
        L_0x0119:
            r25 = r11
            r26 = r15
        L_0x011d:
            int r5 = r5 + 1
            r3 = r47
            r11 = r25
            r15 = r26
            r4 = r35
            goto L_0x00da
        L_0x0128:
            r35 = r4
            androidx.collection.LongSparseArray r3 = r0.f16835e
            androidx.compose.ui.layout.LayoutCoordinates r4 = r0.f16836f
            kotlin.jvm.internal.Intrinsics.f(r4)
            long r24 = r4.N(r2, r9)
            androidx.compose.ui.layout.LayoutCoordinates r4 = r0.f16836f
            kotlin.jvm.internal.Intrinsics.f(r4)
            long r19 = r4.N(r2, r6)
            r31 = 731(0x2db, float:1.024E-42)
            r32 = 0
            r15 = 0
            r17 = 0
            r21 = 0
            r22 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r28 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r4 = androidx.compose.ui.input.pointer.PointerInputChange.c(r14, r15, r17, r19, r21, r22, r24, r26, r27, r28, r29, r31, r32)
            r3.l(r12, r4)
            goto L_0x0165
        L_0x015a:
            r35 = r4
            r34 = r5
            goto L_0x0165
        L_0x015f:
            r35 = r4
            r34 = r5
            r33 = r7
        L_0x0165:
            int r7 = r33 + 1
            r3 = r47
            r5 = r34
            r4 = r35
            r6 = 1
            r11 = 0
            goto L_0x007a
        L_0x0171:
            r35 = r4
            androidx.collection.LongSparseArray r2 = r0.f16835e
            boolean r2 = r2.j()
            if (r2 == 0) goto L_0x0189
            androidx.compose.ui.input.pointer.util.PointerIdArray r1 = r0.f16834d
            r1.b()
            androidx.compose.runtime.collection.MutableVector r1 = r44.g()
            r1.l()
            r2 = 1
            return r2
        L_0x0189:
            r2 = 1
            androidx.compose.ui.input.pointer.util.PointerIdArray r3 = r0.f16834d
            int r3 = r3.e()
            int r3 = r3 - r2
        L_0x0191:
            r2 = -1
            if (r2 >= r3) goto L_0x01a8
            androidx.compose.ui.input.pointer.util.PointerIdArray r2 = r0.f16834d
            long r4 = r2.d(r3)
            boolean r2 = r1.f(r4)
            if (r2 != 0) goto L_0x01a5
            androidx.compose.ui.input.pointer.util.PointerIdArray r2 = r0.f16834d
            r2.h(r3)
        L_0x01a5:
            int r3 = r3 + -1
            goto L_0x0191
        L_0x01a8:
            java.util.ArrayList r1 = new java.util.ArrayList
            androidx.collection.LongSparseArray r2 = r0.f16835e
            int r2 = r2.o()
            r1.<init>(r2)
            androidx.collection.LongSparseArray r2 = r0.f16835e
            int r2 = r2.o()
            r3 = 0
        L_0x01ba:
            if (r3 >= r2) goto L_0x01c8
            androidx.collection.LongSparseArray r4 = r0.f16835e
            java.lang.Object r4 = r4.p(r3)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x01ba
        L_0x01c8:
            androidx.compose.ui.input.pointer.PointerEvent r2 = new androidx.compose.ui.input.pointer.PointerEvent
            r3 = r47
            r2.<init>(r1, r3)
            java.util.List r1 = r2.c()
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L_0x01db:
            if (r5 >= r4) goto L_0x01f3
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.f()
            boolean r7 = r3.a(r7)
            if (r7 == 0) goto L_0x01f0
            r9 = r6
            goto L_0x01f4
        L_0x01f0:
            int r5 = r5 + 1
            goto L_0x01db
        L_0x01f3:
            r9 = 0
        L_0x01f4:
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 == 0) goto L_0x02a4
            if (r48 != 0) goto L_0x01ff
            r1 = 0
            r0.f16839i = r1
        L_0x01fd:
            r4 = 1
            goto L_0x0221
        L_0x01ff:
            r1 = 0
            boolean r3 = r0.f16839i
            if (r3 != 0) goto L_0x01fd
            boolean r3 = r9.i()
            if (r3 != 0) goto L_0x0210
            boolean r3 = r9.l()
            if (r3 == 0) goto L_0x01fd
        L_0x0210:
            androidx.compose.ui.layout.LayoutCoordinates r3 = r0.f16836f
            kotlin.jvm.internal.Intrinsics.f(r3)
            long r3 = r3.a()
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.e(r9, r3)
            r4 = 1
            r3 = r3 ^ r4
            r0.f16839i = r3
        L_0x0221:
            boolean r3 = r0.f16839i
            boolean r5 = r0.f16838h
            if (r3 == r5) goto L_0x0264
            int r3 = r2.h()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.f16852b
            int r6 = r5.c()
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventType.j(r3, r6)
            if (r3 != 0) goto L_0x0253
            int r3 = r2.h()
            int r6 = r5.a()
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventType.j(r3, r6)
            if (r3 != 0) goto L_0x0253
            int r3 = r2.h()
            int r6 = r5.b()
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventType.j(r3, r6)
            if (r3 == 0) goto L_0x0264
        L_0x0253:
            boolean r3 = r0.f16839i
            if (r3 == 0) goto L_0x025c
            int r3 = r5.a()
            goto L_0x0260
        L_0x025c:
            int r3 = r5.b()
        L_0x0260:
            r2.i(r3)
            goto L_0x02a6
        L_0x0264:
            int r3 = r2.h()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.f16852b
            int r6 = r5.a()
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventType.j(r3, r6)
            if (r3 == 0) goto L_0x0284
            boolean r3 = r0.f16838h
            if (r3 == 0) goto L_0x0284
            boolean r3 = r0.f16840j
            if (r3 != 0) goto L_0x0284
            int r3 = r5.c()
            r2.i(r3)
            goto L_0x02a6
        L_0x0284:
            int r3 = r2.h()
            int r6 = r5.b()
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventType.j(r3, r6)
            if (r3 == 0) goto L_0x02a6
            boolean r3 = r0.f16839i
            if (r3 == 0) goto L_0x02a6
            boolean r3 = r9.i()
            if (r3 == 0) goto L_0x02a6
            int r3 = r5.c()
            r2.i(r3)
            goto L_0x02a6
        L_0x02a4:
            r1 = 0
            r4 = 1
        L_0x02a6:
            if (r35 != 0) goto L_0x02c3
            int r3 = r2.h()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.f16852b
            int r5 = r5.c()
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventType.j(r3, r5)
            if (r3 == 0) goto L_0x02c3
            androidx.compose.ui.input.pointer.PointerEvent r3 = r0.f16837g
            boolean r3 = r0.m(r3, r2)
            if (r3 == 0) goto L_0x02c1
            goto L_0x02c3
        L_0x02c1:
            r6 = r1
            goto L_0x02c4
        L_0x02c3:
            r6 = r4
        L_0x02c4:
            r0.f16837g = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.a(androidx.collection.LongSparseArray, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    public void b(InternalPointerEvent internalPointerEvent) {
        super.b(internalPointerEvent);
        PointerEvent pointerEvent = this.f16837g;
        if (pointerEvent != null) {
            this.f16838h = this.f16839i;
            List c2 = pointerEvent.c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChange = (PointerInputChange) c2.get(i2);
                boolean i3 = pointerInputChange.i();
                boolean a2 = internalPointerEvent.a(pointerInputChange.f());
                boolean z2 = this.f16839i;
                if ((!i3 && !a2) || (!i3 && !z2)) {
                    this.f16834d.g(pointerInputChange.f());
                }
            }
            this.f16839i = false;
            this.f16840j = PointerEventType.j(pointerEvent.h(), PointerEventType.f16852b.b());
        }
    }

    public void d() {
        MutableVector g2 = g();
        Object[] objArr = g2.f15005z;
        int p2 = g2.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((Node) objArr[i2]).d();
        }
        Modifier.Node node = this.f16833c;
        int a2 = NodeKind.a(16);
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) node).X0();
            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                int i3 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i3++;
                        if (i3 == 1) {
                            node = a3;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.d(node);
                                node = null;
                            }
                            mutableVector.d(a3);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            node = DelegatableNodeKt.h(mutableVector);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(androidx.compose.ui.input.pointer.InternalPointerEvent r14) {
        /*
            r13 = this;
            androidx.collection.LongSparseArray r0 = r13.f16835e
            boolean r0 = r0.j()
            r1 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x009c
        L_0x000b:
            androidx.compose.ui.Modifier$Node r0 = r13.f16833c
            boolean r0 = r0.F2()
            if (r0 != 0) goto L_0x0015
            goto L_0x009c
        L_0x0015:
            androidx.compose.ui.input.pointer.PointerEvent r0 = r13.f16837g
            kotlin.jvm.internal.Intrinsics.f(r0)
            androidx.compose.ui.layout.LayoutCoordinates r2 = r13.f16836f
            kotlin.jvm.internal.Intrinsics.f(r2)
            long r2 = r2.a()
            androidx.compose.ui.Modifier$Node r4 = r13.f16833c
            r5 = 16
            int r6 = androidx.compose.ui.node.NodeKind.a(r5)
            r7 = 0
            r8 = r7
        L_0x002d:
            r9 = 1
            if (r4 == 0) goto L_0x007d
            boolean r10 = r4 instanceof androidx.compose.ui.node.PointerInputModifierNode
            if (r10 == 0) goto L_0x003c
            androidx.compose.ui.node.PointerInputModifierNode r4 = (androidx.compose.ui.node.PointerInputModifierNode) r4
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r4.S0(r0, r9, r2)
            goto L_0x0078
        L_0x003c:
            int r10 = r4.A2()
            r10 = r10 & r6
            if (r10 == 0) goto L_0x0078
            boolean r10 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r10 == 0) goto L_0x0078
            r10 = r4
            androidx.compose.ui.node.DelegatingNode r10 = (androidx.compose.ui.node.DelegatingNode) r10
            androidx.compose.ui.Modifier$Node r10 = r10.a3()
            r11 = r1
        L_0x004f:
            if (r10 == 0) goto L_0x0075
            int r12 = r10.A2()
            r12 = r12 & r6
            if (r12 == 0) goto L_0x0070
            int r11 = r11 + 1
            if (r11 != r9) goto L_0x005e
            r4 = r10
            goto L_0x0070
        L_0x005e:
            if (r8 != 0) goto L_0x0067
            androidx.compose.runtime.collection.MutableVector r8 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r12 = new androidx.compose.ui.Modifier.Node[r5]
            r8.<init>(r12, r1)
        L_0x0067:
            if (r4 == 0) goto L_0x006d
            r8.d(r4)
            r4 = r7
        L_0x006d:
            r8.d(r10)
        L_0x0070:
            androidx.compose.ui.Modifier$Node r10 = r10.w2()
            goto L_0x004f
        L_0x0075:
            if (r11 != r9) goto L_0x0078
            goto L_0x002d
        L_0x0078:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.h(r8)
            goto L_0x002d
        L_0x007d:
            androidx.compose.ui.Modifier$Node r0 = r13.f16833c
            boolean r0 = r0.F2()
            if (r0 == 0) goto L_0x009b
            androidx.compose.runtime.collection.MutableVector r0 = r13.g()
            java.lang.Object[] r2 = r0.f15005z
            int r0 = r0.p()
        L_0x008f:
            if (r1 >= r0) goto L_0x009b
            r3 = r2[r1]
            androidx.compose.ui.input.pointer.Node r3 = (androidx.compose.ui.input.pointer.Node) r3
            r3.e(r14)
            int r1 = r1 + 1
            goto L_0x008f
        L_0x009b:
            r1 = r9
        L_0x009c:
            r13.b(r14)
            r13.j()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.e(androidx.compose.ui.input.pointer.InternalPointerEvent):boolean");
    }

    public boolean f(LongSparseArray longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z2) {
        if (this.f16835e.j() || !this.f16833c.F2()) {
            return false;
        }
        PointerEvent pointerEvent = this.f16837g;
        Intrinsics.f(pointerEvent);
        LayoutCoordinates layoutCoordinates2 = this.f16836f;
        Intrinsics.f(layoutCoordinates2);
        long a2 = layoutCoordinates2.a();
        Modifier.Node node = this.f16833c;
        int a3 = NodeKind.a(16);
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) node).S0(pointerEvent, PointerEventPass.Initial, a2);
            } else if ((node.A2() & a3) != 0 && (node instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node a32 = ((DelegatingNode) node).a3(); a32 != null; a32 = a32.w2()) {
                    if ((a32.A2() & a3) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node = a32;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.d(node);
                                node = null;
                            }
                            mutableVector.d(a32);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            node = DelegatableNodeKt.h(mutableVector);
        }
        if (this.f16833c.F2()) {
            MutableVector g2 = g();
            Object[] objArr = g2.f15005z;
            int p2 = g2.p();
            for (int i3 = 0; i3 < p2; i3++) {
                LongSparseArray longSparseArray2 = this.f16835e;
                LayoutCoordinates layoutCoordinates3 = this.f16836f;
                Intrinsics.f(layoutCoordinates3);
                ((Node) objArr[i3]).f(longSparseArray2, layoutCoordinates3, internalPointerEvent, z2);
            }
        }
        if (this.f16833c.F2()) {
            Modifier.Node node2 = this.f16833c;
            int a4 = NodeKind.a(16);
            MutableVector mutableVector2 = null;
            while (node2 != null) {
                if (node2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) node2).S0(pointerEvent, PointerEventPass.Main, a2);
                } else if ((node2.A2() & a4) != 0 && (node2 instanceof DelegatingNode)) {
                    int i4 = 0;
                    for (Modifier.Node a33 = ((DelegatingNode) node2).a3(); a33 != null; a33 = a33.w2()) {
                        if ((a33.A2() & a4) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node2 = a33;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != null) {
                                    mutableVector2.d(node2);
                                    node2 = null;
                                }
                                mutableVector2.d(a33);
                            }
                        }
                    }
                    if (i4 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.h(mutableVector2);
            }
        }
        return true;
    }

    public void h(long j2, MutableObjectList mutableObjectList) {
        if (this.f16834d.c(j2) && !mutableObjectList.a(this)) {
            this.f16834d.g(j2);
            this.f16835e.n(j2);
        }
        MutableVector g2 = g();
        Object[] objArr = g2.f15005z;
        int p2 = g2.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((Node) objArr[i2]).h(j2, mutableObjectList);
        }
    }

    public final void j() {
        this.f16835e.c();
        this.f16836f = null;
    }

    public final Modifier.Node k() {
        return this.f16833c;
    }

    public final PointerIdArray l() {
        return this.f16834d;
    }

    public final boolean m(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.c().size() != pointerEvent2.c().size()) {
            return true;
        }
        int size = pointerEvent2.c().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Offset.j(((PointerInputChange) pointerEvent.c().get(i2)).h(), ((PointerInputChange) pointerEvent2.c().get(i2)).h())) {
                return true;
            }
        }
        return false;
    }

    public final void n() {
        this.f16839i = true;
    }

    public String toString() {
        return "Node(modifierNode=" + this.f16833c + ", children=" + g() + ", pointerIds=" + this.f16834d + ')';
    }
}
