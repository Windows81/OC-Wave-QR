package androidx.core.splashscreen;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MaskedDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f20047a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f20048b;

    public void draw(Canvas canvas) {
        Intrinsics.i(canvas, "canvas");
        canvas.clipPath(this.f20048b);
        this.f20047a.draw(canvas);
    }

    public int getOpacity() {
        return this.f20047a.getOpacity();
    }

    public void onBoundsChange(Rect rect) {
        Intrinsics.i(rect, "bounds");
        super.onBoundsChange(rect);
        this.f20047a.setBounds(rect);
        this.f20048b.offset(rect.exactCenterX(), rect.exactCenterY());
    }

    public void setAlpha(int i2) {
        this.f20047a.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f20047a.setColorFilter(colorFilter);
    }
}
