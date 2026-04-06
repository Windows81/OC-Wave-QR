package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

@Metadata
public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList<UInt> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int[] f40680A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UInt)) {
            return false;
        }
        return i(((UInt) obj).l());
    }

    public int g() {
        return UIntArray.s(this.f40680A);
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        return UInt.d(m(i2));
    }

    public boolean i(int i2) {
        return UIntArray.m(this.f40680A, i2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof UInt)) {
            return -1;
        }
        return n(((UInt) obj).l());
    }

    public boolean isEmpty() {
        return UIntArray.v(this.f40680A);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof UInt)) {
            return -1;
        }
        return o(((UInt) obj).l());
    }

    public int m(int i2) {
        return UIntArray.p(this.f40680A, i2);
    }

    public int n(int i2) {
        return ArraysKt.r0(this.f40680A, i2);
    }

    public int o(int i2) {
        return ArraysKt.G0(this.f40680A, i2);
    }
}
