package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {

    /* renamed from: z  reason: collision with root package name */
    public final Type f40985z;

    public GenericArrayTypeImpl(Type type) {
        Intrinsics.i(type, "elementType");
        this.f40985z = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && Intrinsics.d(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    public Type getGenericComponentType() {
        return this.f40985z;
    }

    public String getTypeName() {
        return TypesJVMKt.g(this.f40985z) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
