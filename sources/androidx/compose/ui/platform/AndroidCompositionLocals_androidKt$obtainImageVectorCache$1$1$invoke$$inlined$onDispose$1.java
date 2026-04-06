package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f17599a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 f17600b;

    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$invoke$$inlined$onDispose$1(Context context, AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) {
        this.f17599a = context;
        this.f17600b = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
    }

    public void d() {
        this.f17599a.getApplicationContext().unregisterComponentCallbacks(this.f17600b);
    }
}
