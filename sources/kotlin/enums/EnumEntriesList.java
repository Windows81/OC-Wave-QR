package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class EnumEntriesList<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Enum[] f40746A;

    public EnumEntriesList(Enum[] enumArr) {
        Intrinsics.i(enumArr, "entries");
        this.f40746A = enumArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return i((Enum) obj);
    }

    public int g() {
        return this.f40746A.length;
    }

    public boolean i(Enum enumR) {
        Intrinsics.i(enumR, "element");
        return ((Enum) ArraysKt.o0(this.f40746A, enumR.ordinal())) == enumR;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return n((Enum) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return o((Enum) obj);
    }

    /* renamed from: m */
    public Enum get(int i2) {
        AbstractList.f40564z.b(i2, this.f40746A.length);
        return this.f40746A[i2];
    }

    public int n(Enum enumR) {
        Intrinsics.i(enumR, "element");
        int ordinal = enumR.ordinal();
        if (((Enum) ArraysKt.o0(this.f40746A, ordinal)) == enumR) {
            return ordinal;
        }
        return -1;
    }

    public int o(Enum enumR) {
        Intrinsics.i(enumR, "element");
        return indexOf(enumR);
    }
}
