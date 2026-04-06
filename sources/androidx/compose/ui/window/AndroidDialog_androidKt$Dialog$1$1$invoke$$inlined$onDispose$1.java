package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DialogWrapper f19261a;

    public AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1(DialogWrapper dialogWrapper) {
        this.f19261a = dialogWrapper;
    }

    public void d() {
        this.f19261a.dismiss();
        this.f19261a.l();
    }
}
