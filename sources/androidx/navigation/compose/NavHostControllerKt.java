package androidx.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public final class NavHostControllerKt {
    public static final Saver a(Context context) {
        return SaverKt.e(NavHostControllerKt$NavControllerSaver$1.f22508z, new NavHostControllerKt$NavControllerSaver$2(context));
    }

    public static final NavHostController c(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.M().b(new ComposeNavGraphNavigator(navHostController.M()));
        navHostController.M().b(new ComposeNavigator());
        navHostController.M().b(new DialogNavigator());
        return navHostController;
    }

    public static final State d(NavController navController, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-120375203, i2, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        State a2 = SnapshotStateKt.a(navController.H(), (Object) null, (CoroutineContext) null, composer, 48, 2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.navigation.NavHostController e(androidx.navigation.Navigator[] r8, androidx.compose.runtime.Composer r9, int r10) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)"
            r2 = -312215566(0xffffffffed63f7f2, float:-4.4095528E27)
            androidx.compose.runtime.ComposerKt.Y(r2, r10, r0, r1)
        L_0x000f:
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r10 = r9.C(r10)
            android.content.Context r10 = (android.content.Context) r10
            int r0 = r8.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r0)
            androidx.compose.runtime.saveable.Saver r2 = a(r10)
            boolean r0 = r9.l(r10)
            java.lang.Object r3 = r9.g()
            if (r0 != 0) goto L_0x0034
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x003c
        L_0x0034:
            androidx.navigation.compose.NavHostControllerKt$rememberNavController$1$1 r3 = new androidx.navigation.compose.NavHostControllerKt$rememberNavController$1$1
            r3.<init>(r10)
            r9.N(r3)
        L_0x003c:
            r4 = r3
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r6 = 0
            r7 = 4
            r3 = 0
            r5 = r9
            java.lang.Object r9 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r1, r2, r3, r4, r5, r6, r7)
            androidx.navigation.NavHostController r9 = (androidx.navigation.NavHostController) r9
            int r10 = r8.length
            r0 = 0
        L_0x004b:
            if (r0 >= r10) goto L_0x0059
            r1 = r8[r0]
            androidx.navigation.NavigatorProvider r2 = r9.M()
            r2.b(r1)
            int r0 = r0 + 1
            goto L_0x004b
        L_0x0059:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0062
            androidx.compose.runtime.ComposerKt.X()
        L_0x0062:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostControllerKt.e(androidx.navigation.Navigator[], androidx.compose.runtime.Composer, int):androidx.navigation.NavHostController");
    }
}
