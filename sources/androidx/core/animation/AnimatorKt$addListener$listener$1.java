package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f19455a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f19456b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function1 f19457c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function1 f19458d;

    public void onAnimationCancel(Animator animator) {
        this.f19457c.invoke(animator);
    }

    public void onAnimationEnd(Animator animator) {
        this.f19456b.invoke(animator);
    }

    public void onAnimationRepeat(Animator animator) {
        this.f19455a.invoke(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f19458d.invoke(animator);
    }
}
