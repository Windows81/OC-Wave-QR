package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Field;

final class WeightTypefaceApi14 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f19812a;

    /* renamed from: b  reason: collision with root package name */
    public static final LongSparseArray f19813b = new LongSparseArray(3);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f19814c = new Object();

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            field = null;
        }
        f19812a = field;
    }
}
