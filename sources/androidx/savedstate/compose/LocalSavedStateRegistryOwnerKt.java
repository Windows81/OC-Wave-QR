package androidx.savedstate.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.savedstate.SavedStateRegistryOwner;
import h.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LocalSavedStateRegistryOwnerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f22831a;

    static {
        Object obj;
        ProvidableCompositionLocal providableCompositionLocal;
        ProvidableCompositionLocal providableCompositionLocal2 = null;
        try {
            Result.Companion companion = Result.f40519A;
            ClassLoader classLoader = SavedStateRegistryOwner.class.getClassLoader();
            Intrinsics.f(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", (Class[]) null);
            Annotation[] annotations = method.getAnnotations();
            Intrinsics.h(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Object invoke = method.invoke((Object) null, (Object[]) null);
                    if (invoke instanceof ProvidableCompositionLocal) {
                        providableCompositionLocal = (ProvidableCompositionLocal) invoke;
                    }
                } else if (annotations[i2] instanceof Deprecated) {
                    break;
                } else {
                    i2++;
                }
            }
            providableCompositionLocal = null;
            obj = Result.b(providableCompositionLocal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        if (!Result.g(obj)) {
            providableCompositionLocal2 = obj;
        }
        ProvidableCompositionLocal providableCompositionLocal3 = providableCompositionLocal2;
        if (providableCompositionLocal3 == null) {
            providableCompositionLocal3 = CompositionLocalKt.j(new a());
        }
        f22831a = providableCompositionLocal3;
    }

    public static final SavedStateRegistryOwner b() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }

    public static final ProvidableCompositionLocal c() {
        return f22831a;
    }
}
