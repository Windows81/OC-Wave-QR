package androidx.compose.ui.graphics;

import android.view.ViewTreeObserver;
import kotlin.Metadata;

@Metadata
public final class AndroidGraphicsContext$1$onTrimMemory$1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidGraphicsContext f15895z;

    public AndroidGraphicsContext$1$onTrimMemory$1(AndroidGraphicsContext androidGraphicsContext) {
        this.f15895z = androidGraphicsContext;
    }

    public boolean onPreDraw() {
        this.f15895z.f15889c.g();
        this.f15895z.f15887a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f15895z.f15892f = false;
        return true;
    }
}
