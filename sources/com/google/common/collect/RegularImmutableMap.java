package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap G = new RegularImmutableMap((Object) null, new Object[0], 0);
    public final transient Object D;
    public final transient Object[] E;
    public final transient int F;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: B  reason: collision with root package name */
        public final transient ImmutableMap f28510B;
        public final transient Object[] C;
        public final transient int D;
        public final transient int E;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i2, int i3) {
            this.f28510B = immutableMap;
            this.C = objArr;
            this.D = i2;
            this.E = i3;
        }

        public ImmutableList B() {
            return new ImmutableList<Map.Entry<K, V>>() {
                /* renamed from: Q */
                public Map.Entry get(int i2) {
                    Preconditions.o(i2, EntrySet.this.E);
                    int i3 = i2 * 2;
                    Object obj = EntrySet.this.C[EntrySet.this.D + i3];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.C[i3 + (EntrySet.this.D ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                public boolean n() {
                    return true;
                }

                public int size() {
                    return EntrySet.this.E;
                }
            };
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f28510B.get(key));
        }

        public int g(Object[] objArr, int i2) {
            return e().g(objArr, i2);
        }

        public boolean n() {
            return true;
        }

        /* renamed from: o */
        public UnmodifiableIterator iterator() {
            return e().iterator();
        }

        public int size() {
            return this.E;
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* renamed from: B  reason: collision with root package name */
        public final transient ImmutableMap f28512B;
        public final transient ImmutableList C;

        public KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.f28512B = immutableMap;
            this.C = immutableList;
        }

        public boolean contains(Object obj) {
            return this.f28512B.get(obj) != null;
        }

        public ImmutableList e() {
            return this.C;
        }

        public int g(Object[] objArr, int i2) {
            return e().g(objArr, i2);
        }

        public boolean n() {
            return true;
        }

        /* renamed from: o */
        public UnmodifiableIterator iterator() {
            return e().iterator();
        }

        public int size() {
            return this.f28512B.size();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* renamed from: B  reason: collision with root package name */
        public final transient Object[] f28513B;
        public final transient int C;
        public final transient int D;

        public KeysOrValuesAsList(Object[] objArr, int i2, int i3) {
            this.f28513B = objArr;
            this.C = i2;
            this.D = i3;
        }

        public Object get(int i2) {
            Preconditions.o(i2, this.D);
            Object obj = this.f28513B[(i2 * 2) + this.C];
            Objects.requireNonNull(obj);
            return obj;
        }

        public boolean n() {
            return true;
        }

        public int size() {
            return this.D;
        }
    }

    public RegularImmutableMap(Object obj, Object[] objArr, int i2) {
        this.D = obj;
        this.E = objArr;
        this.F = i2;
    }

    public static RegularImmutableMap r(int i2, Object[] objArr) {
        return s(i2, objArr, (ImmutableMap.Builder) null);
    }

    public static RegularImmutableMap s(int i2, Object[] objArr, ImmutableMap.Builder builder) {
        if (i2 == 0) {
            return (RegularImmutableMap) G;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.a(obj, obj2);
            return new RegularImmutableMap((Object) null, objArr, 1);
        }
        Preconditions.t(i2, objArr.length >> 1);
        Object t2 = t(objArr, i2, ImmutableSet.u(i2), 0);
        if (t2 instanceof Object[]) {
            Object[] objArr2 = (Object[]) t2;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder != null) {
                builder.f28155e = duplicateKey;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                t2 = obj3;
                i2 = intValue;
            } else {
                throw duplicateKey.a();
            }
        }
        return new RegularImmutableMap(t2, objArr, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object t(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0018
            r0 = r16[r19]
            java.util.Objects.requireNonNull(r0)
            r1 = r19 ^ 1
            r1 = r16[r1]
            java.util.Objects.requireNonNull(r1)
            com.google.common.collect.CollectPreconditions.a(r0, r1)
            return r2
        L_0x0018:
            int r4 = r1 + -1
            r5 = 128(0x80, float:1.794E-43)
            r6 = 3
            r7 = -1
            r8 = 2
            r9 = 0
            if (r1 > r5) goto L_0x008c
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = r9
            r7 = r5
        L_0x0029:
            if (r5 >= r0) goto L_0x007b
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.CollectPreconditions.a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.Hashing.c(r13)
        L_0x0049:
            r13 = r13 & r4
            byte r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x005f
            byte r14 = (byte) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x005c
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x005c:
            int r7 = r7 + 1
            goto L_0x0075
        L_0x005f:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0078
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x0075:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0078:
            int r13 = r13 + 1
            goto L_0x0049
        L_0x007b:
            if (r7 != r0) goto L_0x007e
            goto L_0x008b
        L_0x007e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x008b:
            return r1
        L_0x008c:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r5) goto L_0x00fc
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = r9
            r7 = r5
        L_0x0098:
            if (r5 >= r0) goto L_0x00eb
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.CollectPreconditions.a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.Hashing.c(r13)
        L_0x00b8:
            r13 = r13 & r4
            short r14 = r1[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x00cf
            short r14 = (short) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x00cc
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x00cc:
            int r7 = r7 + 1
            goto L_0x00e5
        L_0x00cf:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00e8
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x00e5:
            int r5 = r5 + 1
            goto L_0x0098
        L_0x00e8:
            int r13 = r13 + 1
            goto L_0x00b8
        L_0x00eb:
            if (r7 != r0) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x00fb:
            return r1
        L_0x00fc:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = r9
            r10 = r5
        L_0x0103:
            if (r5 >= r0) goto L_0x0153
            int r11 = r5 * 2
            int r11 = r11 + r19
            int r12 = r10 * 2
            int r12 = r12 + r19
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r11 = r11 ^ r3
            r11 = r16[r11]
            java.util.Objects.requireNonNull(r11)
            com.google.common.collect.CollectPreconditions.a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = com.google.common.collect.Hashing.c(r14)
        L_0x0123:
            r14 = r14 & r4
            r15 = r1[r14]
            if (r15 != r7) goto L_0x0135
            r1[r14] = r12
            if (r10 >= r5) goto L_0x0132
            r16[r12] = r13
            r12 = r12 ^ 1
            r16[r12] = r11
        L_0x0132:
            int r10 = r10 + 1
            goto L_0x014b
        L_0x0135:
            r7 = r16[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x014f
            com.google.common.collect.ImmutableMap$Builder$DuplicateKey r2 = new com.google.common.collect.ImmutableMap$Builder$DuplicateKey
            r7 = r15 ^ 1
            r12 = r16[r7]
            java.util.Objects.requireNonNull(r12)
            r2.<init>(r13, r11, r12)
            r16[r7] = r11
        L_0x014b:
            int r5 = r5 + 1
            r7 = -1
            goto L_0x0103
        L_0x014f:
            int r14 = r14 + 1
            r7 = -1
            goto L_0x0123
        L_0x0153:
            if (r10 != r0) goto L_0x0156
            goto L_0x0163
        L_0x0156:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x0163:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableMap.t(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static Object u(Object[] objArr, int i2, int i3, int i4) {
        Object t2 = t(objArr, i2, i3, i4);
        if (!(t2 instanceof Object[])) {
            return t2;
        }
        throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) t2)[2]).a();
    }

    public static Object v(Object obj, Object[] objArr, int i2, int i3, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i2 == 1) {
            Object obj3 = objArr[i3];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int c2 = Hashing.c(obj2.hashCode());
                while (true) {
                    int i4 = c2 & length;
                    byte b2 = bArr[i4] & 255;
                    if (b2 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[b2])) {
                        return objArr[b2 ^ 1];
                    }
                    c2 = i4 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int c3 = Hashing.c(obj2.hashCode());
                while (true) {
                    int i5 = c3 & length2;
                    short s2 = sArr[i5] & 65535;
                    if (s2 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[s2])) {
                        return objArr[s2 ^ 1];
                    }
                    c3 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int c4 = Hashing.c(obj2.hashCode());
                while (true) {
                    int i6 = c4 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i7])) {
                        return objArr[i7 ^ 1];
                    }
                    c4 = i6 + 1;
                }
            }
        }
    }

    public ImmutableSet f() {
        return new EntrySet(this, this.E, 0, this.F);
    }

    public ImmutableSet g() {
        return new KeySet(this, new KeysOrValuesAsList(this.E, 0, this.F));
    }

    public Object get(Object obj) {
        Object v2 = v(this.D, this.E, this.F, 0, obj);
        if (v2 == null) {
            return null;
        }
        return v2;
    }

    public ImmutableCollection h() {
        return new KeysOrValuesAsList(this.E, 1, this.F);
    }

    public boolean k() {
        return false;
    }

    public int size() {
        return this.F;
    }
}
