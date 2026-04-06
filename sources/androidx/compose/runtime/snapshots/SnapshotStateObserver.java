package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.h;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.Thread_jvmKt;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class SnapshotStateObserver {

    /* renamed from: l  reason: collision with root package name */
    public static final int f15299l = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f15300a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f15301b = new AtomicReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public boolean f15302c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2 f15303d = new k(this);

    /* renamed from: e  reason: collision with root package name */
    public final Function1 f15304e = new l(this);

    /* renamed from: f  reason: collision with root package name */
    public final MutableVector f15305f = new MutableVector(new ObservedScopeMap[16], 0);

    /* renamed from: g  reason: collision with root package name */
    public final Object f15306g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public ObserverHandle f15307h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15308i;

    /* renamed from: j  reason: collision with root package name */
    public ObservedScopeMap f15309j;

    /* renamed from: k  reason: collision with root package name */
    public long f15310k = -1;

    @Metadata
    public static final class ObservedScopeMap {

        /* renamed from: a  reason: collision with root package name */
        public final Function1 f15311a;

        /* renamed from: b  reason: collision with root package name */
        public Object f15312b;

        /* renamed from: c  reason: collision with root package name */
        public MutableObjectIntMap f15313c;

        /* renamed from: d  reason: collision with root package name */
        public int f15314d = -1;

        /* renamed from: e  reason: collision with root package name */
        public final MutableScatterMap f15315e = ScopeMap.d((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);

        /* renamed from: f  reason: collision with root package name */
        public final MutableScatterMap f15316f = new MutableScatterMap(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: g  reason: collision with root package name */
        public final MutableScatterSet f15317g = new MutableScatterSet(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: h  reason: collision with root package name */
        public final MutableVector f15318h = new MutableVector(new DerivedState[16], 0);

        /* renamed from: i  reason: collision with root package name */
        public final DerivedStateObserver f15319i = new SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1(this);

        /* renamed from: j  reason: collision with root package name */
        public int f15320j;

        /* renamed from: k  reason: collision with root package name */
        public final MutableScatterMap f15321k = ScopeMap.d((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);

        /* renamed from: l  reason: collision with root package name */
        public final HashMap f15322l = new HashMap();

        public ObservedScopeMap(Function1 function1) {
            this.f15311a = function1;
        }

        public final void c() {
            ScopeMap.b(this.f15315e);
            this.f15316f.k();
            ScopeMap.b(this.f15321k);
            this.f15322l.clear();
        }

        public final void d(Object obj) {
            int i2 = this.f15314d;
            MutableObjectIntMap mutableObjectIntMap = this.f15313c;
            if (mutableObjectIntMap != null) {
                long[] jArr = mutableObjectIntMap.f1931a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj2 = mutableObjectIntMap.f1932b[i6];
                                    boolean z2 = mutableObjectIntMap.f1933c[i6] != i2;
                                    Object obj3 = obj;
                                    if (z2) {
                                        m(obj3, obj2);
                                    }
                                    if (z2) {
                                        mutableObjectIntMap.s(i6);
                                    }
                                } else {
                                    Object obj4 = obj;
                                }
                                j2 >>= 8;
                            }
                            Object obj5 = obj;
                            if (i4 != 8) {
                                return;
                            }
                        } else {
                            Object obj6 = obj;
                        }
                        if (i3 != length) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final void e(Object obj) {
            Object obj2 = obj;
            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) this.f15316f.u(obj2);
            if (mutableObjectIntMap != null) {
                Object[] objArr = mutableObjectIntMap.f1932b;
                int[] iArr = mutableObjectIntMap.f1933c;
                long[] jArr = mutableObjectIntMap.f1931a;
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
                                    Object obj3 = objArr[i5];
                                    int i6 = iArr[i5];
                                    m(obj2, obj3);
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
        }

        public final Function1 f() {
            return this.f15311a;
        }

        public final boolean g() {
            return this.f15316f.i();
        }

        public final void h() {
            MutableScatterSet mutableScatterSet = this.f15317g;
            Function1 function1 = this.f15311a;
            Object[] objArr = mutableScatterSet.f1967b;
            long[] jArr = mutableScatterSet.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                function1.invoke(objArr[(i2 << 3) + i4]);
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
            mutableScatterSet.m();
        }

        /* JADX INFO: finally extract failed */
        public final void i(Object obj, Function1 function1, Function0 function0) {
            Object obj2 = this.f15312b;
            MutableObjectIntMap mutableObjectIntMap = this.f15313c;
            int i2 = this.f15314d;
            this.f15312b = obj;
            this.f15313c = (MutableObjectIntMap) this.f15316f.e(obj);
            if (this.f15314d == -1) {
                this.f15314d = Long.hashCode(SnapshotKt.M().i());
            }
            DerivedStateObserver derivedStateObserver = this.f15319i;
            MutableVector c2 = SnapshotStateKt.c();
            try {
                c2.d(derivedStateObserver);
                Snapshot.f15255e.h(function1, (Function1) null, function0);
                c2.y(c2.p() - 1);
                Object obj3 = this.f15312b;
                Intrinsics.f(obj3);
                d(obj3);
                this.f15312b = obj2;
                this.f15313c = mutableObjectIntMap;
                this.f15314d = i2;
            } catch (Throwable th) {
                c2.y(c2.p() - 1);
                throw th;
            }
        }

        public final boolean j(Set set) {
            boolean z2;
            Iterator it;
            MutableScatterMap mutableScatterMap;
            HashMap hashMap;
            Object obj;
            char c2;
            Object obj2;
            int i2;
            char c3;
            MutableScatterMap mutableScatterMap2;
            HashMap hashMap2;
            Object[] objArr;
            long[] jArr;
            int i3;
            Iterator it2;
            HashMap hashMap3;
            MutableScatterMap mutableScatterMap3;
            Object obj3;
            MutableScatterMap mutableScatterMap4;
            long[] jArr2;
            Object[] objArr2;
            Object[] objArr3;
            char c4;
            MutableScatterMap mutableScatterMap5;
            String str;
            Object[] objArr4;
            long[] jArr3;
            MutableScatterMap mutableScatterMap6;
            HashMap hashMap4;
            int i4;
            long[] jArr4;
            MutableScatterMap mutableScatterMap7;
            HashMap hashMap5;
            MutableScatterMap mutableScatterMap8;
            Object[] objArr5;
            String str2;
            int i5;
            int i6;
            long j2;
            int i7;
            Object obj4;
            int i8;
            char c5;
            Object obj5;
            int i9;
            char c6;
            MutableScatterMap mutableScatterMap9;
            HashMap hashMap6;
            Object[] objArr6;
            int i10;
            MutableScatterMap mutableScatterMap10;
            HashMap hashMap7;
            MutableScatterMap mutableScatterMap11;
            String str3;
            long j3;
            Object obj6;
            Object[] objArr7;
            MutableScatterMap mutableScatterMap12;
            char c7;
            Set set2 = set;
            MutableScatterMap mutableScatterMap13 = this.f15321k;
            HashMap hashMap8 = this.f15322l;
            MutableScatterMap mutableScatterMap14 = this.f15315e;
            MutableScatterSet mutableScatterSet = this.f15317g;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            char c8 = 7;
            long j4 = -9187201950435737472L;
            if (set2 instanceof ScatterSetWrapper) {
                ScatterSet e2 = ((ScatterSetWrapper) set2).e();
                Object[] objArr8 = e2.f1967b;
                long[] jArr5 = e2.f1966a;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    z2 = false;
                    while (true) {
                        long j5 = jArr5[i11];
                        int i12 = length;
                        if ((((~j5) << c8) & j5 & j4) != j4) {
                            int i13 = 8 - ((~(i11 - i12)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j5 & 255) < 128) {
                                    Object obj7 = objArr8[(i11 << 3) + i14];
                                    if (!(obj7 instanceof StateObjectImpl) || ((StateObjectImpl) obj7).t(ReaderKind.a(2))) {
                                        if (ScopeMap.e(mutableScatterMap13, obj7)) {
                                            Object e3 = mutableScatterMap13.e(obj7);
                                            if (e3 == null) {
                                                jArr4 = jArr5;
                                                mutableScatterMap7 = mutableScatterMap13;
                                                hashMap5 = hashMap8;
                                                mutableScatterMap8 = mutableScatterMap14;
                                                objArr5 = objArr8;
                                                str2 = str4;
                                                i5 = i13;
                                                i6 = i14;
                                                j2 = j5;
                                                i7 = i11;
                                                obj5 = obj7;
                                            } else if (e3 instanceof MutableScatterSet) {
                                                MutableScatterSet mutableScatterSet2 = (MutableScatterSet) e3;
                                                Object[] objArr9 = mutableScatterSet2.f1967b;
                                                long[] jArr6 = mutableScatterSet2.f1966a;
                                                jArr4 = jArr5;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    objArr5 = objArr8;
                                                    i5 = i13;
                                                    i6 = i14;
                                                    int i15 = 0;
                                                    while (true) {
                                                        long j6 = jArr6[i15];
                                                        long[] jArr7 = jArr6;
                                                        i7 = i11;
                                                        if ((((~j6) << 7) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                            int i17 = 0;
                                                            while (i17 < i16) {
                                                                if ((j6 & 255) < 128) {
                                                                    objArr7 = objArr9;
                                                                    DerivedState derivedState = (DerivedState) objArr9[(i15 << 3) + i17];
                                                                    Intrinsics.g(derivedState, str4);
                                                                    str3 = str4;
                                                                    Object obj8 = hashMap8.get(derivedState);
                                                                    SnapshotMutationPolicy d2 = derivedState.d();
                                                                    if (d2 == null) {
                                                                        d2 = SnapshotStateKt.r();
                                                                    }
                                                                    mutableScatterMap10 = mutableScatterMap13;
                                                                    j3 = j5;
                                                                    if (!d2.a(derivedState.s().a(), obj8)) {
                                                                        Object e4 = mutableScatterMap14.e(derivedState);
                                                                        if (e4 != null) {
                                                                            if (e4 instanceof MutableScatterSet) {
                                                                                MutableScatterSet mutableScatterSet3 = (MutableScatterSet) e4;
                                                                                Object[] objArr10 = mutableScatterSet3.f1967b;
                                                                                long[] jArr8 = mutableScatterSet3.f1966a;
                                                                                int length3 = jArr8.length - 2;
                                                                                if (length3 >= 0) {
                                                                                    obj6 = obj7;
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        long j7 = jArr8[i18];
                                                                                        long[] jArr9 = jArr8;
                                                                                        hashMap7 = hashMap8;
                                                                                        if ((((~j7) << 7) & j7 & -9187201950435737472L) != -9187201950435737472L) {
                                                                                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                                                                            int i20 = 0;
                                                                                            while (i20 < i19) {
                                                                                                if ((j7 & 255) < 128) {
                                                                                                    mutableScatterMap12 = mutableScatterMap14;
                                                                                                    mutableScatterSet.h(objArr10[(i18 << 3) + i20]);
                                                                                                    c7 = 8;
                                                                                                    z2 = true;
                                                                                                } else {
                                                                                                    mutableScatterMap12 = mutableScatterMap14;
                                                                                                    c7 = 8;
                                                                                                }
                                                                                                j7 >>= c7;
                                                                                                i20++;
                                                                                                mutableScatterMap14 = mutableScatterMap12;
                                                                                            }
                                                                                            mutableScatterMap11 = mutableScatterMap14;
                                                                                            if (i19 != 8) {
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            mutableScatterMap11 = mutableScatterMap14;
                                                                                        }
                                                                                        if (i18 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i18++;
                                                                                        hashMap8 = hashMap7;
                                                                                        jArr8 = jArr9;
                                                                                        mutableScatterMap14 = mutableScatterMap11;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                hashMap7 = hashMap8;
                                                                                mutableScatterMap11 = mutableScatterMap14;
                                                                                obj6 = obj7;
                                                                                mutableScatterSet.h(e4);
                                                                                z2 = true;
                                                                            }
                                                                            Unit unit = Unit.f40552a;
                                                                        }
                                                                        hashMap7 = hashMap8;
                                                                        mutableScatterMap11 = mutableScatterMap14;
                                                                        obj6 = obj7;
                                                                        Unit unit2 = Unit.f40552a;
                                                                    } else {
                                                                        hashMap7 = hashMap8;
                                                                        mutableScatterMap11 = mutableScatterMap14;
                                                                        obj6 = obj7;
                                                                        this.f15318h.d(derivedState);
                                                                    }
                                                                } else {
                                                                    mutableScatterMap10 = mutableScatterMap13;
                                                                    hashMap7 = hashMap8;
                                                                    mutableScatterMap11 = mutableScatterMap14;
                                                                    str3 = str4;
                                                                    j3 = j5;
                                                                    obj6 = obj7;
                                                                    objArr7 = objArr9;
                                                                }
                                                                j6 >>= 8;
                                                                i17++;
                                                                str4 = str3;
                                                                objArr9 = objArr7;
                                                                obj7 = obj6;
                                                                mutableScatterMap13 = mutableScatterMap10;
                                                                j5 = j3;
                                                                hashMap8 = hashMap7;
                                                                mutableScatterMap14 = mutableScatterMap11;
                                                            }
                                                            mutableScatterMap7 = mutableScatterMap13;
                                                            hashMap6 = hashMap8;
                                                            mutableScatterMap9 = mutableScatterMap14;
                                                            str2 = str4;
                                                            j2 = j5;
                                                            obj5 = obj7;
                                                            objArr6 = objArr9;
                                                            i10 = 1;
                                                            if (i16 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            mutableScatterMap7 = mutableScatterMap13;
                                                            hashMap6 = hashMap8;
                                                            mutableScatterMap9 = mutableScatterMap14;
                                                            str2 = str4;
                                                            j2 = j5;
                                                            obj5 = obj7;
                                                            objArr6 = objArr9;
                                                            i10 = 1;
                                                        }
                                                        if (i15 == length2) {
                                                            break;
                                                        }
                                                        i15 += i10;
                                                        i11 = i7;
                                                        jArr6 = jArr7;
                                                        str4 = str2;
                                                        objArr9 = objArr6;
                                                        obj7 = obj5;
                                                        mutableScatterMap13 = mutableScatterMap7;
                                                        j5 = j2;
                                                        hashMap8 = hashMap6;
                                                        mutableScatterMap14 = mutableScatterMap9;
                                                    }
                                                } else {
                                                    mutableScatterMap7 = mutableScatterMap13;
                                                    hashMap6 = hashMap8;
                                                    mutableScatterMap9 = mutableScatterMap14;
                                                    objArr5 = objArr8;
                                                    str2 = str4;
                                                    i5 = i13;
                                                    i6 = i14;
                                                    j2 = j5;
                                                    i7 = i11;
                                                    obj5 = obj7;
                                                }
                                                hashMap5 = hashMap6;
                                                mutableScatterMap8 = mutableScatterMap9;
                                            } else {
                                                jArr4 = jArr5;
                                                mutableScatterMap7 = mutableScatterMap13;
                                                MutableScatterMap mutableScatterMap15 = mutableScatterMap14;
                                                objArr5 = objArr8;
                                                str2 = str4;
                                                i5 = i13;
                                                i6 = i14;
                                                j2 = j5;
                                                i7 = i11;
                                                obj5 = obj7;
                                                DerivedState derivedState2 = (DerivedState) e3;
                                                hashMap5 = hashMap8;
                                                Object obj9 = hashMap5.get(derivedState2);
                                                SnapshotMutationPolicy d3 = derivedState2.d();
                                                if (d3 == null) {
                                                    d3 = SnapshotStateKt.r();
                                                }
                                                if (!d3.a(derivedState2.s().a(), obj9)) {
                                                    mutableScatterMap8 = mutableScatterMap15;
                                                    Object e5 = mutableScatterMap8.e(derivedState2);
                                                    if (e5 != null) {
                                                        if (e5 instanceof MutableScatterSet) {
                                                            MutableScatterSet mutableScatterSet4 = (MutableScatterSet) e5;
                                                            Object[] objArr11 = mutableScatterSet4.f1967b;
                                                            long[] jArr10 = mutableScatterSet4.f1966a;
                                                            int length4 = jArr10.length - 2;
                                                            if (length4 >= 0) {
                                                                int i21 = 0;
                                                                while (true) {
                                                                    long j8 = jArr10[i21];
                                                                    if ((((~j8) << 7) & j8 & -9187201950435737472L) != -9187201950435737472L) {
                                                                        int i22 = 8 - ((~(i21 - length4)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j8 & 255) < 128) {
                                                                                mutableScatterSet.h(objArr11[(i21 << 3) + i23]);
                                                                                c6 = 8;
                                                                                z2 = true;
                                                                            } else {
                                                                                c6 = 8;
                                                                            }
                                                                            j8 >>= c6;
                                                                        }
                                                                        i9 = 1;
                                                                        if (i22 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        i9 = 1;
                                                                    }
                                                                    if (i21 == length4) {
                                                                        break;
                                                                    }
                                                                    i21 += i9;
                                                                }
                                                            }
                                                        } else {
                                                            mutableScatterSet.h(e5);
                                                            z2 = true;
                                                        }
                                                    }
                                                    Unit unit3 = Unit.f40552a;
                                                } else {
                                                    mutableScatterMap8 = mutableScatterMap15;
                                                    this.f15318h.d(derivedState2);
                                                }
                                            }
                                            obj4 = obj5;
                                        } else {
                                            jArr4 = jArr5;
                                            mutableScatterMap7 = mutableScatterMap13;
                                            hashMap5 = hashMap8;
                                            mutableScatterMap8 = mutableScatterMap14;
                                            objArr5 = objArr8;
                                            str2 = str4;
                                            i5 = i13;
                                            i6 = i14;
                                            j2 = j5;
                                            i7 = i11;
                                            obj4 = obj7;
                                        }
                                        Object e6 = mutableScatterMap8.e(obj4);
                                        if (e6 != null) {
                                            if (e6 instanceof MutableScatterSet) {
                                                MutableScatterSet mutableScatterSet5 = (MutableScatterSet) e6;
                                                Object[] objArr12 = mutableScatterSet5.f1967b;
                                                long[] jArr11 = mutableScatterSet5.f1966a;
                                                int length5 = jArr11.length - 2;
                                                if (length5 >= 0) {
                                                    int i24 = 0;
                                                    while (true) {
                                                        long j9 = jArr11[i24];
                                                        if ((((~j9) << 7) & j9 & -9187201950435737472L) != -9187201950435737472L) {
                                                            int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                            for (int i26 = 0; i26 < i25; i26++) {
                                                                if ((j9 & 255) < 128) {
                                                                    mutableScatterSet.h(objArr12[(i24 << 3) + i26]);
                                                                    c5 = 8;
                                                                    z2 = true;
                                                                } else {
                                                                    c5 = 8;
                                                                }
                                                                j9 >>= c5;
                                                            }
                                                            i8 = 1;
                                                            if (i25 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            i8 = 1;
                                                        }
                                                        if (i24 == length5) {
                                                            break;
                                                        }
                                                        i24 += i8;
                                                    }
                                                }
                                            } else {
                                                mutableScatterSet.h(e6);
                                                z2 = true;
                                            }
                                        }
                                        j5 = j2 >> 8;
                                        i14 = i6 + 1;
                                        mutableScatterMap14 = mutableScatterMap8;
                                        jArr5 = jArr4;
                                        objArr8 = objArr5;
                                        i13 = i5;
                                        i11 = i7;
                                        str4 = str2;
                                        hashMap8 = hashMap5;
                                        mutableScatterMap13 = mutableScatterMap7;
                                    }
                                }
                                jArr4 = jArr5;
                                mutableScatterMap7 = mutableScatterMap13;
                                hashMap5 = hashMap8;
                                mutableScatterMap8 = mutableScatterMap14;
                                objArr5 = objArr8;
                                str2 = str4;
                                i5 = i13;
                                i6 = i14;
                                j2 = j5;
                                i7 = i11;
                                j5 = j2 >> 8;
                                i14 = i6 + 1;
                                mutableScatterMap14 = mutableScatterMap8;
                                jArr5 = jArr4;
                                objArr8 = objArr5;
                                i13 = i5;
                                i11 = i7;
                                str4 = str2;
                                hashMap8 = hashMap5;
                                mutableScatterMap13 = mutableScatterMap7;
                            }
                            jArr3 = jArr5;
                            mutableScatterMap5 = mutableScatterMap13;
                            hashMap4 = hashMap8;
                            mutableScatterMap6 = mutableScatterMap14;
                            objArr4 = objArr8;
                            str = str4;
                            int i27 = i11;
                            if (i13 != 8) {
                                break;
                            }
                            length = i12;
                            i4 = i27;
                        } else {
                            jArr3 = jArr5;
                            mutableScatterMap5 = mutableScatterMap13;
                            hashMap4 = hashMap8;
                            mutableScatterMap6 = mutableScatterMap14;
                            objArr4 = objArr8;
                            str = str4;
                            length = i12;
                            i4 = i11;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i11 = i4 + 1;
                        mutableScatterMap14 = mutableScatterMap6;
                        jArr5 = jArr3;
                        objArr8 = objArr4;
                        str4 = str;
                        c8 = 7;
                        j4 = -9187201950435737472L;
                        hashMap8 = hashMap4;
                        mutableScatterMap13 = mutableScatterMap5;
                    }
                } else {
                    z2 = false;
                }
            } else {
                MutableScatterMap mutableScatterMap16 = mutableScatterMap13;
                HashMap hashMap9 = hashMap8;
                MutableScatterMap mutableScatterMap17 = mutableScatterMap14;
                String str5 = str4;
                Iterator it3 = set2.iterator();
                z2 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof StateObjectImpl) || ((StateObjectImpl) next).t(ReaderKind.a(2))) {
                        MutableScatterMap mutableScatterMap18 = mutableScatterMap16;
                        if (ScopeMap.e(mutableScatterMap18, next)) {
                            Object e7 = mutableScatterMap18.e(next);
                            if (e7 == null) {
                                it = it3;
                                hashMap = hashMap9;
                                mutableScatterMap = mutableScatterMap17;
                                obj2 = next;
                                mutableScatterMap16 = mutableScatterMap18;
                            } else if (e7 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet6 = (MutableScatterSet) e7;
                                Object[] objArr13 = mutableScatterSet6.f1967b;
                                long[] jArr12 = mutableScatterSet6.f1966a;
                                int length6 = jArr12.length - 2;
                                if (length6 >= 0) {
                                    int i28 = 0;
                                    while (true) {
                                        long j10 = jArr12[i28];
                                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i29 = 8 - ((~(i28 - length6)) >>> 31);
                                            int i30 = 0;
                                            while (i30 < i29) {
                                                if ((j10 & 255) < 128) {
                                                    DerivedState derivedState3 = (DerivedState) objArr13[(i28 << 3) + i30];
                                                    it2 = it3;
                                                    Intrinsics.g(derivedState3, str5);
                                                    Object obj10 = hashMap9.get(derivedState3);
                                                    SnapshotMutationPolicy d4 = derivedState3.d();
                                                    if (d4 == null) {
                                                        d4 = SnapshotStateKt.r();
                                                    }
                                                    mutableScatterMap4 = mutableScatterMap18;
                                                    jArr2 = jArr12;
                                                    if (!d4.a(derivedState3.s().a(), obj10)) {
                                                        Object e8 = mutableScatterMap17.e(derivedState3);
                                                        if (e8 != null) {
                                                            if (e8 instanceof MutableScatterSet) {
                                                                MutableScatterSet mutableScatterSet7 = (MutableScatterSet) e8;
                                                                Object[] objArr14 = mutableScatterSet7.f1967b;
                                                                long[] jArr13 = mutableScatterSet7.f1966a;
                                                                int length7 = jArr13.length - 2;
                                                                if (length7 >= 0) {
                                                                    mutableScatterMap3 = mutableScatterMap17;
                                                                    obj3 = next;
                                                                    int i31 = 0;
                                                                    while (true) {
                                                                        long j11 = jArr13[i31];
                                                                        long[] jArr14 = jArr13;
                                                                        hashMap3 = hashMap9;
                                                                        if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                                                                            int i32 = 8 - ((~(i31 - length7)) >>> 31);
                                                                            int i33 = 0;
                                                                            while (i33 < i32) {
                                                                                if ((j11 & 255) < 128) {
                                                                                    objArr3 = objArr13;
                                                                                    mutableScatterSet.h(objArr14[(i31 << 3) + i33]);
                                                                                    c4 = 8;
                                                                                    z2 = true;
                                                                                } else {
                                                                                    objArr3 = objArr13;
                                                                                    c4 = 8;
                                                                                }
                                                                                j11 >>= c4;
                                                                                i33++;
                                                                                objArr13 = objArr3;
                                                                            }
                                                                            objArr2 = objArr13;
                                                                            if (i32 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            objArr2 = objArr13;
                                                                        }
                                                                        if (i31 == length7) {
                                                                            break;
                                                                        }
                                                                        i31++;
                                                                        jArr13 = jArr14;
                                                                        objArr13 = objArr2;
                                                                        hashMap9 = hashMap3;
                                                                    }
                                                                }
                                                            } else {
                                                                hashMap3 = hashMap9;
                                                                mutableScatterMap3 = mutableScatterMap17;
                                                                obj3 = next;
                                                                objArr2 = objArr13;
                                                                mutableScatterSet.h(e8);
                                                                z2 = true;
                                                            }
                                                            Unit unit4 = Unit.f40552a;
                                                        }
                                                        hashMap3 = hashMap9;
                                                        mutableScatterMap3 = mutableScatterMap17;
                                                        obj3 = next;
                                                        objArr2 = objArr13;
                                                        Unit unit42 = Unit.f40552a;
                                                    } else {
                                                        hashMap3 = hashMap9;
                                                        mutableScatterMap3 = mutableScatterMap17;
                                                        obj3 = next;
                                                        objArr2 = objArr13;
                                                        this.f15318h.d(derivedState3);
                                                    }
                                                } else {
                                                    it2 = it3;
                                                    hashMap3 = hashMap9;
                                                    mutableScatterMap3 = mutableScatterMap17;
                                                    obj3 = next;
                                                    mutableScatterMap4 = mutableScatterMap18;
                                                    jArr2 = jArr12;
                                                    objArr2 = objArr13;
                                                }
                                                j10 >>= 8;
                                                i30++;
                                                it3 = it2;
                                                next = obj3;
                                                jArr12 = jArr2;
                                                objArr13 = objArr2;
                                                mutableScatterMap18 = mutableScatterMap4;
                                                hashMap9 = hashMap3;
                                                mutableScatterMap17 = mutableScatterMap3;
                                            }
                                            it = it3;
                                            hashMap2 = hashMap9;
                                            mutableScatterMap2 = mutableScatterMap17;
                                            obj2 = next;
                                            mutableScatterMap16 = mutableScatterMap18;
                                            jArr = jArr12;
                                            objArr = objArr13;
                                            i3 = 1;
                                            if (i29 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it3;
                                            hashMap2 = hashMap9;
                                            mutableScatterMap2 = mutableScatterMap17;
                                            obj2 = next;
                                            mutableScatterMap16 = mutableScatterMap18;
                                            jArr = jArr12;
                                            objArr = objArr13;
                                            i3 = 1;
                                        }
                                        if (i28 == length6) {
                                            break;
                                        }
                                        i28 += i3;
                                        it3 = it;
                                        next = obj2;
                                        jArr12 = jArr;
                                        objArr13 = objArr;
                                        mutableScatterMap18 = mutableScatterMap16;
                                        hashMap9 = hashMap2;
                                        mutableScatterMap17 = mutableScatterMap2;
                                    }
                                } else {
                                    it = it3;
                                    hashMap2 = hashMap9;
                                    mutableScatterMap2 = mutableScatterMap17;
                                    obj2 = next;
                                    mutableScatterMap16 = mutableScatterMap18;
                                }
                                hashMap = hashMap2;
                                mutableScatterMap = mutableScatterMap2;
                            } else {
                                it = it3;
                                MutableScatterMap mutableScatterMap19 = mutableScatterMap17;
                                obj2 = next;
                                mutableScatterMap16 = mutableScatterMap18;
                                DerivedState derivedState4 = (DerivedState) e7;
                                hashMap = hashMap9;
                                Object obj11 = hashMap.get(derivedState4);
                                SnapshotMutationPolicy d5 = derivedState4.d();
                                if (d5 == null) {
                                    d5 = SnapshotStateKt.r();
                                }
                                if (!d5.a(derivedState4.s().a(), obj11)) {
                                    mutableScatterMap = mutableScatterMap19;
                                    Object e9 = mutableScatterMap.e(derivedState4);
                                    if (e9 != null) {
                                        if (e9 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet8 = (MutableScatterSet) e9;
                                            Object[] objArr15 = mutableScatterSet8.f1967b;
                                            long[] jArr15 = mutableScatterSet8.f1966a;
                                            int length8 = jArr15.length - 2;
                                            if (length8 >= 0) {
                                                int i34 = 0;
                                                while (true) {
                                                    long j12 = jArr15[i34];
                                                    if ((((~j12) << 7) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i34 - length8)) >>> 31);
                                                        for (int i36 = 0; i36 < i35; i36++) {
                                                            if ((j12 & 255) < 128) {
                                                                mutableScatterSet.h(objArr15[(i34 << 3) + i36]);
                                                                c3 = 8;
                                                                z2 = true;
                                                            } else {
                                                                c3 = 8;
                                                            }
                                                            j12 >>= c3;
                                                        }
                                                        i2 = 1;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    if (i34 == length8) {
                                                        break;
                                                    }
                                                    i34 += i2;
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.h(e9);
                                            z2 = true;
                                        }
                                    }
                                    Unit unit5 = Unit.f40552a;
                                } else {
                                    mutableScatterMap = mutableScatterMap19;
                                    this.f15318h.d(derivedState4);
                                }
                            }
                            obj = obj2;
                        } else {
                            it = it3;
                            hashMap = hashMap9;
                            mutableScatterMap = mutableScatterMap17;
                            mutableScatterMap16 = mutableScatterMap18;
                            obj = next;
                        }
                        Object e10 = mutableScatterMap.e(obj);
                        if (e10 != null) {
                            if (e10 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet9 = (MutableScatterSet) e10;
                                Object[] objArr16 = mutableScatterSet9.f1967b;
                                long[] jArr16 = mutableScatterSet9.f1966a;
                                int length9 = jArr16.length - 2;
                                if (length9 >= 0) {
                                    int i37 = 0;
                                    while (true) {
                                        long j13 = jArr16[i37];
                                        if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i38 = 8 - ((~(i37 - length9)) >>> 31);
                                            for (int i39 = 0; i39 < i38; i39++) {
                                                if ((j13 & 255) < 128) {
                                                    mutableScatterSet.h(objArr16[(i37 << 3) + i39]);
                                                    c2 = 8;
                                                    z2 = true;
                                                } else {
                                                    c2 = 8;
                                                }
                                                j13 >>= c2;
                                            }
                                            if (i38 != 8) {
                                                break;
                                            }
                                        }
                                        if (i37 == length9) {
                                            break;
                                        }
                                        i37++;
                                    }
                                }
                            } else {
                                mutableScatterSet.h(e10);
                                z2 = true;
                            }
                            mutableScatterMap17 = mutableScatterMap;
                            hashMap9 = hashMap;
                            it3 = it;
                        }
                    } else {
                        it = it3;
                        hashMap = hashMap9;
                        mutableScatterMap = mutableScatterMap17;
                    }
                    mutableScatterMap17 = mutableScatterMap;
                    hashMap9 = hashMap;
                    it3 = it;
                }
            }
            if (this.f15318h.p() != 0) {
                MutableVector mutableVector = this.f15318h;
                Object[] objArr17 = mutableVector.f15005z;
                int p2 = mutableVector.p();
                for (int i40 = 0; i40 < p2; i40++) {
                    o((DerivedState) objArr17[i40]);
                }
                this.f15318h.l();
            }
            return z2;
        }

        public final void k(Object obj) {
            Object obj2 = this.f15312b;
            Intrinsics.f(obj2);
            int i2 = this.f15314d;
            MutableObjectIntMap mutableObjectIntMap = this.f15313c;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap(0, 1, (DefaultConstructorMarker) null);
                this.f15313c = mutableObjectIntMap;
                this.f15316f.x(obj2, mutableObjectIntMap);
                Unit unit = Unit.f40552a;
            }
            l(obj, i2, obj2, mutableObjectIntMap);
        }

        public final void l(Object obj, int i2, Object obj2, MutableObjectIntMap mutableObjectIntMap) {
            int i3;
            int i4;
            Object obj3 = obj;
            int i5 = i2;
            if (this.f15320j <= 0) {
                int q2 = mutableObjectIntMap.q(obj3, i5, -1);
                if (!(obj3 instanceof DerivedState) || q2 == i5) {
                    i3 = -1;
                } else {
                    DerivedState.Record s2 = ((DerivedState) obj3).s();
                    this.f15322l.put(obj3, s2.a());
                    ObjectIntMap b2 = s2.b();
                    MutableScatterMap mutableScatterMap = this.f15321k;
                    ScopeMap.j(mutableScatterMap, obj3);
                    Object[] objArr = b2.f1932b;
                    long[] jArr = b2.f1931a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr[i6];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i7 = 8;
                                int i8 = 8 - ((~(i6 - length)) >>> 31);
                                int i9 = 0;
                                while (i9 < i8) {
                                    if ((j2 & 255) < 128) {
                                        StateObject stateObject = (StateObject) objArr[(i6 << 3) + i9];
                                        if (stateObject instanceof StateObjectImpl) {
                                            ((StateObjectImpl) stateObject).u(ReaderKind.a(2));
                                        }
                                        ScopeMap.a(mutableScatterMap, stateObject, obj3);
                                        i4 = 8;
                                    } else {
                                        i4 = i7;
                                    }
                                    j2 >>= i4;
                                    i9++;
                                    i7 = i4;
                                }
                                if (i8 != i7) {
                                    break;
                                }
                            }
                            if (i6 == length) {
                                break;
                            }
                            i6++;
                        }
                    }
                    i3 = -1;
                }
                if (q2 == i3) {
                    if (obj3 instanceof StateObjectImpl) {
                        ((StateObjectImpl) obj3).u(ReaderKind.a(2));
                    }
                    ScopeMap.a(this.f15315e, obj3, obj2);
                }
            }
        }

        public final void m(Object obj, Object obj2) {
            ScopeMap.i(this.f15315e, obj2, obj);
            if ((obj2 instanceof DerivedState) && !ScopeMap.e(this.f15315e, obj2)) {
                ScopeMap.j(this.f15321k, obj2);
                this.f15322l.remove(obj2);
            }
        }

        public final void n(Function1 function1) {
            long[] jArr;
            int i2;
            long j2;
            int i3;
            int i4;
            long[] jArr2;
            long j3;
            int i5;
            MutableScatterMap mutableScatterMap = this.f15316f;
            long[] jArr3 = mutableScatterMap.f1959a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j4 = jArr3[i6];
                    long j5 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                        int i7 = 8;
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j4 & 255) < 128) {
                                int i10 = (i6 << 3) + i9;
                                Object obj = mutableScatterMap.f1960b[i10];
                                MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.f1961c[i10];
                                Boolean bool = (Boolean) function1.invoke(obj);
                                if (bool.booleanValue()) {
                                    Object[] objArr = mutableObjectIntMap.f1932b;
                                    int[] iArr = mutableObjectIntMap.f1933c;
                                    long[] jArr4 = mutableObjectIntMap.f1931a;
                                    int length2 = jArr4.length - 2;
                                    jArr2 = jArr3;
                                    if (length2 >= 0) {
                                        i4 = i8;
                                        int i11 = 0;
                                        while (true) {
                                            long j6 = jArr4[i11];
                                            i3 = i6;
                                            j2 = j4;
                                            j3 = -9187201950435737472L;
                                            if ((((~j6) << 7) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                for (int i13 = 0; i13 < i12; i13++) {
                                                    if ((j6 & 255) < 128) {
                                                        int i14 = (i11 << 3) + i13;
                                                        Object obj2 = objArr[i14];
                                                        int i15 = iArr[i14];
                                                        m(obj, obj2);
                                                    }
                                                    j6 >>= 8;
                                                }
                                                if (i12 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i11 == length2) {
                                                break;
                                            }
                                            i11++;
                                            i6 = i3;
                                            j4 = j2;
                                        }
                                    } else {
                                        i3 = i6;
                                        j2 = j4;
                                        i4 = i8;
                                        j3 = -9187201950435737472L;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i3 = i6;
                                    j2 = j4;
                                    i4 = i8;
                                    j3 = j5;
                                }
                                if (bool.booleanValue()) {
                                    mutableScatterMap.v(i10);
                                }
                                i5 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i6;
                                j2 = j4;
                                i4 = i8;
                                j3 = j5;
                                i5 = i7;
                            }
                            j4 = j2 >> i5;
                            i9++;
                            i7 = i5;
                            j5 = j3;
                            jArr3 = jArr2;
                            i8 = i4;
                            i6 = i3;
                        }
                        jArr = jArr3;
                        int i16 = i6;
                        if (i8 == i7) {
                            i2 = i16;
                        } else {
                            return;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i6;
                    }
                    if (i2 != length) {
                        i6 = i2 + 1;
                        jArr3 = jArr;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void o(DerivedState derivedState) {
            long[] jArr;
            long[] jArr2;
            int i2;
            MutableObjectIntMap mutableObjectIntMap;
            DerivedState derivedState2 = derivedState;
            MutableScatterMap mutableScatterMap = this.f15316f;
            int hashCode = Long.hashCode(SnapshotKt.M().i());
            Object e2 = this.f15315e.e(derivedState2);
            if (e2 == null) {
                return;
            }
            if (e2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) e2;
                Object[] objArr = mutableScatterSet.f1967b;
                long[] jArr3 = mutableScatterSet.f1966a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr3[i3];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j2 & 255) < 128) {
                                    Object obj = objArr[(i3 << 3) + i6];
                                    MutableObjectIntMap mutableObjectIntMap2 = (MutableObjectIntMap) mutableScatterMap.e(obj);
                                    jArr2 = jArr3;
                                    if (mutableObjectIntMap2 == null) {
                                        mutableObjectIntMap = new MutableObjectIntMap(0, 1, (DefaultConstructorMarker) null);
                                        mutableScatterMap.x(obj, mutableObjectIntMap);
                                        Unit unit = Unit.f40552a;
                                    } else {
                                        mutableObjectIntMap = mutableObjectIntMap2;
                                    }
                                    l(derivedState2, hashCode, obj, mutableObjectIntMap);
                                    i2 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i5 != i4) {
                                return;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i3 != length) {
                            i3++;
                            jArr3 = jArr;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                MutableObjectIntMap mutableObjectIntMap3 = (MutableObjectIntMap) mutableScatterMap.e(e2);
                if (mutableObjectIntMap3 == null) {
                    mutableObjectIntMap3 = new MutableObjectIntMap(0, 1, (DefaultConstructorMarker) null);
                    mutableScatterMap.x(e2, mutableObjectIntMap3);
                    Unit unit2 = Unit.f40552a;
                }
                l(derivedState2, hashCode, e2, mutableObjectIntMap3);
            }
        }
    }

    public SnapshotStateObserver(Function1 function1) {
        this.f15300a = function1;
    }

    public static final Unit e(SnapshotStateObserver snapshotStateObserver, Set set, Snapshot snapshot) {
        snapshotStateObserver.d(set);
        if (snapshotStateObserver.i()) {
            snapshotStateObserver.o();
        }
        return Unit.f40552a;
    }

    public static final Unit l(SnapshotStateObserver snapshotStateObserver, Object obj) {
        if (!snapshotStateObserver.f15308i) {
            synchronized (snapshotStateObserver.f15306g) {
                ObservedScopeMap observedScopeMap = snapshotStateObserver.f15309j;
                Intrinsics.f(observedScopeMap);
                observedScopeMap.k(obj);
                Unit unit = Unit.f40552a;
            }
        }
        return Unit.f40552a;
    }

    public static final Unit p(SnapshotStateObserver snapshotStateObserver) {
        do {
            synchronized (snapshotStateObserver.f15306g) {
                try {
                    if (!snapshotStateObserver.f15302c) {
                        snapshotStateObserver.f15302c = true;
                        MutableVector mutableVector = snapshotStateObserver.f15305f;
                        Object[] objArr = mutableVector.f15005z;
                        int p2 = mutableVector.p();
                        for (int i2 = 0; i2 < p2; i2++) {
                            ((ObservedScopeMap) objArr[i2]).h();
                        }
                        snapshotStateObserver.f15302c = false;
                    }
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (snapshotStateObserver.i());
        return Unit.f40552a;
    }

    public final void d(Set set) {
        Object obj;
        Collection collection;
        do {
            obj = this.f15301b.get();
            if (obj == null) {
                collection = set;
            } else if (obj instanceof Set) {
                collection = CollectionsKt.p(obj, set);
            } else if (obj instanceof List) {
                collection = CollectionsKt.x0((Collection) obj, CollectionsKt.e(set));
            } else {
                n();
                throw new KotlinNothingValueException();
            }
        } while (!h.a(this.f15301b, obj, collection));
    }

    public final void f() {
        synchronized (this.f15306g) {
            try {
                MutableVector mutableVector = this.f15305f;
                Object[] objArr = mutableVector.f15005z;
                int p2 = mutableVector.p();
                for (int i2 = 0; i2 < p2; i2++) {
                    ((ObservedScopeMap) objArr[i2]).c();
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f15306g) {
            try {
                MutableVector mutableVector = this.f15305f;
                int p2 = mutableVector.p();
                int i2 = 0;
                for (int i3 = 0; i3 < p2; i3++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.f15005z[i3];
                    observedScopeMap.e(obj);
                    if (!observedScopeMap.g()) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr = mutableVector.f15005z;
                        objArr[i3 - i2] = objArr[i3];
                    }
                }
                int i4 = p2 - i2;
                ArraysKt.w(mutableVector.f15005z, (Object) null, i4, p2);
                mutableVector.D(i4);
                Unit unit = Unit.f40552a;
            } finally {
            }
        }
    }

    public final void h(Function1 function1) {
        synchronized (this.f15306g) {
            try {
                MutableVector mutableVector = this.f15305f;
                int p2 = mutableVector.p();
                int i2 = 0;
                for (int i3 = 0; i3 < p2; i3++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.f15005z[i3];
                    observedScopeMap.n(function1);
                    if (!observedScopeMap.g()) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr = mutableVector.f15005z;
                        objArr[i3 - i2] = objArr[i3];
                    }
                }
                int i4 = p2 - i2;
                ArraysKt.w(mutableVector.f15005z, (Object) null, i4, p2);
                mutableVector.D(i4);
                Unit unit = Unit.f40552a;
            } finally {
            }
        }
    }

    public final boolean i() {
        boolean z2;
        synchronized (this.f15306g) {
            z2 = this.f15302c;
        }
        if (z2) {
            return false;
        }
        boolean z3 = false;
        while (true) {
            Set m2 = m();
            if (m2 == null) {
                return z3;
            }
            synchronized (this.f15306g) {
                try {
                    MutableVector mutableVector = this.f15305f;
                    Object[] objArr = mutableVector.f15005z;
                    int p2 = mutableVector.p();
                    for (int i2 = 0; i2 < p2; i2++) {
                        if (!((ObservedScopeMap) objArr[i2]).j(m2)) {
                            if (!z3) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    }
                    Unit unit = Unit.f40552a;
                } finally {
                }
            }
        }
    }

    public final ObservedScopeMap j(Function1 function1) {
        ObservedScopeMap observedScopeMap;
        MutableVector mutableVector = this.f15305f;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        int i2 = 0;
        while (true) {
            if (i2 >= p2) {
                observedScopeMap = null;
                break;
            }
            observedScopeMap = objArr[i2];
            if (((ObservedScopeMap) observedScopeMap).f() == function1) {
                break;
            }
            i2++;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.e(function1, 1));
        this.f15305f.d(observedScopeMap3);
        return observedScopeMap3;
    }

    public final void k(Object obj, Function1 function1, Function0 function0) {
        ObservedScopeMap j2;
        synchronized (this.f15306g) {
            j2 = j(function1);
        }
        boolean z2 = this.f15308i;
        ObservedScopeMap observedScopeMap = this.f15309j;
        long j3 = this.f15310k;
        if (j3 != -1) {
            if (!(j3 == Thread_jvmKt.a())) {
                PreconditionsKt.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + Thread_jvmKt.a() + ", name=" + Thread_jvmKt.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f15308i = false;
            this.f15309j = j2;
            this.f15310k = Thread_jvmKt.a();
            j2.i(obj, this.f15304e, function0);
        } finally {
            this.f15309j = observedScopeMap;
            this.f15308i = z2;
            this.f15310k = j3;
        }
    }

    public final Set m() {
        Object obj;
        Object obj2;
        Set set;
        do {
            obj = this.f15301b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                n();
                throw new KotlinNothingValueException();
            }
        } while (!h.a(this.f15301b, obj, obj2));
        return set;
    }

    public final Void n() {
        ComposerKt.w("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    public final void o() {
        this.f15300a.invoke(new m(this));
    }

    public final void q() {
        this.f15307h = Snapshot.f15255e.i(this.f15303d);
    }

    public final void r() {
        ObserverHandle observerHandle = this.f15307h;
        if (observerHandle != null) {
            observerHandle.d();
        }
    }
}
