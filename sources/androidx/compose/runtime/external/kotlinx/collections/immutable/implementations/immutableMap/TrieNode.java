package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata
public final class TrieNode<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f15056e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f15057f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final TrieNode f15058g = new TrieNode(0, 0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    public int f15059a;

    /* renamed from: b  reason: collision with root package name */
    public int f15060b;

    /* renamed from: c  reason: collision with root package name */
    public final MutabilityOwnership f15061c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f15062d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TrieNode a() {
            return TrieNode.f15058g;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ModificationResult<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public TrieNode f15063a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15064b;

        public ModificationResult(TrieNode trieNode, int i2) {
            this.f15063a = trieNode;
            this.f15064b = i2;
        }

        public final TrieNode a() {
            return this.f15063a;
        }

        public final int b() {
            return this.f15064b;
        }

        public final void c(TrieNode trieNode) {
            this.f15063a = trieNode;
        }
    }

    public TrieNode(int i2, int i3, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.f15059a = i2;
        this.f15060b = i3;
        this.f15061c = mutabilityOwnership;
        this.f15062d = objArr;
    }

    public final TrieNode A(int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.n(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.k(W(i2));
        if (this.f15062d.length == 2) {
            return null;
        }
        if (this.f15061c != persistentHashMapBuilder.i()) {
            return new TrieNode(0, 0, TrieNodeKt.h(this.f15062d, i2), persistentHashMapBuilder.i());
        }
        this.f15062d = TrieNodeKt.h(this.f15062d, i2);
        return this;
    }

    public final TrieNode B(int i2, Object obj, Object obj2, MutabilityOwnership mutabilityOwnership) {
        int n2 = n(i2);
        if (this.f15061c == mutabilityOwnership) {
            this.f15062d = TrieNodeKt.g(this.f15062d, n2, obj, obj2);
            this.f15059a = i2 | this.f15059a;
            return this;
        }
        return new TrieNode(i2 | this.f15059a, this.f15060b, TrieNodeKt.g(this.f15062d, n2, obj, obj2), mutabilityOwnership);
    }

    public final TrieNode C(int i2, int i3, int i4, Object obj, Object obj2, int i5, MutabilityOwnership mutabilityOwnership) {
        if (this.f15061c == mutabilityOwnership) {
            this.f15062d = d(i2, i3, i4, obj, obj2, i5, mutabilityOwnership);
            this.f15059a ^= i3;
            this.f15060b |= i3;
            return this;
        }
        return new TrieNode(this.f15059a ^ i3, i3 | this.f15060b, d(i2, i3, i4, obj, obj2, i5, mutabilityOwnership), mutabilityOwnership);
    }

    public final TrieNode D(int i2, Object obj, Object obj2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        int f2 = 1 << TrieNodeKt.f(i2, i3);
        if (q(f2)) {
            int n2 = n(f2);
            if (Intrinsics.d(obj, t(n2))) {
                persistentHashMapBuilder.k(W(n2));
                return W(n2) == obj2 ? this : M(n2, obj2, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.n(persistentHashMapBuilder.size() + 1);
            return C(n2, f2, i2, obj, obj2, i3, persistentHashMapBuilder.i());
        } else if (r(f2)) {
            int O = O(f2);
            TrieNode N = N(O);
            TrieNode w2 = i3 == 30 ? N.w(obj, obj2, persistentHashMapBuilder) : N.D(i2, obj, obj2, i3 + 5, persistentHashMapBuilder);
            return N == w2 ? this : L(O, w2, persistentHashMapBuilder.i());
        } else {
            persistentHashMapBuilder.n(persistentHashMapBuilder.size() + 1);
            return B(f2, obj, obj2, persistentHashMapBuilder.i());
        }
    }

    public final TrieNode E(TrieNode trieNode, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode trieNode2 = trieNode;
        DeltaCounter deltaCounter2 = deltaCounter;
        if (this == trieNode2) {
            deltaCounter2.b(e());
            return this;
        } else if (i2 > 30) {
            return x(trieNode2, deltaCounter2, persistentHashMapBuilder.i());
        } else {
            int i3 = this.f15060b | trieNode2.f15060b;
            int i4 = this.f15059a;
            int i5 = trieNode2.f15059a;
            int i6 = i4 & i5;
            int i7 = (i4 ^ i5) & (~i3);
            while (i6 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i6);
                if (Intrinsics.d(t(n(lowestOneBit)), trieNode2.t(trieNode2.n(lowestOneBit)))) {
                    i7 |= lowestOneBit;
                } else {
                    i3 |= lowestOneBit;
                }
                i6 ^= lowestOneBit;
            }
            int i8 = 0;
            if (!((i3 & i7) == 0)) {
                PreconditionsKt.b("Check failed.");
            }
            TrieNode trieNode3 = (Intrinsics.d(this.f15061c, persistentHashMapBuilder.i()) && this.f15059a == i7 && this.f15060b == i3) ? this : new TrieNode(i7, i3, new Object[((Integer.bitCount(i7) * 2) + Integer.bitCount(i3))]);
            int i9 = i3;
            int i10 = 0;
            while (i9 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i9);
                Object[] objArr = trieNode3.f15062d;
                objArr[(objArr.length - 1) - i10] = F(trieNode, lowestOneBit2, i2, deltaCounter, persistentHashMapBuilder);
                i10++;
                i9 ^= lowestOneBit2;
            }
            while (i7 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i7);
                int i11 = i8 * 2;
                if (!trieNode2.q(lowestOneBit3)) {
                    int n2 = n(lowestOneBit3);
                    trieNode3.f15062d[i11] = t(n2);
                    trieNode3.f15062d[i11 + 1] = W(n2);
                } else {
                    int n3 = trieNode2.n(lowestOneBit3);
                    trieNode3.f15062d[i11] = trieNode2.t(n3);
                    trieNode3.f15062d[i11 + 1] = trieNode2.W(n3);
                    if (q(lowestOneBit3)) {
                        deltaCounter2.c(deltaCounter.a() + 1);
                    }
                }
                i8++;
                i7 ^= lowestOneBit3;
            }
            return l(trieNode3) ? this : trieNode2.l(trieNode3) ? trieNode2 : trieNode3;
        }
    }

    public final TrieNode F(TrieNode trieNode, int i2, int i3, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode trieNode2 = trieNode;
        int i4 = i2;
        DeltaCounter deltaCounter2 = deltaCounter;
        int i5 = 0;
        if (r(i4)) {
            TrieNode N = N(O(i4));
            if (trieNode.r(i2)) {
                return N.E(trieNode2.N(trieNode.O(i2)), i3 + 5, deltaCounter2, persistentHashMapBuilder);
            }
            PersistentHashMapBuilder persistentHashMapBuilder2 = persistentHashMapBuilder;
            if (!trieNode.q(i2)) {
                return N;
            }
            int n2 = trieNode.n(i2);
            Object t2 = trieNode2.t(n2);
            Object W = trieNode2.W(n2);
            int size = persistentHashMapBuilder.size();
            if (t2 != null) {
                i5 = t2.hashCode();
            }
            TrieNode D = N.D(i5, t2, W, i3 + 5, persistentHashMapBuilder);
            if (persistentHashMapBuilder.size() != size) {
                return D;
            }
            deltaCounter2.c(deltaCounter.a() + 1);
            return D;
        }
        PersistentHashMapBuilder persistentHashMapBuilder3 = persistentHashMapBuilder;
        if (trieNode.r(i2)) {
            TrieNode N2 = trieNode2.N(trieNode.O(i2));
            if (q(i4)) {
                int n3 = n(i4);
                Object t3 = t(n3);
                int i6 = i3 + 5;
                if (N2.k(t3 != null ? t3.hashCode() : 0, t3, i6)) {
                    deltaCounter2.c(deltaCounter.a() + 1);
                } else {
                    Object W2 = W(n3);
                    if (t3 != null) {
                        i5 = t3.hashCode();
                    }
                    return N2.D(i5, t3, W2, i6, persistentHashMapBuilder);
                }
            }
            return N2;
        }
        int n4 = n(i4);
        Object t4 = t(n4);
        Object W3 = W(n4);
        int n5 = trieNode.n(i2);
        Object t5 = trieNode2.t(n5);
        Object W4 = trieNode2.W(n5);
        int hashCode = t4 != null ? t4.hashCode() : 0;
        if (t5 != null) {
            i5 = t5.hashCode();
        }
        return u(hashCode, t4, W3, i5, t5, W4, i3 + 5, persistentHashMapBuilder.i());
    }

    public final TrieNode G(int i2, Object obj, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        int f2 = 1 << TrieNodeKt.f(i2, i3);
        if (q(f2)) {
            int n2 = n(f2);
            return Intrinsics.d(obj, t(n2)) ? I(n2, f2, persistentHashMapBuilder) : this;
        } else if (!r(f2)) {
            return this;
        } else {
            int O = O(f2);
            TrieNode N = N(O);
            return K(N, i3 == 30 ? N.y(obj, persistentHashMapBuilder) : N.G(i2, obj, i3 + 5, persistentHashMapBuilder), O, f2, persistentHashMapBuilder.i());
        }
    }

    public final TrieNode H(int i2, Object obj, Object obj2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object obj3 = obj;
        Object obj4 = obj2;
        int i4 = i3;
        PersistentHashMapBuilder persistentHashMapBuilder2 = persistentHashMapBuilder;
        int i5 = i2;
        int f2 = 1 << TrieNodeKt.f(i2, i3);
        if (q(f2)) {
            int n2 = n(f2);
            return (!Intrinsics.d(obj, t(n2)) || !Intrinsics.d(obj2, W(n2))) ? this : I(n2, f2, persistentHashMapBuilder2);
        } else if (!r(f2)) {
            return this;
        } else {
            int O = O(f2);
            TrieNode N = N(O);
            return K(N, i4 == 30 ? N.z(obj, obj2, persistentHashMapBuilder2) : N.H(i2, obj, obj2, i4 + 5, persistentHashMapBuilder), O, f2, persistentHashMapBuilder.i());
        }
    }

    public final TrieNode I(int i2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.n(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.k(W(i2));
        if (this.f15062d.length == 2) {
            return null;
        }
        if (this.f15061c == persistentHashMapBuilder.i()) {
            this.f15062d = TrieNodeKt.h(this.f15062d, i2);
            this.f15059a ^= i3;
            return this;
        }
        return new TrieNode(i3 ^ this.f15059a, this.f15060b, TrieNodeKt.h(this.f15062d, i2), persistentHashMapBuilder.i());
    }

    public final TrieNode J(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.f15062d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f15061c == mutabilityOwnership) {
            this.f15062d = TrieNodeKt.i(objArr, i2);
            this.f15060b ^= i3;
            return this;
        }
        return new TrieNode(this.f15059a, i3 ^ this.f15060b, TrieNodeKt.i(objArr, i2), mutabilityOwnership);
    }

    public final TrieNode K(TrieNode trieNode, TrieNode trieNode2, int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        return trieNode2 == null ? J(i2, i3, mutabilityOwnership) : (this.f15061c == mutabilityOwnership || trieNode != trieNode2) ? L(i2, trieNode2, mutabilityOwnership) : this;
    }

    public final TrieNode L(int i2, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.f15062d;
        if (objArr.length == 1 && trieNode.f15062d.length == 2 && trieNode.f15060b == 0) {
            trieNode.f15059a = this.f15060b;
            return trieNode;
        } else if (this.f15061c == mutabilityOwnership) {
            objArr[i2] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[i2] = trieNode;
            return new TrieNode(this.f15059a, this.f15060b, copyOf, mutabilityOwnership);
        }
    }

    public final TrieNode M(int i2, Object obj, PersistentHashMapBuilder persistentHashMapBuilder) {
        if (this.f15061c == persistentHashMapBuilder.i()) {
            this.f15062d[i2 + 1] = obj;
            return this;
        }
        persistentHashMapBuilder.j(persistentHashMapBuilder.g() + 1);
        Object[] objArr = this.f15062d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        copyOf[i2 + 1] = obj;
        return new TrieNode(this.f15059a, this.f15060b, copyOf, persistentHashMapBuilder.i());
    }

    public final TrieNode N(int i2) {
        Object obj = this.f15062d[i2];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int O(int i2) {
        return (this.f15062d.length - 1) - Integer.bitCount((i2 - 1) & this.f15060b);
    }

    public final ModificationResult P(int i2, Object obj, Object obj2, int i3) {
        ModificationResult modificationResult;
        int f2 = 1 << TrieNodeKt.f(i2, i3);
        if (q(f2)) {
            int n2 = n(f2);
            if (!Intrinsics.d(obj, t(n2))) {
                return v(n2, f2, i2, obj, obj2, i3).b();
            }
            if (W(n2) == obj2) {
                return null;
            }
            return V(n2, obj2).c();
        } else if (!r(f2)) {
            return s(f2, obj, obj2).b();
        } else {
            int O = O(f2);
            TrieNode N = N(O);
            if (i3 == 30) {
                modificationResult = N.h(obj, obj2);
                if (modificationResult == null) {
                    return null;
                }
            } else {
                modificationResult = N.P(i2, obj, obj2, i3 + 5);
                if (modificationResult == null) {
                    return null;
                }
            }
            modificationResult.c(U(O, f2, modificationResult.a()));
            return modificationResult;
        }
    }

    public final TrieNode Q(int i2, Object obj, int i3) {
        int f2 = 1 << TrieNodeKt.f(i2, i3);
        if (q(f2)) {
            int n2 = n(f2);
            return Intrinsics.d(obj, t(n2)) ? R(n2, f2) : this;
        } else if (!r(f2)) {
            return this;
        } else {
            int O = O(f2);
            TrieNode N = N(O);
            return T(N, i3 == 30 ? N.i(obj) : N.Q(i2, obj, i3 + 5), O, f2);
        }
    }

    public final TrieNode R(int i2, int i3) {
        Object[] objArr = this.f15062d;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode(i3 ^ this.f15059a, this.f15060b, TrieNodeKt.h(objArr, i2));
    }

    public final TrieNode S(int i2, int i3) {
        Object[] objArr = this.f15062d;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode(this.f15059a, i3 ^ this.f15060b, TrieNodeKt.i(objArr, i2));
    }

    public final TrieNode T(TrieNode trieNode, TrieNode trieNode2, int i2, int i3) {
        return trieNode2 == null ? S(i2, i3) : trieNode != trieNode2 ? U(i2, i3, trieNode2) : this;
    }

    public final TrieNode U(int i2, int i3, TrieNode trieNode) {
        Object[] objArr = trieNode.f15062d;
        if (objArr.length != 2 || trieNode.f15060b != 0) {
            Object[] objArr2 = this.f15062d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[i2] = trieNode;
            return new TrieNode(this.f15059a, this.f15060b, copyOf);
        } else if (this.f15062d.length == 1) {
            trieNode.f15059a = this.f15060b;
            return trieNode;
        } else {
            return new TrieNode(this.f15059a ^ i3, i3 ^ this.f15060b, TrieNodeKt.k(this.f15062d, i2, n(i3), objArr[0], objArr[1]));
        }
    }

    public final TrieNode V(int i2, Object obj) {
        Object[] objArr = this.f15062d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        copyOf[i2 + 1] = obj;
        return new TrieNode(this.f15059a, this.f15060b, copyOf);
    }

    public final Object W(int i2) {
        return this.f15062d[i2 + 1];
    }

    public final ModificationResult b() {
        return new ModificationResult(this, 1);
    }

    public final ModificationResult c() {
        return new ModificationResult(this, 0);
    }

    public final Object[] d(int i2, int i3, int i4, Object obj, Object obj2, int i5, MutabilityOwnership mutabilityOwnership) {
        Object t2 = t(i2);
        int i6 = i3;
        int i7 = i2;
        return TrieNodeKt.j(this.f15062d, i2, O(i3) + 1, u(t2 != null ? t2.hashCode() : 0, t2, W(i2), i4, obj, obj2, i5 + 5, mutabilityOwnership));
    }

    public final int e() {
        if (this.f15060b == 0) {
            return this.f15062d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f15059a);
        int length = this.f15062d.length;
        for (int i2 = bitCount * 2; i2 < length; i2++) {
            bitCount += N(i2).e();
        }
        return bitCount;
    }

    public final boolean f(Object obj) {
        IntProgression u2 = RangesKt.u(RangesKt.v(0, this.f15062d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
            while (!Intrinsics.d(obj, this.f15062d[n2])) {
                if (n2 != o2) {
                    n2 += p2;
                }
            }
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        IntProgression u2 = RangesKt.u(RangesKt.v(0, this.f15062d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 <= 0 || n2 > o2) && (p2 >= 0 || o2 > n2)) {
            return null;
        }
        while (!Intrinsics.d(obj, t(n2))) {
            if (n2 == o2) {
                return null;
            }
            n2 += p2;
        }
        return W(n2);
    }

    public final ModificationResult h(Object obj, Object obj2) {
        IntProgression u2 = RangesKt.u(RangesKt.v(0, this.f15062d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
            while (!Intrinsics.d(obj, t(n2))) {
                if (n2 != o2) {
                    n2 += p2;
                }
            }
            if (obj2 == W(n2)) {
                return null;
            }
            Object[] objArr = this.f15062d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[n2 + 1] = obj2;
            return new TrieNode(0, 0, copyOf).c();
        }
        return new TrieNode(0, 0, TrieNodeKt.g(this.f15062d, 0, obj, obj2)).b();
    }

    public final TrieNode i(Object obj) {
        IntProgression u2 = RangesKt.u(RangesKt.v(0, this.f15062d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
            while (!Intrinsics.d(obj, t(n2))) {
                if (n2 != o2) {
                    n2 += p2;
                }
            }
            return j(n2);
        }
        return this;
    }

    public final TrieNode j(int i2) {
        Object[] objArr = this.f15062d;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode(0, 0, TrieNodeKt.h(objArr, i2));
    }

    public final boolean k(int i2, Object obj, int i3) {
        int f2 = 1 << TrieNodeKt.f(i2, i3);
        if (q(f2)) {
            return Intrinsics.d(obj, t(n(f2)));
        }
        if (!r(f2)) {
            return false;
        }
        TrieNode N = N(O(f2));
        return i3 == 30 ? N.f(obj) : N.k(i2, obj, i3 + 5);
    }

    public final boolean l(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f15060b != trieNode.f15060b || this.f15059a != trieNode.f15059a) {
            return false;
        }
        int length = this.f15062d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f15062d[i2] != trieNode.f15062d[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int m() {
        return Integer.bitCount(this.f15059a);
    }

    public final int n(int i2) {
        return Integer.bitCount((i2 - 1) & this.f15059a) * 2;
    }

    public final Object o(int i2, Object obj, int i3) {
        int f2 = 1 << TrieNodeKt.f(i2, i3);
        if (q(f2)) {
            int n2 = n(f2);
            if (Intrinsics.d(obj, t(n2))) {
                return W(n2);
            }
            return null;
        } else if (!r(f2)) {
            return null;
        } else {
            TrieNode N = N(O(f2));
            return i3 == 30 ? N.g(obj) : N.o(i2, obj, i3 + 5);
        }
    }

    public final Object[] p() {
        return this.f15062d;
    }

    public final boolean q(int i2) {
        return (i2 & this.f15059a) != 0;
    }

    public final boolean r(int i2) {
        return (i2 & this.f15060b) != 0;
    }

    public final TrieNode s(int i2, Object obj, Object obj2) {
        return new TrieNode(i2 | this.f15059a, this.f15060b, TrieNodeKt.g(this.f15062d, n(i2), obj, obj2));
    }

    public final Object t(int i2) {
        return this.f15062d[i2];
    }

    public final TrieNode u(int i2, Object obj, Object obj2, int i3, Object obj3, Object obj4, int i4, MutabilityOwnership mutabilityOwnership) {
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
        int f2 = TrieNodeKt.f(i2, i5);
        int f3 = TrieNodeKt.f(i3, i5);
        if (f2 != f3) {
            return new TrieNode((1 << f2) | (1 << f3), 0, f2 < f3 ? new Object[]{obj5, obj6, obj7, obj8} : new Object[]{obj7, obj8, obj5, obj6}, mutabilityOwnership2);
        }
        return new TrieNode(0, 1 << f2, new Object[]{u(i2, obj, obj2, i3, obj3, obj4, i5 + 5, mutabilityOwnership)}, mutabilityOwnership2);
    }

    public final TrieNode v(int i2, int i3, int i4, Object obj, Object obj2, int i5) {
        return new TrieNode(this.f15059a ^ i3, i3 | this.f15060b, d(i2, i3, i4, obj, obj2, i5, (MutabilityOwnership) null));
    }

    public final TrieNode w(Object obj, Object obj2, PersistentHashMapBuilder persistentHashMapBuilder) {
        IntProgression u2 = RangesKt.u(RangesKt.v(0, this.f15062d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
            while (!Intrinsics.d(obj, t(n2))) {
                if (n2 != o2) {
                    n2 += p2;
                }
            }
            persistentHashMapBuilder.k(W(n2));
            if (this.f15061c == persistentHashMapBuilder.i()) {
                this.f15062d[n2 + 1] = obj2;
                return this;
            }
            persistentHashMapBuilder.j(persistentHashMapBuilder.g() + 1);
            Object[] objArr = this.f15062d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.h(copyOf, "copyOf(...)");
            copyOf[n2 + 1] = obj2;
            return new TrieNode(0, 0, copyOf, persistentHashMapBuilder.i());
        }
        persistentHashMapBuilder.n(persistentHashMapBuilder.size() + 1);
        return new TrieNode(0, 0, TrieNodeKt.g(this.f15062d, 0, obj, obj2), persistentHashMapBuilder.i());
    }

    public final TrieNode x(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.a(this.f15060b == 0);
        CommonFunctionsKt.a(this.f15059a == 0);
        CommonFunctionsKt.a(trieNode.f15060b == 0);
        CommonFunctionsKt.a(trieNode.f15059a == 0);
        Object[] objArr = this.f15062d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f15062d.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        int length = this.f15062d.length;
        IntProgression u2 = RangesKt.u(RangesKt.v(0, trieNode.f15062d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
            while (true) {
                if (!f(trieNode.f15062d[n2])) {
                    Object[] objArr2 = trieNode.f15062d;
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
        if (length == this.f15062d.length) {
            return this;
        }
        if (length == trieNode.f15062d.length) {
            return trieNode;
        }
        if (length == copyOf.length) {
            return new TrieNode(0, 0, copyOf, mutabilityOwnership);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        Intrinsics.h(copyOf2, "copyOf(...)");
        return new TrieNode(0, 0, copyOf2, mutabilityOwnership);
    }

    public final TrieNode y(Object obj, PersistentHashMapBuilder persistentHashMapBuilder) {
        IntProgression u2 = RangesKt.u(RangesKt.v(0, this.f15062d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
            while (!Intrinsics.d(obj, t(n2))) {
                if (n2 != o2) {
                    n2 += p2;
                }
            }
            return A(n2, persistentHashMapBuilder);
        }
        return this;
    }

    public final TrieNode z(Object obj, Object obj2, PersistentHashMapBuilder persistentHashMapBuilder) {
        IntProgression u2 = RangesKt.u(RangesKt.v(0, this.f15062d.length), 2);
        int n2 = u2.n();
        int o2 = u2.o();
        int p2 = u2.p();
        if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
            while (true) {
                if (!Intrinsics.d(obj, t(n2)) || !Intrinsics.d(obj2, W(n2))) {
                    if (n2 == o2) {
                        break;
                    }
                    n2 += p2;
                } else {
                    return A(n2, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    public TrieNode(int i2, int i3, Object[] objArr) {
        this(i2, i3, objArr, (MutabilityOwnership) null);
    }
}
