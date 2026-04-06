package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class TypefaceCompatBaseImpl {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f19809a = new ConcurrentHashMap();

    /* renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$3  reason: invalid class name */
    class AnonymousClass3 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        /* renamed from: c */
        public int a(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
            return fontFileResourceEntry.e();
        }

        /* renamed from: d */
        public boolean b(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
            return fontFileResourceEntry.f();
        }
    }

    public interface StyleExtractor<T> {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object h(Object[] objArr, int i2, StyleExtractor styleExtractor) {
        return i(objArr, (i2 & 1) == 0 ? 400 : 700, (i2 & 2) != 0, styleExtractor);
    }

    public static Object i(Object[] objArr, int i2, boolean z2, StyleExtractor styleExtractor) {
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(styleExtractor.a(obj2) - i2) * 2) + (styleExtractor.b(obj2) == z2 ? 0 : 1);
            if (obj == null || i3 > abs) {
                obj = obj2;
                i3 = abs;
            }
        }
        return obj;
    }

    public static long k(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        } catch (IllegalAccessException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0;
        }
    }

    public final void a(Typeface typeface, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry) {
        long k2 = k(typeface);
        if (k2 != 0) {
            this.f19809a.put(Long.valueOf(k2), fontFamilyFilesResourceEntry);
        }
    }

    public Typeface b(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        FontResourcesParserCompat.FontFileResourceEntry g2 = g(fontFamilyFilesResourceEntry, i2);
        if (g2 == null) {
            return null;
        }
        Typeface e2 = TypefaceCompat.e(context, resources, g2.b(), g2.a(), 0, i2);
        a(e2, fontFamilyFilesResourceEntry);
        return e2;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(j(fontInfoArr, i2).d());
            try {
                Typeface e2 = e(context, inputStream);
                TypefaceCompatUtil.a(inputStream);
                return e2;
            } catch (IOException unused) {
                TypefaceCompatUtil.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                TypefaceCompatUtil.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            TypefaceCompatUtil.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            TypefaceCompatUtil.a(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, CancellationSignal cancellationSignal, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface e(Context context, InputStream inputStream) {
        File e2 = TypefaceCompatUtil.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.d(e2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e2.getPath());
            e2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    public Typeface f(Context context, Resources resources, int i2, String str, int i3) {
        File e2 = TypefaceCompatUtil.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.c(e2, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e2.getPath());
            e2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    public final FontResourcesParserCompat.FontFileResourceEntry g(FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i2) {
        return (FontResourcesParserCompat.FontFileResourceEntry) h(fontFamilyFilesResourceEntry.a(), i2, new StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>() {
            /* renamed from: c */
            public int a(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.e();
            }

            /* renamed from: d */
            public boolean b(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.f();
            }
        });
    }

    public FontsContractCompat.FontInfo j(FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        return (FontsContractCompat.FontInfo) h(fontInfoArr, i2, new StyleExtractor<FontsContractCompat.FontInfo>() {
            /* renamed from: c */
            public int a(FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.e();
            }

            /* renamed from: d */
            public boolean b(FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.f();
            }
        });
    }
}
