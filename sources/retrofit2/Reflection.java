package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Reflection {

    public static final class Android24 extends Reflection {
        public Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return DefaultMethodSupport.a(method, cls, obj, objArr);
        }

        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    public static class Java8 extends Reflection {
        public String a(Method method, int i2) {
            Parameter parameter = method.getParameters()[i2];
            if (!parameter.isNamePresent()) {
                return Reflection.super.a(method, i2);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        public Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return DefaultMethodSupport.a(method, cls, obj, objArr);
        }

        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(Method method, int i2) {
        return "parameter #" + (i2 + 1);
    }

    public Object b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
