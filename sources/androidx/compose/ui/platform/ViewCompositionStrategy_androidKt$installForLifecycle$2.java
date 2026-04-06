package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f17907A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Lifecycle f17908z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        super(0);
        this.f17908z = lifecycle;
        this.f17907A = lifecycleEventObserver;
    }

    public final void invoke() {
        this.f17908z.d(this.f17907A);
    }
}
