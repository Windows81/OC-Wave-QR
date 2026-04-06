package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class ArraysKt___ArraysJvmKt$asList$7 extends AbstractList<Boolean> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean[] f40589A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return i(((Boolean) obj).booleanValue());
    }

    public int g() {
        return this.f40589A.length;
    }

    public boolean i(boolean z2) {
        return ArraysKt___ArraysKt.a0(this.f40589A, z2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        return n(((Boolean) obj).booleanValue());
    }

    public boolean isEmpty() {
        return this.f40589A.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        return o(((Boolean) obj).booleanValue());
    }

    /* renamed from: m */
    public Boolean get(int i2) {
        return Boolean.valueOf(this.f40589A[i2]);
    }

    public int n(boolean z2) {
        return ArraysKt___ArraysKt.v0(this.f40589A, z2);
    }

    public int o(boolean z2) {
        return ArraysKt___ArraysKt.K0(this.f40589A, z2);
    }
}
