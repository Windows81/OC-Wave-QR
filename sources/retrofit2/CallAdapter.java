package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface CallAdapter<R, T> {

    public static abstract class Factory {
        public static Type b(int i2, ParameterizedType parameterizedType) {
            return Utils.g(i2, parameterizedType);
        }

        public static Class c(Type type) {
            return Utils.h(type);
        }

        public abstract CallAdapter a(Type type, Annotation[] annotationArr, Retrofit retrofit);
    }

    Type a();

    Object b(Call call);
}
