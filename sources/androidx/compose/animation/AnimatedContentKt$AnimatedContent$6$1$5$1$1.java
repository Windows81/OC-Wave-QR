package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentKt$AnimatedContent$6$1$5$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f2041A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f2042B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f2043z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$5$1$1(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        super(1);
        this.f2043z = snapshotStateList;
        this.f2041A = obj;
        this.f2042B = animatedContentTransitionScopeImpl;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return new AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1(this.f2043z, this.f2041A, this.f2042B);
    }
}
