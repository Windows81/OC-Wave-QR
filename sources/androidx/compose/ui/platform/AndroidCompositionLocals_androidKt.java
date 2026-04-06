package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17592a = CompositionLocalKt.h((SnapshotMutationPolicy) null, AndroidCompositionLocals_androidKt$LocalConfiguration$1.f17603z, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17593b = CompositionLocalKt.j(AndroidCompositionLocals_androidKt$LocalContext$1.f17604z);

    /* renamed from: c  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17594c = CompositionLocalKt.j(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.f17605z);

    /* renamed from: d  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17595d = CompositionLocalKt.j(AndroidCompositionLocals_androidKt$LocalResourceIdCache$1.f17606z);

    /* renamed from: e  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17596e = CompositionLocalKt.j(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.f17607z);

    /* renamed from: f  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17597f = CompositionLocalKt.j(AndroidCompositionLocals_androidKt$LocalView$1.f17608z);

    public static final void a(AndroidComposeView androidComposeView, Function2 function2, Composer composer, int i2) {
        int i3;
        AndroidComposeView androidComposeView2 = androidComposeView;
        Function2 function22 = function2;
        int i4 = i2;
        Composer q2 = composer.q(1396852028);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(androidComposeView2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function22) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1396852028, i3, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:76)");
            }
            Context context = androidComposeView.getContext();
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = SnapshotStateKt__SnapshotStateKt.e(new Configuration(context.getResources().getConfiguration()), (SnapshotMutationPolicy) null, 2, (Object) null);
                q2.N(g2);
            }
            MutableState mutableState = (MutableState) g2;
            Object g3 = q2.g();
            if (g3 == companion.a()) {
                g3 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(mutableState);
                q2.N(g3);
            }
            androidComposeView2.setConfigurationChangeObserver((Function1) g3);
            Object g4 = q2.g();
            if (g4 == companion.a()) {
                g4 = new AndroidUriHandler(context);
                q2.N(g4);
            }
            AndroidUriHandler androidUriHandler = (AndroidUriHandler) g4;
            AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners != null) {
                Object g5 = q2.g();
                if (g5 == companion.a()) {
                    g5 = DisposableSaveableStateRegistry_androidKt.b(androidComposeView2, viewTreeOwners.b());
                    q2.N(g5);
                }
                DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) g5;
                Unit unit = Unit.f40552a;
                boolean l2 = q2.l(disposableSaveableStateRegistry);
                Object g6 = q2.g();
                if (l2 || g6 == companion.a()) {
                    g6 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1(disposableSaveableStateRegistry);
                    q2.N(g6);
                }
                EffectsKt.c(unit, (Function1) g6, q2, 6);
                Object g7 = q2.g();
                if (g7 == companion.a()) {
                    g7 = HapticDefaults.f17786a.a(context) ? new DefaultHapticFeedback(androidComposeView.getView()) : new NoHapticFeedback();
                    q2.N(g7);
                }
                CompositionLocalKt.d(new ProvidedValue[]{f17592a.d(b(mutableState)), f17593b.d(context), LocalLifecycleOwnerKt.c().d(viewTreeOwners.a()), f17596e.d(viewTreeOwners.b()), SaveableStateRegistryKt.g().d(disposableSaveableStateRegistry), f17597f.d(androidComposeView.getView()), f17594c.d(l(context, b(mutableState), q2, 0)), f17595d.d(m(context, q2, 0)), CompositionLocalsKt.o().d(Boolean.valueOf(((Boolean) q2.C(CompositionLocalsKt.p())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), CompositionLocalsKt.k().d((HapticFeedback) g7)}, ComposableLambdaKt.e(1471621628, true, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(androidComposeView2, androidUriHandler, function22), q2, 54), q2, ProvidedValue.f14769i | 48);
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(androidComposeView2, function22, i4));
        }
    }

    public static final Configuration b(MutableState mutableState) {
        return (Configuration) mutableState.getValue();
    }

    public static final void c(MutableState mutableState, Configuration configuration) {
        mutableState.setValue(configuration);
    }

    public static final ProvidableCompositionLocal f() {
        return f17592a;
    }

    public static final ProvidableCompositionLocal g() {
        return f17593b;
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.c();
    }

    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return f17596e;
    }

    public static final ProvidableCompositionLocal h() {
        return f17594c;
    }

    public static final ProvidableCompositionLocal i() {
        return f17595d;
    }

    public static final ProvidableCompositionLocal j() {
        return f17597f;
    }

    public static final Void k(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final ImageVectorCache l(Context context, Configuration configuration, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-485908294, i2, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:157)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = new ImageVectorCache();
            composer.N(g2);
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) g2;
        Object g3 = composer.g();
        Configuration configuration2 = g3;
        if (g3 == companion.a()) {
            Configuration configuration3 = new Configuration();
            if (configuration != null) {
                configuration3.setTo(configuration);
            }
            composer.N(configuration3);
            configuration2 = configuration3;
        }
        Configuration configuration4 = (Configuration) configuration2;
        Object g4 = composer.g();
        if (g4 == companion.a()) {
            g4 = new AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1(configuration4, imageVectorCache);
            composer.N(g4);
        }
        AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) g4;
        boolean l2 = composer.l(context);
        Object g5 = composer.g();
        if (l2 || g5 == companion.a()) {
            g5 = new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1(context, androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1);
            composer.N(g5);
        }
        EffectsKt.c(imageVectorCache, (Function1) g5, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return imageVectorCache;
    }

    public static final ResourceIdCache m(Context context, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1348507246, i2, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:127)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = new ResourceIdCache();
            composer.N(g2);
        }
        ResourceIdCache resourceIdCache = (ResourceIdCache) g2;
        Object g3 = composer.g();
        if (g3 == companion.a()) {
            g3 = new AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1(resourceIdCache);
            composer.N(g3);
        }
        AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) g3;
        boolean l2 = composer.l(context);
        Object g4 = composer.g();
        if (l2 || g4 == companion.a()) {
            g4 = new AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1(context, androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1);
            composer.N(g4);
        }
        EffectsKt.c(resourceIdCache, (Function1) g4, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return resourceIdCache;
    }
}
