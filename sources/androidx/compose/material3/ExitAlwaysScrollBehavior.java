package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class ExitAlwaysScrollBehavior implements BottomAppBarScrollBehavior {

    /* renamed from: a  reason: collision with root package name */
    public final BottomAppBarState f9923a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationSpec f9924b;

    /* renamed from: c  reason: collision with root package name */
    public final DecayAnimationSpec f9925c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0 f9926d;

    public DecayAnimationSpec a() {
        return this.f9925c;
    }

    public AnimationSpec b() {
        return this.f9924b;
    }

    public BottomAppBarState c() {
        return this.f9923a;
    }

    public final Function0 d() {
        return this.f9926d;
    }
}
