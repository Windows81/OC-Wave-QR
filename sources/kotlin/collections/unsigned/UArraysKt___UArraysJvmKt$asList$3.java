package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

@Metadata
public final class UArraysKt___UArraysJvmKt$asList$3 extends AbstractList<UByte> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ byte[] f40682A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UByte)) {
            return false;
        }
        return i(((UByte) obj).l());
    }

    public int g() {
        return UByteArray.s(this.f40682A);
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        return UByte.d(m(i2));
    }

    public boolean i(byte b2) {
        return UByteArray.m(this.f40682A, b2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof UByte)) {
            return -1;
        }
        return n(((UByte) obj).l());
    }

    public boolean isEmpty() {
        return UByteArray.v(this.f40682A);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof UByte)) {
            return -1;
        }
        return o(((UByte) obj).l());
    }

    public byte m(int i2) {
        return UByteArray.p(this.f40682A, i2);
    }

    public int n(byte b2) {
        return ArraysKt.p0(this.f40682A, b2);
    }

    public int o(byte b2) {
        return ArraysKt.E0(this.f40682A, b2);
    }
}
