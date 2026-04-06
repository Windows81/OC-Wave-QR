package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

final class WrappedDrawableState extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f19852a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f19853b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f19854c = null;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f19855d = WrappedDrawableApi14.F;

    public WrappedDrawableState(WrappedDrawableState wrappedDrawableState) {
        if (wrappedDrawableState != null) {
            this.f19852a = wrappedDrawableState.f19852a;
            this.f19853b = wrappedDrawableState.f19853b;
            this.f19854c = wrappedDrawableState.f19854c;
            this.f19855d = wrappedDrawableState.f19855d;
        }
    }

    public boolean a() {
        return this.f19853b != null;
    }

    public int getChangingConfigurations() {
        int i2 = this.f19852a;
        Drawable.ConstantState constantState = this.f19853b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new WrappedDrawableApi21(this, resources);
    }
}
