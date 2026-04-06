package com.hansecom.abt.presentation.main;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelper;
import com.hansecom.abt.presentation.biometric.BiometricHelper;
import com.hansecom.abt.presentation.nfc.NfcHelper;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import com.hansecom.abt.util.resourcesResolvers.IconResolver;
import dagger.MembersInjector;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
    public static void a(MainActivity mainActivity, AppFeatures appFeatures) {
        mainActivity.i0 = appFeatures;
    }

    public static void b(MainActivity mainActivity, AppInfo appInfo) {
        mainActivity.j0 = appInfo;
    }

    public static void c(MainActivity mainActivity, AppUpdateHelper appUpdateHelper) {
        mainActivity.f0 = appUpdateHelper;
    }

    public static void d(MainActivity mainActivity, BiometricHelper biometricHelper) {
        mainActivity.e0 = biometricHelper;
    }

    public static void e(MainActivity mainActivity, GoogleWalletHelper googleWalletHelper) {
        mainActivity.k0 = googleWalletHelper;
    }

    public static void f(MainActivity mainActivity, IconResolver iconResolver) {
        mainActivity.h0 = iconResolver;
    }

    public static void g(MainActivity mainActivity, NfcHelper nfcHelper) {
        mainActivity.g0 = nfcHelper;
    }
}
