package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata
public final class TypesJVMKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41004a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f41004a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.TypesJVMKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Type c(KType kType, boolean z2) {
        KClassifier g2 = kType.g();
        if (g2 instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) g2);
        }
        if (g2 instanceof KClass) {
            KClass kClass = (KClass) g2;
            Class b2 = z2 ? JvmClassMappingKt.b(kClass) : JvmClassMappingKt.a(kClass);
            List f2 = kType.f();
            if (f2.isEmpty()) {
                return b2;
            }
            if (!b2.isArray()) {
                return e(b2, f2);
            }
            if (b2.getComponentType().isPrimitive()) {
                return b2;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.C0(f2);
            if (kTypeProjection != null) {
                KVariance a2 = kTypeProjection.a();
                KType b3 = kTypeProjection.b();
                int i2 = a2 == null ? -1 : WhenMappings.f41004a[a2.ordinal()];
                if (i2 == -1 || i2 == 1) {
                    return b2;
                }
                if (i2 == 2 || i2 == 3) {
                    Intrinsics.f(b3);
                    Type d2 = d(b3, false, 1, (Object) null);
                    return d2 instanceof Class ? b2 : new GenericArrayTypeImpl(d2);
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    public static /* synthetic */ Type d(KType kType, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return c(kType, z2);
    }

    public static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            Iterable<KTypeProjection> iterable = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
            for (KTypeProjection f2 : iterable) {
                arrayList.add(f(f2));
            }
            return new ParameterizedTypeImpl(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            Iterable<KTypeProjection> iterable2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(iterable2, 10));
            for (KTypeProjection f3 : iterable2) {
                arrayList2.add(f(f3));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e2 = e(declaringClass, list.subList(length, list.size()));
            Iterable<KTypeProjection> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.x(subList, 10));
            for (KTypeProjection f4 : subList) {
                arrayList3.add(f(f4));
            }
            return new ParameterizedTypeImpl(cls, e2, arrayList3);
        }
    }

    public static final Type f(KTypeProjection kTypeProjection) {
        KVariance d2 = kTypeProjection.d();
        if (d2 == null) {
            return WildcardTypeImpl.f41005B.a();
        }
        KType c2 = kTypeProjection.c();
        Intrinsics.f(c2);
        int i2 = WhenMappings.f41004a[d2.ordinal()];
        if (i2 == 1) {
            return new WildcardTypeImpl((Type) null, c(c2, true));
        }
        if (i2 == 2) {
            return c(c2, true);
        }
        if (i2 == 3) {
            return new WildcardTypeImpl(c(c2, true), (Type) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String g(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Sequence h2 = SequencesKt.h(type, TypesJVMKt$typeToString$unwrap$1.I);
            return ((Class) SequencesKt.y(h2)).getName() + StringsKt.G("[]", SequencesKt.o(h2));
        }
        String name = cls.getName();
        Intrinsics.h(name, "getName(...)");
        return name;
    }
}
