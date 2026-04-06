package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TrieNode<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f15076d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f15077e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final TrieNode f15078f = new TrieNode(0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    public int f15079a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f15080b;

    /* renamed from: c  reason: collision with root package name */
    public MutabilityOwnership f15081c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TrieNode a() {
            return TrieNode.f15078f;
        }

        public Companion() {
        }
    }

    public TrieNode(int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.f15079a = i2;
        this.f15080b = objArr;
        this.f15081c = mutabilityOwnership;
    }

    public final TrieNode A(int i2, MutabilityOwnership mutabilityOwnership) {
        if (this.f15081c != mutabilityOwnership) {
            return new TrieNode(0, TrieNodeKt.e(this.f15080b, i2), mutabilityOwnership);
        }
        this.f15080b = TrieNodeKt.e(this.f15080b, i2);
        return this;
    }

    public final Object B(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.b(this.f15080b.length);
            return this;
        }
        Object[] objArr = Intrinsics.d(mutabilityOwnership, this.f15081c) ? this.f15080b : new Object[Math.min(this.f15080b.length, trieNode.f15080b.length)];
        Object[] objArr2 = this.f15080b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.a(i3 <= i2);
            if (trieNode.f(objArr2[i2])) {
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
            return f15078f;
        }
        if (i3 == 1) {
            return objArr[0];
        }
        if (i3 == this.f15080b.length) {
            return this;
        }
        if (i3 == trieNode.f15080b.length) {
            return trieNode;
        }
        if (i3 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i3);
        Intrinsics.h(copyOf, "copyOf(...)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    public final TrieNode C(int i2, int i3, Object obj, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.f15081c == mutabilityOwnership) {
            this.f15080b[i2] = r(i2, i3, obj, i4, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.f15080b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        copyOf[i2] = r(i2, i3, obj, i4, mutabilityOwnership);
        return new TrieNode(this.f15079a, copyOf, mutabilityOwnership);
    }

    public final TrieNode D(int i2, Object obj, int i3, PersistentHashSetBuilder persistentHashSetBuilder) {
        int d2 = 1 << TrieNodeKt.d(i2, i3);
        if (o(d2)) {
            return this;
        }
        int p2 = p(d2);
        Object obj2 = this.f15080b[p2];
        if (obj2 instanceof TrieNode) {
            TrieNode I = I(p2);
            TrieNode y2 = i3 == 30 ? I.y(obj, persistentHashSetBuilder) : I.D(i2, obj, i3 + 5, persistentHashSetBuilder);
            return (this.f15081c == persistentHashSetBuilder.m() || I != y2) ? H(p2, y2, persistentHashSetBuilder.m()) : this;
        } else if (!Intrinsics.d(obj, obj2)) {
            return this;
        } else {
            persistentHashSetBuilder.n(persistentHashSetBuilder.size() - 1);
            return F(p2, d2, persistentHashSetBuilder.m());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r17, int r18, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r19, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            if (r0 != r1) goto L_0x0016
            int r1 = r16.d()
            r3.b(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r1 = f15078f
            return r1
        L_0x0016:
            r5 = 30
            if (r2 <= r5) goto L_0x0023
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r2 = r20.m()
            java.lang.Object r1 = r0.z(r1, r3, r2)
            return r1
        L_0x0023:
            int r5 = r0.f15079a
            int r6 = r1.f15079a
            r5 = r5 & r6
            if (r5 != 0) goto L_0x002b
            return r0
        L_0x002b:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r6 = r0.f15081c
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r7 = r20.m()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L_0x0039
            r6 = r0
            goto L_0x0050
        L_0x0039:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            int r7 = r0.f15079a
            java.lang.Object[] r8 = r0.f15080b
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String r9 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.h(r8, r9)
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r9 = r20.m()
            r6.<init>(r7, r8, r9)
        L_0x0050:
            int r7 = r0.f15079a
        L_0x0052:
            if (r5 == 0) goto L_0x00ed
            int r10 = java.lang.Integer.lowestOneBit(r5)
            int r11 = r0.p(r10)
            int r12 = r1.p(r10)
            java.lang.Object[] r13 = r0.f15080b
            r13 = r13[r11]
            java.lang.Object[] r14 = r1.f15080b
            r12 = r14[r12]
            boolean r14 = r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            boolean r15 = r12 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            java.lang.String r8 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>"
            if (r14 == 0) goto L_0x0083
            if (r15 == 0) goto L_0x0083
            kotlin.jvm.internal.Intrinsics.g(r13, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r13
            kotlin.jvm.internal.Intrinsics.g(r12, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r12 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r12
            int r8 = r2 + 5
            java.lang.Object r13 = r13.E(r12, r8, r3, r4)
            goto L_0x00e1
        L_0x0083:
            if (r14 == 0) goto L_0x00b6
            kotlin.jvm.internal.Intrinsics.g(r13, r8)
            r8 = r13
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r8
            int r14 = r20.size()
            if (r12 == 0) goto L_0x0096
            int r15 = r12.hashCode()
            goto L_0x0097
        L_0x0096:
            r15 = 0
        L_0x0097:
            int r9 = r2 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = r8.D(r15, r12, r9, r4)
            int r9 = r20.size()
            if (r14 == r9) goto L_0x00e1
            r9 = 1
            r3.b(r9)
            java.lang.Object[] r12 = r8.f15080b
            int r13 = r12.length
            if (r13 != r9) goto L_0x00b4
            r9 = 0
            r13 = r12[r9]
            boolean r9 = r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r9 != 0) goto L_0x00b4
            goto L_0x00e1
        L_0x00b4:
            r13 = r8
            goto L_0x00e1
        L_0x00b6:
            r9 = 0
            if (r15 == 0) goto L_0x00d5
            kotlin.jvm.internal.Intrinsics.g(r12, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r12 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r12
            if (r13 == 0) goto L_0x00c5
            int r8 = r13.hashCode()
            goto L_0x00c6
        L_0x00c5:
            r8 = r9
        L_0x00c6:
            int r9 = r2 + 5
            boolean r8 = r12.i(r8, r13, r9)
            if (r8 == 0) goto L_0x00e1
            r8 = 1
            r3.b(r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = f15078f
            goto L_0x00e1
        L_0x00d5:
            r8 = 1
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r13, r12)
            if (r9 == 0) goto L_0x00e1
            r3.b(r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r13 = f15078f
        L_0x00e1:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r8 = f15078f
            if (r13 != r8) goto L_0x00e6
            r7 = r7 ^ r10
        L_0x00e6:
            java.lang.Object[] r8 = r6.f15080b
            r8[r11] = r13
            r5 = r5 ^ r10
            goto L_0x0052
        L_0x00ed:
            r9 = 0
            int r1 = java.lang.Integer.bitCount(r7)
            if (r7 != 0) goto L_0x00f8
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = f15078f
            goto L_0x0159
        L_0x00f8:
            int r3 = r0.f15079a
            if (r7 != r3) goto L_0x0104
            boolean r1 = r6.l(r0)
            if (r1 == 0) goto L_0x0159
            r6 = r0
            goto L_0x0159
        L_0x0104:
            r3 = 1
            if (r1 != r3) goto L_0x0124
            if (r2 == 0) goto L_0x0124
            java.lang.Object[] r1 = r6.f15080b
            int r2 = r6.p(r7)
            r6 = r1[r2]
            boolean r1 = r6 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r1 == 0) goto L_0x0159
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r1 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            java.lang.Object[] r2 = new java.lang.Object[]{r6}
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r3 = r20.m()
            r1.<init>(r7, r2, r3)
            r6 = r1
            goto L_0x0159
        L_0x0124:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object[] r5 = r6.f15080b
            r6 = r9
            r8 = r6
        L_0x012a:
            int r10 = r5.length
            if (r6 >= r10) goto L_0x0150
            if (r8 > r6) goto L_0x0131
            r10 = r3
            goto L_0x0132
        L_0x0131:
            r10 = r9
        L_0x0132:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.a(r10)
            r10 = r5[r6]
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode$Companion r11 = f15076d
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r11 = r11.a()
            if (r10 == r11) goto L_0x014d
            r10 = r5[r6]
            r2[r8] = r10
            int r8 = r8 + 1
            if (r8 > r1) goto L_0x0149
            r10 = r3
            goto L_0x014a
        L_0x0149:
            r10 = r9
        L_0x014a:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.a(r10)
        L_0x014d:
            int r6 = r6 + 1
            goto L_0x012a
        L_0x0150:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r6 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r1 = r20.m()
            r6.<init>(r7, r2, r1)
        L_0x0159:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.E(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    public final TrieNode F(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (this.f15081c == mutabilityOwnership) {
            this.f15080b = TrieNodeKt.e(this.f15080b, i2);
            this.f15079a ^= i3;
            return this;
        }
        return new TrieNode(i3 ^ this.f15079a, TrieNodeKt.e(this.f15080b, i2), mutabilityOwnership);
    }

    public final Object G(TrieNode trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode trieNode2;
        TrieNode trieNode3 = trieNode;
        int i3 = i2;
        DeltaCounter deltaCounter2 = deltaCounter;
        if (this == trieNode3) {
            deltaCounter2.b(d());
            return this;
        } else if (i3 > 30) {
            return B(trieNode3, deltaCounter2, persistentHashSetBuilder.m());
        } else {
            int i4 = this.f15079a & trieNode3.f15079a;
            if (i4 == 0) {
                return f15078f;
            }
            TrieNode trieNode4 = (!Intrinsics.d(this.f15081c, persistentHashSetBuilder.m()) || i4 != this.f15079a) ? new TrieNode(i4, new Object[Integer.bitCount(i4)], persistentHashSetBuilder.m()) : this;
            int i5 = i4;
            int i6 = 0;
            int i7 = 0;
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                int p2 = p(lowestOneBit);
                int p3 = trieNode3.p(lowestOneBit);
                Object obj = this.f15080b[p2];
                Object obj2 = trieNode3.f15080b[p3];
                boolean z2 = obj instanceof TrieNode;
                boolean z3 = obj2 instanceof TrieNode;
                if (z2 && z3) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    obj = ((TrieNode) obj).G((TrieNode) obj2, i3 + 5, deltaCounter2, persistentHashSetBuilder);
                } else if (z2) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    if (((TrieNode) obj).i(obj2 != null ? obj2.hashCode() : 0, obj2, i3 + 5)) {
                        deltaCounter2.b(1);
                        obj = obj2;
                    } else {
                        obj = f15078f;
                    }
                } else if (z3) {
                    Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    if (((TrieNode) obj2).i(obj != null ? obj.hashCode() : 0, obj, i3 + 5)) {
                        deltaCounter2.b(1);
                    } else {
                        obj = f15078f;
                    }
                } else if (Intrinsics.d(obj, obj2)) {
                    deltaCounter2.b(1);
                } else {
                    obj = f15078f;
                }
                if (obj != f15078f) {
                    i6 |= lowestOneBit;
                }
                trieNode4.f15080b[i7] = obj;
                i7++;
                i5 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i6);
            if (i6 == 0) {
                return f15078f;
            }
            if (i6 == i4) {
                return trieNode4.l(this) ? this : trieNode4.l(trieNode3) ? trieNode3 : trieNode4;
            }
            if (bitCount != 1 || i3 == 0) {
                Object[] objArr = new Object[bitCount];
                Object[] objArr2 = trieNode4.f15080b;
                int i8 = 0;
                int i9 = 0;
                while (i8 < objArr2.length) {
                    CommonFunctionsKt.a(i9 <= i8);
                    if (objArr2[i8] != f15076d.a()) {
                        objArr[i9] = objArr2[i8];
                        i9++;
                        CommonFunctionsKt.a(i9 <= bitCount);
                    }
                    i8++;
                }
                trieNode2 = new TrieNode(i6, objArr, persistentHashSetBuilder.m());
            } else {
                Object obj3 = trieNode4.f15080b[trieNode4.p(i6)];
                if (!(obj3 instanceof TrieNode)) {
                    return obj3;
                }
                trieNode2 = new TrieNode(i6, new Object[]{obj3}, persistentHashSetBuilder.m());
            }
            return trieNode2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode H(int r4, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r5, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r6) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r5.f15080b
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r1 != 0) goto L_0x0018
            java.lang.Object[] r1 = r3.f15080b
            int r1 = r1.length
            if (r1 != r2) goto L_0x0017
            int r4 = r3.f15079a
            r5.f15079a = r4
            return r5
        L_0x0017:
            r5 = r0
        L_0x0018:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r0 = r3.f15081c
            if (r0 != r6) goto L_0x0021
            java.lang.Object[] r6 = r3.f15080b
            r6[r4] = r5
            return r3
        L_0x0021:
            java.lang.Object[] r0 = r3.f15080b
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            r0[r4] = r5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r4 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            int r5 = r3.f15079a
            r4.<init>(r5, r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.H(int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode");
    }

    public final TrieNode I(int i2) {
        Object obj = this.f15080b[i2];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    public final TrieNode J(int i2, Object obj, int i3) {
        int d2 = 1 << TrieNodeKt.d(i2, i3);
        if (o(d2)) {
            return this;
        }
        int p2 = p(d2);
        Object obj2 = this.f15080b[p2];
        if (!(obj2 instanceof TrieNode)) {
            return Intrinsics.d(obj, obj2) ? K(p2, d2) : this;
        }
        TrieNode I = I(p2);
        TrieNode g2 = i3 == 30 ? I.g(obj) : I.J(i2, obj, i3 + 5);
        return I == g2 ? this : L(p2, g2);
    }

    public final TrieNode K(int i2, int i3) {
        return new TrieNode(i3 ^ this.f15079a, TrieNodeKt.e(this.f15080b, i2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode L(int r4, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r5) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r5.f15080b
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            if (r1 != 0) goto L_0x0018
            java.lang.Object[] r1 = r3.f15080b
            int r1 = r1.length
            if (r1 != r2) goto L_0x0017
            int r4 = r3.f15079a
            r5.f15079a = r4
            return r5
        L_0x0017:
            r5 = r0
        L_0x0018:
            java.lang.Object[] r0 = r3.f15080b
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            r0[r4] = r5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r4 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode
            int r5 = r3.f15079a
            r4.<init>(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.L(int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode");
    }

    public final TrieNode b(int i2, Object obj, int i3) {
        int d2 = 1 << TrieNodeKt.d(i2, i3);
        if (o(d2)) {
            return c(d2, obj);
        }
        int p2 = p(d2);
        Object obj2 = this.f15080b[p2];
        if (!(obj2 instanceof TrieNode)) {
            return Intrinsics.d(obj, obj2) ? this : s(p2, i2, obj, i3);
        }
        TrieNode I = I(p2);
        TrieNode e2 = i3 == 30 ? I.e(obj) : I.b(i2, obj, i3 + 5);
        return I == e2 ? this : L(p2, e2);
    }

    public final TrieNode c(int i2, Object obj) {
        return new TrieNode(i2 | this.f15079a, TrieNodeKt.c(this.f15080b, p(i2), obj));
    }

    public final int d() {
        if (this.f15079a == 0) {
            return this.f15080b.length;
        }
        int i2 = 0;
        for (Object obj : this.f15080b) {
            i2 += obj instanceof TrieNode ? ((TrieNode) obj).d() : 1;
        }
        return i2;
    }

    public final TrieNode e(Object obj) {
        return f(obj) ? this : new TrieNode(0, TrieNodeKt.c(this.f15080b, 0, obj));
    }

    public final boolean f(Object obj) {
        return ArraysKt.Y(this.f15080b, obj);
    }

    public final TrieNode g(Object obj) {
        int t0 = ArraysKt.t0(this.f15080b, obj);
        return t0 != -1 ? h(t0) : this;
    }

    public final TrieNode h(int i2) {
        return new TrieNode(0, TrieNodeKt.e(this.f15080b, i2));
    }

    public final boolean i(int i2, Object obj, int i3) {
        int d2 = 1 << TrieNodeKt.d(i2, i3);
        if (o(d2)) {
            return false;
        }
        int p2 = p(d2);
        Object obj2 = this.f15080b[p2];
        if (!(obj2 instanceof TrieNode)) {
            return Intrinsics.d(obj, obj2);
        }
        TrieNode I = I(p2);
        return i3 == 30 ? I.f(obj) : I.i(i2, obj, i3 + 5);
    }

    public final boolean j(TrieNode trieNode, int i2) {
        if (this == trieNode) {
            return true;
        }
        if (i2 > 30) {
            for (Object Y : trieNode.f15080b) {
                if (!ArraysKt.Y(this.f15080b, Y)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.f15079a;
        int i4 = trieNode.f15079a;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int p2 = p(lowestOneBit);
            int p3 = trieNode.p(lowestOneBit);
            Object obj = this.f15080b[p2];
            Object obj2 = trieNode.f15080b[p3];
            boolean z2 = obj instanceof TrieNode;
            boolean z3 = obj2 instanceof TrieNode;
            if (z2 && z3) {
                Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj).j((TrieNode) obj2, i2 + 5)) {
                    return false;
                }
            } else if (z2) {
                Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj).i(obj2 != null ? obj2.hashCode() : 0, obj2, i2 + 5)) {
                    return false;
                }
            } else if (z3 || !Intrinsics.d(obj, obj2)) {
                return false;
            }
            i5 ^= lowestOneBit;
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f15080b[i2];
    }

    public final boolean l(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f15079a != trieNode.f15079a) {
            return false;
        }
        int length = this.f15080b.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f15080b[i2] != trieNode.f15080b[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int m() {
        return this.f15079a;
    }

    public final Object[] n() {
        return this.f15080b;
    }

    public final boolean o(int i2) {
        return (i2 & this.f15079a) == 0;
    }

    public final int p(int i2) {
        return Integer.bitCount((i2 - 1) & this.f15079a);
    }

    public final TrieNode q(int i2, Object obj, int i3, Object obj2, int i4, MutabilityOwnership mutabilityOwnership) {
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
        return new TrieNode(1 << d2, new Object[]{q(i2, obj, i3, obj2, i5 + 5, mutabilityOwnership)}, mutabilityOwnership2);
    }

    public final TrieNode r(int i2, int i3, Object obj, int i4, MutabilityOwnership mutabilityOwnership) {
        Object k2 = k(i2);
        return q(k2 != null ? k2.hashCode() : 0, k2, i3, obj, i4 + 5, mutabilityOwnership);
    }

    public final TrieNode s(int i2, int i3, Object obj, int i4) {
        Object[] objArr = this.f15080b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        copyOf[i2] = r(i2, i3, obj, i4, (MutabilityOwnership) null);
        return new TrieNode(this.f15079a, copyOf);
    }

    public final TrieNode t(int i2, Object obj, int i3, PersistentHashSetBuilder persistentHashSetBuilder) {
        int d2 = 1 << TrieNodeKt.d(i2, i3);
        if (o(d2)) {
            persistentHashSetBuilder.n(persistentHashSetBuilder.size() + 1);
            return v(d2, obj, persistentHashSetBuilder.m());
        }
        int p2 = p(d2);
        Object obj2 = this.f15080b[p2];
        if (obj2 instanceof TrieNode) {
            TrieNode I = I(p2);
            TrieNode w2 = i3 == 30 ? I.w(obj, persistentHashSetBuilder) : I.t(i2, obj, i3 + 5, persistentHashSetBuilder);
            return I == w2 ? this : H(p2, w2, persistentHashSetBuilder.m());
        } else if (Intrinsics.d(obj, obj2)) {
            return this;
        } else {
            persistentHashSetBuilder.n(persistentHashSetBuilder.size() + 1);
            return C(p2, i2, obj, i3, persistentHashSetBuilder.m());
        }
    }

    public final TrieNode u(TrieNode trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        Object[] objArr;
        int i3;
        TrieNode trieNode2;
        TrieNode t2;
        TrieNode trieNode3 = trieNode;
        int i4 = i2;
        DeltaCounter deltaCounter2 = deltaCounter;
        PersistentHashSetBuilder persistentHashSetBuilder2 = persistentHashSetBuilder;
        if (this == trieNode3) {
            deltaCounter2.c(deltaCounter.a() + d());
            return this;
        } else if (i4 > 30) {
            return x(trieNode3, deltaCounter2, persistentHashSetBuilder.m());
        } else {
            int i5 = this.f15079a;
            int i6 = trieNode3.f15079a | i5;
            TrieNode trieNode4 = (i6 != i5 || !Intrinsics.d(this.f15081c, persistentHashSetBuilder.m())) ? new TrieNode(i6, new Object[Integer.bitCount(i6)], persistentHashSetBuilder.m()) : this;
            int i7 = i6;
            int i8 = 0;
            while (i7 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i7);
                int p2 = p(lowestOneBit);
                int p3 = trieNode3.p(lowestOneBit);
                Object[] objArr2 = trieNode4.f15080b;
                if (o(lowestOneBit)) {
                    trieNode2 = trieNode3.f15080b[p3];
                } else if (trieNode3.o(lowestOneBit)) {
                    trieNode2 = this.f15080b[p2];
                } else {
                    Object obj = this.f15080b[p2];
                    Object obj2 = trieNode3.f15080b[p3];
                    boolean z2 = obj instanceof TrieNode;
                    boolean z3 = obj2 instanceof TrieNode;
                    if (!z2 || !z3) {
                        if (z2) {
                            Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                            TrieNode trieNode5 = (TrieNode) obj;
                            int size = persistentHashSetBuilder.size();
                            t2 = trieNode5.t(obj2 != null ? obj2.hashCode() : 0, obj2, i4 + 5, persistentHashSetBuilder2);
                            if (persistentHashSetBuilder.size() == size) {
                                deltaCounter2.c(deltaCounter.a() + 1);
                            }
                            Unit unit = Unit.f40552a;
                        } else if (z3) {
                            Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                            TrieNode trieNode6 = (TrieNode) obj2;
                            int size2 = persistentHashSetBuilder.size();
                            t2 = trieNode6.t(obj != null ? obj.hashCode() : 0, obj, i4 + 5, persistentHashSetBuilder2);
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
                            trieNode2 = q(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i4 + 5, persistentHashSetBuilder.m());
                            objArr[i8] = trieNode2;
                            i8++;
                            i7 ^= i3;
                        }
                        trieNode2 = t2;
                    } else {
                        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        trieNode2 = ((TrieNode) obj).u((TrieNode) obj2, i4 + 5, deltaCounter2, persistentHashSetBuilder2);
                    }
                }
                objArr = objArr2;
                i3 = lowestOneBit;
                objArr[i8] = trieNode2;
                i8++;
                i7 ^= i3;
            }
            return l(trieNode4) ? this : trieNode3.l(trieNode4) ? trieNode3 : trieNode4;
        }
    }

    public final TrieNode v(int i2, Object obj, MutabilityOwnership mutabilityOwnership) {
        int p2 = p(i2);
        if (this.f15081c == mutabilityOwnership) {
            this.f15080b = TrieNodeKt.c(this.f15080b, p2, obj);
            this.f15079a = i2 | this.f15079a;
            return this;
        }
        return new TrieNode(i2 | this.f15079a, TrieNodeKt.c(this.f15080b, p2, obj), mutabilityOwnership);
    }

    public final TrieNode w(Object obj, PersistentHashSetBuilder persistentHashSetBuilder) {
        if (f(obj)) {
            return this;
        }
        persistentHashSetBuilder.n(persistentHashSetBuilder.size() + 1);
        if (this.f15081c != persistentHashSetBuilder.m()) {
            return new TrieNode(0, TrieNodeKt.c(this.f15080b, 0, obj), persistentHashSetBuilder.m());
        }
        this.f15080b = TrieNodeKt.c(this.f15080b, 0, obj);
        return this;
    }

    public final TrieNode x(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.b(this.f15080b.length);
            return this;
        }
        Object[] objArr = this.f15080b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f15080b.length);
        Intrinsics.h(copyOf, "copyOf(...)");
        Object[] objArr2 = trieNode.f15080b;
        int length = this.f15080b.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr2.length) {
            boolean z2 = true;
            CommonFunctionsKt.a(i3 <= i2);
            if (!f(objArr2[i2])) {
                copyOf[length + i3] = objArr2[i2];
                i3++;
                if (length + i3 > copyOf.length) {
                    z2 = false;
                }
                CommonFunctionsKt.a(z2);
            }
            i2++;
        }
        int length2 = i3 + this.f15080b.length;
        deltaCounter.b(copyOf.length - length2);
        if (length2 == this.f15080b.length) {
            return this;
        }
        if (length2 == trieNode.f15080b.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            Intrinsics.h(copyOf, "copyOf(...)");
        }
        if (!Intrinsics.d(this.f15081c, mutabilityOwnership)) {
            return new TrieNode(0, copyOf, mutabilityOwnership);
        }
        this.f15080b = copyOf;
        return this;
    }

    public final TrieNode y(Object obj, PersistentHashSetBuilder persistentHashSetBuilder) {
        int t0 = ArraysKt.t0(this.f15080b, obj);
        if (t0 == -1) {
            return this;
        }
        persistentHashSetBuilder.n(persistentHashSetBuilder.size() - 1);
        return A(t0, persistentHashSetBuilder.m());
    }

    public final Object z(TrieNode trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.b(this.f15080b.length);
            return f15078f;
        }
        Object[] objArr = Intrinsics.d(mutabilityOwnership, this.f15081c) ? this.f15080b : new Object[this.f15080b.length];
        Object[] objArr2 = this.f15080b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.a(i3 <= i2);
            if (!trieNode.f(objArr2[i2])) {
                objArr[i3] = objArr2[i2];
                i3++;
                if (i3 > objArr.length) {
                    z2 = false;
                }
                CommonFunctionsKt.a(z2);
            }
            i2++;
        }
        deltaCounter.b(this.f15080b.length - i3);
        if (i3 == 0) {
            return f15078f;
        }
        if (i3 == 1) {
            return objArr[0];
        }
        if (i3 == this.f15080b.length) {
            return this;
        }
        if (i3 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i3);
        Intrinsics.h(copyOf, "copyOf(...)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    public TrieNode(int i2, Object[] objArr) {
        this(i2, objArr, (MutabilityOwnership) null);
    }
}
