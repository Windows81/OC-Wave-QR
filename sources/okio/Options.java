package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final ByteString[] f43400A;

    /* renamed from: B  reason: collision with root package name */
    public final int[] f43401B;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(Companion companion, long j2, Buffer buffer, int i2, List list, int i3, int i4, List list2, int i5, Object obj) {
            companion.a((i5 & 1) != 0 ? 0 : j2, buffer, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        public final void a(long j2, Buffer buffer, int i2, List list, int i3, int i4, List list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            Buffer buffer2;
            Buffer buffer3 = buffer;
            int i9 = i2;
            List list3 = list;
            int i10 = i3;
            int i11 = i4;
            List list4 = list2;
            if (i10 < i11) {
                int i12 = i10;
                while (i12 < i11) {
                    if (((ByteString) list3.get(i12)).N() >= i9) {
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                ByteString byteString = (ByteString) list.get(i3);
                ByteString byteString2 = (ByteString) list3.get(i11 - 1);
                int i13 = -1;
                if (i9 == byteString.N()) {
                    int intValue = ((Number) list4.get(i10)).intValue();
                    int i14 = i10 + 1;
                    i5 = i14;
                    i6 = intValue;
                    byteString = (ByteString) list3.get(i14);
                } else {
                    i5 = i10;
                    i6 = -1;
                }
                if (byteString.k(i9) != byteString2.k(i9)) {
                    int i15 = 1;
                    for (int i16 = i5 + 1; i16 < i11; i16++) {
                        if (((ByteString) list3.get(i16 - 1)).k(i9) != ((ByteString) list3.get(i16)).k(i9)) {
                            i15++;
                        }
                    }
                    long c2 = j2 + c(buffer3) + ((long) 2) + ((long) (i15 * 2));
                    buffer3.writeInt(i15);
                    buffer3.writeInt(i6);
                    for (int i17 = i5; i17 < i11; i17++) {
                        byte k2 = ((ByteString) list3.get(i17)).k(i9);
                        if (i17 == i5 || k2 != ((ByteString) list3.get(i17 - 1)).k(i9)) {
                            buffer3.writeInt(k2 & 255);
                        }
                    }
                    Buffer buffer4 = new Buffer();
                    while (i5 < i11) {
                        byte k3 = ((ByteString) list3.get(i5)).k(i9);
                        int i18 = i5 + 1;
                        int i19 = i18;
                        while (true) {
                            if (i19 >= i11) {
                                i7 = i11;
                                break;
                            } else if (k3 != ((ByteString) list3.get(i19)).k(i9)) {
                                i7 = i19;
                                break;
                            } else {
                                i19++;
                            }
                        }
                        if (i18 == i7 && i9 + 1 == ((ByteString) list3.get(i5)).N()) {
                            buffer3.writeInt(((Number) list4.get(i5)).intValue());
                            i8 = i7;
                            buffer2 = buffer4;
                        } else {
                            buffer3.writeInt(((int) (c2 + c(buffer4))) * i13);
                            i8 = i7;
                            buffer2 = buffer4;
                            a(c2, buffer4, i9 + 1, list, i5, i7, list2);
                        }
                        buffer4 = buffer2;
                        i5 = i8;
                        i13 = -1;
                    }
                    buffer3.P0(buffer4);
                    return;
                }
                int min = Math.min(byteString.N(), byteString2.N());
                int i20 = 0;
                int i21 = i9;
                while (i21 < min && byteString.k(i21) == byteString2.k(i21)) {
                    i20++;
                    i21++;
                }
                long c3 = j2 + c(buffer3) + ((long) 2) + ((long) i20) + 1;
                buffer3.writeInt(-i20);
                buffer3.writeInt(i6);
                int i22 = i20 + i9;
                while (i9 < i22) {
                    buffer3.writeInt(byteString.k(i9) & 255);
                    i9++;
                }
                if (i5 + 1 != i11) {
                    Buffer buffer5 = new Buffer();
                    buffer3.writeInt(((int) (c(buffer5) + c3)) * -1);
                    a(c3, buffer5, i22, list, i5, i4, list2);
                    buffer3.P0(buffer5);
                } else if (i22 == ((ByteString) list3.get(i5)).N()) {
                    buffer3.writeInt(((Number) list4.get(i5)).intValue());
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        public final long c(Buffer buffer) {
            return buffer.n0() / ((long) 4);
        }

        public final Options d(ByteString... byteStringArr) {
            ByteString[] byteStringArr2 = byteStringArr;
            Intrinsics.i(byteStringArr2, "byteStrings");
            if (byteStringArr2.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List g1 = ArraysKt.g1(byteStringArr);
            CollectionsKt.z(g1);
            int size = g1.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(-1);
            }
            int length = byteStringArr2.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                arrayList.set(CollectionsKt.l(g1, byteStringArr2[i3], 0, 0, 6, (Object) null), Integer.valueOf(i4));
                i3++;
                i4++;
            }
            if (((ByteString) g1.get(0)).N() > 0) {
                int i5 = 0;
                while (i5 < g1.size()) {
                    ByteString byteString = (ByteString) g1.get(i5);
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (i7 < g1.size()) {
                        ByteString byteString2 = (ByteString) g1.get(i7);
                        if (!byteString2.Q(byteString)) {
                            continue;
                            break;
                        } else if (byteString2.N() == byteString.N()) {
                            throw new IllegalArgumentException(("duplicate option: " + byteString2).toString());
                        } else if (((Number) arrayList.get(i7)).intValue() > ((Number) arrayList.get(i5)).intValue()) {
                            g1.remove(i7);
                            arrayList.remove(i7);
                        } else {
                            i7++;
                        }
                    }
                    i5 = i6;
                }
                Buffer buffer = new Buffer();
                b(this, 0, buffer, 0, g1, 0, 0, arrayList, 53, (Object) null);
                int c2 = (int) c(buffer);
                int[] iArr = new int[c2];
                for (int i8 = 0; i8 < c2; i8++) {
                    iArr[i8] = buffer.readInt();
                }
                Object[] copyOf = Arrays.copyOf(byteStringArr2, byteStringArr2.length);
                Intrinsics.h(copyOf, "copyOf(...)");
                return new Options((ByteString[]) copyOf, iArr, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }

        public Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ByteString)) {
            return false;
        }
        return i((ByteString) obj);
    }

    public int g() {
        return this.f43400A.length;
    }

    public /* bridge */ boolean i(ByteString byteString) {
        return super.contains(byteString);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof ByteString)) {
            return -1;
        }
        return p((ByteString) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof ByteString)) {
            return -1;
        }
        return q((ByteString) obj);
    }

    /* renamed from: m */
    public ByteString get(int i2) {
        return this.f43400A[i2];
    }

    public final ByteString[] n() {
        return this.f43400A;
    }

    public final int[] o() {
        return this.f43401B;
    }

    public /* bridge */ int p(ByteString byteString) {
        return super.indexOf(byteString);
    }

    public /* bridge */ int q(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    public Options(ByteString[] byteStringArr, int[] iArr) {
        this.f43400A = byteStringArr;
        this.f43401B = iArr;
    }
}
