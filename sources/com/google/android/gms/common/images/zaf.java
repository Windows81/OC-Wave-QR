package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

public final class zaf extends zag {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f24829c;

    public final void a(Drawable drawable, boolean z2, boolean z3, boolean z4) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (!z3 && (onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f24829c.get()) != null) {
            onImageLoadedListener.a(this.f24830a.f24827a, drawable, z4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaf)) {
            return false;
        }
        zaf zaf = (zaf) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f24829c.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = (ImageManager.OnImageLoadedListener) zaf.f24829c.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.a(onImageLoadedListener2, onImageLoadedListener) && Objects.a(zaf.f24830a, this.f24830a);
    }

    public final int hashCode() {
        return Objects.b(this.f24830a);
    }
}
