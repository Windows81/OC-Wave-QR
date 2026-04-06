package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

abstract class ServiceMethod<T> {
    public static ServiceMethod b(Retrofit retrofit, Class cls, Method method) {
        RequestFactory b2 = RequestFactory.b(retrofit, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (Utils.j(genericReturnType)) {
            throw Utils.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return HttpServiceMethod.f(retrofit, method, b2);
        } else {
            throw Utils.n(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    public abstract Object a(Object obj, Object[] objArr);
}
