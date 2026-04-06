package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AnimatorKt$addPauseListener$listener$1 implements Animator.AnimatorPauseListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f19461a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f19462b;

    public void onAnimationPause(Animator animator) {
        this.f19461a.invoke(animator);
    }

    public void onAnimationResume(Animator animator) {
        this.f19462b.invoke(animator);
    }
}
