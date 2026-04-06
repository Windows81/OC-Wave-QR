package androidx.compose.ui.platform;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.ui.R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {

    /* renamed from: A  reason: collision with root package name */
    public final Composition f17945A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f17946B;
    public Lifecycle C;
    public Function2 D = ComposableSingletons$Wrapper_androidKt.f17678a.a();

    /* renamed from: z  reason: collision with root package name */
    public final AndroidComposeView f17947z;

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        this.f17947z = androidComposeView;
        this.f17945A = composition;
    }

    public final Composition H() {
        return this.f17945A;
    }

    public final AndroidComposeView I() {
        return this.f17947z;
    }

    public void d() {
        if (!this.f17946B) {
            this.f17946B = true;
            this.f17947z.getView().setTag(R.id.L, (Object) null);
            Lifecycle lifecycle = this.C;
            if (lifecycle != null) {
                lifecycle.d(this);
            }
        }
        this.f17945A.d();
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            d();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.f17946B) {
            p(this.D);
        }
    }

    public void p(Function2 function2) {
        this.f17947z.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, function2));
    }
}
