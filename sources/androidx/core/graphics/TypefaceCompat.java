package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.tracing.Trace;
import java.util.List;

public class TypefaceCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final TypefaceCompatBaseImpl f19790a;

    /* renamed from: b  reason: collision with root package name */
    public static final LruCache f19791b = new LruCache(16);

    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        /* renamed from: a  reason: collision with root package name */
        public ResourcesCompat.FontCallback f19792a;

        public ResourcesCallbackAdapter(ResourcesCompat.FontCallback fontCallback) {
            this.f19792a = fontCallback;
        }

        public void a(int i2) {
            ResourcesCompat.FontCallback fontCallback = this.f19792a;
            if (fontCallback != null) {
                fontCallback.f(i2);
            }
        }

        public void b(Typeface typeface) {
            ResourcesCompat.FontCallback fontCallback = this.f19792a;
            if (fontCallback != null) {
                fontCallback.g(typeface);
            }
        }
    }

    static {
        Trace.a("TypefaceCompat static init");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f19790a = new TypefaceCompatApi29Impl();
        } else if (i2 >= 28) {
            f19790a = new TypefaceCompatApi28Impl();
        } else {
            f19790a = new TypefaceCompatApi26Impl();
        }
        Trace.b();
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        if (context != null) {
            return Typeface.create(typeface, i2);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Trace.a("TypefaceCompat.createFromFontInfo");
        try {
            return f19790a.c(context, cancellationSignal, fontInfoArr, i2);
        } finally {
            Trace.b();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i2) {
        Trace.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f19790a.d(context, cancellationSignal, list, i2);
        } finally {
            Trace.b();
        }
    }

    public static Typeface d(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i2, String str, int i3, int i4, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean z2) {
        Typeface typeface;
        FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry2 = familyResourceEntry;
        ResourcesCompat.FontCallback fontCallback2 = fontCallback;
        Handler handler2 = handler;
        if (familyResourceEntry2 instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry2;
            Typeface h2 = h(providerResourceEntry.d());
            if (h2 != null) {
                if (fontCallback2 != null) {
                    fontCallback2.d(h2, handler2);
                }
                return h2;
            }
            typeface = FontsContractCompat.c(context, providerResourceEntry.a() != null ? c.a(new Object[]{providerResourceEntry.c(), providerResourceEntry.a()}) : c.a(new Object[]{providerResourceEntry.c()}), i4, !z2 ? fontCallback2 == null : providerResourceEntry.b() == 0, z2 ? providerResourceEntry.e() : -1, ResourcesCompat.FontCallback.e(handler), new ResourcesCallbackAdapter(fontCallback2));
            Resources resources2 = resources;
            int i5 = i4;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f19790a.b(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry2, resources, i4);
            if (fontCallback2 != null) {
                if (typeface != null) {
                    fontCallback2.d(typeface, handler2);
                } else {
                    fontCallback2.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f19791b.f(f(resources, i2, str, i3, i4), typeface);
        }
        return typeface;
    }

    public static Typeface e(Context context, Resources resources, int i2, String str, int i3, int i4) {
        Typeface f2 = f19790a.f(context, resources, i2, str, i4);
        if (f2 != null) {
            f19791b.f(f(resources, i2, str, i3, i4), f2);
        }
        return f2;
    }

    public static String f(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }

    public static Typeface g(Resources resources, int i2, String str, int i3, int i4) {
        return (Typeface) f19791b.d(f(resources, i2, str, i3, i4));
    }

    public static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
