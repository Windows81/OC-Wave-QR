package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {

    /* renamed from: b  reason: collision with root package name */
    public static Class f19793b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor f19794c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f19795d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f19796e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f19797f = false;

    public static boolean l(Object obj, String str, int i2, boolean z2) {
        o();
        try {
            return ((Boolean) f19795d.invoke(obj, new Object[]{str, Integer.valueOf(i2), Boolean.valueOf(z2)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface m(Object obj) {
        o();
        try {
            Object newInstance = Array.newInstance(f19793b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f19796e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void o() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f19797f) {
            f19797f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f19794c = constructor;
            f19793b = cls;
            f19795d = method;
            f19796e = method2;
        }
    }

    private static Object p() {
        o();
        try {
            return f19794c.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Typeface b(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        Object p2 = p();
        FontResourcesParserCompat.FontFileResourceEntry[] a2 = fontFamilyFilesResourceEntry.a();
        int length = a2.length;
        int i3 = 0;
        while (i3 < length) {
            FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = a2[i3];
            File e2 = TypefaceCompatUtil.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!TypefaceCompatUtil.c(e2, resources, fontFileResourceEntry.b())) {
                    e2.delete();
                    return null;
                } else if (!l(p2, e2.getPath(), fontFileResourceEntry.e(), fontFileResourceEntry.f())) {
                    return null;
                } else {
                    e2.delete();
                    i3++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return m(p2);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        if (fontInfoArr.length < 1) {
            return null;
        }
        FontsContractCompat.FontInfo j2 = j(fontInfoArr, i2);
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(j2.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File n2 = n(openFileDescriptor);
            if (n2 != null) {
                if (n2.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(n2);
                    openFileDescriptor.close();
                    return createFromFile;
                }
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface e2 = super.e(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return e2;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
        throw th;
    }

    public final File n(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
