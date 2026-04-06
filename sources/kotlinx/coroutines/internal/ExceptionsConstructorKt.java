package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ExceptionsConstructorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f41835a = n(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    public static final CtorCache f41836b;

    static {
        CtorCache ctorCache;
        try {
            ctorCache = FastServiceLoaderKt.a() ? WeakMapCtorCache.f41885a : ClassValueCtorCache.f41823a;
        } catch (Throwable unused) {
            ctorCache = WeakMapCtorCache.f41885a;
        }
        f41836b = ctorCache;
    }

    public static final Function1 g(Class cls) {
        Object obj;
        Function1 function1;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = ExceptionsConstructorKt$createConstructor$nullResult$1.f41837z;
        if (f41835a != n(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            Constructor constructor = constructors[i2];
            Class[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                Class<Throwable> cls2 = Throwable.class;
                Class<String> cls3 = String.class;
                if (length2 != 1) {
                    pair = length2 != 2 ? TuplesKt.a((Object) null, -1) : (!Intrinsics.d(parameterTypes[0], cls3) || !Intrinsics.d(parameterTypes[1], cls2)) ? TuplesKt.a((Object) null, -1) : TuplesKt.a(o(new a(constructor)), 3);
                } else {
                    Class cls4 = parameterTypes[0];
                    pair = Intrinsics.d(cls4, cls3) ? TuplesKt.a(o(new b(constructor)), 2) : Intrinsics.d(cls4, cls2) ? TuplesKt.a(o(new c(constructor)), 1) : TuplesKt.a((Object) null, -1);
                }
            } else {
                pair = TuplesKt.a(o(new d(constructor)), 0);
            }
            arrayList.add(pair);
            i2++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Pair) obj).f()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Pair) next).f()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair2 = (Pair) obj;
        return (pair2 == null || (function1 = (Function1) pair2.e()) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : function1;
    }

    public static final Throwable h(Constructor constructor, Throwable th) {
        Object newInstance = constructor.newInstance(new Object[]{th.getMessage(), th});
        Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }

    public static final Throwable i(Constructor constructor, Throwable th) {
        Object newInstance = constructor.newInstance(new Object[]{th.getMessage()});
        Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th2 = (Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }

    public static final Throwable j(Constructor constructor, Throwable th) {
        Object newInstance = constructor.newInstance(new Object[]{th});
        Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }

    public static final Throwable k(Constructor constructor, Throwable th) {
        Object newInstance = constructor.newInstance((Object[]) null);
        Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th2 = (Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }

    public static final int l(Class cls, int i2) {
        do {
            int i3 = 0;
            for (Field modifiers : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(modifiers.getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i2;
    }

    public static /* synthetic */ int m(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return l(cls, i2);
    }

    public static final int n(Class cls, int i2) {
        Integer num;
        JvmClassMappingKt.c(cls);
        try {
            Result.Companion companion = Result.f40519A;
            num = Result.b(Integer.valueOf(m(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            num = Result.b(ResultKt.a(th));
        }
        Integer valueOf = Integer.valueOf(i2);
        if (Result.g(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    public static final Function1 o(Function1 function1) {
        return new e(function1);
    }

    public static final Throwable p(Function1 function1, Throwable th) {
        Object obj;
        Throwable th2 = null;
        try {
            Result.Companion companion = Result.f40519A;
            Throwable th3 = (Throwable) function1.invoke(th);
            if (!Intrinsics.d(th.getMessage(), th3.getMessage()) && !Intrinsics.d(th3.getMessage(), th.toString())) {
                th3 = null;
            }
            obj = Result.b(th3);
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th4));
        }
        if (!Result.g(obj)) {
            th2 = obj;
        }
        return th2;
    }
}
