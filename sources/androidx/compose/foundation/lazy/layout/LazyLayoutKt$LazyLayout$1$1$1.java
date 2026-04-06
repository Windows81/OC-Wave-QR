package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutKt$LazyLayout$1$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory f4879A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f4880B;
    public final /* synthetic */ PrefetchScheduler C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPrefetchState f4881z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1$1$1(LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        super(1);
        this.f4881z = lazyLayoutPrefetchState;
        this.f4879A = lazyLayoutItemContentFactory;
        this.f4880B = subcomposeLayoutState;
        this.C = prefetchScheduler;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f4881z.f(new PrefetchHandleProvider(this.f4879A, this.f4880B, this.C));
        return new LazyLayoutKt$LazyLayout$1$1$1$invoke$$inlined$onDispose$1(this.f4881z);
    }
}
