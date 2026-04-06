package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class ArraysKt___ArraysJvmKt$asList$8 extends AbstractList<Character> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ char[] f40590A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Character)) {
            return false;
        }
        return i(((Character) obj).charValue());
    }

    public int g() {
        return this.f40590A.length;
    }

    public boolean i(char c2) {
        return ArraysKt___ArraysKt.V(this.f40590A, c2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        return n(((Character) obj).charValue());
    }

    public boolean isEmpty() {
        return this.f40590A.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        return o(((Character) obj).charValue());
    }

    /* renamed from: m */
    public Character get(int i2) {
        return Character.valueOf(this.f40590A[i2]);
    }

    public int n(char c2) {
        return ArraysKt___ArraysKt.q0(this.f40590A, c2);
    }

    public int o(char c2) {
        return ArraysKt___ArraysKt.F0(this.f40590A, c2);
    }
}
