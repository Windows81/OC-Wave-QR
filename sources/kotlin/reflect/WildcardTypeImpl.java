package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class WildcardTypeImpl implements WildcardType, TypeImpl {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f41005B = new Companion((DefaultConstructorMarker) null);
    public static final WildcardTypeImpl C = new WildcardTypeImpl((Type) null, (Type) null);

    /* renamed from: A  reason: collision with root package name */
    public final Type f41006A;

    /* renamed from: z  reason: collision with root package name */
    public final Type f41007z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WildcardTypeImpl a() {
            return WildcardTypeImpl.C;
        }

        public Companion() {
        }
    }

    public WildcardTypeImpl(Type type, Type type2) {
        this.f41007z = type;
        this.f41006A = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
        }
    }

    public Type[] getLowerBounds() {
        Type type = this.f41006A;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    public String getTypeName() {
        if (this.f41006A != null) {
            return "? super " + TypesJVMKt.g(this.f41006A);
        }
        Type type = this.f41007z;
        if (type == null || Intrinsics.d(type, Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.g(this.f41007z);
    }

    public Type[] getUpperBounds() {
        Type type = this.f41007z;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
