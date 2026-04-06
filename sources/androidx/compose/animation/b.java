package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b implements GraphicsLayerBlockForEnterExit {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transition.DeferredAnimation f2415a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transition.DeferredAnimation f2416b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Transition f2417c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ EnterTransition f2418d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ExitTransition f2419e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Transition.DeferredAnimation f2420f;

    public /* synthetic */ b(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition transition, EnterTransition enterTransition, ExitTransition exitTransition, Transition.DeferredAnimation deferredAnimation3) {
        this.f2415a = deferredAnimation;
        this.f2416b = deferredAnimation2;
        this.f2417c = transition;
        this.f2418d = enterTransition;
        this.f2419e = exitTransition;
        this.f2420f = deferredAnimation3;
    }

    public final Function1 a() {
        return EnterExitTransitionKt.f(this.f2415a, this.f2416b, this.f2417c, this.f2418d, this.f2419e, this.f2420f);
    }
}
