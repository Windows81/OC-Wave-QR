package com.hansecom.abt.ui;

import android.content.Context;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.AppInfoKt;
import com.hansecom.abt.presentation.biometric.BiometricHelper;
import com.hansecom.abt.presentation.biometric.BiometricHelperKt;
import com.hansecom.abt.presentation.screens.home.HomeNavigationKt;
import com.hansecom.abt.presentation.screens.main.MainNavigationKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.resourcesResolvers.IconResolver;
import com.hansecom.abt.util.resourcesResolvers.IconResolverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
final class CompositionLocalKt$AbtThemePreview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f37857z;

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1703546600, i2, -1, "com.hansecom.abt.ui.AbtThemePreview.<anonymous> (CompositionLocal.kt:29)");
            }
            ProvidableCompositionLocal c2 = CompositionLocalKt.c();
            Context context = (Context) composer.C(AndroidCompositionLocals_androidKt.g());
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, composer);
                composer.N(g2);
            }
            final Function2 function2 = this.f37857z;
            CompositionLocalKt.d(new ProvidedValue[]{c2.d(new AbtSnackbarHostState(context, (CoroutineScope) g2)), IconResolverKt.c().d(new IconResolver((Context) composer.C(AndroidCompositionLocals_androidKt.g()))), MainNavigationKt.l().d(NavHostControllerKt.e(new Navigator[0], composer, 0)), HomeNavigationKt.f().d(NavHostControllerKt.e(new Navigator[0], composer, 0)), AppInfoKt.c().d(new AppInfo()), BiometricHelperKt.c().d(new BiometricHelper((Context) composer.C(AndroidCompositionLocals_androidKt.g())))}, ComposableLambdaKt.e(1778316200, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if ((i2 & 3) != 2 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1778316200, i2, -1, "com.hansecom.abt.ui.AbtThemePreview.<anonymous>.<anonymous> (CompositionLocal.kt:37)");
                        }
                        SurfaceKt.c((Modifier) null, (Shape) null, AbtTheme.f38851a.b(composer, 6).z(), 0, 0.0f, 0.0f, (BorderStroke) null, function2, composer, 0, 123);
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b((Composer) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
