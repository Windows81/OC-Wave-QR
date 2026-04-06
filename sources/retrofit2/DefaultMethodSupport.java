package retrofit2;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

final class DefaultMethodSupport {

    /* renamed from: a  reason: collision with root package name */
    public static Constructor f44139a;

    public static Object a(Method method, Class cls, Object obj, Object[] objArr) {
        Constructor<MethodHandles.Lookup> constructor = f44139a;
        if (constructor == null) {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            constructor.setAccessible(true);
            f44139a = constructor;
        }
        return constructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
