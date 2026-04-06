package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    public static final KSerializer a(SerializersModule serializersModule, GenericArrayType genericArrayType, boolean z2) {
        KSerializer kSerializer;
        KClass kClass;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            Intrinsics.h(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) ArraysKt.e0(upperBounds);
        }
        Intrinsics.f(genericComponentType);
        if (z2) {
            kSerializer = SerializersKt.c(serializersModule, genericComponentType);
        } else {
            kSerializer = SerializersKt.g(serializersModule, genericComponentType);
            if (kSerializer == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            Intrinsics.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kClass = JvmClassMappingKt.c((Class) rawType);
        } else if (genericComponentType instanceof KClass) {
            kClass = (KClass) genericComponentType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.b(genericComponentType.getClass()));
        }
        Intrinsics.g(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer a2 = BuiltinSerializersKt.a(kClass, kSerializer);
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a2;
    }

    public static final Class b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.h(rawType, "getRawType(...)");
            return b(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.h(upperBounds, "getUpperBounds(...)");
            Object e0 = ArraysKt.e0(upperBounds);
            Intrinsics.h(e0, "first(...)");
            return b((Type) e0);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.h(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.b(type.getClass()));
        }
    }

    public static final KSerializer c(SerializersModule serializersModule, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer c2 = PlatformKt.c(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (c2 != null) {
            return c2;
        }
        KClass c3 = JvmClassMappingKt.c(cls);
        KSerializer b2 = PrimitivesKt.b(c3);
        if (b2 != null) {
            return b2;
        }
        KSerializer b3 = serializersModule.b(c3, list);
        if (b3 != null) {
            return b3;
        }
        if (cls.isInterface()) {
            return new PolymorphicSerializer(JvmClassMappingKt.c(cls));
        }
        return null;
    }

    public static final KSerializer d(SerializersModule serializersModule, Type type) {
        Intrinsics.i(serializersModule, "<this>");
        Intrinsics.i(type, "type");
        KSerializer e2 = e(serializersModule, type, true);
        if (e2 != null) {
            return e2;
        }
        PlatformKt.q(b(type));
        throw new KotlinNothingValueException();
    }

    public static final KSerializer e(SerializersModule serializersModule, Type type, boolean z2) {
        ArrayList<KSerializer> arrayList;
        if (type instanceof GenericArrayType) {
            return a(serializersModule, (GenericArrayType) type, z2);
        }
        if (type instanceof Class) {
            return h(serializersModule, (Class) type, z2);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Intrinsics.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) rawType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Intrinsics.f(actualTypeArguments);
            if (z2) {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    Intrinsics.f(type2);
                    arrayList.add(SerializersKt.c(serializersModule, type2));
                }
            } else {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    Intrinsics.f(type3);
                    KSerializer g2 = SerializersKt.g(serializersModule, type3);
                    if (g2 == null) {
                        return null;
                    }
                    arrayList.add(g2);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                KSerializer n2 = BuiltinSerializersKt.n((KSerializer) arrayList.get(0));
                Intrinsics.g(n2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return n2;
            } else if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                KSerializer h2 = BuiltinSerializersKt.h((KSerializer) arrayList.get(0));
                Intrinsics.g(h2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return h2;
            } else if (Map.class.isAssignableFrom(cls)) {
                KSerializer k2 = BuiltinSerializersKt.k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                Intrinsics.g(k2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return k2;
            } else if (Map.Entry.class.isAssignableFrom(cls)) {
                KSerializer j2 = BuiltinSerializersKt.j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                Intrinsics.g(j2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return j2;
            } else if (Pair.class.isAssignableFrom(cls)) {
                KSerializer m2 = BuiltinSerializersKt.m((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                Intrinsics.g(m2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m2;
            } else if (Triple.class.isAssignableFrom(cls)) {
                KSerializer p2 = BuiltinSerializersKt.p((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
                Intrinsics.g(p2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return p2;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
                for (KSerializer kSerializer : arrayList) {
                    Intrinsics.g(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                    arrayList2.add(kSerializer);
                }
                return c(serializersModule, cls, arrayList2);
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.h(upperBounds, "getUpperBounds(...)");
            Object e0 = ArraysKt.e0(upperBounds);
            Intrinsics.h(e0, "first(...)");
            return f(serializersModule, (Type) e0, false, 2, (Object) null);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.b(type.getClass()));
        }
    }

    public static /* synthetic */ KSerializer f(SerializersModule serializersModule, Type type, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return e(serializersModule, type, z2);
    }

    public static final KSerializer g(SerializersModule serializersModule, Type type) {
        Intrinsics.i(serializersModule, "<this>");
        Intrinsics.i(type, "type");
        return e(serializersModule, type, false);
    }

    public static final KSerializer h(SerializersModule serializersModule, Class cls, boolean z2) {
        KSerializer kSerializer;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            Intrinsics.g(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(serializersModule, cls, CollectionsKt.m());
        }
        Class<?> componentType = cls.getComponentType();
        Intrinsics.h(componentType, "getComponentType(...)");
        if (z2) {
            kSerializer = SerializersKt.c(serializersModule, componentType);
        } else {
            kSerializer = SerializersKt.g(serializersModule, componentType);
            if (kSerializer == null) {
                return null;
            }
        }
        KClass c2 = JvmClassMappingKt.c(componentType);
        Intrinsics.g(c2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer a2 = BuiltinSerializersKt.a(c2, kSerializer);
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a2;
    }
}
