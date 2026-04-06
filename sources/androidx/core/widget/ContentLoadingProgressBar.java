package androidx.core.widget;

import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: A  reason: collision with root package name */
    public final Runnable f20451A;

    /* renamed from: z  reason: collision with root package name */
    public final Runnable f20452z;

    public final void a() {
        removeCallbacks(this.f20452z);
        removeCallbacks(this.f20451A);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }
}
