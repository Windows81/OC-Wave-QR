package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata
final /* synthetic */ class SerializersKt__SerializersKt {
    public static final KSerializer b(KClass kClass, List list, Function0 function0) {
        if (!Intrinsics.d(kClass, Reflection.b(Collection.class))) {
            Class<List> cls = List.class;
            if (!Intrinsics.d(kClass, Reflection.b(cls)) && !Intrinsics.d(kClass, Reflection.b(cls)) && !Intrinsics.d(kClass, Reflection.b(ArrayList.class))) {
                if (Intrinsics.d(kClass, Reflection.b(HashSet.class))) {
                    return new HashSetSerializer((KSerializer) list.get(0));
                }
                Class<Set> cls2 = Set.class;
                if (Intrinsics.d(kClass, Reflection.b(cls2)) || Intrinsics.d(kClass, Reflection.b(cls2)) || Intrinsics.d(kClass, Reflection.b(LinkedHashSet.class))) {
                    return new LinkedHashSetSerializer((KSerializer) list.get(0));
                }
                if (Intrinsics.d(kClass, Reflection.b(HashMap.class))) {
                    return new HashMapSerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
                }
                Class<Map> cls3 = Map.class;
                if (Intrinsics.d(kClass, Reflection.b(cls3)) || Intrinsics.d(kClass, Reflection.b(cls3)) || Intrinsics.d(kClass, Reflection.b(LinkedHashMap.class))) {
                    return new LinkedHashMapSerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
                }
                if (Intrinsics.d(kClass, Reflection.b(Map.Entry.class))) {
                    return BuiltinSerializersKt.j((KSerializer) list.get(0), (KSerializer) list.get(1));
                }
                if (Intrinsics.d(kClass, Reflection.b(Pair.class))) {
                    return BuiltinSerializersKt.m((KSerializer) list.get(0), (KSerializer) list.get(1));
                }
                if (Intrinsics.d(kClass, Reflection.b(Triple.class))) {
                    return BuiltinSerializersKt.p((KSerializer) list.get(0), (KSerializer) list.get(1), (KSerializer) list.get(2));
                }
                if (!PlatformKt.o(kClass)) {
                    return null;
                }
                Object invoke = function0.invoke();
                Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                return BuiltinSerializersKt.a((KClass) invoke, (KSerializer) list.get(0));
            }
        }
        return new ArrayListSerializer((KSerializer) list.get(0));
    }

    public static final KSerializer c(KClass kClass, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return PlatformKt.d(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final KSerializer d(KSerializer kSerializer, boolean z2) {
        if (z2) {
            return BuiltinSerializersKt.u(kSerializer);
        }
        Intrinsics.g(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    public static final KSerializer e(KClass kClass, List list, Function0 function0) {
        Intrinsics.i(kClass, "<this>");
        Intrinsics.i(list, "serializers");
        Intrinsics.i(function0, "elementClassifierIfArray");
        KSerializer b2 = b(kClass, list, function0);
        return b2 == null ? c(kClass, list) : b2;
    }

    public static final KSerializer f(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        KSerializer e2 = SerializersKt.e(kClass);
        if (e2 != null) {
            return e2;
        }
        Platform_commonKt.f(kClass);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer g(SerializersModule serializersModule, KType kType) {
        Intrinsics.i(serializersModule, "<this>");
        Intrinsics.i(kType, "type");
        KSerializer h2 = h(serializersModule, kType, true);
        if (h2 != null) {
            return h2;
        }
        PlatformKt.p(Platform_commonKt.c(kType));
        throw new KotlinNothingValueException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.KSerializer h(kotlinx.serialization.modules.SerializersModule r6, kotlin.reflect.KType r7, boolean r8) {
        /*
            kotlin.reflect.KClass r0 = kotlinx.serialization.internal.Platform_commonKt.c(r7)
            boolean r1 = r7.c()
            java.util.List r7 = r7.f()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.x(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L_0x001d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r7.next()
            kotlin.reflect.KTypeProjection r3 = (kotlin.reflect.KTypeProjection) r3
            kotlin.reflect.KType r3 = kotlinx.serialization.internal.Platform_commonKt.g(r3)
            r2.add(r3)
            goto L_0x001d
        L_0x0031:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L_0x004c
            boolean r7 = kotlinx.serialization.internal.PlatformKt.l(r0)
            if (r7 == 0) goto L_0x0047
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.modules.SerializersModule.c(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L_0x0047
        L_0x0045:
            r7 = r4
            goto L_0x0060
        L_0x0047:
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.SerializersCacheKt.m(r0, r1)
            goto L_0x0060
        L_0x004c:
            boolean r7 = r6.d()
            if (r7 == 0) goto L_0x0053
            goto L_0x0045
        L_0x0053:
            java.lang.Object r7 = kotlinx.serialization.SerializersCacheKt.n(r0, r2, r1)
            boolean r5 = kotlin.Result.g(r7)
            if (r5 == 0) goto L_0x005e
            r7 = r4
        L_0x005e:
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7
        L_0x0060:
            if (r7 == 0) goto L_0x0063
            return r7
        L_0x0063:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x0084
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.SerializersKt.e(r0)
            if (r7 != 0) goto L_0x00a9
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.modules.SerializersModule.c(r6, r0, r4, r3, r4)
            if (r7 != 0) goto L_0x00a9
            boolean r6 = kotlinx.serialization.internal.PlatformKt.l(r0)
            if (r6 == 0) goto L_0x0082
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r0)
        L_0x0080:
            r7 = r6
            goto L_0x00a9
        L_0x0082:
            r7 = r4
            goto L_0x00a9
        L_0x0084:
            java.util.List r7 = kotlinx.serialization.SerializersKt.i(r6, r2, r8)
            if (r7 != 0) goto L_0x008b
            return r4
        L_0x008b:
            kotlinx.serialization.j r8 = new kotlinx.serialization.j
            r8.<init>(r2)
            kotlinx.serialization.KSerializer r8 = kotlinx.serialization.SerializersKt.a(r0, r7, r8)
            if (r8 != 0) goto L_0x00a8
            kotlinx.serialization.KSerializer r7 = r6.b(r0, r7)
            if (r7 != 0) goto L_0x00a9
            boolean r6 = kotlinx.serialization.internal.PlatformKt.l(r0)
            if (r6 == 0) goto L_0x0082
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r0)
            goto L_0x0080
        L_0x00a8:
            r7 = r8
        L_0x00a9:
            if (r7 == 0) goto L_0x00af
            kotlinx.serialization.KSerializer r4 = d(r7, r1)
        L_0x00af:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.SerializersKt__SerializersKt.h(kotlinx.serialization.modules.SerializersModule, kotlin.reflect.KType, boolean):kotlinx.serialization.KSerializer");
    }

    public static final KClassifier i(List list) {
        return ((KType) list.get(0)).g();
    }

    public static final KSerializer j(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        KSerializer b2 = PlatformKt.b(kClass);
        return b2 == null ? PrimitivesKt.b(kClass) : b2;
    }

    public static final KSerializer k(KType kType) {
        Intrinsics.i(kType, "type");
        return SerializersKt.h(SerializersModuleBuildersKt.a(), kType);
    }

    public static final KSerializer l(SerializersModule serializersModule, KType kType) {
        Intrinsics.i(serializersModule, "<this>");
        Intrinsics.i(kType, "type");
        return h(serializersModule, kType, false);
    }

    public static final List m(SerializersModule serializersModule, List list, boolean z2) {
        ArrayList arrayList;
        Intrinsics.i(serializersModule, "<this>");
        Intrinsics.i(list, "typeArguments");
        if (z2) {
            Iterable<KType> iterable = list;
            arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
            for (KType d2 : iterable) {
                arrayList.add(SerializersKt.d(serializersModule, d2));
            }
        } else {
            Iterable<KType> iterable2 = list;
            arrayList = new ArrayList(CollectionsKt.x(iterable2, 10));
            for (KType h2 : iterable2) {
                KSerializer h3 = SerializersKt.h(serializersModule, h2);
                if (h3 == null) {
                    return null;
                }
                arrayList.add(h3);
            }
        }
        return arrayList;
    }
}
