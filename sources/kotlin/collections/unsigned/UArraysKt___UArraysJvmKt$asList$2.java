package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

@Metadata
public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList<ULong> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long[] f40681A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ULong)) {
            return false;
        }
        return i(((ULong) obj).m());
    }

    public int g() {
        return ULongArray.s(this.f40681A);
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        return ULong.d(m(i2));
    }

    public boolean i(long j2) {
        return ULongArray.m(this.f40681A, j2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof ULong)) {
            return -1;
        }
        return n(((ULong) obj).m());
    }

    public boolean isEmpty() {
        return ULongArray.v(this.f40681A);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof ULong)) {
            return -1;
        }
        return o(((ULong) obj).m());
    }

    public long m(int i2) {
        return ULongArray.p(this.f40681A, i2);
    }

    public int n(long j2) {
        return ArraysKt.s0(this.f40681A, j2);
    }

    public int o(long j2) {
        return ArraysKt.H0(this.f40681A, j2);
    }
}
