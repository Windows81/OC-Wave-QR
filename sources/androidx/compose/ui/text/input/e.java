package androidx.compose.ui.text.input;

import android.view.Choreographer;

public final /* synthetic */ class e implements Choreographer.FrameCallback {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Runnable f18934z;

    public /* synthetic */ e(Runnable runnable) {
        this.f18934z = runnable;
    }

    public final void doFrame(long j2) {
        TextInputServiceAndroid_androidKt.f(this.f18934z, j2);
    }
}
