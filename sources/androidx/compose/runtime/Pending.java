package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class Pending {

    /* renamed from: a  reason: collision with root package name */
    public final List f14758a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14759b;

    /* renamed from: c  reason: collision with root package name */
    public int f14760c;

    /* renamed from: d  reason: collision with root package name */
    public final List f14761d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableIntObjectMap f14762e;

    /* renamed from: f  reason: collision with root package name */
    public final Lazy f14763f;

    public Pending(List list, int i2) {
        this.f14758a = list;
        this.f14759b = i2;
        if (!(i2 >= 0)) {
            PreconditionsKt.a("Invalid start index");
        }
        this.f14761d = new ArrayList();
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            KeyInfo keyInfo = (KeyInfo) this.f14758a.get(i4);
            mutableIntObjectMap.r(keyInfo.b(), new GroupInfo(i4, i3, keyInfo.c()));
            i3 += keyInfo.c();
        }
        this.f14762e = mutableIntObjectMap;
        this.f14763f = LazyKt.b(new Pending$keyMap$2(this));
    }

    public final int a() {
        return this.f14760c;
    }

    public final List b() {
        return this.f14758a;
    }

    public final MutableScatterMap c() {
        return ((MultiValueMap) this.f14763f.getValue()).p();
    }

    public final KeyInfo d(int i2, Object obj) {
        return (KeyInfo) MultiValueMap.l(c(), obj != null ? new JoinedKey(Integer.valueOf(i2), obj) : Integer.valueOf(i2));
    }

    public final int e() {
        return this.f14759b;
    }

    public final List f() {
        return this.f14761d;
    }

    public final int g(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.f14762e.b(keyInfo.b());
        if (groupInfo != null) {
            return groupInfo.b();
        }
        return -1;
    }

    public final boolean h(KeyInfo keyInfo) {
        return this.f14761d.add(keyInfo);
    }

    public final void i(KeyInfo keyInfo, int i2) {
        this.f14762e.r(keyInfo.b(), new GroupInfo(-1, i2, 0));
    }

    public final void j(int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        char c2 = 7;
        long j2 = -9187201950435737472L;
        if (i5 > i6) {
            MutableIntObjectMap mutableIntObjectMap = this.f14762e;
            Object[] objArr = mutableIntObjectMap.f1794c;
            long[] jArr = mutableIntObjectMap.f1792a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j3 = jArr[i7];
                    if ((((~j3) << 7) & j3 & j2) != j2) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((j3 & 255) < 128) {
                                GroupInfo groupInfo = (GroupInfo) objArr[(i7 << 3) + i9];
                                int b2 = groupInfo.b();
                                if (i5 <= b2 && b2 < i5 + i4) {
                                    groupInfo.e((b2 - i5) + i6);
                                } else if (i6 <= b2 && b2 < i5) {
                                    groupInfo.e(b2 + i4);
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i8 != 8) {
                            return;
                        }
                    }
                    if (i7 != length) {
                        i7++;
                        j2 = -9187201950435737472L;
                    } else {
                        return;
                    }
                }
            }
        } else if (i6 > i5) {
            MutableIntObjectMap mutableIntObjectMap2 = this.f14762e;
            Object[] objArr2 = mutableIntObjectMap2.f1794c;
            long[] jArr2 = mutableIntObjectMap2.f1792a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j4 = jArr2[i10];
                    if ((((~j4) << c2) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((j4 & 255) < 128) {
                                GroupInfo groupInfo2 = (GroupInfo) objArr2[(i10 << 3) + i12];
                                int b3 = groupInfo2.b();
                                if (i5 <= b3 && b3 < i5 + i4) {
                                    groupInfo2.e((b3 - i5) + i6);
                                } else if (i5 + 1 <= b3 && b3 < i6) {
                                    groupInfo2.e(b3 - i4);
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i11 != 8) {
                            return;
                        }
                    }
                    if (i10 != length2) {
                        i10++;
                        c2 = 7;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void k(int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        char c2 = 7;
        long j2 = -9187201950435737472L;
        if (i4 > i5) {
            MutableIntObjectMap mutableIntObjectMap = this.f14762e;
            Object[] objArr = mutableIntObjectMap.f1794c;
            long[] jArr = mutableIntObjectMap.f1792a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j3 = jArr[i6];
                    if ((((~j3) << 7) & j3 & j2) != j2) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j3 & 255) < 128) {
                                GroupInfo groupInfo = (GroupInfo) objArr[(i6 << 3) + i8];
                                int c3 = groupInfo.c();
                                if (c3 == i4) {
                                    groupInfo.f(i5);
                                } else if (i5 <= c3 && c3 < i4) {
                                    groupInfo.f(c3 + 1);
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i7 != 8) {
                            return;
                        }
                    }
                    if (i6 != length) {
                        i6++;
                        j2 = -9187201950435737472L;
                    } else {
                        return;
                    }
                }
            }
        } else if (i5 > i4) {
            MutableIntObjectMap mutableIntObjectMap2 = this.f14762e;
            Object[] objArr2 = mutableIntObjectMap2.f1794c;
            long[] jArr2 = mutableIntObjectMap2.f1792a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i9 = 0;
                while (true) {
                    long j4 = jArr2[i9];
                    if ((((~j4) << c2) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((j4 & 255) < 128) {
                                GroupInfo groupInfo2 = (GroupInfo) objArr2[(i9 << 3) + i11];
                                int c4 = groupInfo2.c();
                                if (c4 == i4) {
                                    groupInfo2.f(i5);
                                } else if (i4 + 1 <= c4 && c4 < i5) {
                                    groupInfo2.f(c4 - 1);
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i10 != 8) {
                            return;
                        }
                    }
                    if (i9 != length2) {
                        i9++;
                        c2 = 7;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void l(int i2) {
        this.f14760c = i2;
    }

    public final int m(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.f14762e.b(keyInfo.b());
        if (groupInfo != null) {
            return groupInfo.c();
        }
        return -1;
    }

    public final boolean n(int i2, int i3) {
        int b2;
        int i4 = i3;
        GroupInfo groupInfo = (GroupInfo) this.f14762e.b(i2);
        if (groupInfo == null) {
            return false;
        }
        int b3 = groupInfo.b();
        int a2 = i4 - groupInfo.a();
        groupInfo.d(i4);
        if (a2 == 0) {
            return true;
        }
        MutableIntObjectMap mutableIntObjectMap = this.f14762e;
        Object[] objArr = mutableIntObjectMap.f1794c;
        long[] jArr = mutableIntObjectMap.f1792a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr[i5];
            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j2) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i5 << 3) + i7];
                        if (groupInfo2.b() >= b3 && !Intrinsics.d(groupInfo2, groupInfo) && (b2 = groupInfo2.b() + a2) >= 0) {
                            groupInfo2.e(b2);
                        }
                    }
                    j2 >>= 8;
                }
                if (i6 != 8) {
                    return true;
                }
            }
            if (i5 == length) {
                return true;
            }
            i5++;
        }
    }

    public final int o(KeyInfo keyInfo) {
        GroupInfo groupInfo = (GroupInfo) this.f14762e.b(keyInfo.b());
        return groupInfo != null ? groupInfo.a() : keyInfo.c();
    }
}
