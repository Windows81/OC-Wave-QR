package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;

@Metadata
public final class AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f2020a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2021b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f2022c;

    public AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.f2020a = snapshotStateList;
        this.f2021b = obj;
        this.f2022c = animatedContentTransitionScopeImpl;
    }

    public void d() {
        this.f2020a.remove(this.f2021b);
        this.f2022c.n().u(this.f2021b);
    }
}
