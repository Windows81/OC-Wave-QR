package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Typeface f19762A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ResourcesCompat.FontCallback f19763z;

    public /* synthetic */ a(ResourcesCompat.FontCallback fontCallback, Typeface typeface) {
        this.f19763z = fontCallback;
        this.f19762A = typeface;
    }

    public final void run() {
        this.f19763z.g(this.f19762A);
    }
}
