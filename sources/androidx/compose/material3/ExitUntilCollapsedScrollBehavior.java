package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class ExitUntilCollapsedScrollBehavior implements TopAppBarScrollBehavior {

    /* renamed from: a  reason: collision with root package name */
    public final TopAppBarState f9928a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationSpec f9929b;

    /* renamed from: c  reason: collision with root package name */
    public final DecayAnimationSpec f9930c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0 f9931d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9932e;

    public DecayAnimationSpec a() {
        return this.f9930c;
    }

    public AnimationSpec b() {
        return this.f9929b;
    }

    public TopAppBarState c() {
        return this.f9928a;
    }

    public boolean d() {
        return this.f9932e;
    }

    public final Function0 e() {
        return this.f9931d;
    }
}
