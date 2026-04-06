package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class AnnotatedStringKt {

    /* renamed from: a  reason: collision with root package name */
    public static final AnnotatedString f18237a = new AnnotatedString("", (List) null, 2, (DefaultConstructorMarker) null);

    public static final List d(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add((AnnotatedString.Range) list.get(i2));
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList.add((AnnotatedString.Range) list2.get(i3));
        }
        return arrayList;
    }

    public static final AnnotatedString e() {
        return f18237a;
    }

    public static final List f(List list, int i2, int i3) {
        if (!(i2 <= i3)) {
            InlineClassHelperKt.a("start (" + i2 + ") should be less than or equal to end (" + i3 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i4);
            if (i(i2, i3, range.h(), range.f())) {
                arrayList.add(new AnnotatedString.Range(range.g(), Math.max(i2, range.h()) - i2, Math.min(i3, range.f()) - i2, range.i()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final List g(AnnotatedString annotatedString, int i2, int i3, Function1 function1) {
        List c2;
        if (i2 == i3 || (c2 = annotatedString.c()) == null) {
            return null;
        }
        if (i2 != 0 || i3 < annotatedString.k().length()) {
            ArrayList arrayList = new ArrayList(c2.size());
            int size = c2.size();
            for (int i4 = 0; i4 < size; i4++) {
                AnnotatedString.Range range = (AnnotatedString.Range) c2.get(i4);
                boolean z2 = true;
                if (!(function1 != null ? ((Boolean) function1.invoke(range.g())).booleanValue() : true) || !i(i2, i3, range.h(), range.f())) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(new AnnotatedString.Range((AnnotatedString.Annotation) range.g(), RangesKt.o(range.h(), i2, i3) - i2, RangesKt.o(range.f(), i2, i3) - i2, range.i()));
                }
            }
            return arrayList;
        } else if (function1 == null) {
            return c2;
        } else {
            ArrayList arrayList2 = new ArrayList(c2.size());
            int size2 = c2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                Object obj = c2.get(i5);
                if (((Boolean) function1.invoke(((AnnotatedString.Range) obj).g())).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
    }

    public static /* synthetic */ List h(AnnotatedString annotatedString, int i2, int i3, Function1 function1, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function1 = null;
        }
        return g(annotatedString, i2, i3, function1);
    }

    public static final boolean i(int i2, int i3, int i4, int i5) {
        boolean z2 = false;
        boolean z3 = ((i2 == i3) | (i4 == i5)) & (i2 == i4);
        boolean z4 = i2 < i5;
        if (i4 < i3) {
            z2 = true;
        }
        return (z4 & z2) | z3;
    }

    public static final List j(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        List list;
        ParagraphStyle paragraphStyle2 = paragraphStyle;
        List g2 = annotatedString.g();
        if (g2 == null || (list = CollectionsKt.D0(g2, new AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1())) == null) {
            list = CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
            AnnotatedString.Range e2 = AnnotatedString.Range.e(range, paragraphStyle2.l((ParagraphStyle) range.g()), 0, 0, (String) null, 14, (Object) null);
            while (i2 < e2.h() && !arrayDeque.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) arrayDeque.last();
                if (e2.h() < range2.f()) {
                    arrayList.add(new AnnotatedString.Range(range2.g(), i2, e2.h()));
                    i2 = e2.h();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.g(), i2, range2.f()));
                    i2 = range2.f();
                    while (!arrayDeque.isEmpty() && i2 == ((AnnotatedString.Range) arrayDeque.last()).f()) {
                        arrayDeque.removeLast();
                    }
                }
            }
            if (i2 < e2.h()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle2, i2, e2.h()));
                i2 = e2.h();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayDeque.q();
            if (range3 == null) {
                arrayDeque.add(new AnnotatedString.Range(e2.g(), e2.h(), e2.f()));
            } else if (range3.h() == e2.h() && range3.f() == e2.f()) {
                arrayDeque.removeLast();
                arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.g()).l((ParagraphStyle) e2.g()), e2.h(), e2.f()));
            } else if (range3.h() == range3.f()) {
                arrayList.add(new AnnotatedString.Range(range3.g(), range3.h(), range3.f()));
                arrayDeque.removeLast();
                arrayDeque.add(new AnnotatedString.Range(e2.g(), e2.h(), e2.f()));
            } else if (range3.f() >= e2.f()) {
                arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.g()).l((ParagraphStyle) e2.g()), e2.h(), e2.f()));
            } else {
                throw new IllegalArgumentException();
            }
        }
        while (i2 <= annotatedString.k().length() && !arrayDeque.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) arrayDeque.last();
            arrayList.add(new AnnotatedString.Range(range4.g(), i2, range4.f()));
            i2 = range4.f();
            while (!arrayDeque.isEmpty() && i2 == ((AnnotatedString.Range) arrayDeque.last()).f()) {
                arrayDeque.removeLast();
            }
        }
        if (i2 < annotatedString.k().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle2, i2, annotatedString.k().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle2, 0, 0));
        }
        return arrayList;
    }

    public static final AnnotatedString k(AnnotatedString annotatedString, int i2, int i3) {
        String str;
        if (i2 != i3) {
            str = annotatedString.k().substring(i2, i3);
            Intrinsics.h(str, "substring(...)");
        } else {
            str = "";
        }
        List g2 = g(annotatedString, i2, i3, AnnotatedStringKt$substringWithoutParagraphStyles$1.f18240z);
        if (g2 == null) {
            g2 = CollectionsKt.m();
        }
        return new AnnotatedString(str, g2);
    }
}
