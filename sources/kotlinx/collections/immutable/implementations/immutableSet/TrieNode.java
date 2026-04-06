package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MutabilityOwnership;

@Metadata
public final class TrieNode<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f41300d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final TrieNode f41301e = new TrieNode(0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    public int f41302a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f41303b;

    /* renamed from: c  reason: collision with root package name */
    public MutabilityOwnership f41304c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TrieNode a() {
            return TrieNode.f41301e;
        }

        public Companion() {
        }
    }

    public TrieNode(int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        Intrinsics.i(objArr, "buffer");
        this.f41302a = i2;
        this.f41303b = objArr;
        this.f41304c = mutabilityOwnership;
    }

    public final Object A(TrieNode trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode trieNode2;
        TrieNode trieNode3 = trieNode;
        int i3 = i2;
        DeltaCounter deltaCounter2 = deltaCounter;
        PersistentHashSetBuilder persistentHashSetBuilder2 = persistentHashSetBuilder;
        Intrinsics.i(trieNode3, "otherNode");
        Intrinsics.i(deltaCounter2, "intersectionSizeRef");
        Intrinsics.i(persistentHashSetBuilder2, "mutator");
        if (this == trieNode3) {
            deltaCounter2.b(c());
            return this;
        } else if (i3 > 30) {
            return x(trieNode3, deltaCounter2, persistentHashSetBuilder.m());
        } else {
            int i4 = this.f41302a & trieNode3.f41302a;
            if (i4 == 0) {
                return f41301e;
            }
            TrieNode trieNode4 = (!Intrinsics.d(this.f41304c, persistentHashSetBuilder.m()) || i4 != this.f41302a) ? new TrieNode(i4, new Object[Integer.bitCount(i4)], persistentHashSetBuilder.m()) : this;
            int i5 = i4;
            int i6 = 0;
            int i7 = 0;
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                int n2 = n(lowestOneBit);
                int n3 = trieNode3.n(lowestOneBit);
                Object obj = this.f41303b[n2];
                Object obj2 = trieNode3.f41303b[n3];
                boolean z2 = obj instanceof TrieNode;
                boolean z3 = obj2 instanceof TrieNode;
                if (z2 && z3) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    obj = ((TrieNode) obj).A((TrieNode) obj2, i3 + 5, deltaCounter2, persistentHashSetBuilder2);
                } else if (z2) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    if (((TrieNode) obj).g(obj2 != null ? obj2.hashCode() : 0, obj2, i3 + 5)) {
                        deltaCounter2.b(1);
                        obj = obj2;
                    } else {
                        obj = f41301e;
                    }
                } else if (z3) {
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    if (((TrieNode) obj2).g(obj != null ? obj.hashCode() : 0, obj, i3 + 5)) {
                        deltaCounter2.b(1);
                    } else {
                        obj = f41301e;
                    }
                } else if (Intrinsics.d(obj, obj2)) {
                    deltaCounter2.b(1);
                } else {
                    obj = f41301e;
                }
                if (obj != f41301e) {
                    i6 |= lowestOneBit;
                }
                trieNode4.f41303b[i7] = obj;
                i7++;
                i5 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i6);
            if (i6 == 0) {
                return f41301e;
            }
            if (i6 == i4) {
                return trieNode4.j(this) ? this : trieNode4.j(trieNode3) ? trieNode3 : trieNode4;
            }
            if (bitCount != 1 || i3 == 0) {
                Object[] objArr = new Object[bitCount];
                Object[] objArr2 = trieNode4.f41303b;
                int i8 = 0;
                int i9 = 0;
                while (i8 < objArr2.length) {
                    CommonFunctionsKt.a(i9 <= i8);
                    if (objArr2[i8] != f41300d.a()) {
                        objArr[i9] = objArr2[i8];
                        i9++;
                        CommonFunctionsKt.a(i9 <= bitCount);
                    }
                    i8++;
                }
                trieNode2 = new TrieNode(i6, objArr, persistentHashSetBuilder.m());
            } else {
                Object obj3 = trieNode4.f41303b[trieNode4.n(i6)];
                if (!(obj3 instanceof TrieNode)) {
                    return obj3;
                }
                trieNode2 = new TrieNode(i6, new Object[]{obj3}, persistentHashSetBuilder.m());
            }
            return trieNode2;
        }
    }

    public final TrieNode B(int i2) {
        Object obj = this.f41303b[i2];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    public final TrieNode C(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        return E(i3 ^ this.f41302a, TrieNodeKt.e(this.f41303b, i2), mutabilityOwnership);
    }

    public final TrieNode D(int i2, Object obj, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.f41304c;
        if (mutabilityOwnership2 == null || mutabilityOwnership2 != mutabilityOwnership) {
            Object[] objArr = this.f41303b;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[i2] = obj;
            return new TrieNode(this.f41302a, copyOf, mutabilityOwnership);
        }
        this.f41303b[i2] = obj;
        return this;
    }

    public final TrieNode E(int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.f41304c;
        if (mutabilityOwnership2 == null || mutabilityOwnership2 != mutabilityOwnership) {
            return new TrieNode(i2, objArr, mutabilityOwnership);
        }
        this.f41302a = i2;
        this.f41303b = objArr;
        return this;
    }

    public final TrieNode b(int i2, Object obj, MutabilityOwnership mutabilityOwnership) {
        return E(i2 | this.f41302a, TrieNodeKt.c(this.f41303b, n(i2), obj), mutabilityOwnership);
    }

    public final int c() {
        if (this.f41302a == 0) {
            return this.f41303b.length;
        }
        int i2 = 0;
        for (Object obj : this.f41303b) {
            i2 += obj instanceof TrieNode ? ((TrieNode) obj).c() : 1;
        }
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.collections.immutable.implementations.immutableSet.TrieNode d(int r4, kotlinx.collections.immutable.implementations.immutableSet.TrieNode r5, kotlinx.collections.immutable.internal.MutabilityOwnership r6) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r5.f41303b
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r1 != 0) goto L_0x0018
            java.lang.Object[] r1 = r3.f41303b
            int r1 = r1.length
            if (r1 != r2) goto L_0x0017
            int r4 = r3.f41302a
            r5.f41302a = r4
            return r5
        L_0x0017:
            r5 = r0
        L_0x0018:
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r4 = r3.D(r4, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.collections.immutable.implementations.immutableSet.TrieNode.d(int, kotlinx.collections.immutable.implementations.immutableSet.TrieNode, kotlinx.collections.immutable.internal.MutabilityOwnership):kotlinx.collections.immutable.implementations.immutableSet.TrieNode");
    }

    public final boolean e(Object obj) {
        return ArraysKt.Y(this.f41303b, obj);
    }

    public final TrieNode f(int i2, MutabilityOwnership mutabilityOwnership) {
        return E(0, TrieNodeKt.e(this.f41303b, i2), mutabilityOwnership);
    }

    public final boolean g(int i2, Object obj, int i3) {
        int d2 = 1 << TrieNodeKt.d(i2, i3);
        if (m(d2)) {
            return false;
        }
        int n2 = n(d2);
        Object obj2 = this.f41303b[n2];
        if (!(obj2 instanceof TrieNode)) {
            return Intrinsics.d(obj, obj2);
        }
        TrieNode B2 = B(n2);
        return i3 == 30 ? B2.e(obj) : B2.g(i2, obj, i3 + 5);
    }

    public final boolean h(TrieNode trieNode, int i2) {
        Intrinsics.i(trieNode, "otherNode");
        if (this == trieNode) {
            return true;
        }
        if (i2 > 30) {
            for (Object Y : trieNode.f41303b) {
                if (!ArraysKt.Y(this.f41303b, Y)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.f41302a;
        int i4 = trieNode.f41302a;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int n2 = n(lowestOneBit);
            int n3 = trieNode.n(lowestOneBit);
            Object obj = this.f41303b[n2];
            Object obj2 = trieNode.f41303b[n3];
            boolean z2 = obj instanceof TrieNode;
            boolean z3 = obj2 instanceof TrieNode;
            if (z2 && z3) {
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj).h((TrieNode) obj2, i2 + 5)) {
                    return false;
                }
            } else if (z2) {
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj).g(obj2 != null ? obj2.hashCode() : 0, obj2, i2 + 5)) {
                    return false;
                }
            } else if (z3 || !Intrinsics.d(obj, obj2)) {
                return false;
            }
            i5 ^= lowestOneBit;
        }
        return true;
    }

    public final Object i(int i2) {
        return this.f41303b[i2];
    }

    public final boolean j(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f41302a != trieNode.f41302a) {
            return false;
        }
        int length = this.f41303b.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f41303b[i2] != trieNode.f41303b[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int k() {
        return this.f41302a;
    }

    public final Object[] l() {
        return this.f41303b;
    }

    public final boolean m(int i2) {
        return (i2 & this.f41302a) == 0;
    }

    public final int n(int i2) {
        return Integer.bitCount((i2 - 1) & this.f41302a);
    }

    public final TrieNode o(int i2, Object obj, int i3, Object obj2, int i4, MutabilityOwnership mutabilityOwnership) {
        Object obj3 = obj;
        Object obj4 = obj2;
        int i5 = i4;
        MutabilityOwnership mutabilityOwnership2 = mutabilityOwnership;
        if (i5 > 30) {
            return new TrieNode(0, new Object[]{obj, obj2}, mutabilityOwnership2);
        }
        int i6 = i2;
        int d2 = TrieNodeKt.d(i2, i4);
        int i7 = i3;
        int d3 = TrieNodeKt.d(i3, i4);
        if (d2 != d3) {
            return new TrieNode((1 << d2) | (1 << d3), d2 < d3 ? new Object[]{obj3, obj4} : new Object[]{obj4, obj3}, mutabilityOwnership2);
        }
        return new TrieNode(1 << d2, new Object[]{o(i2, obj, i3, obj2, i5 + 5, mutabilityOwnership)}, mutabilityOwnership2);
    }

    public final TrieNode p(int i2, int i3, Object obj, int i4, MutabilityOwnership mutabilityOwnership) {
        Object i5 = i(i2);
        return o(i5 != null ? i5.hashCode() : 0, i5, i3, obj, i4 + 5, mutabilityOwnership);
    }

    public final TrieNode q(int i2, int i3, Object obj, int i4, MutabilityOwnership mutabilityOwnership) {
        return D(i2, p(i2, i3, obj, i4, mutabilityOwnership), mutabilityOwnership);
    }

    public final TrieNode r(int i2, Object obj, int i3, PersistentHashSetBuilder persistentHashSetBuilder) {
        Intrinsics.i(persistentHashSetBuilder, "mutator");
        int d2 = 1 << TrieNodeKt.d(i2, i3);
        if (m(d2)) {
            persistentHashSetBuilder.n(persistentHashSetBuilder.size() + 1);
            return b(d2, obj, persistentHashSetBuilder.m());
        }
        int n2 = n(d2);
        Object obj2 = this.f41303b[n2];
        if (obj2 instanceof TrieNode) {
            TrieNode B2 = B(n2);
            TrieNode t2 = i3 == 30 ? B2.t(obj, persistentHashSetBuilder) : B2.r(i2, obj, i3 + 5, persistentHashSetBuilder);
            return B2 == t2 ? this : D(n2, t2, persistentHashSetBuilder.m());
        } else if (Intrinsics.d(obj, obj2)) {
            return this;
        } else {
            persistentHashSetBuilder.n(persistentHashSetBuilder.size() + 1);
            return q(n2, i2, obj, i3, persistentHashSetBuilder.m());
        }
    }

    public final TrieNode s(TrieNode trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        Object[] objArr;
        int i3;
        TrieNode trieNode2;
        TrieNode r2;
        TrieNode trieNode3 = trieNode;
        int i4 = i2;
        DeltaCounter deltaCounter2 = deltaCounter;
        PersistentHashSetBuilder persistentHashSetBuilder2 = persistentHashSetBuilder;
        Intrinsics.i(trieNode3, "otherNode");
        Intrinsics.i(deltaCounter2, "intersectionSizeRef");
        Intrinsics.i(persistentHashSetBuilder2, "mutator");
        if (this == trieNode3) {
            deltaCounter2.c(deltaCounter.a() + c());
            return this;
        } else if (i4 > 30) {
            return u(trieNode3, deltaCounter2, persistentHashSetBuilder.m());
        } else {
            int i5 = this.f41302a;
            int i6 = trieNode3.f41302a | i5;
            TrieNode trieNode4 = (i6 != i5 || !Intrinsics.d(this.f41304c, persistentHashSetBuilder.m())) ? new TrieNode(i6, new Object[Integer.bitCount(i6)], persistentHashSetBuilder.m()) : this;
            int i7 = i6;
            int i8 = 0;
            while (i7 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i7);
                int n2 = n(lowestOneBit);
                int n3 = trieNode3.n(lowestOneBit);
                Object[] objArr2 = trieNode4.f41303b;
                if (m(lowestOneBit)) {
                    trieNode2 = trieNode3.f41303b[n3];
                } else if (trieNode3.m(lowestOneBit)) {
                    trieNode2 = this.f41303b[n2];
                } else {
                    Object obj = this.f41303b[n2];
                    Object obj2 = trieNode3.f41303b[n3];
                    boolean z2 = obj instanceof TrieNode;
                    boolean z3 = obj2 instanceof TrieNode;
                    if (!z2 || !z3) {
                        if (z2) {
                            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                            TrieNode trieNode5 = (TrieNode) obj;
                            int size = persistentHashSetBuilder.size();
                            r2 = trieNode5.r(obj2 != null ? obj2.hashCode() : 0, obj2, i4 + 5, persistentHashSetBuilder2);
                            if (persistentHashSetBuilder.size() == size) {
                                deltaCounter2.c(deltaCounter.a() + 1);
                            }
                            Unit unit = Unit.f40552a;
                        } else if (z3) {
                            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                            TrieNode trieNode6 = (TrieNode) obj2;
                            int size2 = persistentHashSetBuilder.size();
                            r2 = trieNode6.r(obj != null ? obj.hashCode() : 0, obj, i4 + 5, persistentHashSetBuilder2);
                            if (persistentHashSetBuilder.size() == size2) {
                                deltaCounter2.c(deltaCounter.a() + 1);
                            }
                            Unit unit2 = Unit.f40552a;
                        } else if (Intrinsics.d(obj, obj2)) {
                            deltaCounter2.c(deltaCounter.a() + 1);
                            Unit unit3 = Unit.f40552a;
                            trieNode2 = obj;
                        } else {
                            objArr = objArr2;
                            i3 = lowestOneBit;
                            trieNode2 = o(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i4 + 5, persistentHashSetBuilder.m());
                            objArr[i8] = trieNode2;
                            i8++;
                            i7 ^= i3;
                        }
                        trieNode2 = r2;
                    } else {
                        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        trieNode2 = ((TrieNode) obj).s((TrieNode) obj2, i4 + 5, deltaCounter2, persistentHashSetBuilder2);
                    }
                }
                objArr = objArr2;
                i3 = lowestOneBit;
                objArr[i8] = trieNode2;
                i8++;
                i7 ^= i3;
            }
            return j(trieNode4) ? this : trieNode3.j(trieNode4) ? trieNode3 : trieNode4;
        }
    }

    public final TrieNode t(Object obj, PersistentHashSetBuilder persistentHashSetBuilder) {
        if (e(obj)) {
            return this;
        }
        persistentHashSetBuilder.n(persistentHashSetBuilder.size() + 1);
        return E(0, TrieNodeKt.c(this.f41303b, 0, obj), persistentHashSetBuilder.m());
    }

    public final TrieNode u(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.b(this.f41303b.length);
            return this;
        }
        Object[] objArr = this.f41303b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f41303b.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        Object[] objArr2 = trieNode.f41303b;
        int length = this.f41303b.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr2.length) {
            boolean z2 = true;
            CommonFunctionsKt.a(i3 <= i2);
            if (!e(objArr2[i2])) {
                copyOf[length + i3] = objArr2[i2];
                i3++;
                if (length + i3 > copyOf.length) {
                    z2 = false;
                }
                CommonFunctionsKt.a(z2);
            }
            i2++;
        }
        int length2 = i3 + this.f41303b.length;
        deltaCounter.b(copyOf.length - length2);
        if (length2 == this.f41303b.length) {
            return this;
        }
        if (length2 == trieNode.f41303b.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            Intrinsics.h(copyOf, "copyOf(...)");
        }
        return E(0, copyOf, mutabilityOwnership);
    }

    public final TrieNode v(Object obj, PersistentHashSetBuilder persistentHashSetBuilder) {
        int t0 = ArraysKt.t0(this.f41303b, obj);
        if (t0 == -1) {
            return this;
        }
        persistentHashSetBuilder.n(persistentHashSetBuilder.size() - 1);
        return f(t0, persistentHashSetBuilder.m());
    }

    public final Object w(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.b(this.f41303b.length);
            return f41301e;
        }
        Object[] objArr = mutabilityOwnership == this.f41304c ? this.f41303b : new Object[this.f41303b.length];
        Object[] objArr2 = this.f41303b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.a(i3 <= i2);
            if (!trieNode.e(objArr2[i2])) {
                objArr[i3] = objArr2[i2];
                i3++;
                if (i3 > objArr.length) {
                    z2 = false;
                }
                CommonFunctionsKt.a(z2);
            }
            i2++;
        }
        deltaCounter.b(this.f41303b.length - i3);
        if (i3 == 0) {
            return f41301e;
        }
        if (i3 == 1) {
            return objArr[0];
        }
        if (i3 == this.f41303b.length) {
            return this;
        }
        if (i3 == objArr.length) {
            return E(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i3);
        Intrinsics.h(copyOf, "copyOf(...)");
        return E(0, copyOf, mutabilityOwnership);
    }

    public final Object x(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.b(this.f41303b.length);
            return this;
        }
        Object[] objArr = mutabilityOwnership == this.f41304c ? this.f41303b : new Object[Math.min(this.f41303b.length, trieNode.f41303b.length)];
        Object[] objArr2 = this.f41303b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.a(i3 <= i2);
            if (trieNode.e(objArr2[i2])) {
                objArr[i3] = objArr2[i2];
                i3++;
                if (i3 > objArr.length) {
                    z2 = false;
                }
                CommonFunctionsKt.a(z2);
            }
            i2++;
        }
        deltaCounter.b(i3);
        if (i3 == 0) {
            return f41301e;
        }
        if (i3 == 1) {
            return objArr[0];
        }
        if (i3 == this.f41303b.length) {
            return this;
        }
        if (i3 == trieNode.f41303b.length) {
            return trieNode;
        }
        if (i3 == objArr.length) {
            return E(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i3);
        Intrinsics.h(copyOf, "copyOf(...)");
        return E(0, copyOf, mutabilityOwnership);
    }

    public final TrieNode y(int i2, Object obj, int i3, PersistentHashSetBuilder persistentHashSetBuilder) {
        Intrinsics.i(persistentHashSetBuilder, "mutator");
        int d2 = 1 << TrieNodeKt.d(i2, i3);
        if (m(d2)) {
            return this;
        }
        int n2 = n(d2);
        Object obj2 = this.f41303b[n2];
        if (obj2 instanceof TrieNode) {
            TrieNode B2 = B(n2);
            TrieNode v2 = i3 == 30 ? B2.v(obj, persistentHashSetBuilder) : B2.y(i2, obj, i3 + 5, persistentHashSetBuilder);
            return (B2.f41304c == persistentHashSetBuilder.m() || B2 != v2) ? d(n2, v2, persistentHashSetBuilder.m()) : this;
        } else if (!Intrinsics.d(obj, obj2)) {
            return this;
        } else {
            persistentHashSetBuilder.n(persistentHashSetBuilder.size() - 1);
            return C(n2, d2, persistentHashSetBuilder.m());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
        if ((r13 instanceof kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(kotlinx.collections.immutable.implementations.immutableSet.TrieNode r17, int r18, kotlinx.collections.immutable.internal.DeltaCounter r19, kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r5 = "otherNode"
            kotlin.jvm.internal.Intrinsics.i(r1, r5)
            java.lang.String r5 = "intersectionSizeRef"
            kotlin.jvm.internal.Intrinsics.i(r3, r5)
            java.lang.String r5 = "mutator"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            if (r0 != r1) goto L_0x0025
            int r1 = r16.c()
            r3.b(r1)
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r1 = f41301e
            return r1
        L_0x0025:
            r5 = 30
            if (r2 <= r5) goto L_0x0032
            kotlinx.collections.immutable.internal.MutabilityOwnership r2 = r20.m()
            java.lang.Object r1 = r0.w(r1, r3, r2)
            return r1
        L_0x0032:
            int r5 = r0.f41302a
            int r6 = r1.f41302a
            r5 = r5 & r6
            if (r5 != 0) goto L_0x003a
            return r0
        L_0x003a:
            kotlinx.collections.immutable.internal.MutabilityOwnership r6 = r0.f41304c
            kotlinx.collections.immutable.internal.MutabilityOwnership r7 = r20.m()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L_0x0048
            r6 = r0
            goto L_0x005f
        L_0x0048:
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = new kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            int r7 = r0.f41302a
            java.lang.Object[] r8 = r0.f41303b
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String r9 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.h(r8, r9)
            kotlinx.collections.immutable.internal.MutabilityOwnership r9 = r20.m()
            r6.<init>(r7, r8, r9)
        L_0x005f:
            int r7 = r0.f41302a
        L_0x0061:
            if (r5 == 0) goto L_0x00fc
            int r10 = java.lang.Integer.lowestOneBit(r5)
            int r11 = r0.n(r10)
            int r12 = r1.n(r10)
            java.lang.Object[] r13 = r0.f41303b
            r13 = r13[r11]
            java.lang.Object[] r14 = r1.f41303b
            r12 = r14[r12]
            boolean r14 = r13 instanceof kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            boolean r15 = r12 instanceof kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            java.lang.String r8 = "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>"
            if (r14 == 0) goto L_0x0092
            if (r15 == 0) goto L_0x0092
            kotlin.jvm.internal.Intrinsics.g(r13, r8)
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = (kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r13
            kotlin.jvm.internal.Intrinsics.g(r12, r8)
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r12 = (kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r12
            int r8 = r2 + 5
            java.lang.Object r13 = r13.z(r12, r8, r3, r4)
            goto L_0x00f0
        L_0x0092:
            if (r14 == 0) goto L_0x00c5
            kotlin.jvm.internal.Intrinsics.g(r13, r8)
            r8 = r13
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = (kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r8
            int r14 = r20.size()
            if (r12 == 0) goto L_0x00a5
            int r15 = r12.hashCode()
            goto L_0x00a6
        L_0x00a5:
            r15 = 0
        L_0x00a6:
            int r9 = r2 + 5
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = r8.y(r15, r12, r9, r4)
            int r9 = r20.size()
            if (r14 == r9) goto L_0x00f0
            r9 = 1
            r3.b(r9)
            java.lang.Object[] r12 = r8.f41303b
            int r13 = r12.length
            if (r13 != r9) goto L_0x00c3
            r9 = 0
            r13 = r12[r9]
            boolean r9 = r13 instanceof kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r9 != 0) goto L_0x00c3
            goto L_0x00f0
        L_0x00c3:
            r13 = r8
            goto L_0x00f0
        L_0x00c5:
            r9 = 0
            if (r15 == 0) goto L_0x00e4
            kotlin.jvm.internal.Intrinsics.g(r12, r8)
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r12 = (kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r12
            if (r13 == 0) goto L_0x00d4
            int r8 = r13.hashCode()
            goto L_0x00d5
        L_0x00d4:
            r8 = r9
        L_0x00d5:
            int r9 = r2 + 5
            boolean r8 = r12.g(r8, r13, r9)
            if (r8 == 0) goto L_0x00f0
            r8 = 1
            r3.b(r8)
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = f41301e
            goto L_0x00f0
        L_0x00e4:
            r8 = 1
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r13, r12)
            if (r9 == 0) goto L_0x00f0
            r3.b(r8)
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = f41301e
        L_0x00f0:
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = f41301e
            if (r13 != r8) goto L_0x00f5
            r7 = r7 ^ r10
        L_0x00f5:
            java.lang.Object[] r8 = r6.f41303b
            r8[r11] = r13
            r5 = r5 ^ r10
            goto L_0x0061
        L_0x00fc:
            r9 = 0
            int r1 = java.lang.Integer.bitCount(r7)
            if (r7 != 0) goto L_0x0107
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = f41301e
            goto L_0x0168
        L_0x0107:
            int r3 = r0.f41302a
            if (r7 != r3) goto L_0x0113
            boolean r1 = r6.j(r0)
            if (r1 == 0) goto L_0x0168
            r6 = r0
            goto L_0x0168
        L_0x0113:
            r3 = 1
            if (r1 != r3) goto L_0x0133
            if (r2 == 0) goto L_0x0133
            java.lang.Object[] r1 = r6.f41303b
            int r2 = r6.n(r7)
            r6 = r1[r2]
            boolean r1 = r6 instanceof kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r1 == 0) goto L_0x0168
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r1 = new kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            java.lang.Object[] r2 = new java.lang.Object[]{r6}
            kotlinx.collections.immutable.internal.MutabilityOwnership r3 = r20.m()
            r1.<init>(r7, r2, r3)
            r6 = r1
            goto L_0x0168
        L_0x0133:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object[] r5 = r6.f41303b
            r6 = r9
            r8 = r6
        L_0x0139:
            int r10 = r5.length
            if (r6 >= r10) goto L_0x015f
            if (r8 > r6) goto L_0x0140
            r10 = r3
            goto L_0x0141
        L_0x0140:
            r10 = r9
        L_0x0141:
            kotlinx.collections.immutable.internal.CommonFunctionsKt.a(r10)
            r10 = r5[r6]
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode$Companion r11 = f41300d
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r11 = r11.a()
            if (r10 == r11) goto L_0x015c
            r10 = r5[r6]
            r2[r8] = r10
            int r8 = r8 + 1
            if (r8 > r1) goto L_0x0158
            r10 = r3
            goto L_0x0159
        L_0x0158:
            r10 = r9
        L_0x0159:
            kotlinx.collections.immutable.internal.CommonFunctionsKt.a(r10)
        L_0x015c:
            int r6 = r6 + 1
            goto L_0x0139
        L_0x015f:
            kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = new kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            kotlinx.collections.immutable.internal.MutabilityOwnership r1 = r20.m()
            r6.<init>(r7, r2, r1)
        L_0x0168:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.collections.immutable.implementations.immutableSet.TrieNode.z(kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, kotlinx.collections.immutable.internal.DeltaCounter, kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrieNode(int i2, Object[] objArr) {
        this(i2, objArr, (MutabilityOwnership) null);
        Intrinsics.i(objArr, "buffer");
    }
}
