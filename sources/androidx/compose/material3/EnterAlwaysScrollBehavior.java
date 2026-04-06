package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class EnterAlwaysScrollBehavior implements TopAppBarScrollBehavior {

    /* renamed from: a  reason: collision with root package name */
    public final TopAppBarState f9908a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationSpec f9909b;

    /* renamed from: c  reason: collision with root package name */
    public final DecayAnimationSpec f9910c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0 f9911d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9912e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9913f;

    public DecayAnimationSpec a() {
        return this.f9910c;
    }

    public AnimationSpec b() {
        return this.f9909b;
    }

    public TopAppBarState c() {
        return this.f9908a;
    }

    public boolean d() {
        return this.f9913f;
    }

    public final Function0 e() {
        return this.f9911d;
    }

    public final boolean f() {
        return this.f9912e;
    }
}
