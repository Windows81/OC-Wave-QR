package com.hansecom.abt.presentation.main;

import android.app.ComponentCaller;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.ktx.Firebase;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelper;
import com.hansecom.abt.presentation.biometric.BiometricHelper;
import com.hansecom.abt.presentation.nfc.NfcHelper;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import com.hansecom.abt.ui.theme.colorScheme.ColorSchemes;
import com.hansecom.abt.util.resourcesResolvers.IconResolver;
import com.lokalise.sdk.LokaliseContextWrapper;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata
@AndroidEntryPoint
public final class MainActivity extends Hilt_MainActivity {
    public BiometricHelper e0;
    public AppUpdateHelper f0;
    public NfcHelper g0;
    public IconResolver h0;
    public AppFeatures i0;
    public AppInfo j0;
    public GoogleWalletHelper k0;

    public final NfcHelper A0() {
        NfcHelper nfcHelper = this.g0;
        if (nfcHelper != null) {
            return nfcHelper;
        }
        Intrinsics.y("nfcHelper");
        return null;
    }

    public final void B0(String str) {
        Intrinsics.i(str, "link");
        try {
            CustomTabsIntent a2 = new CustomTabsIntent.Builder().a();
            Intrinsics.h(a2, "build(...)");
            a2.a(this, Uri.parse(str));
        } catch (Exception e2) {
            Timber.f44337a.c(e2);
        }
    }

    public final void C0(String str, String str2) {
        Object obj;
        Intrinsics.i(str, "url");
        try {
            Result.Companion companion = Result.f40519A;
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            obj = Result.b(Unit.f40552a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        Throwable e2 = Result.e(obj);
        if (e2 != null) {
            if (str2 != null) {
                try {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                    obj = Result.b(Unit.f40552a);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.f40519A;
                    obj = Result.b(ResultKt.a(th2));
                }
            } else {
                throw e2;
            }
        }
        Throwable e3 = Result.e(obj);
        if (e3 != null) {
            Timber.f44337a.c(e3);
            FirebaseCrashlyticsKt.a(Firebase.f30878a).c(e3);
        }
    }

    public void attachBaseContext(Context context) {
        Intrinsics.i(context, "newBase");
        super.attachBaseContext(LokaliseContextWrapper.Companion.wrap(context));
    }

    public void onActivityResult(int i2, int i3, Intent intent, ComponentCaller componentCaller) {
        Intrinsics.i(componentCaller, "caller");
        super.onActivityResult(i2, i3, intent, componentCaller);
        if (y0().b(i2)) {
            y0().f(i2, i3, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SystemBarStyle.Companion companion = SystemBarStyle.f114e;
        SystemBarStyle c2 = companion.c(0);
        ColorSchemes.Companion companion2 = ColorSchemes.f38931a;
        EdgeToEdge.a(this, c2, SystemBarStyle.Companion.b(companion, companion2.b(), companion2.a(), (Function1) null, 4, (Object) null));
        ComponentActivityKt.b(this, (CompositionContext) null, ComposableLambdaKt.c(284553623, true, new MainActivity$onCreate$1(this)), 1, (Object) null);
    }

    public final AppFeatures u0() {
        AppFeatures appFeatures = this.i0;
        if (appFeatures != null) {
            return appFeatures;
        }
        Intrinsics.y("appFeatures");
        return null;
    }

    public final AppInfo v0() {
        AppInfo appInfo = this.j0;
        if (appInfo != null) {
            return appInfo;
        }
        Intrinsics.y("appInfo");
        return null;
    }

    public final AppUpdateHelper w0() {
        AppUpdateHelper appUpdateHelper = this.f0;
        if (appUpdateHelper != null) {
            return appUpdateHelper;
        }
        Intrinsics.y("appUpdateHelper");
        return null;
    }

    public final BiometricHelper x0() {
        BiometricHelper biometricHelper = this.e0;
        if (biometricHelper != null) {
            return biometricHelper;
        }
        Intrinsics.y("biometricHelper");
        return null;
    }

    public final GoogleWalletHelper y0() {
        GoogleWalletHelper googleWalletHelper = this.k0;
        if (googleWalletHelper != null) {
            return googleWalletHelper;
        }
        Intrinsics.y("googleWalletHelper");
        return null;
    }

    public final IconResolver z0() {
        IconResolver iconResolver = this.h0;
        if (iconResolver != null) {
            return iconResolver;
        }
        Intrinsics.y("iconResolver");
        return null;
    }
}
