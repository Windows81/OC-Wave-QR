package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {
    public static Sequence A(Sequence sequence, Function1 function1) {
        Intrinsics.i(sequence, "<this>");
        Intrinsics.i(function1, "transform");
        return SequencesKt.s(new TransformingSequence(sequence, function1));
    }

    public static Sequence B(Sequence sequence, Function1 function1) {
        Intrinsics.i(sequence, "<this>");
        Intrinsics.i(function1, "predicate");
        return new TakeWhileSequence(sequence, function1);
    }

    public static final Collection C(Sequence sequence, Collection collection) {
        Intrinsics.i(sequence, "<this>");
        Intrinsics.i(collection, "destination");
        for (Object add : sequence) {
            collection.add(add);
        }
        return collection;
    }

    public static List D(Sequence sequence) {
        Intrinsics.i(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.m();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final List E(Sequence sequence) {
        Intrinsics.i(sequence, "<this>");
        return (List) C(sequence, new ArrayList());
    }

    public static Iterable n(Sequence sequence) {
        Intrinsics.i(sequence, "<this>");
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(sequence);
    }

    public static int o(Sequence sequence) {
        Intrinsics.i(sequence, "<this>");
        Iterator it = sequence.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                CollectionsKt.v();
            }
        }
        return i2;
    }

    public static Sequence p(Sequence sequence, int i2) {
        Intrinsics.i(sequence, "<this>");
        if (i2 >= 0) {
            return i2 == 0 ? sequence : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).a(i2) : new DropSequence(sequence, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final Sequence q(Sequence sequence, Function1 function1) {
        Intrinsics.i(sequence, "<this>");
        Intrinsics.i(function1, "predicate");
        return new FilteringSequence(sequence, true, function1);
    }

    public static final Sequence r(Sequence sequence, Function1 function1) {
        Intrinsics.i(sequence, "<this>");
        Intrinsics.i(function1, "predicate");
        return new FilteringSequence(sequence, false, function1);
    }

    public static Sequence s(Sequence sequence) {
        Intrinsics.i(sequence, "<this>");
        Sequence r2 = r(sequence, new c());
        Intrinsics.g(r2, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return r2;
    }

    public static final boolean t(Object obj) {
        return obj == null;
    }

    public static Object u(Sequence sequence) {
        Intrinsics.i(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final Appendable v(Sequence sequence, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(sequence, "<this>");
        Intrinsics.i(appendable, "buffer");
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i3 = 0;
        for (Object next : sequence) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            StringsKt.a(appendable, next, function1);
        }
        if (i2 >= 0 && i3 > i2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String w(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(sequence, "<this>");
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        return ((StringBuilder) v(sequence, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String x(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return w(sequence, charSequence, charSequence6, charSequence5, i4, charSequence7, function1);
    }

    public static Object y(Sequence sequence) {
        Intrinsics.i(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Sequence z(Sequence sequence, Function1 function1) {
        Intrinsics.i(sequence, "<this>");
        Intrinsics.i(function1, "transform");
        return new TransformingSequence(sequence, function1);
    }
}
