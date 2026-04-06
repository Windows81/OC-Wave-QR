package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableScatterMap f4828a = ScatterMapKt.c();

    /* renamed from: b  reason: collision with root package name */
    public LazyLayoutKeyIndexMap f4829b;

    /* renamed from: c  reason: collision with root package name */
    public int f4830c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableScatterSet f4831d = ScatterSetKt.a();

    /* renamed from: e  reason: collision with root package name */
    public final List f4832e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List f4833f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final List f4834g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List f4835h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final List f4836i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public DrawModifierNode f4837j;

    /* renamed from: k  reason: collision with root package name */
    public final Modifier f4838k = new DisplayingDisappearingItemsElement(this);

    @Metadata
    public static final class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {

        /* renamed from: z  reason: collision with root package name */
        public final LazyLayoutItemAnimator f4843z;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f4843z = lazyLayoutItemAnimator;
        }

        /* renamed from: c */
        public DisplayingDisappearingItemsNode a() {
            return new DisplayingDisappearingItemsNode(this.f4843z);
        }

        /* renamed from: d */
        public void b(DisplayingDisappearingItemsNode displayingDisappearingItemsNode) {
            displayingDisappearingItemsNode.Z2(this.f4843z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && Intrinsics.d(this.f4843z, ((DisplayingDisappearingItemsElement) obj).f4843z);
        }

        public int hashCode() {
            return this.f4843z.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f4843z + ')';
        }
    }

    @Metadata
    public static final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        public LazyLayoutItemAnimator N;

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.N = lazyLayoutItemAnimator;
        }

        public void I2() {
            this.N.f4837j = this;
        }

        public void J2() {
            this.N.p();
        }

        public void U(ContentDrawScope contentDrawScope) {
            List b2 = this.N.f4836i;
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) b2.get(i2);
                GraphicsLayer p2 = lazyLayoutItemAnimation.p();
                if (p2 != null) {
                    float k2 = ((float) IntOffset.k(lazyLayoutItemAnimation.o())) - ((float) IntOffset.k(p2.y()));
                    float l2 = ((float) IntOffset.l(lazyLayoutItemAnimation.o())) - ((float) IntOffset.l(p2.y()));
                    contentDrawScope.G1().e().d(k2, l2);
                    try {
                        GraphicsLayerKt.a(contentDrawScope, p2);
                    } finally {
                        contentDrawScope.G1().e().d(-k2, -l2);
                    }
                }
            }
            contentDrawScope.q2();
        }

        public final void Z2(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            if (!Intrinsics.d(this.N, lazyLayoutItemAnimator) && M().F2()) {
                this.N.p();
                lazyLayoutItemAnimator.f4837j = this;
                this.N = lazyLayoutItemAnimator;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsNode) && Intrinsics.d(this.N, ((DisplayingDisappearingItemsNode) obj).N);
        }

        public int hashCode() {
            return this.N.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.N + ')';
        }
    }

    @Metadata
    public final class ItemInfo {

        /* renamed from: a  reason: collision with root package name */
        public LazyLayoutItemAnimation[] f4844a = LazyLayoutItemAnimatorKt.f4853a;

        /* renamed from: b  reason: collision with root package name */
        public Constraints f4845b;

        /* renamed from: c  reason: collision with root package name */
        public int f4846c;

        /* renamed from: d  reason: collision with root package name */
        public int f4847d;

        /* renamed from: e  reason: collision with root package name */
        public int f4848e = 1;

        /* renamed from: f  reason: collision with root package name */
        public int f4849f;

        /* renamed from: g  reason: collision with root package name */
        public int f4850g;

        public ItemInfo() {
        }

        public static /* synthetic */ void l(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 32) != 0) {
                i4 = LazyLayoutItemAnimator.this.f(lazyLayoutMeasuredItem);
            }
            itemInfo.k(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i2, i3, i4);
        }

        public final LazyLayoutItemAnimation[] a() {
            return this.f4844a;
        }

        public final Constraints b() {
            return this.f4845b;
        }

        public final int c() {
            return this.f4846c;
        }

        public final int d() {
            return this.f4847d;
        }

        public final int e() {
            return this.f4850g;
        }

        public final int f() {
            return this.f4849f;
        }

        public final int g() {
            return this.f4848e;
        }

        public final boolean h() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.f4844a) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.x()) {
                    return true;
                }
            }
            return false;
        }

        public final void i(int i2) {
            this.f4847d = i2;
        }

        public final void j(int i2) {
            this.f4848e = i2;
        }

        public final void k(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i2, int i3, int i4) {
            if (!h()) {
                this.f4849f = i2;
                this.f4850g = i3;
            }
            int length = this.f4844a.length;
            for (int b2 = lazyLayoutMeasuredItem.b(); b2 < length; b2++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.f4844a[b2];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.y();
                }
            }
            if (this.f4844a.length != lazyLayoutMeasuredItem.b()) {
                Object[] copyOf = Arrays.copyOf(this.f4844a, lazyLayoutMeasuredItem.b());
                Intrinsics.h(copyOf, "copyOf(...)");
                this.f4844a = (LazyLayoutItemAnimation[]) copyOf;
            }
            this.f4845b = Constraints.a(lazyLayoutMeasuredItem.d());
            this.f4846c = i4;
            this.f4847d = lazyLayoutMeasuredItem.c();
            this.f4848e = lazyLayoutMeasuredItem.j();
            int b3 = lazyLayoutMeasuredItem.b();
            LazyLayoutItemAnimator lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i5 = 0; i5 < b3; i5++) {
                LazyLayoutAnimationSpecsNode b4 = LazyLayoutItemAnimatorKt.c(lazyLayoutMeasuredItem.k(i5));
                if (b4 == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.f4844a[i5];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.y();
                    }
                    this.f4844a[i5] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.f4844a[i5];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1(lazyLayoutItemAnimator));
                        this.f4844a[i5] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.C(b4.Z2());
                    lazyLayoutItemAnimation3.I(b4.b3());
                    lazyLayoutItemAnimation3.D(b4.a3());
                }
            }
        }
    }

    public static /* synthetic */ void l(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i2, ItemInfo itemInfo, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            Object e2 = lazyLayoutItemAnimator.f4828a.e(lazyLayoutMeasuredItem.getKey());
            Intrinsics.f(e2);
            itemInfo = (ItemInfo) e2;
        }
        lazyLayoutItemAnimator.k(lazyLayoutMeasuredItem, i2, itemInfo);
    }

    public static /* synthetic */ void r(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        lazyLayoutItemAnimator.q(lazyLayoutMeasuredItem, z2);
    }

    public final LazyLayoutItemAnimation e(Object obj, int i2) {
        LazyLayoutItemAnimation[] a2;
        ItemInfo itemInfo = (ItemInfo) this.f4828a.e(obj);
        if (itemInfo == null || (a2 = itemInfo.a()) == null) {
            return null;
        }
        return a2[i2];
    }

    public final int f(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long m2 = lazyLayoutMeasuredItem.m(0);
        return !lazyLayoutMeasuredItem.l() ? IntOffset.l(m2) : IntOffset.k(m2);
    }

    public final boolean g(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        int b2 = lazyLayoutMeasuredItem.b();
        for (int i2 = 0; i2 < b2; i2++) {
            if (LazyLayoutItemAnimatorKt.c(lazyLayoutMeasuredItem.k(i2)) != null) {
                return true;
            }
        }
        return false;
    }

    public final int h(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long m2 = lazyLayoutMeasuredItem.m(0);
        return lazyLayoutMeasuredItem.l() ? IntOffset.l(m2) : IntOffset.k(m2);
    }

    public final long i() {
        long a2 = IntSize.f19170b.a();
        List list = this.f4836i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i2);
            GraphicsLayer p2 = lazyLayoutItemAnimation.p();
            if (p2 != null) {
                int max = Math.max((int) (a2 >> 32), IntOffset.k(lazyLayoutItemAnimation.s()) + ((int) (p2.x() >> 32)));
                a2 = IntSize.c((((long) Math.max((int) (a2 & 4294967295L), IntOffset.l(lazyLayoutItemAnimation.s()) + ((int) (p2.x() & 4294967295L)))) & 4294967295L) | (((long) max) << 32));
            }
        }
        return a2;
    }

    public final Modifier j() {
        return this.f4838k;
    }

    public final void k(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i2, ItemInfo itemInfo) {
        int i3 = 0;
        long m2 = lazyLayoutMeasuredItem.m(0);
        long h2 = lazyLayoutMeasuredItem.l() ? IntOffset.h(m2, 0, i2, 1, (Object) null) : IntOffset.h(m2, i2, 0, 2, (Object) null);
        LazyLayoutItemAnimation[] a2 = itemInfo.a();
        int length = a2.length;
        int i4 = 0;
        while (i3 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = a2[i3];
            int i5 = i4 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.J(IntOffset.o(h2, IntOffset.n(lazyLayoutMeasuredItem.m(i4), m2)));
            }
            i3++;
            i4 = i5;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x041b, code lost:
        r11.k(r0, r48, r49, r46, r47, r11.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0430, code lost:
        if (r15 >= r6.f4830c) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0432, code lost:
        r6.f4834g.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0438, code lost:
        r6.f4835h.add(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x00ca A[EDGE_INSN: B:223:0x00ca->B:35:0x00ca ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2 A[LOOP:1: B:24:0x008d->B:38:0x00d2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r36, int r37, int r38, java.util.List r39, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r40, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider r41, boolean r42, boolean r43, int r44, boolean r45, int r46, int r47, kotlinx.coroutines.CoroutineScope r48, androidx.compose.ui.graphics.GraphicsContext r49) {
        /*
            r35 = this;
            r6 = r35
            r0 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r44
            r12 = 1
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r13 = r6.f4829b
            r6.f4829b = r10
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r1.size()
            r14 = 0
            r3 = r14
        L_0x001c:
            if (r3 >= r2) goto L_0x002d
            java.lang.Object r4 = r9.get(r3)
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r4 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r4
            boolean r4 = r6.g(r4)
            if (r4 == 0) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            int r3 = r3 + r12
            goto L_0x001c
        L_0x002d:
            androidx.collection.MutableScatterMap r2 = r6.f4828a
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x0039
            r35.n()
            return
        L_0x0039:
            int r2 = r6.f4830c
            java.lang.Object r3 = kotlin.collections.CollectionsKt.g0(r39)
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r3
            if (r3 == 0) goto L_0x0048
            int r3 = r3.getIndex()
            goto L_0x0049
        L_0x0048:
            r3 = r14
        L_0x0049:
            r6.f4830c = r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            if (r42 == 0) goto L_0x0060
            r16 = r13
            long r12 = (long) r14
            long r12 = r12 << r5
            long r14 = (long) r0
            long r3 = r3 & r14
            long r3 = r3 | r12
            long r3 = androidx.compose.ui.unit.IntOffset.f(r3)
            goto L_0x006c
        L_0x0060:
            r16 = r13
            long r12 = (long) r0
            long r12 = r12 << r5
            r0 = 0
            long r14 = (long) r0
            long r3 = r3 & r14
            long r3 = r3 | r12
            long r3 = androidx.compose.ui.unit.IntOffset.f(r3)
        L_0x006c:
            if (r43 != 0) goto L_0x0073
            if (r45 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r12 = 0
            goto L_0x0074
        L_0x0073:
            r12 = 1
        L_0x0074:
            androidx.collection.MutableScatterMap r0 = r6.f4828a
            java.lang.Object[] r5 = r0.f1960b
            long[] r0 = r0.f1959a
            int r13 = r0.length
            r14 = 2
            int r13 = r13 - r14
            r17 = 128(0x80, double:6.32E-322)
            r19 = 255(0xff, double:1.26E-321)
            r21 = 7
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = 8
            if (r13 < 0) goto L_0x00db
            r14 = 0
        L_0x008d:
            r7 = r0[r14]
            long r10 = ~r7
            long r10 = r10 << r21
            long r10 = r10 & r7
            long r10 = r10 & r22
            int r10 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x00cc
            int r10 = r14 - r13
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L_0x00a1:
            if (r11 >= r10) goto L_0x00c3
            long r24 = r7 & r19
            int r24 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r24 >= 0) goto L_0x00b9
            int r24 = r14 << 3
            int r24 = r24 + r11
            r15 = r5[r24]
            r24 = r0
            androidx.collection.MutableScatterSet r0 = r6.f4831d
            r0.h(r15)
            r0 = 8
            goto L_0x00bc
        L_0x00b9:
            r24 = r0
            r0 = r15
        L_0x00bc:
            long r7 = r7 >> r0
            r15 = 1
            int r11 = r11 + r15
            r15 = r0
            r0 = r24
            goto L_0x00a1
        L_0x00c3:
            r24 = r0
            r0 = r15
            r15 = 1
            if (r10 != r0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            r7 = r0
            goto L_0x00dc
        L_0x00cc:
            r24 = r0
            r0 = r15
            r15 = 1
        L_0x00d0:
            if (r14 == r13) goto L_0x00ca
            int r14 = r14 + r15
            r10 = r40
            r11 = r44
            r15 = r0
            r0 = r24
            goto L_0x008d
        L_0x00db:
            r7 = r15
        L_0x00dc:
            int r0 = r1.size()
            r1 = 0
        L_0x00e1:
            r8 = -1
            if (r1 >= r0) goto L_0x0222
            java.lang.Object r5 = r9.get(r1)
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r5 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r5
            androidx.collection.MutableScatterSet r11 = r6.f4831d
            java.lang.Object r13 = r5.getKey()
            r11.y(r13)
            boolean r11 = r6.g(r5)
            if (r11 == 0) goto L_0x020f
            androidx.collection.MutableScatterMap r11 = r6.f4828a
            java.lang.Object r13 = r5.getKey()
            java.lang.Object r11 = r11.e(r13)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r11 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r11
            if (r16 == 0) goto L_0x0112
            java.lang.Object r13 = r5.getKey()
            r14 = r16
            int r13 = r14.e(r13)
            goto L_0x0115
        L_0x0112:
            r14 = r16
            r13 = r8
        L_0x0115:
            if (r13 != r8) goto L_0x011c
            if (r14 == 0) goto L_0x011c
            r16 = 1
            goto L_0x011e
        L_0x011c:
            r16 = 0
        L_0x011e:
            if (r11 != 0) goto L_0x0188
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r10 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo
            r10.<init>()
            r31 = 32
            r32 = 0
            r30 = 0
            r24 = r10
            r25 = r5
            r26 = r48
            r27 = r49
            r28 = r46
            r29 = r47
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.l(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.collection.MutableScatterMap r11 = r6.f4828a
            java.lang.Object r15 = r5.getKey()
            r11.x(r15, r10)
            int r11 = r5.getIndex()
            if (r11 == r13) goto L_0x015b
            if (r13 == r8) goto L_0x015b
            if (r13 >= r2) goto L_0x0155
            java.util.List r8 = r6.f4832e
            r8.add(r5)
        L_0x0152:
            r10 = 1
            goto L_0x0219
        L_0x0155:
            java.util.List r8 = r6.f4833f
            r8.add(r5)
            goto L_0x0152
        L_0x015b:
            r8 = 0
            long r24 = r5.m(r8)
            boolean r8 = r5.l()
            if (r8 == 0) goto L_0x016b
            int r8 = androidx.compose.ui.unit.IntOffset.l(r24)
            goto L_0x016f
        L_0x016b:
            int r8 = androidx.compose.ui.unit.IntOffset.k(r24)
        L_0x016f:
            r6.k(r5, r8, r10)
            if (r16 == 0) goto L_0x0152
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r5 = r10.a()
            int r8 = r5.length
            r10 = 0
        L_0x017a:
            if (r10 >= r8) goto L_0x0152
            r11 = r5[r10]
            if (r11 == 0) goto L_0x0185
            r11.k()
            kotlin.Unit r11 = kotlin.Unit.f40552a
        L_0x0185:
            r11 = 1
            int r10 = r10 + r11
            goto L_0x017a
        L_0x0188:
            if (r12 == 0) goto L_0x0152
            r31 = 32
            r32 = 0
            r30 = 0
            r24 = r11
            r25 = r5
            r26 = r48
            r27 = r49
            r28 = r46
            r29 = r47
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.l(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r8 = r11.a()
            int r13 = r8.length
            r15 = 0
        L_0x01a5:
            if (r15 >= r13) goto L_0x01dd
            r7 = r8[r15]
            if (r7 == 0) goto L_0x01cc
            r25 = r11
            long r10 = r7.s()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$Companion r26 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.f4799s
            r27 = r8
            long r8 = r26.a()
            boolean r8 = androidx.compose.ui.unit.IntOffset.j(r10, r8)
            if (r8 != 0) goto L_0x01ca
            long r8 = r7.s()
            long r8 = androidx.compose.ui.unit.IntOffset.o(r8, r3)
            r7.J(r8)
        L_0x01ca:
            r7 = 1
            goto L_0x01d1
        L_0x01cc:
            r27 = r8
            r25 = r11
            goto L_0x01ca
        L_0x01d1:
            int r8 = r15 + 1
            r9 = r39
            r15 = r8
            r11 = r25
            r8 = r27
            r7 = 8
            goto L_0x01a5
        L_0x01dd:
            r25 = r11
            if (r16 == 0) goto L_0x0207
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r7 = r25.a()
            int r8 = r7.length
            r9 = 0
        L_0x01e7:
            if (r9 >= r8) goto L_0x0207
            r10 = r7[r9]
            if (r10 == 0) goto L_0x0204
            boolean r11 = r10.v()
            if (r11 == 0) goto L_0x0201
            java.util.List r11 = r6.f4836i
            r11.remove(r10)
            androidx.compose.ui.node.DrawModifierNode r11 = r6.f4837j
            if (r11 == 0) goto L_0x0201
            androidx.compose.ui.node.DrawModifierNodeKt.a(r11)
            kotlin.Unit r11 = kotlin.Unit.f40552a
        L_0x0201:
            r10.k()
        L_0x0204:
            r10 = 1
            int r9 = r9 + r10
            goto L_0x01e7
        L_0x0207:
            r10 = 1
            r7 = 0
            r8 = 2
            r9 = 0
            r(r6, r5, r7, r8, r9)
            goto L_0x0219
        L_0x020f:
            r14 = r16
            r10 = 1
            java.lang.Object r5 = r5.getKey()
            r6.o(r5)
        L_0x0219:
            int r1 = r1 + r10
            r9 = r39
            r16 = r14
            r7 = 8
            goto L_0x00e1
        L_0x0222:
            r7 = r44
            r14 = r16
            int[] r9 = new int[r7]
            if (r12 == 0) goto L_0x02e4
            if (r14 == 0) goto L_0x02e4
            java.util.List r0 = r6.f4832e
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0285
            java.util.List r0 = r6.f4832e
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0247
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1 r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1
            r1.<init>(r14)
            kotlin.collections.CollectionsKt.A(r0, r1)
        L_0x0247:
            java.util.List r10 = r6.f4832e
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            int r11 = r0.size()
            r13 = 0
        L_0x0251:
            if (r13 >= r11) goto L_0x0276
            java.lang.Object r0 = r10.get(r13)
            r5 = r0
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r5 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r5
            int r0 = r6.s(r9, r5)
            int r2 = r46 - r0
            r4 = 4
            r16 = 0
            r3 = 0
            r0 = r35
            r1 = r5
            r15 = r5
            r5 = r16
            l(r0, r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 2
            r2 = 0
            r(r6, r15, r0, r1, r2)
            r0 = 1
            int r13 = r13 + r0
            goto L_0x0251
        L_0x0276:
            r29 = 6
            r30 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r25 = r9
            kotlin.collections.ArraysKt.x(r25, r26, r27, r28, r29, r30)
        L_0x0285:
            java.util.List r0 = r6.f4833f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02e4
            java.util.List r0 = r6.f4833f
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x02a0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1 r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1
            r1.<init>(r14)
            kotlin.collections.CollectionsKt.A(r0, r1)
        L_0x02a0:
            java.util.List r10 = r6.f4833f
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            int r11 = r0.size()
            r13 = 0
        L_0x02aa:
            if (r13 >= r11) goto L_0x02d5
            java.lang.Object r0 = r10.get(r13)
            r5 = r0
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r5 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r5
            int r0 = r6.s(r9, r5)
            int r0 = r47 + r0
            int r1 = r5.h()
            int r2 = r0 - r1
            r4 = 4
            r16 = 0
            r3 = 0
            r0 = r35
            r1 = r5
            r15 = r5
            r5 = r16
            l(r0, r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 2
            r2 = 0
            r(r6, r15, r0, r1, r2)
            r0 = 1
            int r13 = r13 + r0
            goto L_0x02aa
        L_0x02d5:
            r29 = 6
            r30 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r25 = r9
            kotlin.collections.ArraysKt.x(r25, r26, r27, r28, r29, r30)
        L_0x02e4:
            androidx.collection.MutableScatterSet r0 = r6.f4831d
            java.lang.Object[] r1 = r0.f1967b
            long[] r0 = r0.f1966a
            int r2 = r0.length
            r3 = 2
            int r2 = r2 - r3
            if (r2 < 0) goto L_0x047b
            r3 = 0
        L_0x02f0:
            r4 = r0[r3]
            long r10 = ~r4
            long r10 = r10 << r21
            long r10 = r10 & r4
            long r10 = r10 & r22
            int r10 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x0464
            int r10 = r3 - r2
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r25 = r4
            r4 = 0
        L_0x0308:
            if (r4 >= r10) goto L_0x0456
            long r27 = r25 & r19
            int r5 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r5 >= 0) goto L_0x0440
            int r5 = r3 << 3
            int r5 = r5 + r4
            r5 = r1[r5]
            androidx.collection.MutableScatterMap r11 = r6.f4828a
            java.lang.Object r11 = r11.e(r5)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r11 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r11
            if (r11 != 0) goto L_0x0321
            goto L_0x0440
        L_0x0321:
            r13 = r40
            int r15 = r13.e(r5)
            int r8 = r11.g()
            int r8 = java.lang.Math.min(r7, r8)
            r11.j(r8)
            int r8 = r11.g()
            int r8 = r7 - r8
            r16 = r0
            int r0 = r11.d()
            int r0 = java.lang.Math.min(r8, r0)
            r11.i(r0)
            r0 = -1
            if (r15 != r0) goto L_0x03cb
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r8 = r11.a()
            int r15 = r8.length
            r0 = 0
            r27 = 0
            r28 = 0
        L_0x0352:
            if (r0 >= r15) goto L_0x03c0
            r34 = r1
            r1 = r8[r0]
            r29 = 1
            int r30 = r27 + 1
            r29 = r15
            if (r1 == 0) goto L_0x038b
            boolean r31 = r1.v()
            if (r31 == 0) goto L_0x036c
        L_0x0366:
            r1 = 1
            r24 = 0
            r28 = 1
            goto L_0x03b8
        L_0x036c:
            boolean r31 = r1.u()
            if (r31 == 0) goto L_0x038e
            r1.y()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r31 = r11.a()
            r24 = 0
            r31[r27] = r24
            java.util.List r15 = r6.f4836i
            r15.remove(r1)
            androidx.compose.ui.node.DrawModifierNode r1 = r6.f4837j
            if (r1 == 0) goto L_0x038b
            androidx.compose.ui.node.DrawModifierNodeKt.a(r1)
            kotlin.Unit r1 = kotlin.Unit.f40552a
        L_0x038b:
            r24 = 0
            goto L_0x03b7
        L_0x038e:
            androidx.compose.ui.graphics.layer.GraphicsLayer r15 = r1.p()
            if (r15 == 0) goto L_0x0397
            r1.l()
        L_0x0397:
            boolean r15 = r1.v()
            if (r15 == 0) goto L_0x03ac
            java.util.List r15 = r6.f4836i
            r15.add(r1)
            androidx.compose.ui.node.DrawModifierNode r1 = r6.f4837j
            if (r1 == 0) goto L_0x0366
            androidx.compose.ui.node.DrawModifierNodeKt.a(r1)
            kotlin.Unit r1 = kotlin.Unit.f40552a
            goto L_0x0366
        L_0x03ac:
            r1.y()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r1 = r11.a()
            r24 = 0
            r1[r27] = r24
        L_0x03b7:
            r1 = 1
        L_0x03b8:
            int r0 = r0 + r1
            r15 = r29
            r27 = r30
            r1 = r34
            goto L_0x0352
        L_0x03c0:
            r34 = r1
            r24 = 0
            if (r28 != 0) goto L_0x043d
            r6.o(r5)
            goto L_0x043d
        L_0x03cb:
            r34 = r1
            r24 = 0
            androidx.compose.ui.unit.Constraints r0 = r11.b()
            kotlin.jvm.internal.Intrinsics.f(r0)
            long r31 = r0.r()
            int r29 = r11.d()
            int r30 = r11.g()
            r27 = r41
            r28 = r15
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r0 = r27.a(r28, r29, r30, r31)
            r1 = 1
            r0.g(r1)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r8 = r11.a()
            int r1 = r8.length
            r7 = 0
        L_0x03f4:
            if (r7 >= r1) goto L_0x040f
            r27 = r8[r7]
            r28 = r1
            if (r27 == 0) goto L_0x0406
            boolean r1 = r27.w()
            r42 = r8
            r8 = 1
            if (r1 != r8) goto L_0x0409
            goto L_0x041b
        L_0x0406:
            r42 = r8
            r8 = 1
        L_0x0409:
            int r7 = r7 + r8
            r8 = r42
            r1 = r28
            goto L_0x03f4
        L_0x040f:
            if (r14 == 0) goto L_0x041b
            int r7 = r14.e(r5)
            if (r15 != r7) goto L_0x041b
            r6.o(r5)
            goto L_0x043d
        L_0x041b:
            int r33 = r11.c()
            r27 = r11
            r28 = r0
            r29 = r48
            r30 = r49
            r31 = r46
            r32 = r47
            r27.k(r28, r29, r30, r31, r32, r33)
            int r5 = r6.f4830c
            if (r15 >= r5) goto L_0x0438
            java.util.List r5 = r6.f4834g
            r5.add(r0)
            goto L_0x043d
        L_0x0438:
            java.util.List r5 = r6.f4835h
            r5.add(r0)
        L_0x043d:
            r0 = 8
            goto L_0x0449
        L_0x0440:
            r13 = r40
            r16 = r0
            r34 = r1
            r24 = 0
            goto L_0x043d
        L_0x0449:
            long r25 = r25 >> r0
            r1 = 1
            int r4 = r4 + r1
            r7 = r44
            r0 = r16
            r1 = r34
            r8 = -1
            goto L_0x0308
        L_0x0456:
            r13 = r40
            r16 = r0
            r34 = r1
            r0 = 8
            r1 = 1
            r24 = 0
            if (r10 != r0) goto L_0x047d
            goto L_0x046f
        L_0x0464:
            r13 = r40
            r16 = r0
            r34 = r1
            r0 = 8
            r1 = 1
            r24 = 0
        L_0x046f:
            if (r3 == r2) goto L_0x047d
            int r3 = r3 + r1
            r7 = r44
            r0 = r16
            r1 = r34
            r8 = -1
            goto L_0x02f0
        L_0x047b:
            r13 = r40
        L_0x047d:
            java.util.List r0 = r6.f4834g
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04f6
            java.util.List r0 = r6.f4834g
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0498
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2 r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2
            r1.<init>(r13)
            kotlin.collections.CollectionsKt.A(r0, r1)
        L_0x0498:
            java.util.List r0 = r6.f4834g
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
        L_0x04a2:
            if (r2 >= r1) goto L_0x04e2
            java.lang.Object r3 = r0.get(r2)
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r3
            androidx.collection.MutableScatterMap r4 = r6.f4828a
            java.lang.Object r5 = r3.getKey()
            java.lang.Object r4 = r4.e(r5)
            kotlin.jvm.internal.Intrinsics.f(r4)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r4 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r4
            int r5 = r6.s(r9, r3)
            if (r43 == 0) goto L_0x04ca
            java.lang.Object r7 = kotlin.collections.CollectionsKt.e0(r39)
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r7 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r7
            int r7 = r6.h(r7)
            goto L_0x04ce
        L_0x04ca:
            int r7 = r4.f()
        L_0x04ce:
            int r7 = r7 - r5
            int r4 = r4.c()
            r5 = r37
            r8 = r38
            r3.o(r7, r4, r5, r8)
            r4 = 1
            if (r12 == 0) goto L_0x04e0
            r6.q(r3, r4)
        L_0x04e0:
            int r2 = r2 + r4
            goto L_0x04a2
        L_0x04e2:
            r5 = r37
            r8 = r38
            r29 = 6
            r30 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r25 = r9
            kotlin.collections.ArraysKt.x(r25, r26, r27, r28, r29, r30)
            goto L_0x04fa
        L_0x04f6:
            r5 = r37
            r8 = r38
        L_0x04fa:
            java.util.List r0 = r6.f4835h
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0565
            java.util.List r0 = r6.f4835h
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0515
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2 r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2
            r1.<init>(r13)
            kotlin.collections.CollectionsKt.A(r0, r1)
        L_0x0515:
            java.util.List r0 = r6.f4835h
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
        L_0x051f:
            if (r2 >= r1) goto L_0x0565
            java.lang.Object r3 = r0.get(r2)
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r3
            androidx.collection.MutableScatterMap r4 = r6.f4828a
            java.lang.Object r7 = r3.getKey()
            java.lang.Object r4 = r4.e(r7)
            kotlin.jvm.internal.Intrinsics.f(r4)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r4 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r4
            int r7 = r6.s(r9, r3)
            if (r43 == 0) goto L_0x054c
            java.lang.Object r10 = kotlin.collections.CollectionsKt.p0(r39)
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r10
            int r11 = r6.h(r10)
            int r10 = r10.h()
            int r11 = r11 + r10
            goto L_0x0550
        L_0x054c:
            int r11 = r4.e()
        L_0x0550:
            int r10 = r3.h()
            int r11 = r11 - r10
            int r11 = r11 + r7
            int r4 = r4.c()
            r3.o(r11, r4, r5, r8)
            r4 = 1
            if (r12 == 0) goto L_0x0563
            r6.q(r3, r4)
        L_0x0563:
            int r2 = r2 + r4
            goto L_0x051f
        L_0x0565:
            java.util.List r0 = r6.f4834g
            kotlin.collections.CollectionsKt.U(r0)
            kotlin.Unit r1 = kotlin.Unit.f40552a
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r39
            r2 = 0
            r1.addAll(r2, r0)
            java.util.List r0 = r6.f4835h
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.List r0 = r6.f4832e
            r0.clear()
            java.util.List r0 = r6.f4833f
            r0.clear()
            java.util.List r0 = r6.f4834g
            r0.clear()
            java.util.List r0 = r6.f4835h
            r0.clear()
            androidx.collection.MutableScatterSet r0 = r6.f4831d
            r0.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.m(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider, boolean, boolean, int, boolean, int, int, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.graphics.GraphicsContext):void");
    }

    public final void n() {
        if (this.f4828a.i()) {
            MutableScatterMap mutableScatterMap = this.f4828a;
            Object[] objArr = mutableScatterMap.f1961c;
            long[] jArr = mutableScatterMap.f1959a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i2 << 3) + i4]).a()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.y();
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            this.f4828a.k();
        }
    }

    public final void o(Object obj) {
        LazyLayoutItemAnimation[] a2;
        ItemInfo itemInfo = (ItemInfo) this.f4828a.u(obj);
        if (itemInfo != null && (a2 = itemInfo.a()) != null) {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : a2) {
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.y();
                }
            }
        }
    }

    public final void p() {
        n();
        this.f4829b = null;
        this.f4830c = -1;
    }

    public final void q(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z2) {
        Object e2 = this.f4828a.e(lazyLayoutMeasuredItem.getKey());
        Intrinsics.f(e2);
        LazyLayoutItemAnimation[] a2 = ((ItemInfo) e2).a();
        int length = a2.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = a2[i2];
            int i4 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                long m2 = lazyLayoutMeasuredItem.m(i3);
                long s2 = lazyLayoutItemAnimation.s();
                if (!IntOffset.j(s2, LazyLayoutItemAnimation.f4799s.a()) && !IntOffset.j(s2, m2)) {
                    lazyLayoutItemAnimation.m(IntOffset.n(m2, s2), z2);
                }
                lazyLayoutItemAnimation.J(m2);
            }
            i2++;
            i3 = i4;
        }
    }

    public final int s(int[] iArr, LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        int c2 = lazyLayoutMeasuredItem.c();
        int j2 = lazyLayoutMeasuredItem.j() + c2;
        int i2 = 0;
        while (c2 < j2) {
            int h2 = iArr[c2] + lazyLayoutMeasuredItem.h();
            iArr[c2] = h2;
            i2 = Math.max(i2, h2);
            c2++;
        }
        return i2;
    }
}
