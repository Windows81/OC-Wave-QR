package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class ScopeMap<Key, Scope> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableScatterMap f15014a;

    public static final void a(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        int n2 = mutableScatterMap.n(obj);
        boolean z2 = n2 < 0;
        Object obj3 = z2 ? null : mutableScatterMap.f1961c[n2];
        if (obj3 != null) {
            if (obj3 instanceof MutableScatterSet) {
                Intrinsics.g(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((MutableScatterSet) obj3).h(obj2);
            } else if (obj3 != obj2) {
                MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);
                Intrinsics.g(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                mutableScatterSet.h(obj3);
                mutableScatterSet.h(obj2);
                obj2 = mutableScatterSet;
            }
            obj2 = obj3;
        }
        if (z2) {
            int i2 = ~n2;
            mutableScatterMap.f1960b[i2] = obj;
            mutableScatterMap.f1961c[i2] = obj2;
            return;
        }
        mutableScatterMap.f1961c[n2] = obj2;
    }

    public static final void b(MutableScatterMap mutableScatterMap) {
        mutableScatterMap.k();
    }

    public static MutableScatterMap c(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap;
    }

    public static /* synthetic */ MutableScatterMap d(MutableScatterMap mutableScatterMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            mutableScatterMap = ScatterMapKt.c();
        }
        return c(mutableScatterMap);
    }

    public static final boolean e(MutableScatterMap mutableScatterMap, Object obj) {
        return mutableScatterMap.c(obj);
    }

    public static boolean f(MutableScatterMap mutableScatterMap, Object obj) {
        return (obj instanceof ScopeMap) && Intrinsics.d(mutableScatterMap, ((ScopeMap) obj).m());
    }

    public static final int g(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.g();
    }

    public static int h(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    public static final boolean i(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        Object e2 = mutableScatterMap.e(obj);
        if (e2 == null) {
            return false;
        }
        if (e2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) e2;
            boolean y2 = mutableScatterSet.y(obj2);
            if (y2 && mutableScatterSet.d()) {
                mutableScatterMap.u(obj);
            }
            return y2;
        } else if (!Intrinsics.d(e2, obj2)) {
            return false;
        } else {
            mutableScatterMap.u(obj);
            return true;
        }
    }

    public static final void j(MutableScatterMap mutableScatterMap, Object obj) {
        boolean z2;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = mutableScatterMap.f1960b[i5];
                            Object obj3 = mutableScatterMap.f1961c[i5];
                            if (obj3 instanceof MutableScatterSet) {
                                Intrinsics.g(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                                mutableScatterSet.y(obj);
                                z2 = mutableScatterSet.d();
                            } else {
                                z2 = obj3 == obj;
                            }
                            if (z2) {
                                mutableScatterMap.v(i5);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void k(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        mutableScatterMap.x(obj, obj2);
    }

    public static String l(MutableScatterMap mutableScatterMap) {
        return "ScopeMap(map=" + mutableScatterMap + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f15014a, obj);
    }

    public int hashCode() {
        return h(this.f15014a);
    }

    public final /* synthetic */ MutableScatterMap m() {
        return this.f15014a;
    }

    public String toString() {
        return l(this.f15014a);
    }
}
