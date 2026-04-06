package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class WeightTypefaceApi21 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f19815a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f19816b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f19817c;

    /* renamed from: d  reason: collision with root package name */
    public static final Constructor f19818d;

    /* renamed from: e  reason: collision with root package name */
    public static final LongSparseArray f19819e = new LongSparseArray(3);

    /* renamed from: f  reason: collision with root package name */
    public static final Object f19820f = new Object();

    static {
        Method method;
        Method method2;
        Field field;
        Constructor<Typeface> constructor;
        Class<Typeface> cls = Typeface.class;
        try {
            field = cls.getDeclaredField("native_instance");
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            method2 = cls.getDeclaredMethod("nativeCreateFromTypeface", new Class[]{cls2, cls3});
            method2.setAccessible(true);
            method = cls.getDeclaredMethod("nativeCreateWeightAlias", new Class[]{cls2, cls3});
            method.setAccessible(true);
            constructor = cls.getDeclaredConstructor(new Class[]{cls2});
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            field = null;
            constructor = null;
            method2 = null;
            method = null;
        }
        f19815a = field;
        f19816b = method2;
        f19817c = method;
        f19818d = constructor;
    }
}
