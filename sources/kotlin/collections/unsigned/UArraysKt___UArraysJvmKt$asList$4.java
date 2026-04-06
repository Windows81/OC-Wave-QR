package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

@Metadata
public final class UArraysKt___UArraysJvmKt$asList$4 extends AbstractList<UShort> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ short[] f40683A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UShort)) {
            return false;
        }
        return i(((UShort) obj).l());
    }

    public int g() {
        return UShortArray.s(this.f40683A);
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        return UShort.d(m(i2));
    }

    public boolean i(short s2) {
        return UShortArray.m(this.f40683A, s2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof UShort)) {
            return -1;
        }
        return n(((UShort) obj).l());
    }

    public boolean isEmpty() {
        return UShortArray.v(this.f40683A);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof UShort)) {
            return -1;
        }
        return o(((UShort) obj).l());
    }

    public short m(int i2) {
        return UShortArray.p(this.f40683A, i2);
    }

    public int n(short s2) {
        return ArraysKt.u0(this.f40683A, s2);
    }

    public int o(short s2) {
        return ArraysKt.J0(this.f40683A, s2);
    }
}
