package androidx.lifecycle.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class SavedStateHandleImpl_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final List f22052a = ArraysKt.b0(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class});

    public static final boolean a(Object obj) {
        if (obj != null) {
            Iterable<Class> iterable = f22052a;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (Class isInstance : iterable) {
                    if (isInstance.isInstance(obj)) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
