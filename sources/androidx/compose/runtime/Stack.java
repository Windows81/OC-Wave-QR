package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class Stack<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f14918a;

    public static final void a(ArrayList arrayList) {
        arrayList.clear();
    }

    public static ArrayList b(ArrayList arrayList) {
        return arrayList;
    }

    public static /* synthetic */ ArrayList c(ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return b(arrayList);
    }

    public static boolean d(ArrayList arrayList, Object obj) {
        return (obj instanceof Stack) && Intrinsics.d(arrayList, ((Stack) obj).o());
    }

    public static final int e(ArrayList arrayList) {
        return arrayList.size();
    }

    public static int f(ArrayList arrayList) {
        return arrayList.hashCode();
    }

    public static final boolean g(ArrayList arrayList) {
        return arrayList.isEmpty();
    }

    public static final boolean h(ArrayList arrayList) {
        return !g(arrayList);
    }

    public static final Object i(ArrayList arrayList) {
        return arrayList.get(e(arrayList) - 1);
    }

    public static final Object j(ArrayList arrayList, int i2) {
        return arrayList.get(i2);
    }

    public static final Object k(ArrayList arrayList) {
        return arrayList.remove(e(arrayList) - 1);
    }

    public static final boolean l(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    public static final Object[] m(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        return objArr;
    }

    public static String n(ArrayList arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f14918a, obj);
    }

    public int hashCode() {
        return f(this.f14918a);
    }

    public final /* synthetic */ ArrayList o() {
        return this.f14918a;
    }

    public String toString() {
        return n(this.f14918a);
    }
}
