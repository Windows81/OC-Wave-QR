package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ParameterizedTypeImpl implements ParameterizedType, TypeImpl {

    /* renamed from: A  reason: collision with root package name */
    public final Type f41000A;

    /* renamed from: B  reason: collision with root package name */
    public final Type[] f41001B;

    /* renamed from: z  reason: collision with root package name */
    public final Class f41002z;

    public ParameterizedTypeImpl(Class cls, Type type, List list) {
        Intrinsics.i(cls, "rawType");
        Intrinsics.i(list, "typeArguments");
        this.f41002z = cls;
        this.f41000A = type;
        this.f41001B = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return Intrinsics.d(this.f41002z, parameterizedType.getRawType()) && Intrinsics.d(this.f41000A, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    public Type[] getActualTypeArguments() {
        return this.f41001B;
    }

    public Type getOwnerType() {
        return this.f41000A;
    }

    public Type getRawType() {
        return this.f41002z;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.f41000A;
        if (type != null) {
            sb.append(TypesJVMKt.g(type));
            sb.append("$");
            sb.append(this.f41002z.getSimpleName());
        } else {
            sb.append(TypesJVMKt.g(this.f41002z));
        }
        Type[] typeArr = this.f41001B;
        if (!(typeArr.length == 0)) {
            ArraysKt.y0(typeArr, sb, (CharSequence) null, "<", ">", 0, (CharSequence) null, ParameterizedTypeImpl$getTypeName$1$1.I, 50, (Object) null);
        }
        return sb.toString();
    }

    public int hashCode() {
        int hashCode = this.f41002z.hashCode();
        Type type = this.f41000A;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
