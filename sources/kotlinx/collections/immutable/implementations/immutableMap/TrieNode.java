package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MutabilityOwnership;

@Metadata
public final class TrieNode<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f41283e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final TrieNode f41284f = new TrieNode(0, 0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    public int f41285a;

    /* renamed from: b  reason: collision with root package name */
    public int f41286b;

    /* renamed from: c  reason: collision with root package name */
    public final MutabilityOwnership f41287c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f41288d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TrieNode a() {
            return TrieNode.f41284f;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ModificationResult<K, V> {
    }

    public TrieNode(int i2, int i3, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        Intrinsics.i(objArr, "buffer");
        this.f41285a = i2;
        this.f41286b = i3;
        this.f41287c = mutabilityOwnership;
        this.f41288d = objArr;
    }

    public final TrieNode A(TrieNode trieNode, int i2, int i3, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode trieNode2 = trieNode;
        int i4 = i2;
        DeltaCounter deltaCounter2 = deltaCounter;
        int i5 = 0;
        if (o(i4)) {
            TrieNode I = I(J(i4));
            if (trieNode.o(i2)) {
                return I.z(trieNode2.I(trieNode.J(i2)), i3 + 5, deltaCounter2, persistentHashMapBuilder);
            }
            PersistentHashMapBuilder persistentHashMapBuilder2 = persistentHashMapBuilder;
            if (!trieNode.n(i2)) {
                return I;
            }
            int j2 = trieNode.j(i2);
            Object p2 = trieNode2.p(j2);
            Object K = trieNode2.K(j2);
            int size = persistentHashMapBuilder.size();
            if (p2 != null) {
                i5 = p2.hashCode();
            }
            TrieNode y2 = I.y(i5, p2, K, i3 + 5, persistentHashMapBuilder);
            if (persistentHashMapBuilder.size() != size) {
                return y2;
            }
            deltaCounter2.c(deltaCounter.a() + 1);
            return y2;
        }
        PersistentHashMapBuilder persistentHashMapBuilder3 = persistentHashMapBuilder;
        if (trieNode.o(i2)) {
            TrieNode I2 = trieNode2.I(trieNode.J(i2));
            if (n(i4)) {
                int j3 = j(i4);
                Object p3 = p(j3);
                int i6 = i3 + 5;
                if (I2.g(p3 != null ? p3.hashCode() : 0, p3, i6)) {
                    deltaCounter2.c(deltaCounter.a() + 1);
                } else {
                    Object K2 = K(j3);
                    if (p3 != null) {
                        i5 = p3.hashCode();
                    }
                    return I2.y(i5, p3, K2, i6, persistentHashMapBuilder);
                }
            }
            return I2;
        }
        int j4 = j(i4);
        Object p4 = p(j4);
        Object K3 = K(j4);
        int j5 = trieNode.j(i2);
        Object p5 = trieNode2.p(j5);
        Object K4 = trieNode2.K(j5);
        int hashCode = p4 != null ? p4.hashCode() : 0;
        if (p5 != null) {
            i5 = p5.hashCode();
        }
        return q(hashCode, p4, K3, i5, p5, K4, i3 + 5, persistentHashMapBuilder.i());
    }

    public final TrieNode B(int i2, Object obj, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.i(persistentHashMapBuilder, "mutator");
        int e2 = 1 << TrieNodeKt.e(i2, i3);
        if (n(e2)) {
            int j2 = j(e2);
            return Intrinsics.d(obj, p(j2)) ? D(j2, e2, persistentHashMapBuilder) : this;
        } else if (!o(e2)) {
            return this;
        } else {
            int J = J(e2);
            TrieNode I = I(J);
            return F(I, i3 == 30 ? I.u(obj, persistentHashMapBuilder) : I.B(i2, obj, i3 + 5, persistentHashMapBuilder), J, e2, persistentHashMapBuilder.i());
        }
    }

    public final TrieNode C(int i2, Object obj, Object obj2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object obj3 = obj;
        Object obj4 = obj2;
        int i4 = i3;
        PersistentHashMapBuilder persistentHashMapBuilder2 = persistentHashMapBuilder;
        Intrinsics.i(persistentHashMapBuilder2, "mutator");
        int i5 = i2;
        int e2 = 1 << TrieNodeKt.e(i2, i3);
        if (n(e2)) {
            int j2 = j(e2);
            return (!Intrinsics.d(obj, p(j2)) || !Intrinsics.d(obj2, K(j2))) ? this : D(j2, e2, persistentHashMapBuilder2);
        } else if (!o(e2)) {
            return this;
        } else {
            int J = J(e2);
            TrieNode I = I(J);
            return F(I, i4 == 30 ? I.t(obj, obj2, persistentHashMapBuilder2) : I.C(i2, obj, obj2, i4 + 5, persistentHashMapBuilder), J, e2, persistentHashMapBuilder.i());
        }
    }

    public final TrieNode D(int i2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.m(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.k(K(i2));
        if (this.f41288d.length == 2) {
            return null;
        }
        if (this.f41287c == persistentHashMapBuilder.i()) {
            this.f41288d = TrieNodeKt.g(this.f41288d, i2);
            this.f41285a ^= i3;
            return this;
        }
        return new TrieNode(i3 ^ this.f41285a, this.f41286b, TrieNodeKt.g(this.f41288d, i2), persistentHashMapBuilder.i());
    }

    public final TrieNode E(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.f41288d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f41287c == mutabilityOwnership) {
            this.f41288d = TrieNodeKt.h(objArr, i2);
            this.f41286b ^= i3;
            return this;
        }
        return new TrieNode(this.f41285a, i3 ^ this.f41286b, TrieNodeKt.h(objArr, i2), mutabilityOwnership);
    }

    public final TrieNode F(TrieNode trieNode, TrieNode trieNode2, int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        return trieNode2 == null ? E(i2, i3, mutabilityOwnership) : trieNode != trieNode2 ? G(i2, trieNode2, mutabilityOwnership) : this;
    }

    public final TrieNode G(int i2, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.a(trieNode.f41287c == mutabilityOwnership);
        Object[] objArr = this.f41288d;
        if (objArr.length == 1 && trieNode.f41288d.length == 2 && trieNode.f41286b == 0) {
            trieNode.f41285a = this.f41286b;
            return trieNode;
        } else if (this.f41287c == mutabilityOwnership) {
            objArr[i2] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[i2] = trieNode;
            return new TrieNode(this.f41285a, this.f41286b, copyOf, mutabilityOwnership);
        }
    }

    public final TrieNode H(int i2, Object obj, PersistentHashMapBuilder persistentHashMapBuilder) {
        if (this.f41287c == persistentHashMapBuilder.i()) {
            this.f41288d[i2 + 1] = obj;
            return this;
        }
        persistentHashMapBuilder.j(persistentHashMapBuilder.g() + 1);
        Object[] objArr = this.f41288d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        copyOf[i2 + 1] = obj;
        return new TrieNode(this.f41285a, this.f41286b, copyOf, persistentHashMapBuilder.i());
    }

    public final TrieNode I(int i2) {
        Object obj = this.f41288d[i2];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int J(int i2) {
        return (this.f41288d.length - 1) - Integer.bitCount((i2 - 1) & this.f41286b);
    }

    public final Object K(int i2) {
        return this.f41288d[i2 + 1];
    }

    public final Object[] b(int i2, int i3, int i4, Object obj, Object obj2, int i5, MutabilityOwnership mutabilityOwnership) {
        Object p2 = p(i2);
        int i6 = i3;
        int i7 = i2;
        return TrieNodeKt.i(this.f41288d, i2, J(i3) + 1, q(p2 != null ? p2.hashCode() : 0, p2, K(i2), i4, obj, obj2, i5 + 5, mutabilityOwnership));
    }

    public final int c() {
        if (this.f41286b == 0) {
            return this.f41288d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f41285a);
        int length = this.f41288d.length;
        for (int i2 = bitCount * 2; i2 < length; i2++) {
            bitCount += I(i2).c();
        }
        return bitCount;
    }

    public final boolean d(Object obj) {
        return f(obj) != -1;
    }

    public final Object e(Object obj) {
        int f2 = f(obj);
        if (f2 != -1) {
            return K(f2);
        }
        return null;
    }

    public final int f(Object obj) {
        IntProgression u2 = RangesKt.u(RangesKt.v(0, this.f41288d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 <= 0 || n2 > o2) && (p2 >= 0 || o2 > n2)) {
            return -1;
        }
        while (!Intrinsics.d(obj, p(n2))) {
            if (n2 == o2) {
                return -1;
            }
            n2 += p2;
        }
        return n2;
    }

    public final boolean g(int i2, Object obj, int i3) {
        int e2 = 1 << TrieNodeKt.e(i2, i3);
        if (n(e2)) {
            return Intrinsics.d(obj, p(j(e2)));
        }
        if (!o(e2)) {
            return false;
        }
        TrieNode I = I(J(e2));
        return i3 == 30 ? I.d(obj) : I.g(i2, obj, i3 + 5);
    }

    public final boolean h(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f41286b != trieNode.f41286b || this.f41285a != trieNode.f41285a) {
            return false;
        }
        int length = this.f41288d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f41288d[i2] != trieNode.f41288d[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int i() {
        return Integer.bitCount(this.f41285a);
    }

    public final int j(int i2) {
        return Integer.bitCount((i2 - 1) & this.f41285a) * 2;
    }

    public final boolean k(TrieNode trieNode, Function2 function2) {
        int i2;
        boolean z2;
        Intrinsics.i(trieNode, "that");
        Intrinsics.i(function2, "equalityComparator");
        if (this == trieNode) {
            return true;
        }
        int i3 = this.f41285a;
        if (i3 != trieNode.f41285a || (i2 = this.f41286b) != trieNode.f41286b) {
            return false;
        }
        if (i3 == 0 && i2 == 0) {
            Object[] objArr = this.f41288d;
            if (objArr.length != trieNode.f41288d.length) {
                return false;
            }
            IntProgression u2 = RangesKt.u(RangesKt.v(0, objArr.length), 2);
            if ((u2 instanceof Collection) && ((Collection) u2).isEmpty()) {
                return true;
            }
            Iterator it = u2.iterator();
            while (it.hasNext()) {
                int b2 = ((IntIterator) it).b();
                Object p2 = trieNode.p(b2);
                Object K = trieNode.K(b2);
                int f2 = f(p2);
                if (f2 != -1) {
                    z2 = ((Boolean) function2.m(K(f2), K)).booleanValue();
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    return false;
                }
            }
            return true;
        }
        int bitCount = Integer.bitCount(i3) * 2;
        IntProgression u3 = RangesKt.u(RangesKt.v(0, bitCount), 2);
        int n2 = u3.n();
        int o2 = u3.o();
        int p3 = u3.p();
        if ((p3 > 0 && n2 <= o2) || (p3 < 0 && o2 <= n2)) {
            while (Intrinsics.d(p(n2), trieNode.p(n2)) && ((Boolean) function2.m(K(n2), trieNode.K(n2))).booleanValue()) {
                if (n2 != o2) {
                    n2 += p3;
                }
            }
            return false;
        }
        int length = this.f41288d.length;
        while (bitCount < length) {
            if (!I(bitCount).k(trieNode.I(bitCount), function2)) {
                return false;
            }
            bitCount++;
        }
        return true;
    }

    public final Object l(int i2, Object obj, int i3) {
        int e2 = 1 << TrieNodeKt.e(i2, i3);
        if (n(e2)) {
            int j2 = j(e2);
            if (Intrinsics.d(obj, p(j2))) {
                return K(j2);
            }
            return null;
        } else if (!o(e2)) {
            return null;
        } else {
            TrieNode I = I(J(e2));
            return i3 == 30 ? I.e(obj) : I.l(i2, obj, i3 + 5);
        }
    }

    public final Object[] m() {
        return this.f41288d;
    }

    public final boolean n(int i2) {
        return (i2 & this.f41285a) != 0;
    }

    public final boolean o(int i2) {
        return (i2 & this.f41286b) != 0;
    }

    public final Object p(int i2) {
        return this.f41288d[i2];
    }

    public final TrieNode q(int i2, Object obj, Object obj2, int i3, Object obj3, Object obj4, int i4, MutabilityOwnership mutabilityOwnership) {
        Object obj5 = obj;
        Object obj6 = obj2;
        Object obj7 = obj3;
        Object obj8 = obj4;
        int i5 = i4;
        MutabilityOwnership mutabilityOwnership2 = mutabilityOwnership;
        if (i5 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj6, obj7, obj8}, mutabilityOwnership2);
        }
        int i6 = i2;
        int e2 = TrieNodeKt.e(i2, i5);
        int e3 = TrieNodeKt.e(i3, i5);
        if (e2 != e3) {
            return new TrieNode((1 << e2) | (1 << e3), 0, e2 < e3 ? new Object[]{obj5, obj6, obj7, obj8} : new Object[]{obj7, obj8, obj5, obj6}, mutabilityOwnership2);
        }
        return new TrieNode(0, 1 << e2, new Object[]{q(i2, obj, obj2, i3, obj3, obj4, i5 + 5, mutabilityOwnership)}, mutabilityOwnership2);
    }

    public final TrieNode r(Object obj, Object obj2, PersistentHashMapBuilder persistentHashMapBuilder) {
        int f2 = f(obj);
        if (f2 != -1) {
            persistentHashMapBuilder.k(K(f2));
            if (this.f41287c == persistentHashMapBuilder.i()) {
                this.f41288d[f2 + 1] = obj2;
                return this;
            }
            persistentHashMapBuilder.j(persistentHashMapBuilder.g() + 1);
            Object[] objArr = this.f41288d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[f2 + 1] = obj2;
            return new TrieNode(0, 0, copyOf, persistentHashMapBuilder.i());
        }
        persistentHashMapBuilder.m(persistentHashMapBuilder.size() + 1);
        return new TrieNode(0, 0, TrieNodeKt.f(this.f41288d, 0, obj, obj2), persistentHashMapBuilder.i());
    }

    public final TrieNode s(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.a(this.f41286b == 0);
        CommonFunctionsKt.a(this.f41285a == 0);
        CommonFunctionsKt.a(trieNode.f41286b == 0);
        CommonFunctionsKt.a(trieNode.f41285a == 0);
        Object[] objArr = this.f41288d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f41288d.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        int length = this.f41288d.length;
        IntProgression u2 = RangesKt.u(RangesKt.v(0, trieNode.f41288d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
            while (true) {
                if (!d(trieNode.f41288d[n2])) {
                    Object[] objArr2 = trieNode.f41288d;
                    copyOf[length] = objArr2[n2];
                    copyOf[length + 1] = objArr2[n2 + 1];
                    length += 2;
                } else {
                    deltaCounter.c(deltaCounter.a() + 1);
                }
                if (n2 == o2) {
                    break;
                }
                n2 += p2;
            }
        }
        if (length == this.f41288d.length) {
            return this;
        }
        if (length == trieNode.f41288d.length) {
            return trieNode;
        }
        if (length == copyOf.length) {
            return new TrieNode(0, 0, copyOf, mutabilityOwnership);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        Intrinsics.h(copyOf2, "copyOf(...)");
        return new TrieNode(0, 0, copyOf2, mutabilityOwnership);
    }

    public final TrieNode t(Object obj, Object obj2, PersistentHashMapBuilder persistentHashMapBuilder) {
        int f2 = f(obj);
        return (f2 == -1 || !Intrinsics.d(obj2, K(f2))) ? this : v(f2, persistentHashMapBuilder);
    }

    public final TrieNode u(Object obj, PersistentHashMapBuilder persistentHashMapBuilder) {
        int f2 = f(obj);
        return f2 != -1 ? v(f2, persistentHashMapBuilder) : this;
    }

    public final TrieNode v(int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.m(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.k(K(i2));
        if (this.f41288d.length == 2) {
            return null;
        }
        if (this.f41287c != persistentHashMapBuilder.i()) {
            return new TrieNode(0, 0, TrieNodeKt.g(this.f41288d, i2), persistentHashMapBuilder.i());
        }
        this.f41288d = TrieNodeKt.g(this.f41288d, i2);
        return this;
    }

    public final TrieNode w(int i2, Object obj, Object obj2, MutabilityOwnership mutabilityOwnership) {
        int j2 = j(i2);
        if (this.f41287c == mutabilityOwnership) {
            this.f41288d = TrieNodeKt.f(this.f41288d, j2, obj, obj2);
            this.f41285a = i2 | this.f41285a;
            return this;
        }
        return new TrieNode(i2 | this.f41285a, this.f41286b, TrieNodeKt.f(this.f41288d, j2, obj, obj2), mutabilityOwnership);
    }

    public final TrieNode x(int i2, int i3, int i4, Object obj, Object obj2, int i5, MutabilityOwnership mutabilityOwnership) {
        if (this.f41287c == mutabilityOwnership) {
            this.f41288d = b(i2, i3, i4, obj, obj2, i5, mutabilityOwnership);
            this.f41285a ^= i3;
            this.f41286b |= i3;
            return this;
        }
        return new TrieNode(this.f41285a ^ i3, i3 | this.f41286b, b(i2, i3, i4, obj, obj2, i5, mutabilityOwnership), mutabilityOwnership);
    }

    public final TrieNode y(int i2, Object obj, Object obj2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.i(persistentHashMapBuilder, "mutator");
        int e2 = 1 << TrieNodeKt.e(i2, i3);
        if (n(e2)) {
            int j2 = j(e2);
            if (Intrinsics.d(obj, p(j2))) {
                persistentHashMapBuilder.k(K(j2));
                return K(j2) == obj2 ? this : H(j2, obj2, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.m(persistentHashMapBuilder.size() + 1);
            return x(j2, e2, i2, obj, obj2, i3, persistentHashMapBuilder.i());
        } else if (o(e2)) {
            int J = J(e2);
            TrieNode I = I(J);
            TrieNode r2 = i3 == 30 ? I.r(obj, obj2, persistentHashMapBuilder) : I.y(i2, obj, obj2, i3 + 5, persistentHashMapBuilder);
            return I == r2 ? this : G(J, r2, persistentHashMapBuilder.i());
        } else {
            persistentHashMapBuilder.m(persistentHashMapBuilder.size() + 1);
            return w(e2, obj, obj2, persistentHashMapBuilder.i());
        }
    }

    public final TrieNode z(TrieNode trieNode, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode trieNode2 = trieNode;
        DeltaCounter deltaCounter2 = deltaCounter;
        Intrinsics.i(trieNode2, "otherNode");
        Intrinsics.i(deltaCounter2, "intersectionCounter");
        Intrinsics.i(persistentHashMapBuilder, "mutator");
        if (this == trieNode2) {
            deltaCounter2.b(c());
            return this;
        } else if (i2 > 30) {
            return s(trieNode2, deltaCounter2, persistentHashMapBuilder.i());
        } else {
            int i3 = this.f41286b | trieNode2.f41286b;
            int i4 = this.f41285a;
            int i5 = trieNode2.f41285a;
            int i6 = i4 & i5;
            int i7 = (i4 ^ i5) & (~i3);
            while (i6 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i6);
                if (Intrinsics.d(p(j(lowestOneBit)), trieNode2.p(trieNode2.j(lowestOneBit)))) {
                    i7 |= lowestOneBit;
                } else {
                    i3 |= lowestOneBit;
                }
                i6 ^= lowestOneBit;
            }
            if ((i3 & i7) == 0) {
                TrieNode trieNode3 = (Intrinsics.d(this.f41287c, persistentHashMapBuilder.i()) && this.f41285a == i7 && this.f41286b == i3) ? this : new TrieNode(i7, i3, new Object[((Integer.bitCount(i7) * 2) + Integer.bitCount(i3))]);
                int i8 = 0;
                int i9 = i3;
                int i10 = 0;
                while (i9 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i9);
                    Object[] objArr = trieNode3.f41288d;
                    objArr[(objArr.length - 1) - i10] = A(trieNode, lowestOneBit2, i2, deltaCounter, persistentHashMapBuilder);
                    i10++;
                    i9 ^= lowestOneBit2;
                }
                while (i7 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i7);
                    int i11 = i8 * 2;
                    if (!trieNode2.n(lowestOneBit3)) {
                        int j2 = j(lowestOneBit3);
                        trieNode3.f41288d[i11] = p(j2);
                        trieNode3.f41288d[i11 + 1] = K(j2);
                    } else {
                        int j3 = trieNode2.j(lowestOneBit3);
                        trieNode3.f41288d[i11] = trieNode2.p(j3);
                        trieNode3.f41288d[i11 + 1] = trieNode2.K(j3);
                        if (n(lowestOneBit3)) {
                            deltaCounter2.c(deltaCounter.a() + 1);
                        }
                    }
                    i8++;
                    i7 ^= lowestOneBit3;
                }
                return h(trieNode3) ? this : trieNode2.h(trieNode3) ? trieNode2 : trieNode3;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrieNode(int i2, int i3, Object[] objArr) {
        this(i2, i3, objArr, (MutabilityOwnership) null);
        Intrinsics.i(objArr, "buffer");
    }
}
