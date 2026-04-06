package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 f17621A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f17622z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1(Context context, AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) {
        super(1);
        this.f17622z = context;
        this.f17621A = androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f17622z.getApplicationContext().registerComponentCallbacks(this.f17621A);
        return new AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$invoke$$inlined$onDispose$1(this.f17622z, this.f17621A);
    }
}
