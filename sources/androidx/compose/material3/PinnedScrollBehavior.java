package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class PinnedScrollBehavior implements TopAppBarScrollBehavior {

    /* renamed from: a  reason: collision with root package name */
    public final TopAppBarState f10614a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f10615b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10616c;

    /* renamed from: d  reason: collision with root package name */
    public final AnimationSpec f10617d;

    /* renamed from: e  reason: collision with root package name */
    public final DecayAnimationSpec f10618e;

    public DecayAnimationSpec a() {
        return this.f10618e;
    }

    public AnimationSpec b() {
        return this.f10617d;
    }

    public TopAppBarState c() {
        return this.f10614a;
    }

    public boolean d() {
        return this.f10616c;
    }

    public final Function0 e() {
        return this.f10615b;
    }
}
