package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public final class MoreObjects {

    public static final class ToStringHelper {

        /* renamed from: a  reason: collision with root package name */
        public final String f27737a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueHolder f27738b;

        /* renamed from: c  reason: collision with root package name */
        public ValueHolder f27739c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27740d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27741e;

        public static final class UnconditionalValueHolder extends ValueHolder {
            public UnconditionalValueHolder() {
                super();
            }
        }

        public static class ValueHolder {

            /* renamed from: a  reason: collision with root package name */
            public String f27742a;

            /* renamed from: b  reason: collision with root package name */
            public Object f27743b;

            /* renamed from: c  reason: collision with root package name */
            public ValueHolder f27744c;

            public ValueHolder() {
            }
        }

        public static boolean k(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof Optional ? !((Optional) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public ToStringHelper a(String str, double d2) {
            return i(str, String.valueOf(d2));
        }

        public ToStringHelper b(String str, int i2) {
            return i(str, String.valueOf(i2));
        }

        public ToStringHelper c(String str, long j2) {
            return i(str, String.valueOf(j2));
        }

        public ToStringHelper d(String str, Object obj) {
            return g(str, obj);
        }

        public final ValueHolder e() {
            ValueHolder valueHolder = new ValueHolder();
            this.f27739c.f27744c = valueHolder;
            this.f27739c = valueHolder;
            return valueHolder;
        }

        public final ToStringHelper f(Object obj) {
            e().f27743b = obj;
            return this;
        }

        public final ToStringHelper g(String str, Object obj) {
            ValueHolder e2 = e();
            e2.f27743b = obj;
            e2.f27742a = (String) Preconditions.q(str);
            return this;
        }

        public final UnconditionalValueHolder h() {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.f27739c.f27744c = unconditionalValueHolder;
            this.f27739c = unconditionalValueHolder;
            return unconditionalValueHolder;
        }

        public final ToStringHelper i(String str, Object obj) {
            UnconditionalValueHolder h2 = h();
            h2.f27743b = obj;
            h2.f27742a = (String) Preconditions.q(str);
            return this;
        }

        public ToStringHelper j(Object obj) {
            return f(obj);
        }

        public String toString() {
            boolean z2 = this.f27740d;
            boolean z3 = this.f27741e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f27737a);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.f27738b.f27744c; valueHolder != null; valueHolder = valueHolder.f27744c) {
                Object obj = valueHolder.f27743b;
                if (!(valueHolder instanceof UnconditionalValueHolder)) {
                    if (obj == null) {
                        if (z2) {
                        }
                    } else if (z3 && k(obj)) {
                    }
                }
                sb.append(str);
                String str2 = valueHolder.f27742a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        public ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f27738b = valueHolder;
            this.f27739c = valueHolder;
            this.f27740d = false;
            this.f27741e = false;
            this.f27737a = (String) Preconditions.q(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper b(Class cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper c(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }
}
