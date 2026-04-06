package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
@JvmInline
public final class SavedStateReader {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f22823a;

    public static final Bundle A(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        return bundle.getBundle(str);
    }

    public static final Size B(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        Size size = bundle.getSize(str);
        if (size != null) {
            return size;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final SizeF C(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        SizeF sizeF = bundle.getSizeF(str);
        if (sizeF != null) {
            return sizeF;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final SparseArray D(Bundle bundle, String str, KClass kClass) {
        Intrinsics.i(str, "key");
        Intrinsics.i(kClass, "parcelableClass");
        SparseArray E = E(bundle, str, kClass);
        if (E != null) {
            return E;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final SparseArray E(Bundle bundle, String str, KClass kClass) {
        Intrinsics.i(str, "key");
        Intrinsics.i(kClass, "parcelableClass");
        return BundleCompat.e(bundle, str, JvmClassMappingKt.a(kClass));
    }

    public static final String F(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final String[] G(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final List H(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final List I(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        return bundle.getStringArrayList(str);
    }

    public static int J(Bundle bundle) {
        return bundle.hashCode();
    }

    public static final boolean K(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final boolean L(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        return b(bundle, str) && bundle.get(str) == null;
    }

    public static final int M(Bundle bundle) {
        return bundle.size();
    }

    public static final Map N(Bundle bundle) {
        Map d2 = MapsKt.d(bundle.size());
        for (String next : bundle.keySet()) {
            Intrinsics.f(next);
            d2.put(next, bundle.get(next));
        }
        return MapsKt.b(d2);
    }

    public static String O(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public static Bundle a(Bundle bundle) {
        Intrinsics.i(bundle, "source");
        return bundle;
    }

    public static final boolean b(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        return bundle.containsKey(str);
    }

    public static boolean c(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && Intrinsics.d(bundle, ((SavedStateReader) obj).P());
    }

    public static final IBinder d(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final boolean e(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        boolean z2 = bundle.getBoolean(str, false);
        if (z2 || !bundle.getBoolean(str, true)) {
            return z2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final boolean[] f(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final char g(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        char c2 = bundle.getChar(str, 0);
        if (c2 != 0 || bundle.getChar(str, 65535) != 65535) {
            return c2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final char[] h(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        char[] charArray = bundle.getCharArray(str);
        if (charArray != null) {
            return charArray;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final CharSequence i(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final CharSequence[] j(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(str);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final List k(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(str);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final double l(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        double d2 = bundle.getDouble(str, Double.MIN_VALUE);
        if (d2 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final double[] m(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        double[] doubleArray = bundle.getDoubleArray(str);
        if (doubleArray != null) {
            return doubleArray;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final float n(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        float f2 = bundle.getFloat(str, Float.MIN_VALUE);
        if (f2 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final float[] o(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final int p(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final int[] q(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final List r(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final Serializable s(Bundle bundle, String str, KClass kClass) {
        Intrinsics.i(str, "key");
        Intrinsics.i(kClass, "serializableClass");
        Serializable d2 = BundleCompat.d(bundle, str, JvmClassMappingKt.a(kClass));
        if (d2 != null) {
            return d2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final long t(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        long j2 = bundle.getLong(str, Long.MIN_VALUE);
        if (j2 != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final long[] u(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final Parcelable v(Bundle bundle, String str, KClass kClass) {
        Intrinsics.i(str, "key");
        Intrinsics.i(kClass, "parcelableClass");
        Parcelable parcelable = (Parcelable) BundleCompat.a(bundle, str, JvmClassMappingKt.a(kClass));
        if (parcelable != null) {
            return parcelable;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final Parcelable[] w(Bundle bundle, String str, KClass kClass) {
        Intrinsics.i(str, "key");
        Intrinsics.i(kClass, "parcelableClass");
        Parcelable[] x2 = x(bundle, str, kClass);
        if (x2 != null) {
            return x2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final Parcelable[] x(Bundle bundle, String str, KClass kClass) {
        Intrinsics.i(str, "key");
        Intrinsics.i(kClass, "parcelableClass");
        Parcelable[] b2 = BundleCompat.b(bundle, str, JvmClassMappingKt.a(kClass));
        if (b2 != null) {
            return b2;
        }
        return null;
    }

    public static final List y(Bundle bundle, String str, KClass kClass) {
        Intrinsics.i(str, "key");
        Intrinsics.i(kClass, "parcelableClass");
        ArrayList c2 = BundleCompat.c(bundle, str, JvmClassMappingKt.a(kClass));
        if (c2 != null) {
            return c2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public static final Bundle z(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.a(str);
        throw new KotlinNothingValueException();
    }

    public final /* synthetic */ Bundle P() {
        return this.f22823a;
    }

    public boolean equals(Object obj) {
        return c(this.f22823a, obj);
    }

    public int hashCode() {
        return J(this.f22823a);
    }

    public String toString() {
        return O(this.f22823a);
    }
}
