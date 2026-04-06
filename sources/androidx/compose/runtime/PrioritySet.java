package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class PrioritySet {

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntList f14765a;

    public static final void a(MutableIntList mutableIntList, int i2) {
        if (mutableIntList.f1784b == 0 || !(mutableIntList.e(0) == i2 || mutableIntList.e(mutableIntList.f1784b - 1) == i2)) {
            int i3 = mutableIntList.f1784b;
            mutableIntList.k(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int e2 = mutableIntList.e(i4);
                if (i2 <= e2) {
                    break;
                }
                mutableIntList.q(i3, e2);
                i3 = i4;
            }
            mutableIntList.q(i3, i2);
        }
    }

    public static MutableIntList b(MutableIntList mutableIntList) {
        return mutableIntList;
    }

    public static /* synthetic */ MutableIntList c(MutableIntList mutableIntList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            mutableIntList = new MutableIntList(0, 1, (DefaultConstructorMarker) null);
        }
        return b(mutableIntList);
    }

    public static boolean d(MutableIntList mutableIntList, Object obj) {
        return (obj instanceof PrioritySet) && Intrinsics.d(mutableIntList, ((PrioritySet) obj).j());
    }

    public static int e(MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    public static final boolean f(MutableIntList mutableIntList) {
        return mutableIntList.f1784b != 0;
    }

    public static final int g(MutableIntList mutableIntList) {
        return mutableIntList.d();
    }

    public static final int h(MutableIntList mutableIntList) {
        int e2;
        int i2 = mutableIntList.f1784b;
        int e3 = mutableIntList.e(0);
        while (mutableIntList.f1784b != 0 && mutableIntList.e(0) == e3) {
            mutableIntList.q(0, mutableIntList.i());
            mutableIntList.o(mutableIntList.f1784b - 1);
            int i3 = mutableIntList.f1784b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int e4 = mutableIntList.e(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int e5 = mutableIntList.e(i7);
                if (i6 < i3 && (e2 = mutableIntList.e(i6)) > e5) {
                    if (e2 <= e4) {
                        break;
                    }
                    mutableIntList.q(i5, e2);
                    mutableIntList.q(i6, e4);
                    i5 = i6;
                } else if (e5 <= e4) {
                    break;
                } else {
                    mutableIntList.q(i5, e5);
                    mutableIntList.q(i7, e4);
                    i5 = i7;
                }
            }
        }
        return e3;
    }

    public static String i(MutableIntList mutableIntList) {
        return "PrioritySet(list=" + mutableIntList + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f14765a, obj);
    }

    public int hashCode() {
        return e(this.f14765a);
    }

    public final /* synthetic */ MutableIntList j() {
        return this.f14765a;
    }

    public String toString() {
        return i(this.f14765a);
    }
}
