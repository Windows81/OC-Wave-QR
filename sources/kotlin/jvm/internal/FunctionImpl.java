package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

@Deprecated
@Deprecated
public abstract class FunctionImpl implements Function, Serializable, Function0, Function1, Function2, Function3, Function4, Function5, Function6, Function7, Function8, Function9, Function10, Function11, Function12, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function20, Function21, Function22 {
    public final void b(int i2) {
        if (getArity() != i2) {
            e(i2);
        }
    }

    public Object c(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    public Object d(Object obj, Object obj2, Object obj3) {
        b(3);
        return c(obj, obj2, obj3);
    }

    public final void e(int i2) {
        throw new IllegalStateException("Wrong function arity, expected: " + i2 + ", actual: " + getArity());
    }

    public abstract int getArity();

    public Object invoke() {
        b(0);
        return c(new Object[0]);
    }

    public Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(4);
        return c(obj, obj2, obj3, obj4);
    }

    public Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        b(6);
        return c(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public Object m(Object obj, Object obj2) {
        b(2);
        return c(obj, obj2);
    }

    public Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b(5);
        return c(obj, obj2, obj3, obj4, obj5);
    }

    public Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        b(7);
        return c(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public Object invoke(Object obj) {
        b(1);
        return c(obj);
    }
}
