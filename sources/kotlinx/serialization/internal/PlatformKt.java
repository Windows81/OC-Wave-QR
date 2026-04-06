package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

@Metadata
public final class PlatformKt {
    public static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final KSerializer b(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        return d(kClass, new KSerializer[0]);
    }

    public static final KSerializer c(Class cls, KSerializer... kSerializerArr) {
        Intrinsics.i(cls, "<this>");
        Intrinsics.i(kSerializerArr, "args");
        if (cls.isEnum() && m(cls)) {
            return e(cls);
        }
        KSerializer k2 = k(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (k2 != null) {
            return k2;
        }
        KSerializer h2 = h(cls);
        if (h2 != null) {
            return h2;
        }
        KSerializer f2 = f(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (f2 != null) {
            return f2;
        }
        if (n(cls)) {
            return new PolymorphicSerializer(JvmClassMappingKt.c(cls));
        }
        return null;
    }

    public static final KSerializer d(KClass kClass, KSerializer... kSerializerArr) {
        Intrinsics.i(kClass, "<this>");
        Intrinsics.i(kSerializerArr, "args");
        return c(JvmClassMappingKt.a(kClass), (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final KSerializer e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.h(canonicalName, "getCanonicalName(...)");
        Intrinsics.g(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r7 = r3.getField("INSTANCE");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.KSerializer f(java.lang.Class r7, kotlinx.serialization.KSerializer... r8) {
        /*
            java.lang.Object r0 = g(r7)
            if (r0 == 0) goto L_0x0014
            int r1 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)
            kotlinx.serialization.KSerializer[] r8 = (kotlinx.serialization.KSerializer[]) r8
            kotlinx.serialization.KSerializer r8 = j(r0, r8)
            if (r8 == 0) goto L_0x0014
            return r8
        L_0x0014:
            r8 = 0
            java.lang.Class[] r7 = r7.getDeclaredClasses()     // Catch:{ NoSuchFieldException -> 0x0055 }
            java.lang.String r0 = "getDeclaredClasses(...)"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)     // Catch:{ NoSuchFieldException -> 0x0055 }
            int r0 = r7.length     // Catch:{ NoSuchFieldException -> 0x0055 }
            r1 = 0
            r3 = r8
            r2 = r1
        L_0x0022:
            if (r1 >= r0) goto L_0x003b
            r4 = r7[r1]     // Catch:{ NoSuchFieldException -> 0x0055 }
            java.lang.String r5 = r4.getSimpleName()     // Catch:{ NoSuchFieldException -> 0x0055 }
            java.lang.String r6 = "$serializer"
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r6)     // Catch:{ NoSuchFieldException -> 0x0055 }
            if (r5 == 0) goto L_0x0038
            if (r2 == 0) goto L_0x0036
        L_0x0034:
            r3 = r8
            goto L_0x003e
        L_0x0036:
            r2 = 1
            r3 = r4
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x003b:
            if (r2 != 0) goto L_0x003e
            goto L_0x0034
        L_0x003e:
            if (r3 == 0) goto L_0x004d
            java.lang.String r7 = "INSTANCE"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ NoSuchFieldException -> 0x0055 }
            if (r7 == 0) goto L_0x004d
            java.lang.Object r7 = r7.get(r8)     // Catch:{ NoSuchFieldException -> 0x0055 }
            goto L_0x004e
        L_0x004d:
            r7 = r8
        L_0x004e:
            boolean r0 = r7 instanceof kotlinx.serialization.KSerializer     // Catch:{ NoSuchFieldException -> 0x0055 }
            if (r0 == 0) goto L_0x0055
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7     // Catch:{ NoSuchFieldException -> 0x0055 }
            r8 = r7
        L_0x0055:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PlatformKt.f(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static final Object g(Class cls) {
        Class cls2;
        Class[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.h(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i2];
            if (cls2.getAnnotation(NamedCompanion.class) != null) {
                break;
            }
            i2++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.h(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r5 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r4 == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.KSerializer h(java.lang.Class r11) {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto L_0x00ae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = kotlin.text.StringsKt.Q(r0, r2, r3, r4, r1)
            if (r2 != 0) goto L_0x00ae
            java.lang.String r2 = "kotlin."
            boolean r0 = kotlin.text.StringsKt.Q(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L_0x001b
            goto L_0x00ae
        L_0x001b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L_0x0028:
            r7 = 1
            if (r4 >= r2) goto L_0x0056
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L_0x0053
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r11)
            if (r9 == 0) goto L_0x0053
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x0051
        L_0x004f:
            r6 = r1
            goto L_0x0059
        L_0x0051:
            r5 = r7
            r6 = r8
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x004f
        L_0x0059:
            if (r6 != 0) goto L_0x005c
            return r1
        L_0x005c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.Intrinsics.h(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L_0x006c:
            if (r3 >= r2) goto L_0x009d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 == 0) goto L_0x009a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.Intrinsics.h(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L_0x009a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r9 = kotlinx.serialization.KSerializer.class
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 == 0) goto L_0x009a
            if (r4 == 0) goto L_0x0098
        L_0x0096:
            r5 = r1
            goto L_0x00a0
        L_0x0098:
            r5 = r6
            r4 = r7
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x006c
        L_0x009d:
            if (r4 != 0) goto L_0x00a0
            goto L_0x0096
        L_0x00a0:
            if (r5 != 0) goto L_0x00a3
            return r1
        L_0x00a3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto L_0x00ae
            r1 = r11
            kotlinx.serialization.KSerializer r1 = (kotlinx.serialization.KSerializer) r1
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PlatformKt.h(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    public static final Map i() {
        Map c2 = MapsKt.c();
        c2.put(Reflection.b(String.class), BuiltinSerializersKt.I(StringCompanionObject.f40914a));
        c2.put(Reflection.b(Character.TYPE), BuiltinSerializersKt.C(CharCompanionObject.f40889a));
        c2.put(Reflection.b(char[].class), BuiltinSerializersKt.d());
        c2.put(Reflection.b(Double.TYPE), BuiltinSerializersKt.D(DoubleCompanionObject.f40894a));
        c2.put(Reflection.b(double[].class), BuiltinSerializersKt.e());
        c2.put(Reflection.b(Float.TYPE), BuiltinSerializersKt.E(FloatCompanionObject.f40896a));
        c2.put(Reflection.b(float[].class), BuiltinSerializersKt.f());
        c2.put(Reflection.b(Long.TYPE), BuiltinSerializersKt.G(LongCompanionObject.f40898a));
        c2.put(Reflection.b(long[].class), BuiltinSerializersKt.i());
        c2.put(Reflection.b(ULong.class), BuiltinSerializersKt.x(ULong.f40541A));
        c2.put(Reflection.b(Integer.TYPE), BuiltinSerializersKt.F(IntCompanionObject.f40897a));
        c2.put(Reflection.b(int[].class), BuiltinSerializersKt.g());
        c2.put(Reflection.b(UInt.class), BuiltinSerializersKt.w(UInt.f40536A));
        c2.put(Reflection.b(Short.TYPE), BuiltinSerializersKt.H(ShortCompanionObject.f40912a));
        c2.put(Reflection.b(short[].class), BuiltinSerializersKt.o());
        c2.put(Reflection.b(UShort.class), BuiltinSerializersKt.y(UShort.f40547A));
        c2.put(Reflection.b(Byte.TYPE), BuiltinSerializersKt.B(ByteCompanionObject.f40884a));
        c2.put(Reflection.b(byte[].class), BuiltinSerializersKt.c());
        c2.put(Reflection.b(UByte.class), BuiltinSerializersKt.v(UByte.f40531A));
        c2.put(Reflection.b(Boolean.TYPE), BuiltinSerializersKt.A(BooleanCompanionObject.f40883a));
        c2.put(Reflection.b(boolean[].class), BuiltinSerializersKt.b());
        c2.put(Reflection.b(Unit.class), BuiltinSerializersKt.z(Unit.f40552a));
        c2.put(Reflection.b(Void.class), BuiltinSerializersKt.l());
        try {
            c2.put(Reflection.b(Duration.class), BuiltinSerializersKt.J(Duration.f41206A));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            c2.put(Reflection.b(ULongArray.class), BuiltinSerializersKt.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            c2.put(Reflection.b(UIntArray.class), BuiltinSerializersKt.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            c2.put(Reflection.b(UShortArray.class), BuiltinSerializersKt.t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            c2.put(Reflection.b(UByteArray.class), BuiltinSerializersKt.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            c2.put(Reflection.b(Uuid.class), BuiltinSerializersKt.K(Uuid.f41225B));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.b(c2);
    }

    public static final KSerializer j(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e2.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e2;
        }
    }

    public static final KSerializer k(Class cls, KSerializer... kSerializerArr) {
        Object a2 = a(cls, "Companion");
        if (a2 == null) {
            return null;
        }
        return j(a2, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final boolean l(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        return JvmClassMappingKt.a(kClass).isInterface();
    }

    public static final boolean m(Class cls) {
        return cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(Polymorphic.class) == null;
    }

    public static final boolean n(Class cls) {
        if (cls.getAnnotation(Polymorphic.class) != null) {
            return true;
        }
        Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
        return serializable != null && Intrinsics.d(Reflection.b(serializable.with()), Reflection.b(PolymorphicSerializer.class));
    }

    public static final boolean o(KClass kClass) {
        Intrinsics.i(kClass, "rootClass");
        return JvmClassMappingKt.a(kClass).isArray();
    }

    public static final Void p(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        Platform_commonKt.f(kClass);
        throw new KotlinNothingValueException();
    }

    public static final Void q(Class cls) {
        Intrinsics.i(cls, "<this>");
        throw new SerializationException(Platform_commonKt.e(JvmClassMappingKt.c(cls)));
    }

    public static final Object[] r(ArrayList arrayList, KClass kClass) {
        Intrinsics.i(arrayList, "<this>");
        Intrinsics.i(kClass, "eClass");
        Object newInstance = Array.newInstance(JvmClassMappingKt.a(kClass), arrayList.size());
        Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        Intrinsics.h(array, "toArray(...)");
        return array;
    }
}
