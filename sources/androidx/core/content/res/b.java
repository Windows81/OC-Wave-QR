package androidx.core.content.res;

import androidx.core.content.res.ResourcesCompat;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f19764A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ResourcesCompat.FontCallback f19765z;

    public /* synthetic */ b(ResourcesCompat.FontCallback fontCallback, int i2) {
        this.f19765z = fontCallback;
        this.f19764A = i2;
    }

    public final void run() {
        this.f19765z.f(this.f19764A);
    }
}
