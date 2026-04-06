package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
public final class WindowRecomposer_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f17936a = new LinkedHashMap();

    public static final Recomposer b(View view, CoroutineContext coroutineContext, Lifecycle lifecycle) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (coroutineContext.d(ContinuationInterceptor.f40717v) == null || coroutineContext.d(MonotonicFrameClock.f14706b) == null) {
            coroutineContext = AndroidUiDispatcher.L.a().y(coroutineContext);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.d(MonotonicFrameClock.f14706b);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.e();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CoroutineContext coroutineContext2 = (MotionDurationScale) coroutineContext.d(MotionDurationScale.f15495e);
        if (coroutineContext2 == null) {
            coroutineContext2 = new MotionDurationScaleImpl();
            objectRef.f40908z = coroutineContext2;
        }
        CoroutineContext y2 = coroutineContext.y(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : EmptyCoroutineContext.f40721z).y(coroutineContext2);
        Recomposer recomposer = new Recomposer(y2);
        recomposer.H0();
        CoroutineScope a2 = CoroutineScopeKt.a(y2);
        if (lifecycle == null) {
            LifecycleOwner a3 = ViewTreeLifecycleOwner.a(view);
            lifecycle = a3 != null ? a3.a() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1(view, recomposer));
            lifecycle.a(new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(a2, pausableMonotonicFrameClock, recomposer, objectRef, view));
            return recomposer;
        }
        InlineClassHelperKt.d("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Recomposer c(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f40721z;
        }
        if ((i2 & 2) != 0) {
            lifecycle = null;
        }
        return b(view, coroutineContext, lifecycle);
    }

    public static final CompositionContext d(View view) {
        CompositionContext f2 = f(view);
        if (f2 != null) {
            return f2;
        }
        ViewParent parent = view.getParent();
        while (f2 == null && (parent instanceof View)) {
            f2 = f((View) parent);
            parent = parent.getParent();
        }
        return f2;
    }

    public static final StateFlow e(Context context) {
        StateFlow stateFlow;
        Map map = f17936a;
        synchronized (map) {
            try {
                Object obj = map.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Channel b2 = ChannelKt.b(-1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
                    obj = FlowKt.d0(FlowKt.I(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1(b2, HandlerCompat.a(Looper.getMainLooper())), b2, context, (Continuation) null)), CoroutineScopeKt.b(), SharingStarted.Companion.b(SharingStarted.f41761a, 0, 0, 3, (Object) null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, obj);
                }
                stateFlow = (StateFlow) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stateFlow;
    }

    public static final CompositionContext f(View view) {
        Object tag = view.getTag(R.id.G);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    public static final View g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            View view3 = view2;
            parent = view2.getParent();
            view = view3;
        }
        return view;
    }

    public static final Recomposer h(View view) {
        if (!view.isAttachedToWindow()) {
            InlineClassHelperKt.c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View g2 = g(view);
        CompositionContext f2 = f(g2);
        if (f2 == null) {
            return WindowRecomposerPolicy.f17932a.a(g2);
        }
        if (f2 instanceof Recomposer) {
            return (Recomposer) f2;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, CompositionContext compositionContext) {
        view.setTag(R.id.G, compositionContext);
    }
}
