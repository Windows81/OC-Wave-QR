package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class TintContextWrapper extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1313c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList f1314d;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f1315a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f1316b;

    public TintContextWrapper(Context context) {
        super(context);
        if (VectorEnabledTintResources.c()) {
            VectorEnabledTintResources vectorEnabledTintResources = new VectorEnabledTintResources(this, context.getResources());
            this.f1315a = vectorEnabledTintResources;
            Resources.Theme newTheme = vectorEnabledTintResources.newTheme();
            this.f1316b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1315a = new TintResources(this, context.getResources());
        this.f1316b = null;
    }

    public static boolean a(Context context) {
        if ((context instanceof TintContextWrapper) || (context.getResources() instanceof TintResources) || (context.getResources() instanceof VectorEnabledTintResources)) {
            return false;
        }
        return VectorEnabledTintResources.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1313c) {
            try {
                ArrayList arrayList = f1314d;
                if (arrayList == null) {
                    f1314d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f1314d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1314d.remove(size);
                        }
                    }
                    for (int size2 = f1314d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f1314d.get(size2);
                        TintContextWrapper tintContextWrapper = weakReference2 != null ? (TintContextWrapper) weakReference2.get() : null;
                        if (tintContextWrapper != null && tintContextWrapper.getBaseContext() == context) {
                            return tintContextWrapper;
                        }
                    }
                }
                TintContextWrapper tintContextWrapper2 = new TintContextWrapper(context);
                f1314d.add(new WeakReference(tintContextWrapper2));
                return tintContextWrapper2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AssetManager getAssets() {
        return this.f1315a.getAssets();
    }

    public Resources getResources() {
        return this.f1315a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1316b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i2) {
        Resources.Theme theme = this.f1316b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
