package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class NodeParent {

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f16841a = new MutableVector(new Node[16], 0);

    /* renamed from: b  reason: collision with root package name */
    public final MutableObjectList f16842b = new MutableObjectList(10);

    public boolean a(LongSparseArray longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z2) {
        MutableVector mutableVector = this.f16841a;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        boolean z3 = false;
        for (int i2 = 0; i2 < p2; i2++) {
            z3 = ((Node) objArr[i2]).a(longSparseArray, layoutCoordinates, internalPointerEvent, z2) || z3;
        }
        return z3;
    }

    public void b(InternalPointerEvent internalPointerEvent) {
        int p2 = this.f16841a.p();
        while (true) {
            p2--;
            if (-1 >= p2) {
                return;
            }
            if (((Node) this.f16841a.f15005z[p2]).l().f()) {
                this.f16841a.y(p2);
            }
        }
    }

    public final void c() {
        this.f16841a.l();
    }

    public void d() {
        MutableVector mutableVector = this.f16841a;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((Node) objArr[i2]).d();
        }
    }

    public boolean e(InternalPointerEvent internalPointerEvent) {
        MutableVector mutableVector = this.f16841a;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        boolean z2 = false;
        for (int i2 = 0; i2 < p2; i2++) {
            z2 = ((Node) objArr[i2]).e(internalPointerEvent) || z2;
        }
        b(internalPointerEvent);
        return z2;
    }

    public boolean f(LongSparseArray longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z2) {
        MutableVector mutableVector = this.f16841a;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        boolean z3 = false;
        for (int i2 = 0; i2 < p2; i2++) {
            z3 = ((Node) objArr[i2]).f(longSparseArray, layoutCoordinates, internalPointerEvent, z2) || z3;
        }
        return z3;
    }

    public final MutableVector g() {
        return this.f16841a;
    }

    public void h(long j2, MutableObjectList mutableObjectList) {
        MutableVector mutableVector = this.f16841a;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((Node) objArr[i2]).h(j2, mutableObjectList);
        }
    }

    public void i(Modifier.Node node) {
        this.f16842b.t();
        this.f16842b.n(this);
        while (this.f16842b.h()) {
            MutableObjectList mutableObjectList = this.f16842b;
            NodeParent nodeParent = (NodeParent) mutableObjectList.A(mutableObjectList.e() - 1);
            int i2 = 0;
            while (i2 < nodeParent.f16841a.p()) {
                Node node2 = (Node) nodeParent.f16841a.f15005z[i2];
                if (Intrinsics.d(node2.k(), node)) {
                    nodeParent.f16841a.v(node2);
                    node2.d();
                } else {
                    this.f16842b.n(node2);
                    i2++;
                }
            }
        }
    }
}
