package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OnPositionedDispatcher {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f17422c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f17423d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f17424a = new MutableVector(new LayoutNode[16], 0);

    /* renamed from: b  reason: collision with root package name */
    public LayoutNode[] f17425b;

    @Metadata
    public static final class Companion {

        @Metadata
        public static final class DepthComparator implements Comparator<LayoutNode> {

            /* renamed from: z  reason: collision with root package name */
            public static final DepthComparator f17426z = new DepthComparator();

            /* renamed from: a */
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int k2 = Intrinsics.k(layoutNode2.Q(), layoutNode.Q());
                return k2 != 0 ? k2 : Intrinsics.k(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r2 < r0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            androidx.compose.runtime.collection.MutableVector r0 = r4.f17424a
            androidx.compose.ui.node.OnPositionedDispatcher$Companion$DepthComparator r1 = androidx.compose.ui.node.OnPositionedDispatcher.Companion.DepthComparator.f17426z
            r0.E(r1)
            androidx.compose.runtime.collection.MutableVector r0 = r4.f17424a
            int r0 = r0.p()
            androidx.compose.ui.node.LayoutNode[] r1 = r4.f17425b
            if (r1 == 0) goto L_0x0014
            int r2 = r1.length
            if (r2 >= r0) goto L_0x0022
        L_0x0014:
            androidx.compose.runtime.collection.MutableVector r1 = r4.f17424a
            int r1 = r1.p()
            r2 = 16
            int r1 = java.lang.Math.max(r2, r1)
            androidx.compose.ui.node.LayoutNode[] r1 = new androidx.compose.ui.node.LayoutNode[r1]
        L_0x0022:
            r2 = 0
            r4.f17425b = r2
            r2 = 0
        L_0x0026:
            if (r2 >= r0) goto L_0x0033
            androidx.compose.runtime.collection.MutableVector r3 = r4.f17424a
            java.lang.Object[] r3 = r3.f15005z
            r3 = r3[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0033:
            androidx.compose.runtime.collection.MutableVector r2 = r4.f17424a
            r2.l()
            int r0 = r0 + -1
        L_0x003a:
            r2 = -1
            if (r2 >= r0) goto L_0x004e
            r2 = r1[r0]
            kotlin.jvm.internal.Intrinsics.f(r2)
            boolean r3 = r2.t0()
            if (r3 == 0) goto L_0x004b
            r4.b(r2)
        L_0x004b:
            int r0 = r0 + -1
            goto L_0x003a
        L_0x004e:
            r4.f17425b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.OnPositionedDispatcher.a():void");
    }

    public final void b(LayoutNode layoutNode) {
        layoutNode.E();
        layoutNode.S1(false);
        MutableVector J0 = layoutNode.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            b((LayoutNode) objArr[i2]);
        }
    }

    public final boolean c() {
        return this.f17424a.p() != 0;
    }

    public final void d(LayoutNode layoutNode) {
        this.f17424a.d(layoutNode);
        layoutNode.S1(true);
    }

    public final void e(LayoutNode layoutNode) {
        this.f17424a.l();
        this.f17424a.d(layoutNode);
        layoutNode.S1(true);
    }

    public final void f(LayoutNode layoutNode) {
        this.f17424a.v(layoutNode);
    }
}
