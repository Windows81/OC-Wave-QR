package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;

public class Reflection {

    /* renamed from: a  reason: collision with root package name */
    public static final ReflectionFactory f40910a;

    /* renamed from: b  reason: collision with root package name */
    public static final KClass[] f40911b = new KClass[0];

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f40910a = reflectionFactory;
    }

    public static KFunction a(FunctionReference functionReference) {
        return f40910a.a(functionReference);
    }

    public static KClass b(Class cls) {
        return f40910a.b(cls);
    }

    public static KDeclarationContainer c(Class cls) {
        return f40910a.c(cls, "");
    }

    public static KMutableProperty0 d(MutablePropertyReference0 mutablePropertyReference0) {
        return f40910a.d(mutablePropertyReference0);
    }

    public static KMutableProperty1 e(MutablePropertyReference1 mutablePropertyReference1) {
        return f40910a.e(mutablePropertyReference1);
    }

    public static KMutableProperty2 f(MutablePropertyReference2 mutablePropertyReference2) {
        return f40910a.f(mutablePropertyReference2);
    }

    public static KType g(Class cls) {
        return f40910a.l(b(cls), Collections.emptyList(), true);
    }

    public static KProperty0 h(PropertyReference0 propertyReference0) {
        return f40910a.g(propertyReference0);
    }

    public static KProperty1 i(PropertyReference1 propertyReference1) {
        return f40910a.h(propertyReference1);
    }

    public static KProperty2 j(PropertyReference2 propertyReference2) {
        return f40910a.i(propertyReference2);
    }

    public static String k(FunctionBase functionBase) {
        return f40910a.j(functionBase);
    }

    public static String l(Lambda lambda) {
        return f40910a.k(lambda);
    }
}
