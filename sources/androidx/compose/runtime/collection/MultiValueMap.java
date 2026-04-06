package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
@JvmInline
public final class MultiValueMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableScatterMap f15002a;

    public /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.f15002a = mutableScatterMap;
    }

    public static final void a(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        int n2 = mutableScatterMap.n(obj);
        boolean z2 = n2 < 0;
        Object obj3 = z2 ? null : mutableScatterMap.f1961c[n2];
        TypeIntrinsics.l(obj3);
        if (obj3 != null) {
            if (obj3 instanceof MutableObjectList) {
                Intrinsics.g(obj3, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                MutableObjectList mutableObjectList = (MutableObjectList) obj3;
                mutableObjectList.n(obj2);
                obj2 = mutableObjectList;
            } else {
                obj2 = ObjectListKt.h(obj3, obj2);
            }
        }
        if (z2) {
            int i2 = ~n2;
            mutableScatterMap.f1960b[i2] = obj;
            mutableScatterMap.f1961c[i2] = obj2;
            return;
        }
        mutableScatterMap.f1961c[n2] = obj2;
    }

    public static final /* synthetic */ MultiValueMap b(MutableScatterMap mutableScatterMap) {
        return new MultiValueMap(mutableScatterMap);
    }

    public static final void c(MutableScatterMap mutableScatterMap) {
        mutableScatterMap.k();
    }

    public static MutableScatterMap d(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap;
    }

    public static /* synthetic */ MutableScatterMap e(MutableScatterMap mutableScatterMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            mutableScatterMap = new MutableScatterMap(0, 1, (DefaultConstructorMarker) null);
        }
        return d(mutableScatterMap);
    }

    public static final boolean f(MutableScatterMap mutableScatterMap, Object obj) {
        return mutableScatterMap.b(obj);
    }

    public static boolean g(MutableScatterMap mutableScatterMap, Object obj) {
        return (obj instanceof MultiValueMap) && Intrinsics.d(mutableScatterMap, ((MultiValueMap) obj).p());
    }

    public static final ObjectList h(MutableScatterMap mutableScatterMap, Object obj) {
        Object e2 = mutableScatterMap.e(obj);
        return e2 == null ? ObjectListKt.f() : e2 instanceof MutableObjectList ? (ObjectList) e2 : ObjectListKt.i(e2);
    }

    public static int i(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    public static final boolean j(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.h();
    }

    public static final boolean k(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.i();
    }

    public static final Object l(MutableScatterMap mutableScatterMap, Object obj) {
        Object e2 = mutableScatterMap.e(obj);
        if (e2 == null) {
            return null;
        }
        if (e2 instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) e2;
            Object A2 = mutableObjectList.A(0);
            if (mutableObjectList.g()) {
                mutableScatterMap.u(obj);
            }
            if (mutableObjectList.e() == 1) {
                mutableScatterMap.x(obj, mutableObjectList.c());
            }
            return A2;
        }
        mutableScatterMap.u(obj);
        return e2;
    }

    public static final Object m(MutableScatterMap mutableScatterMap, Object obj) {
        Object e2 = mutableScatterMap.e(obj);
        if (e2 == null) {
            return null;
        }
        if (e2 instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) e2;
            Object b2 = ExtensionsKt.b(mutableObjectList);
            Intrinsics.g(b2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            if (mutableObjectList.g()) {
                mutableScatterMap.u(obj);
            }
            if (mutableObjectList.e() == 1) {
                mutableScatterMap.x(obj, mutableObjectList.c());
            }
            return b2;
        }
        mutableScatterMap.u(obj);
        return e2;
    }

    public static final void n(MutableScatterMap mutableScatterMap, Object obj, Function1 function1) {
        Object e2 = mutableScatterMap.e(obj);
        if (e2 == null) {
            return;
        }
        if (e2 instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) e2;
            int i2 = mutableObjectList.f1938b;
            Object[] objArr = mutableObjectList.f1937a;
            int i3 = 0;
            IntRange v2 = RangesKt.v(0, i2);
            int n2 = v2.n();
            int o2 = v2.o();
            if (n2 <= o2) {
                while (true) {
                    objArr[n2 - i3] = objArr[n2];
                    if (((Boolean) function1.invoke(objArr[n2])).booleanValue()) {
                        i3++;
                    }
                    if (n2 == o2) {
                        break;
                    }
                    n2++;
                }
            }
            ArraysKt.w(objArr, (Object) null, i2 - i3, i2);
            mutableObjectList.f1938b -= i3;
            if (mutableObjectList.g()) {
                mutableScatterMap.u(obj);
            }
            if (mutableObjectList.e() == 0) {
                mutableScatterMap.x(obj, mutableObjectList.c());
            }
        } else if (((Boolean) function1.invoke(e2)).booleanValue()) {
            mutableScatterMap.u(obj);
        }
    }

    public static String o(MutableScatterMap mutableScatterMap) {
        return "MultiValueMap(map=" + mutableScatterMap + ')';
    }

    public static final ObjectList q(MutableScatterMap mutableScatterMap) {
        if (mutableScatterMap.h()) {
            return ObjectListKt.f();
        }
        MutableObjectList mutableObjectList = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
        Object[] objArr = mutableScatterMap.f1961c;
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
                            Object obj = objArr[(i2 << 3) + i4];
                            if (obj instanceof MutableObjectList) {
                                Intrinsics.g(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                mutableObjectList.p((MutableObjectList) obj);
                            } else {
                                Intrinsics.g(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                mutableObjectList.n(obj);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return mutableObjectList;
    }

    public boolean equals(Object obj) {
        return g(this.f15002a, obj);
    }

    public int hashCode() {
        return i(this.f15002a);
    }

    public final /* synthetic */ MutableScatterMap p() {
        return this.f15002a;
    }

    public String toString() {
        return o(this.f15002a);
    }
}
