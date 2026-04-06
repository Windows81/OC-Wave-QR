package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IntListKt {

    /* renamed from: a  reason: collision with root package name */
    public static final IntList f1785a = new MutableIntList(0);

    public static final IntList a() {
        return f1785a;
    }

    public static final IntList b(int i2) {
        return e(i2);
    }

    public static final IntList c(int i2, int i3) {
        return f(i2, i3);
    }

    public static final IntList d(int... iArr) {
        Intrinsics.i(iArr, "elements");
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.l(mutableIntList.f1784b, iArr);
        return mutableIntList;
    }

    public static final MutableIntList e(int i2) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.k(i2);
        return mutableIntList;
    }

    public static final MutableIntList f(int i2, int i3) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.k(i2);
        mutableIntList.k(i3);
        return mutableIntList;
    }
}
