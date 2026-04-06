package androidx.compose.ui.input.pointer;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HitPathTracker {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutCoordinates f16809a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16810b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16811c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16812d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16813e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableObjectList f16814f = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public final NodeParent f16815g = new NodeParent();

    /* renamed from: h  reason: collision with root package name */
    public final MutableLongObjectMap f16816h = new MutableLongObjectMap(10);

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.f16809a = layoutCoordinates;
    }

    public final void b(long j2, List list, boolean z2) {
        Node node;
        long j3 = j2;
        List list2 = list;
        NodeParent nodeParent = this.f16815g;
        this.f16816h.g();
        int size = list2.size();
        boolean z3 = true;
        for (int i2 = 0; i2 < size; i2++) {
            Modifier.Node node2 = (Modifier.Node) list2.get(i2);
            if (node2.F2()) {
                node2.R2(new HitPathTracker$addHitPath$1(this, node2));
                if (z3) {
                    MutableVector g2 = nodeParent.g();
                    Object[] objArr = g2.f15005z;
                    int p2 = g2.p();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= p2) {
                            node = null;
                            break;
                        }
                        node = objArr[i3];
                        if (Intrinsics.d(((Node) node).k(), node2)) {
                            break;
                        }
                        i3++;
                    }
                    Node node3 = node;
                    if (node3 != null) {
                        node3.n();
                        node3.l().a(j3);
                        MutableLongObjectMap mutableLongObjectMap = this.f16816h;
                        Object b2 = mutableLongObjectMap.b(j3);
                        if (b2 == null) {
                            b2 = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
                            mutableLongObjectMap.r(j3, b2);
                        }
                        ((MutableObjectList) b2).n(node3);
                        nodeParent = node3;
                    } else {
                        z3 = false;
                    }
                }
                Node node4 = new Node(node2);
                node4.l().a(j3);
                MutableLongObjectMap mutableLongObjectMap2 = this.f16816h;
                Object b3 = mutableLongObjectMap2.b(j3);
                if (b3 == null) {
                    b3 = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
                    mutableLongObjectMap2.r(j3, b3);
                }
                ((MutableObjectList) b3).n(node4);
                nodeParent.g().d(node4);
                nodeParent = node4;
            }
        }
        if (z2) {
            MutableLongObjectMap mutableLongObjectMap3 = this.f16816h;
            long[] jArr = mutableLongObjectMap3.f1830b;
            Object[] objArr2 = mutableLongObjectMap3.f1831c;
            long[] jArr2 = mutableLongObjectMap3.f1829a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j4 = jArr2[i4];
                    if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j4) < 128) {
                                int i7 = (i4 << 3) + i6;
                                f(jArr[i7], (MutableObjectList) objArr2[i7]);
                            }
                            j4 >>= 8;
                        }
                        if (i5 != 8) {
                            return;
                        }
                    }
                    if (i4 != length) {
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.f16812d) {
            this.f16812d = true;
        } else {
            this.f16815g.c();
        }
    }

    public final boolean d(InternalPointerEvent internalPointerEvent, boolean z2) {
        if (!this.f16815g.a(internalPointerEvent.b(), this.f16809a, internalPointerEvent, z2)) {
            return false;
        }
        boolean z3 = true;
        this.f16810b = true;
        boolean f2 = this.f16815g.f(internalPointerEvent.b(), this.f16809a, internalPointerEvent, z2);
        if (!this.f16815g.e(internalPointerEvent) && !f2) {
            z3 = false;
        }
        this.f16810b = false;
        if (this.f16813e) {
            this.f16813e = false;
            int e2 = this.f16814f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                g((Modifier.Node) this.f16814f.d(i2));
            }
            this.f16814f.t();
        }
        if (this.f16811c) {
            this.f16811c = false;
            e();
        }
        if (this.f16812d) {
            this.f16812d = false;
            c();
        }
        return z3;
    }

    public final void e() {
        if (this.f16810b) {
            this.f16811c = true;
            return;
        }
        this.f16815g.d();
        c();
    }

    public final void f(long j2, MutableObjectList mutableObjectList) {
        this.f16815g.h(j2, mutableObjectList);
    }

    public final void g(Modifier.Node node) {
        if (this.f16810b) {
            this.f16813e = true;
            this.f16814f.n(node);
            return;
        }
        this.f16815g.i(node);
    }
}
