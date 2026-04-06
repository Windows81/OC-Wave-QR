package kotlin.jvm;

import kotlin.Metadata;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata
public final class JvmClassMappingKt {
    public static final Class a(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        Class i2 = ((ClassBasedDeclarationContainer) kClass).i();
        Intrinsics.g(i2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return i2;
    }

    public static final Class b(KClass kClass) {
        Intrinsics.i(kClass, "<this>");
        Class i2 = ((ClassBasedDeclarationContainer) kClass).i();
        if (!i2.isPrimitive()) {
            Intrinsics.g(i2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return i2;
        }
        String name = i2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    i2 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    i2 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    i2 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    i2 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    i2 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    i2 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    i2 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    i2 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    i2 = Short.class;
                    break;
                }
                break;
        }
        Intrinsics.g(i2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return i2;
    }

    public static final KClass c(Class cls) {
        Intrinsics.i(cls, "<this>");
        return Reflection.b(cls);
    }
}
