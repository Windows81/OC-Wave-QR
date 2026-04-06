package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;

public final class zae extends zag {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f24828c;

    public final void a(Drawable drawable, boolean z2, boolean z3, boolean z4) {
        ImageView imageView = (ImageView) this.f24828c.get();
        if (imageView == null) {
            return;
        }
        if (z3 || z4 || !(imageView instanceof zal)) {
            boolean z5 = false;
            if (!z3 && !z2) {
                z5 = true;
            }
            if (z5) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zak) {
                    drawable2 = ((zak) drawable2).a();
                }
                drawable = new zak(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zal) {
                zal zal = (zal) imageView;
                throw null;
            } else if (drawable != null && z5) {
                ((zak) drawable).b(250);
            }
        } else {
            zal zal2 = (zal) imageView;
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.f24828c.get();
        ImageView imageView2 = (ImageView) ((zae) obj).f24828c.get();
        return (imageView2 == null || imageView == null || !Objects.a(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }
}
