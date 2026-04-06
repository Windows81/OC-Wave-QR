package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f17601a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 f17602b;

    public AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$invoke$$inlined$onDispose$1(Context context, AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) {
        this.f17601a = context;
        this.f17602b = androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1;
    }

    public void d() {
        this.f17601a.getApplicationContext().unregisterComponentCallbacks(this.f17602b);
    }
}
