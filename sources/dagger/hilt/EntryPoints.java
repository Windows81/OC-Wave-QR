package dagger.hilt;

import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.TestSingletonComponent;
import java.lang.annotation.Annotation;

public final class EntryPoints {
    public static Object a(Object obj, Class cls) {
        if (obj instanceof GeneratedComponent) {
            if (obj instanceof TestSingletonComponent) {
                Preconditions.c(!b(cls, "dagger.hilt.android.EarlyEntryPoint"), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        } else if (obj instanceof GeneratedComponentManager) {
            return a(((GeneratedComponentManager) obj).e(), cls);
        } else {
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), GeneratedComponent.class, GeneratedComponentManager.class}));
        }
    }

    public static boolean b(Class cls, String str) {
        for (Annotation annotationType : cls.getAnnotations()) {
            if (annotationType.annotationType().getCanonicalName().contentEquals(str)) {
                return true;
            }
        }
        return false;
    }
}
