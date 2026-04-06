package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {

    /* renamed from: g  reason: collision with root package name */
    public final Class f19802g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor f19803h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f19804i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f19805j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f19806k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f19807l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f19808m;

    public TypefaceCompatApi26Impl() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls;
        try {
            cls = z();
            constructor = A(cls);
            method5 = w(cls);
            method4 = x(cls);
            method3 = B(cls);
            method2 = v(cls);
            method = y(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            cls = null;
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f19802g = cls;
        this.f19803h = constructor;
        this.f19804i = method5;
        this.f19805j = method4;
        this.f19806k = method3;
        this.f19807l = method2;
        this.f19808m = method;
    }

    public Constructor A(Class cls) {
        return cls.getConstructor((Class[]) null);
    }

    public Method B(Class cls) {
        return cls.getMethod("freeze", (Class[]) null);
    }

    public Typeface b(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        if (!u()) {
            return super.b(context, fontFamilyFilesResourceEntry, resources, i2);
        }
        Object p2 = p();
        if (p2 == null) {
            return null;
        }
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.a()) {
            if (!r(context, p2, fontFileResourceEntry.a(), fontFileResourceEntry.c(), fontFileResourceEntry.e(), fontFileResourceEntry.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.d()))) {
                q(p2);
                return null;
            }
        }
        if (!t(p2)) {
            return null;
        }
        return m(p2);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Typeface m2;
        ParcelFileDescriptor openFileDescriptor;
        if (fontInfoArr.length < 1) {
            return null;
        }
        if (!u()) {
            FontsContractCompat.FontInfo j2 = j(fontInfoArr, i2);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(j2.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(j2.e()).setItalic(j2.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map h2 = TypefaceCompatUtil.h(context, fontInfoArr, cancellationSignal);
            Object p2 = p();
            if (p2 == null) {
                return null;
            }
            boolean z2 = false;
            for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                ByteBuffer byteBuffer = (ByteBuffer) h2.get(fontInfo.d());
                if (byteBuffer != null) {
                    if (!s(p2, byteBuffer, fontInfo.c(), fontInfo.e(), fontInfo.f() ? 1 : 0)) {
                        q(p2);
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                q(p2);
                return null;
            } else if (t(p2) && (m2 = m(p2)) != null) {
                return Typeface.create(m2, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ Typeface d(Context context, CancellationSignal cancellationSignal, List list, int i2) {
        return super.d(context, cancellationSignal, list, i2);
    }

    public Typeface f(Context context, Resources resources, int i2, String str, int i3) {
        if (!u()) {
            return super.f(context, resources, i2, str, i3);
        }
        Object p2 = p();
        if (p2 == null) {
            return null;
        }
        if (!r(context, p2, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            q(p2);
            return null;
        } else if (!t(p2)) {
            return null;
        } else {
            return m(p2);
        }
    }

    public Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f19802g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f19808m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object p() {
        try {
            return this.f19803h.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void q(Object obj) {
        try {
            this.f19807l.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean r(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            Object obj2 = obj;
            return ((Boolean) this.f19804i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean s(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f19805j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean t(Object obj) {
        try {
            return ((Boolean) this.f19806k.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean u() {
        if (this.f19804i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f19804i != null;
    }

    public Method v(Class cls) {
        return cls.getMethod("abortCreation", (Class[]) null);
    }

    public Method w(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public Method x(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public Method y(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{cls2, cls3, cls3});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class z() {
        return Class.forName("android.graphics.FontFamily");
    }
}
