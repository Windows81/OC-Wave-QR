package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SavedStateViewModelFactory_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final List f21982a;

    /* renamed from: b  reason: collision with root package name */
    public static final List f21983b;

    static {
        Class<SavedStateHandle> cls = SavedStateHandle.class;
        f21982a = CollectionsKt.p(Application.class, cls);
        f21983b = CollectionsKt.e(cls);
    }

    public static final Constructor c(Class cls, List list) {
        Intrinsics.i(cls, "modelClass");
        Intrinsics.i(list, "signature");
        Iterator a2 = ArrayIteratorKt.a(cls.getConstructors());
        while (a2.hasNext()) {
            Constructor constructor = (Constructor) a2.next();
            Class[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.h(parameterTypes, "getParameterTypes(...)");
            List a1 = ArraysKt.a1(parameterTypes);
            if (Intrinsics.d(list, a1)) {
                Intrinsics.g(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() == a1.size() && a1.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final ViewModel d(Class cls, Constructor constructor, Object... objArr) {
        Intrinsics.i(cls, "modelClass");
        Intrinsics.i(constructor, "constructor");
        Intrinsics.i(objArr, "params");
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
        }
    }
}
