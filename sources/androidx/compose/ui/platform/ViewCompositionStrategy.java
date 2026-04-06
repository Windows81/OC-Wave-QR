package androidx.compose.ui.platform;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

@Metadata
public interface ViewCompositionStrategy {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f17889a = Companion.f17890a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f17890a = new Companion();

        public final ViewCompositionStrategy a() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.f17895b;
        }
    }

    @Metadata
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {

        /* renamed from: b  reason: collision with root package name */
        public static final DisposeOnDetachedFromWindow f17891b = new DisposeOnDetachedFromWindow();

        public Function0 a(AbstractComposeView abstractComposeView) {
            ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 = new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(abstractComposeView, viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1);
        }
    }

    @Metadata
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {

        /* renamed from: b  reason: collision with root package name */
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool f17895b = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        public Function0 a(AbstractComposeView abstractComposeView) {
            ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1);
            K k2 = new K(abstractComposeView);
            PoolingContainer.a(abstractComposeView, k2);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, k2);
        }
    }

    @Metadata
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {

        /* renamed from: b  reason: collision with root package name */
        public final Lifecycle f17900b;

        public Function0 a(AbstractComposeView abstractComposeView) {
            return ViewCompositionStrategy_androidKt.c(abstractComposeView, this.f17900b);
        }
    }

    @Metadata
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {

        /* renamed from: b  reason: collision with root package name */
        public static final DisposeOnViewTreeLifecycleDestroyed f17901b = new DisposeOnViewTreeLifecycleDestroyed();

        public Function0 a(AbstractComposeView abstractComposeView) {
            if (abstractComposeView.isAttachedToWindow()) {
                LifecycleOwner a2 = ViewTreeLifecycleOwner.a(abstractComposeView);
                if (a2 != null) {
                    return ViewCompositionStrategy_androidKt.c(abstractComposeView, a2.a());
                }
                InlineClassHelperKt.d("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                throw new KotlinNothingValueException();
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1(abstractComposeView, objectRef);
            abstractComposeView.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1);
            objectRef.f40908z = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(abstractComposeView, viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1);
            return new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(objectRef);
        }
    }

    Function0 a(AbstractComposeView abstractComposeView);
}
