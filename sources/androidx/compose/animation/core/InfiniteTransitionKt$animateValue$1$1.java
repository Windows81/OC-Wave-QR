package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InfiniteTransitionKt$animateValue$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition.TransitionAnimationState f2601A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f2602B;
    public final /* synthetic */ InfiniteRepeatableSpec C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f2603z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$1$1(Object obj, InfiniteTransition.TransitionAnimationState transitionAnimationState, Object obj2, InfiniteRepeatableSpec infiniteRepeatableSpec) {
        super(0);
        this.f2603z = obj;
        this.f2601A = transitionAnimationState;
        this.f2602B = obj2;
        this.C = infiniteRepeatableSpec;
    }

    public final void invoke() {
        if (!Intrinsics.d(this.f2603z, this.f2601A.g()) || !Intrinsics.d(this.f2602B, this.f2601A.h())) {
            this.f2601A.w(this.f2603z, this.f2602B, this.C);
        }
    }
}
