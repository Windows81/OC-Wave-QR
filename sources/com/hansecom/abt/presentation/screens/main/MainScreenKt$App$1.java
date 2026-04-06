package com.hansecom.abt.presentation.screens.main;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.data.useCases.appUpdate.AppUpdate;
import com.hansecom.abt.presentation.screens.auth.AuthGraph;
import com.hansecom.abt.presentation.screens.auth.LoginDestination;
import com.hansecom.abt.presentation.screens.auth.WelcomeDestination;
import com.hansecom.abt.presentation.screens.main.Main;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MainScreenKt$App$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37565A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37566B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Main.State f37567z;

    public MainScreenKt$App$1(Main.State state, NavHostController navHostController, NavHostController navHostController2) {
        this.f37567z = state;
        this.f37565A = navHostController;
        this.f37566B = navHostController2;
    }

    public static final int f(int i2) {
        return i2;
    }

    public static final int g(int i2) {
        return i2;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(327064336, i2, -1, "com.hansecom.abt.presentation.screens.main.App.<anonymous> (MainScreen.kt:151)");
            }
            composer.X(-1963033958);
            if (!(this.f37567z.g() == null || this.f37567z.c() == AppUpdate.HARD)) {
                MainNavigationKt.g(this.f37565A, (Context) composer.C(AndroidCompositionLocals_androidKt.g()), this.f37567z.g().booleanValue() ? HomeDestination.INSTANCE : AuthGraph.INSTANCE, this.f37567z.e() ? WelcomeDestination.INSTANCE : LoginDestination.INSTANCE, composer, 0);
                if (this.f37567z.f()) {
                    SurfaceKt.c((Modifier) null, (Shape) null, AbtTheme.f38851a.b(composer, 6).x(), 0, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$MainScreenKt.f37533a.b(), composer, 12582912, 123);
                }
            }
            composer.M();
            if (!((Boolean) composer.C(InspectionModeKt.a())).booleanValue()) {
                boolean z2 = this.f37567z.f() || this.f37567z.c() == AppUpdate.HARD;
                composer.X(-1963009728);
                Object g2 = composer.g();
                Composer.Companion companion = Composer.f14567a;
                if (g2 == companion.a()) {
                    g2 = new x();
                    composer.N(g2);
                }
                composer.M();
                EnterTransition B2 = EnterExitTransitionKt.B((FiniteAnimationSpec) null, (Function1) g2, 1, (Object) null);
                composer.X(-1963005632);
                Object g3 = composer.g();
                if (g3 == companion.a()) {
                    g3 = new y();
                    composer.N(g3);
                }
                composer.M();
                ExitTransition E = EnterExitTransitionKt.E((FiniteAnimationSpec) null, (Function1) g3, 1, (Object) null);
                final NavHostController navHostController = this.f37566B;
                final Main.State state = this.f37567z;
                AnimatedVisibilityKt.j(z2, (Modifier) null, B2, E, (String) null, ComposableLambdaKt.e(560235578, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() {
                    public final void b(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
                        Intrinsics.i(animatedVisibilityScope, "$this$AnimatedVisibility");
                        if (ComposerKt.P()) {
                            ComposerKt.Y(560235578, i2, -1, "com.hansecom.abt.presentation.screens.main.App.<anonymous>.<anonymous> (MainScreen.kt:173)");
                        }
                        NavHostController navHostController = navHostController;
                        AppUpdate c2 = state.c();
                        AppUpdate appUpdate = AppUpdate.HARD;
                        PriorityNavigationKt.e(navHostController, c2 == appUpdate ? HardUpdateDestination.INSTANCE : LockDestination.INSTANCE, composer, 0);
                        if (!Intrinsics.d(navHostController.I(), HardUpdateDestination.INSTANCE) && state.c() == appUpdate) {
                            do {
                            } while (navHostController.c0());
                            NavController.Y(navHostController, HardUpdateDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                        } else if (state.f() && navHostController.I() == null) {
                            NavController.Y(navHostController, LockDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                        }
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                        }
                    }

                    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                        b((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return Unit.f40552a;
                    }
                }, composer, 54), composer, 200064, 18);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
