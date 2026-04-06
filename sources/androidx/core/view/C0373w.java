package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.w  reason: case insensitive filesystem */
public final /* synthetic */ class C0373w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimatorUpdateListener f20433a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f20434b;

    public /* synthetic */ C0373w(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
        this.f20433a = viewPropertyAnimatorUpdateListener;
        this.f20434b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f20433a.a(this.f20434b);
    }
}
