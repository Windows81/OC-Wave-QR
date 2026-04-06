package androidx.compose.ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

public final /* synthetic */ class d implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Choreographer f18933z;

    public /* synthetic */ d(Choreographer choreographer) {
        this.f18933z = choreographer;
    }

    public final void execute(Runnable runnable) {
        TextInputServiceAndroid_androidKt.e(this.f18933z, runnable);
    }
}
