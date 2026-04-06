package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class StrategyKt {
    public static final KeylineList j(KeylineList keylineList, float f2, float f3, float f4, Keyline keyline, int i2) {
        KeylineList keylineList2 = keylineList;
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = keylineList2.get(i3);
            if (!((Keyline) obj).g()) {
                arrayList.add(obj);
            }
        }
        float size2 = f4 / ((float) arrayList.size());
        KeylineList b2 = KeylineListKt.b(f2, f3, i2, (keyline.d() - (size2 / 2.0f)) + f4, new p(keylineList2, size2));
        ArrayList arrayList2 = new ArrayList(b2.size());
        int size3 = b2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList2.add(Keyline.b((Keyline) b2.get(i4), 0.0f, 0.0f, keylineList2.get(i4).f(), false, false, false, 0.0f, 123, (Object) null));
        }
        return new KeylineList(arrayList2);
    }

    public static final Unit k(KeylineList keylineList, float f2, KeylineListScope keylineListScope) {
        int size = keylineList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Keyline keyline = (Keyline) keylineList.get(i2);
            keylineListScope.a(keyline.e() - Math.abs(f2), keyline.g());
        }
        return Unit.f40552a;
    }

    public static final List l(KeylineList keylineList, float f2, float f3, float f4) {
        if (keylineList.isEmpty()) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.J(f2)) {
            if (f4 != 0.0f) {
                arrayList.add(j(keylineList, f2, f3, -f4, keylineList.v(), keylineList.w()));
            }
            return arrayList;
        }
        int w2 = keylineList.w();
        int A2 = keylineList.A();
        int i2 = A2 - w2;
        if (i2 > 0 || keylineList.v().c() <= 0.0f) {
            for (int i3 = 0; i3 < i2; i3++) {
                KeylineList keylineList2 = (KeylineList) CollectionsKt.p0(arrayList);
                int i4 = A2 - i3;
                arrayList.add(t(keylineList2, keylineList.A(), i4 < CollectionsKt.o(keylineList) ? keylineList2.K(keylineList.get(i4 + 1).e()) + 1 : 0, f2, f3));
            }
            if (f4 != 0.0f) {
                arrayList.set(CollectionsKt.o(arrayList), j((KeylineList) CollectionsKt.p0(arrayList), f2, f3, -f4, ((KeylineList) CollectionsKt.p0(arrayList)).v(), ((KeylineList) CollectionsKt.p0(arrayList)).w()));
            }
            return arrayList;
        }
        arrayList.add(t(keylineList, 0, 0, f2, f3));
        return arrayList;
    }

    public static final float m(List list, float f2) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) CollectionsKt.p0((List) CollectionsKt.e0(list))).f() - ((Keyline) CollectionsKt.p0((List) CollectionsKt.p0(list))).f(), f2);
    }

    public static final ShiftPointRange n(int i2, FloatList floatList, float f2) {
        float a2 = floatList.a(0);
        Iterator it = RangesKt.v(1, i2).iterator();
        while (it.hasNext()) {
            int b2 = ((IntIterator) it).b();
            float a3 = floatList.a(b2);
            if (f2 <= a3) {
                return new ShiftPointRange(b2 - 1, b2, r(0.0f, 1.0f, a2, a3, f2));
            }
            a2 = a3;
        }
        return new ShiftPointRange(0, 0, 0.0f);
    }

    public static final List o(KeylineList keylineList, float f2, float f3, float f4) {
        if (keylineList.isEmpty()) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.F()) {
            if (f4 != 0.0f) {
                arrayList.add(j(keylineList, f2, f3, f4, keylineList.m(), keylineList.n()));
            }
            return arrayList;
        }
        int p2 = keylineList.p();
        int n2 = keylineList.n() - p2;
        if (n2 > 0 || keylineList.m().c() <= 0.0f) {
            for (int i2 = 0; i2 < n2; i2++) {
                KeylineList keylineList2 = (KeylineList) CollectionsKt.p0(arrayList);
                int i3 = p2 + i2;
                int o2 = CollectionsKt.o(keylineList);
                if (i3 > 0) {
                    o2 = keylineList2.h(keylineList.get(i3 - 1).e()) - 1;
                }
                arrayList.add(t(keylineList2, keylineList.p(), o2, f2, f3));
            }
            if (f4 != 0.0f) {
                arrayList.set(CollectionsKt.o(arrayList), j((KeylineList) CollectionsKt.p0(arrayList), f2, f3, f4, ((KeylineList) CollectionsKt.p0(arrayList)).m(), ((KeylineList) CollectionsKt.p0(arrayList)).n()));
            }
            return arrayList;
        }
        arrayList.add(t(keylineList, 0, 0, f2, f3));
        return arrayList;
    }

    public static final float p(List list, float f2) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) CollectionsKt.e0((List) CollectionsKt.p0(list))).f() - ((Keyline) CollectionsKt.e0((List) CollectionsKt.e0(list))).f(), f2);
    }

    public static final FloatList q(float f2, List list, boolean z2) {
        MutableFloatList a2 = FloatListKt.a(0.0f);
        if (f2 == 0.0f || list.isEmpty()) {
            return a2;
        }
        IntRange v2 = RangesKt.v(1, list.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(v2, 10));
        Iterator it = v2.iterator();
        while (it.hasNext()) {
            int b2 = ((IntIterator) it).b();
            int i2 = b2 - 1;
            KeylineList keylineList = (KeylineList) list.get(i2);
            KeylineList keylineList2 = (KeylineList) list.get(b2);
            arrayList.add(Boolean.valueOf(a2.d(b2 == CollectionsKt.o(list) ? 1.0f : a2.a(i2) + ((z2 ? ((Keyline) CollectionsKt.e0(keylineList2)).f() - ((Keyline) CollectionsKt.e0(keylineList)).f() : ((Keyline) CollectionsKt.p0(keylineList)).f() - ((Keyline) CollectionsKt.p0(keylineList2)).f()) / f2))));
        }
        return a2;
    }

    public static final float r(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : MathHelpersKt.b(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static final List s(List list, int i2, int i3) {
        list.remove(i2);
        list.add(i3, (Keyline) list.get(i2));
        return list;
    }

    public static final KeylineList t(KeylineList keylineList, int i2, int i3, float f2, float f3) {
        int i4 = i2 > i3 ? 1 : -1;
        return KeylineListKt.b(f2, f3, keylineList.C() + i4, keylineList.B().d() + (((keylineList.get(i2).e() - keylineList.get(i2).c()) + f3) * ((float) i4)), new o(keylineList, i2, i3));
    }

    public static final Unit u(KeylineList keylineList, int i2, int i3, KeylineListScope keylineListScope) {
        List s2 = s(CollectionsKt.P0(keylineList), i2, i3);
        int size = s2.size();
        for (int i4 = 0; i4 < size; i4++) {
            Keyline keyline = (Keyline) s2.get(i4);
            keylineListScope.a(keyline.e(), keyline.g());
        }
        return Unit.f40552a;
    }
}
