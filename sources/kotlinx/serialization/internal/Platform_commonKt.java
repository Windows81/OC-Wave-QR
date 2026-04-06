package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class Platform_commonKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SerialDescriptor[] f42168a = new SerialDescriptor[0];

    public static final Set a(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "<this>");
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.f());
        int f2 = serialDescriptor.f();
        for (int i2 = 0; i2 < f2; i2++) {
            hashSet.add(serialDescriptor.g(i2));
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = (kotlinx.serialization.descriptors.SerialDescriptor[]) r1.toArray(new kotlinx.serialization.descriptors.SerialDescriptor[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.descriptors.SerialDescriptor[] b(java.util.List r1) {
        /*
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 == 0) goto L_0x001b
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            kotlinx.serialization.descriptors.SerialDescriptor[] r0 = new kotlinx.serialization.descriptors.SerialDescriptor[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            kotlinx.serialization.descriptors.SerialDescriptor[] r1 = (kotlinx.serialization.descriptors.SerialDescriptor[]) r1
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            kotlinx.serialization.descriptors.SerialDescriptor[] r1 = f42168a
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.Platform_commonKt.b(java.util.List):kotlinx.serialization.descriptors.SerialDescriptor[]");
    }

    public static final KClass c(KType kType) {
        Intrinsics.i(kType, "<this>");
        KClassifier g2 = kType.g();
        if (g2 instanceof KClass) {
            return (KClass) g2;
        }
        if (g2 instanceof KTypeParameter) {
            throw new IllegalArgumentException("Captured type parameter " + g2 + " from generic non-reified function. Such functionality cannot be supported because " + g2 + " is erased, either specify serializer explicitly or make calling function inline with reified " + g2 + '.');
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + g2);
    }

    public static final String d(String str) {
        Intrinsics.i(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final String e(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        String e2 = kClass.e();
        if (e2 == null) {
            e2 = "<local class name not available>";
        }
        return d(e2);
    }

    public static final Void f(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        throw new SerializationException(e(kClass));
    }

    public static final KType g(KTypeProjection kTypeProjection) {
        Intrinsics.i(kTypeProjection, "<this>");
        KType c2 = kTypeProjection.c();
        if (c2 != null) {
            return c2;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.c()).toString());
    }
}
