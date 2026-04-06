package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f20134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f20135b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function1 f20136c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function1 f20137d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function1 f20138e;

    public void onTransitionCancel(Transition transition) {
        this.f20137d.invoke(transition);
    }

    public void onTransitionEnd(Transition transition) {
        this.f20134a.invoke(transition);
    }

    public void onTransitionPause(Transition transition) {
        this.f20136c.invoke(transition);
    }

    public void onTransitionResume(Transition transition) {
        this.f20135b.invoke(transition);
    }

    public void onTransitionStart(Transition transition) {
        this.f20138e.invoke(transition);
    }
}
