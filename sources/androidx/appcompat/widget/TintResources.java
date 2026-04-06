package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class TintResources extends ResourcesWrapper {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f1321b;

    public TintResources(Context context, Resources resources) {
        super(resources);
        this.f1321b = new WeakReference(context);
    }

    public Drawable getDrawable(int i2) {
        Drawable a2 = a(i2);
        Context context = (Context) this.f1321b.get();
        if (!(a2 == null || context == null)) {
            ResourceManagerInternal.g().w(context, i2, a2);
        }
        return a2;
    }
}
