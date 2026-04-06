package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TransitionKt$doOnResume$$inlined$addListener$default$1 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f20127a;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
        this.f20127a.invoke(transition);
    }

    public void onTransitionStart(Transition transition) {
    }
}
