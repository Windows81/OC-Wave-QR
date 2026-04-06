package com.hansecom.abt.presentation.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.AppInfoKt;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelperKt;
import com.hansecom.abt.presentation.biometric.BiometricHelperKt;
import com.hansecom.abt.presentation.nfc.NfcHelperKt;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelperKt;
import com.hansecom.abt.util.resourcesResolvers.IconResolverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class MainActivity$onCreate$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MainActivity f34168z;

    public MainActivity$onCreate$1(MainActivity mainActivity) {
        this.f34168z = mainActivity;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(284553623, i2, -1, "com.hansecom.abt.presentation.main.MainActivity.onCreate.<anonymous> (MainActivity.kt:72)");
            }
            CompositionLocalKt.d(new ProvidedValue[]{IconResolverKt.c().d(this.f34168z.z0()), BiometricHelperKt.c().d(this.f34168z.x0()), AppUpdateHelperKt.c().d(this.f34168z.w0()), NfcHelperKt.c().d(this.f34168z.A0()), AppFeaturesKt.c().d(this.f34168z.u0()), AppInfoKt.c().d(this.f34168z.v0()), GoogleWalletHelperKt.c().d(this.f34168z.y0())}, ComposableSingletons$MainActivityKt.f34162a.b(), composer, ProvidedValue.f14769i | 48);
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
