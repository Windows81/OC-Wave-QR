package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    public final transient Reference D;
    public final transient GeneralRange E;
    public final transient AvlNode F;

    /* renamed from: com.google.common.collect.TreeMultiset$4  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28620a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28620a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28620a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeMultiset.AnonymousClass4.<clinit>():void");
        }
    }

    public enum Aggregate {
        SIZE {
            public int f(AvlNode avlNode) {
                return avlNode.f28625b;
            }

            public long h(AvlNode avlNode) {
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.f28627d;
            }
        },
        DISTINCT {
            public int f(AvlNode avlNode) {
                return 1;
            }

            public long h(AvlNode avlNode) {
                if (avlNode == null) {
                    return 0;
                }
                return (long) avlNode.f28626c;
            }
        };

        public abstract int f(AvlNode avlNode);

        public abstract long h(AvlNode avlNode);
    }

    public static final class AvlNode<E> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f28624a;

        /* renamed from: b  reason: collision with root package name */
        public int f28625b;

        /* renamed from: c  reason: collision with root package name */
        public int f28626c;

        /* renamed from: d  reason: collision with root package name */
        public long f28627d;

        /* renamed from: e  reason: collision with root package name */
        public int f28628e;

        /* renamed from: f  reason: collision with root package name */
        public AvlNode f28629f;

        /* renamed from: g  reason: collision with root package name */
        public AvlNode f28630g;

        /* renamed from: h  reason: collision with root package name */
        public AvlNode f28631h;

        /* renamed from: i  reason: collision with root package name */
        public AvlNode f28632i;

        public AvlNode(Object obj, int i2) {
            Preconditions.d(i2 > 0);
            this.f28624a = obj;
            this.f28625b = i2;
            this.f28627d = (long) i2;
            this.f28626c = 1;
            this.f28628e = 1;
            this.f28629f = null;
            this.f28630g = null;
        }

        public static long M(AvlNode avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return avlNode.f28627d;
        }

        public static int y(AvlNode avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return avlNode.f28628e;
        }

        public final AvlNode A() {
            int r2 = r();
            if (r2 == -2) {
                Objects.requireNonNull(this.f28630g);
                if (this.f28630g.r() > 0) {
                    this.f28630g = this.f28630g.I();
                }
                return H();
            } else if (r2 != 2) {
                C();
                return this;
            } else {
                Objects.requireNonNull(this.f28629f);
                if (this.f28629f.r() < 0) {
                    this.f28629f = this.f28629f.H();
                }
                return I();
            }
        }

        public final void B() {
            D();
            C();
        }

        public final void C() {
            this.f28628e = Math.max(y(this.f28629f), y(this.f28630g)) + 1;
        }

        public final void D() {
            this.f28626c = TreeMultiset.E(this.f28629f) + 1 + TreeMultiset.E(this.f28630g);
            this.f28627d = ((long) this.f28625b) + M(this.f28629f) + M(this.f28630g);
        }

        public AvlNode E(Comparator comparator, Object obj, int i2, int[] iArr) {
            int compare = comparator.compare(obj, x());
            if (compare < 0) {
                AvlNode avlNode = this.f28629f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f28629f = avlNode.E(comparator, obj, i2, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i2 >= i3) {
                        this.f28626c--;
                        this.f28627d -= (long) i3;
                    } else {
                        this.f28627d -= (long) i2;
                    }
                }
                return i3 == 0 ? this : A();
            } else if (compare > 0) {
                AvlNode avlNode2 = this.f28630g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f28630g = avlNode2.E(comparator, obj, i2, iArr);
                int i4 = iArr[0];
                if (i4 > 0) {
                    if (i2 >= i4) {
                        this.f28626c--;
                        this.f28627d -= (long) i4;
                    } else {
                        this.f28627d -= (long) i2;
                    }
                }
                return A();
            } else {
                int i5 = this.f28625b;
                iArr[0] = i5;
                if (i2 >= i5) {
                    return u();
                }
                this.f28625b = i5 - i2;
                this.f28627d -= (long) i2;
                return this;
            }
        }

        public final AvlNode F(AvlNode avlNode) {
            AvlNode avlNode2 = this.f28630g;
            if (avlNode2 == null) {
                return this.f28629f;
            }
            this.f28630g = avlNode2.F(avlNode);
            this.f28626c--;
            this.f28627d -= (long) avlNode.f28625b;
            return A();
        }

        public final AvlNode G(AvlNode avlNode) {
            AvlNode avlNode2 = this.f28629f;
            if (avlNode2 == null) {
                return this.f28630g;
            }
            this.f28629f = avlNode2.G(avlNode);
            this.f28626c--;
            this.f28627d -= (long) avlNode.f28625b;
            return A();
        }

        public final AvlNode H() {
            Preconditions.w(this.f28630g != null);
            AvlNode avlNode = this.f28630g;
            this.f28630g = avlNode.f28629f;
            avlNode.f28629f = this;
            avlNode.f28627d = this.f28627d;
            avlNode.f28626c = this.f28626c;
            B();
            avlNode.C();
            return avlNode;
        }

        public final AvlNode I() {
            Preconditions.w(this.f28629f != null);
            AvlNode avlNode = this.f28629f;
            this.f28629f = avlNode.f28630g;
            avlNode.f28630g = this;
            avlNode.f28627d = this.f28627d;
            avlNode.f28626c = this.f28626c;
            B();
            avlNode.C();
            return avlNode;
        }

        public AvlNode J(Comparator comparator, Object obj, int i2, int i3, int[] iArr) {
            int compare = comparator.compare(obj, x());
            if (compare < 0) {
                AvlNode avlNode = this.f28629f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return (i2 != 0 || i3 <= 0) ? this : p(obj, i3);
                }
                this.f28629f = avlNode.J(comparator, obj, i2, i3, iArr);
                int i4 = iArr[0];
                if (i4 == i2) {
                    if (i3 == 0 && i4 != 0) {
                        this.f28626c--;
                    } else if (i3 > 0 && i4 == 0) {
                        this.f28626c++;
                    }
                    this.f28627d += (long) (i3 - i4);
                }
                return A();
            } else if (compare > 0) {
                AvlNode avlNode2 = this.f28630g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return (i2 != 0 || i3 <= 0) ? this : q(obj, i3);
                }
                this.f28630g = avlNode2.J(comparator, obj, i2, i3, iArr);
                int i5 = iArr[0];
                if (i5 == i2) {
                    if (i3 == 0 && i5 != 0) {
                        this.f28626c--;
                    } else if (i3 > 0 && i5 == 0) {
                        this.f28626c++;
                    }
                    this.f28627d += (long) (i3 - i5);
                }
                return A();
            } else {
                int i6 = this.f28625b;
                iArr[0] = i6;
                if (i2 == i6) {
                    if (i3 == 0) {
                        return u();
                    }
                    this.f28627d += (long) (i3 - i6);
                    this.f28625b = i3;
                }
                return this;
            }
        }

        public AvlNode K(Comparator comparator, Object obj, int i2, int[] iArr) {
            int compare = comparator.compare(obj, x());
            if (compare < 0) {
                AvlNode avlNode = this.f28629f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return i2 > 0 ? p(obj, i2) : this;
                }
                this.f28629f = avlNode.K(comparator, obj, i2, iArr);
                if (i2 == 0 && iArr[0] != 0) {
                    this.f28626c--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.f28626c++;
                }
                this.f28627d += (long) (i2 - iArr[0]);
                return A();
            } else if (compare > 0) {
                AvlNode avlNode2 = this.f28630g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return i2 > 0 ? q(obj, i2) : this;
                }
                this.f28630g = avlNode2.K(comparator, obj, i2, iArr);
                if (i2 == 0 && iArr[0] != 0) {
                    this.f28626c--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.f28626c++;
                }
                this.f28627d += (long) (i2 - iArr[0]);
                return A();
            } else {
                int i3 = this.f28625b;
                iArr[0] = i3;
                if (i2 == 0) {
                    return u();
                }
                this.f28627d += (long) (i2 - i3);
                this.f28625b = i2;
                return this;
            }
        }

        public final AvlNode L() {
            AvlNode avlNode = this.f28632i;
            Objects.requireNonNull(avlNode);
            return avlNode;
        }

        public AvlNode o(Comparator comparator, Object obj, int i2, int[] iArr) {
            int compare = comparator.compare(obj, x());
            boolean z2 = true;
            if (compare < 0) {
                AvlNode avlNode = this.f28629f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return p(obj, i2);
                }
                int i3 = avlNode.f28628e;
                AvlNode o2 = avlNode.o(comparator, obj, i2, iArr);
                this.f28629f = o2;
                if (iArr[0] == 0) {
                    this.f28626c++;
                }
                this.f28627d += (long) i2;
                return o2.f28628e == i3 ? this : A();
            } else if (compare > 0) {
                AvlNode avlNode2 = this.f28630g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return q(obj, i2);
                }
                int i4 = avlNode2.f28628e;
                AvlNode o3 = avlNode2.o(comparator, obj, i2, iArr);
                this.f28630g = o3;
                if (iArr[0] == 0) {
                    this.f28626c++;
                }
                this.f28627d += (long) i2;
                return o3.f28628e == i4 ? this : A();
            } else {
                int i5 = this.f28625b;
                iArr[0] = i5;
                long j2 = (long) i2;
                if (((long) i5) + j2 > 2147483647L) {
                    z2 = false;
                }
                Preconditions.d(z2);
                this.f28625b += i2;
                this.f28627d += j2;
                return this;
            }
        }

        public final AvlNode p(Object obj, int i2) {
            this.f28629f = new AvlNode(obj, i2);
            TreeMultiset.K(z(), this.f28629f, this);
            this.f28628e = Math.max(2, this.f28628e);
            this.f28626c++;
            this.f28627d += (long) i2;
            return this;
        }

        public final AvlNode q(Object obj, int i2) {
            AvlNode avlNode = new AvlNode(obj, i2);
            this.f28630g = avlNode;
            TreeMultiset.K(this, avlNode, L());
            this.f28628e = Math.max(2, this.f28628e);
            this.f28626c++;
            this.f28627d += (long) i2;
            return this;
        }

        public final int r() {
            return y(this.f28629f) - y(this.f28630g);
        }

        public final AvlNode s(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, x());
            if (compare < 0) {
                AvlNode avlNode = this.f28629f;
                return avlNode == null ? this : (AvlNode) MoreObjects.a(avlNode.s(comparator, obj), this);
            } else if (compare == 0) {
                return this;
            } else {
                AvlNode avlNode2 = this.f28630g;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.s(comparator, obj);
            }
        }

        public int t(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, x());
            if (compare < 0) {
                AvlNode avlNode = this.f28629f;
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.t(comparator, obj);
            } else if (compare <= 0) {
                return this.f28625b;
            } else {
                AvlNode avlNode2 = this.f28630g;
                if (avlNode2 == null) {
                    return 0;
                }
                return avlNode2.t(comparator, obj);
            }
        }

        public String toString() {
            return Multisets.g(x(), w()).toString();
        }

        public final AvlNode u() {
            int i2 = this.f28625b;
            this.f28625b = 0;
            TreeMultiset.J(z(), L());
            AvlNode avlNode = this.f28629f;
            if (avlNode == null) {
                return this.f28630g;
            }
            AvlNode avlNode2 = this.f28630g;
            if (avlNode2 == null) {
                return avlNode;
            }
            if (avlNode.f28628e >= avlNode2.f28628e) {
                AvlNode z2 = z();
                z2.f28629f = this.f28629f.F(z2);
                z2.f28630g = this.f28630g;
                z2.f28626c = this.f28626c - 1;
                z2.f28627d = this.f28627d - ((long) i2);
                return z2.A();
            }
            AvlNode L = L();
            L.f28630g = this.f28630g.G(L);
            L.f28629f = this.f28629f;
            L.f28626c = this.f28626c - 1;
            L.f28627d = this.f28627d - ((long) i2);
            return L.A();
        }

        public final AvlNode v(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, x());
            if (compare > 0) {
                AvlNode avlNode = this.f28630g;
                return avlNode == null ? this : (AvlNode) MoreObjects.a(avlNode.v(comparator, obj), this);
            } else if (compare == 0) {
                return this;
            } else {
                AvlNode avlNode2 = this.f28629f;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.v(comparator, obj);
            }
        }

        public int w() {
            return this.f28625b;
        }

        public Object x() {
            return NullnessCasts.a(this.f28624a);
        }

        public final AvlNode z() {
            AvlNode avlNode = this.f28631h;
            Objects.requireNonNull(avlNode);
            return avlNode;
        }
    }

    public static final class Reference<T> {

        /* renamed from: a  reason: collision with root package name */
        public Object f28633a;

        public void a(Object obj, Object obj2) {
            if (this.f28633a == obj) {
                this.f28633a = obj2;
                return;
            }
            throw new ConcurrentModificationException();
        }

        public void b() {
            this.f28633a = null;
        }

        public Object c() {
            return this.f28633a;
        }
    }

    public TreeMultiset(Reference reference, GeneralRange generalRange, AvlNode avlNode) {
        super(generalRange.a());
        this.D = reference;
        this.E = generalRange;
        this.F = avlNode;
    }

    public static int E(AvlNode avlNode) {
        if (avlNode == null) {
            return 0;
        }
        return avlNode.f28626c;
    }

    public static void J(AvlNode avlNode, AvlNode avlNode2) {
        AvlNode unused = avlNode.f28632i = avlNode2;
        AvlNode unused2 = avlNode2.f28631h = avlNode;
    }

    public static void K(AvlNode avlNode, AvlNode avlNode2, AvlNode avlNode3) {
        J(avlNode, avlNode2);
        J(avlNode2, avlNode3);
    }

    public final long B(Aggregate aggregate, AvlNode avlNode) {
        long h2;
        long B2;
        if (avlNode == null) {
            return 0;
        }
        int compare = comparator().compare(NullnessCasts.a(this.E.g()), avlNode.x());
        if (compare > 0) {
            return B(aggregate, avlNode.f28630g);
        }
        if (compare == 0) {
            int i2 = AnonymousClass4.f28620a[this.E.f().ordinal()];
            if (i2 == 1) {
                h2 = (long) aggregate.f(avlNode);
                B2 = aggregate.h(avlNode.f28630g);
            } else if (i2 == 2) {
                return aggregate.h(avlNode.f28630g);
            } else {
                throw new AssertionError();
            }
        } else {
            h2 = aggregate.h(avlNode.f28630g) + ((long) aggregate.f(avlNode));
            B2 = B(aggregate, avlNode.f28629f);
        }
        return h2 + B2;
    }

    public final long C(Aggregate aggregate, AvlNode avlNode) {
        long h2;
        long C;
        if (avlNode == null) {
            return 0;
        }
        int compare = comparator().compare(NullnessCasts.a(this.E.e()), avlNode.x());
        if (compare < 0) {
            return C(aggregate, avlNode.f28629f);
        }
        if (compare == 0) {
            int i2 = AnonymousClass4.f28620a[this.E.d().ordinal()];
            if (i2 == 1) {
                h2 = (long) aggregate.f(avlNode);
                C = aggregate.h(avlNode.f28629f);
            } else if (i2 == 2) {
                return aggregate.h(avlNode.f28629f);
            } else {
                throw new AssertionError();
            }
        } else {
            h2 = aggregate.h(avlNode.f28629f) + ((long) aggregate.f(avlNode));
            C = C(aggregate, avlNode.f28630g);
        }
        return h2 + C;
    }

    public final long D(Aggregate aggregate) {
        AvlNode avlNode = (AvlNode) this.D.c();
        long h2 = aggregate.h(avlNode);
        if (this.E.h()) {
            h2 -= C(aggregate, avlNode);
        }
        return this.E.i() ? h2 - B(aggregate, avlNode) : h2;
    }

    public SortedMultiset E0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.D, this.E.j(GeneralRange.m(comparator(), obj, boundType)), this.F);
    }

    public final AvlNode F() {
        AvlNode avlNode;
        AvlNode avlNode2 = (AvlNode) this.D.c();
        if (avlNode2 == null) {
            return null;
        }
        if (this.E.h()) {
            Object a2 = NullnessCasts.a(this.E.e());
            avlNode = avlNode2.s(comparator(), a2);
            if (avlNode == null) {
                return null;
            }
            if (this.E.d() == BoundType.OPEN && comparator().compare(a2, avlNode.x()) == 0) {
                avlNode = avlNode.L();
            }
        } else {
            avlNode = this.F.L();
        }
        if (avlNode == this.F || !this.E.b(avlNode.x())) {
            return null;
        }
        return avlNode;
    }

    public final AvlNode H() {
        AvlNode avlNode;
        AvlNode avlNode2 = (AvlNode) this.D.c();
        if (avlNode2 == null) {
            return null;
        }
        if (this.E.i()) {
            Object a2 = NullnessCasts.a(this.E.g());
            avlNode = avlNode2.v(comparator(), a2);
            if (avlNode == null) {
                return null;
            }
            if (this.E.f() == BoundType.OPEN && comparator().compare(a2, avlNode.x()) == 0) {
                avlNode = avlNode.z();
            }
        } else {
            avlNode = this.F.z();
        }
        if (avlNode == this.F || !this.E.b(avlNode.x())) {
            return null;
        }
        return avlNode;
    }

    public final Multiset.Entry L(final AvlNode avlNode) {
        return new Multisets.AbstractEntry<E>() {
            public Object a() {
                return avlNode.x();
            }

            public int getCount() {
                int w2 = avlNode.w();
                return w2 == 0 ? TreeMultiset.this.L0(a()) : w2;
            }
        };
    }

    public int L0(Object obj) {
        try {
            AvlNode avlNode = (AvlNode) this.D.c();
            if (this.E.b(obj)) {
                if (avlNode != null) {
                    return avlNode.t(comparator(), obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public int N(Object obj, int i2) {
        CollectPreconditions.b(i2, "occurrences");
        if (i2 == 0) {
            return L0(obj);
        }
        AvlNode avlNode = (AvlNode) this.D.c();
        int[] iArr = new int[1];
        try {
            if (this.E.b(obj)) {
                if (avlNode != null) {
                    this.D.a(avlNode, avlNode.E(comparator(), obj, i2, iArr));
                    return iArr[0];
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public SortedMultiset S0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.D, this.E.j(GeneralRange.c(comparator(), obj, boundType)), this.F);
    }

    public int T(Object obj, int i2) {
        CollectPreconditions.b(i2, "occurrences");
        if (i2 == 0) {
            return L0(obj);
        }
        Preconditions.d(this.E.b(obj));
        AvlNode avlNode = (AvlNode) this.D.c();
        if (avlNode == null) {
            comparator().compare(obj, obj);
            AvlNode avlNode2 = new AvlNode(obj, i2);
            AvlNode avlNode3 = this.F;
            K(avlNode3, avlNode2, avlNode3);
            this.D.a(avlNode, avlNode2);
            return 0;
        }
        int[] iArr = new int[1];
        this.D.a(avlNode, avlNode.o(comparator(), obj, i2, iArr));
        return iArr[0];
    }

    public void clear() {
        if (this.E.h() || this.E.i()) {
            Iterators.e(m());
            return;
        }
        AvlNode l2 = this.F.L();
        while (true) {
            AvlNode avlNode = this.F;
            if (l2 != avlNode) {
                AvlNode l3 = l2.L();
                int unused = l2.f28625b = 0;
                AvlNode unused2 = l2.f28629f = null;
                AvlNode unused3 = l2.f28630g = null;
                AvlNode unused4 = l2.f28631h = null;
                AvlNode unused5 = l2.f28632i = null;
                l2 = l3;
            } else {
                J(avlNode, avlNode);
                this.D.b();
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ SortedMultiset e0() {
        return super.e0();
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    public int h() {
        return Ints.k(D(Aggregate.DISTINCT));
    }

    public Iterator i() {
        return Multisets.e(m());
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Iterator iterator() {
        return Multisets.i(this);
    }

    public /* bridge */ /* synthetic */ NavigableSet k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    public Iterator m() {
        return new Iterator<Multiset.Entry<E>>() {

            /* renamed from: A  reason: collision with root package name */
            public Multiset.Entry f28614A;

            /* renamed from: z  reason: collision with root package name */
            public AvlNode f28616z;

            {
                this.f28616z = TreeMultiset.this.F();
            }

            /* renamed from: b */
            public Multiset.Entry next() {
                if (hasNext()) {
                    TreeMultiset treeMultiset = TreeMultiset.this;
                    AvlNode avlNode = this.f28616z;
                    Objects.requireNonNull(avlNode);
                    Multiset.Entry u2 = treeMultiset.L(avlNode);
                    this.f28614A = u2;
                    if (this.f28616z.L() == TreeMultiset.this.F) {
                        this.f28616z = null;
                    } else {
                        this.f28616z = this.f28616z.L();
                    }
                    return u2;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.f28616z == null) {
                    return false;
                }
                if (!TreeMultiset.this.E.k(this.f28616z.x())) {
                    return true;
                }
                this.f28616z = null;
                return false;
            }

            public void remove() {
                Preconditions.x(this.f28614A != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.n0(this.f28614A.a(), 0);
                this.f28614A = null;
            }
        };
    }

    public int n0(Object obj, int i2) {
        CollectPreconditions.b(i2, "count");
        boolean z2 = true;
        if (!this.E.b(obj)) {
            if (i2 != 0) {
                z2 = false;
            }
            Preconditions.d(z2);
            return 0;
        }
        AvlNode avlNode = (AvlNode) this.D.c();
        if (avlNode == null) {
            if (i2 > 0) {
                T(obj, i2);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.D.a(avlNode, avlNode.K(comparator(), obj, i2, iArr));
        return iArr[0];
    }

    public Iterator p() {
        return new Iterator<Multiset.Entry<E>>() {

            /* renamed from: A  reason: collision with root package name */
            public Multiset.Entry f28617A = null;

            /* renamed from: z  reason: collision with root package name */
            public AvlNode f28619z;

            {
                this.f28619z = TreeMultiset.this.H();
            }

            /* renamed from: b */
            public Multiset.Entry next() {
                if (hasNext()) {
                    Objects.requireNonNull(this.f28619z);
                    Multiset.Entry u2 = TreeMultiset.this.L(this.f28619z);
                    this.f28617A = u2;
                    if (this.f28619z.z() == TreeMultiset.this.F) {
                        this.f28619z = null;
                    } else {
                        this.f28619z = this.f28619z.z();
                    }
                    return u2;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.f28619z == null) {
                    return false;
                }
                if (!TreeMultiset.this.E.l(this.f28619z.x())) {
                    return true;
                }
                this.f28619z = null;
                return false;
            }

            public void remove() {
                Preconditions.x(this.f28617A != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.n0(this.f28617A.a(), 0);
                this.f28617A = null;
            }
        };
    }

    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    public int size() {
        return Ints.k(D(Aggregate.SIZE));
    }

    public boolean t0(Object obj, int i2, int i3) {
        CollectPreconditions.b(i3, "newCount");
        CollectPreconditions.b(i2, "oldCount");
        Preconditions.d(this.E.b(obj));
        AvlNode avlNode = (AvlNode) this.D.c();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.D.a(avlNode, avlNode.J(comparator(), obj, i2, i3, iArr));
            return iArr[0] == i2;
        } else if (i2 != 0) {
            return false;
        } else {
            if (i3 > 0) {
                T(obj, i3);
            }
            return true;
        }
    }

    public /* bridge */ /* synthetic */ SortedMultiset w1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.w1(obj, boundType, obj2, boundType2);
    }
}
