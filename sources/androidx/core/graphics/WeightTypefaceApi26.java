package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class WeightTypefaceApi26 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f19821a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f19822b;

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor f19823c;

    /* renamed from: d  reason: collision with root package name */
    public static final LongSparseArray f19824d = new LongSparseArray(3);

    /* renamed from: e  reason: collision with root package name */
    public static final Object f19825e = new Object();

    static {
        Method method;
        Field field;
        Constructor<Typeface> constructor;
        Class<Typeface> cls = Typeface.class;
        try {
            field = cls.getDeclaredField("native_instance");
            Class cls2 = Long.TYPE;
            method = cls.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", new Class[]{cls2, Integer.TYPE, Boolean.TYPE});
            method.setAccessible(true);
            constructor = cls.getDeclaredConstructor(new Class[]{cls2});
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            field = null;
            constructor = null;
            method = null;
        }
        f19821a = field;
        f19822b = method;
        f19823c = constructor;
    }
}
