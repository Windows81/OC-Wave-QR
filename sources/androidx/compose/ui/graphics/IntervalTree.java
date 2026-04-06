package androidx.compose.ui.graphics;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IntervalTree<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Node f16031a;

    /* renamed from: b  reason: collision with root package name */
    public Node f16032b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f16033c = new ArrayList();

    @Metadata
    public final class Node extends Interval<T> {

        /* renamed from: d  reason: collision with root package name */
        public int f16034d;

        /* renamed from: e  reason: collision with root package name */
        public float f16035e;

        /* renamed from: f  reason: collision with root package name */
        public float f16036f;

        /* renamed from: g  reason: collision with root package name */
        public Node f16037g;

        /* renamed from: h  reason: collision with root package name */
        public Node f16038h;

        /* renamed from: i  reason: collision with root package name */
        public Node f16039i;

        public Node(float f2, float f3, Object obj, int i2) {
            super(f2, f3, obj);
            this.f16034d = i2;
            this.f16035e = f2;
            this.f16036f = f3;
            Node node = IntervalTree.this.f16031a;
            this.f16037g = node;
            this.f16038h = node;
            this.f16039i = node;
        }

        public final int e() {
            return this.f16034d;
        }

        public final Node f() {
            return this.f16037g;
        }

        public final float g() {
            return this.f16036f;
        }

        public final float h() {
            return this.f16035e;
        }

        public final Node i() {
            return this.f16039i;
        }

        public final Node j() {
            return this.f16038h;
        }

        public final Node k() {
            Node node = this;
            while (true) {
                Node node2 = node.f16037g;
                if (node2 == IntervalTree.this.f16031a) {
                    return node;
                }
                node = node2;
            }
        }

        public final Node l() {
            Node node = this.f16038h;
            if (node != IntervalTree.this.f16031a) {
                return node.k();
            }
            Node node2 = this.f16039i;
            Node node3 = this;
            while (node2 != IntervalTree.this.f16031a && node3 == node2.f16038h) {
                node3 = node2;
                node2 = node2.f16039i;
            }
            return node2;
        }

        public final void m(int i2) {
            this.f16034d = i2;
        }

        public final void n(Node node) {
            this.f16037g = node;
        }

        public final void o(float f2) {
            this.f16036f = f2;
        }

        public final void p(float f2) {
            this.f16035e = f2;
        }

        public final void q(Node node) {
            this.f16039i = node;
        }

        public final void r(Node node) {
            this.f16038h = node;
        }
    }

    public IntervalTree() {
        Node node = new Node(Float.MAX_VALUE, Float.MIN_VALUE, (Object) null, 1);
        this.f16031a = node;
        this.f16032b = node;
    }

    public static /* synthetic */ Interval d(IntervalTree intervalTree, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        return intervalTree.c(f2, f3);
    }

    public final void a(float f2, float f3, Object obj) {
        Node node = new Node(f2, f3, obj, 0);
        Node node2 = this.f16031a;
        for (Node node3 = this.f16032b; node3 != this.f16031a; node3 = node.c() <= node3.c() ? node3.f() : node3.j()) {
            node2 = node3;
        }
        node.q(node2);
        if (node2 == this.f16031a) {
            this.f16032b = node;
        } else if (node.c() <= node2.c()) {
            node2.n(node);
        } else {
            node2.r(node);
        }
        h(node);
        e(node);
    }

    public final boolean b(float f2) {
        return c(f2, f2) != IntervalTreeKt.a();
    }

    public final Interval c(float f2, float f3) {
        Node node = this.f16032b;
        Node node2 = this.f16031a;
        if (!(node == node2 || node == node2)) {
            ArrayList arrayList = this.f16033c;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                Node node3 = (Node) arrayList.remove(arrayList.size() - 1);
                if (node3.d(f2, f3)) {
                    return node3;
                }
                if (node3.f() != this.f16031a && node3.f().g() >= f2) {
                    arrayList.add(node3.f());
                }
                if (node3.j() != this.f16031a && node3.j().h() <= f3) {
                    arrayList.add(node3.j());
                }
            }
            arrayList.clear();
        }
        Interval a2 = IntervalTreeKt.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return a2;
    }

    public final void e(Node node) {
        while (node != this.f16032b && node.i().e() == 0) {
            Node i2 = node.i().i();
            if (node.i() == i2.f()) {
                Node j2 = i2.j();
                if (j2.e() == 0) {
                    j2.m(1);
                    node.i().m(1);
                    i2.m(0);
                } else {
                    if (node == node.i().j()) {
                        node = node.i();
                        f(node);
                    }
                    node.i().m(1);
                    i2.m(0);
                    g(i2);
                }
            } else {
                Node f2 = i2.f();
                if (f2.e() == 0) {
                    f2.m(1);
                    node.i().m(1);
                    i2.m(0);
                } else {
                    if (node == node.i().f()) {
                        node = node.i();
                        g(node);
                    }
                    node.i().m(1);
                    i2.m(0);
                    f(i2);
                }
            }
            node = i2;
        }
        this.f16032b.m(1);
    }

    public final void f(Node node) {
        Node j2 = node.j();
        node.r(j2.f());
        if (j2.f() != this.f16031a) {
            j2.f().q(node);
        }
        j2.q(node.i());
        if (node.i() == this.f16031a) {
            this.f16032b = j2;
        } else if (node.i().f() == node) {
            node.i().n(j2);
        } else {
            node.i().r(j2);
        }
        j2.n(node);
        node.q(j2);
        h(node);
    }

    public final void g(Node node) {
        Node f2 = node.f();
        node.n(f2.j());
        if (f2.j() != this.f16031a) {
            f2.j().q(node);
        }
        f2.q(node.i());
        if (node.i() == this.f16031a) {
            this.f16032b = f2;
        } else if (node.i().j() == node) {
            node.i().r(f2);
        } else {
            node.i().n(f2);
        }
        f2.r(node);
        node.q(f2);
        h(node);
    }

    public final void h(Node node) {
        while (node != this.f16031a) {
            node.p(Math.min(node.c(), Math.min(node.f().h(), node.j().h())));
            node.o(Math.max(node.b(), Math.max(node.f().g(), node.j().g())));
            node = node.i();
        }
    }
}
