package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class ActionBarBackgroundDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f987a;

    public static class Api21Impl {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.f987a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f987a;
        if (actionBarContainer.G) {
            Drawable drawable = actionBarContainer.F;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.D;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f987a;
        Drawable drawable3 = actionBarContainer2.E;
        if (drawable3 != null && actionBarContainer2.H) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f987a;
        if (!actionBarContainer.G) {
            Drawable drawable = actionBarContainer.D;
            if (drawable != null) {
                Api21Impl.a(drawable, outline);
            }
        } else if (actionBarContainer.F != null) {
            Api21Impl.a(actionBarContainer.D, outline);
        }
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
