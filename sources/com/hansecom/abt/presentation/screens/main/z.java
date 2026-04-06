package com.hansecom.abt.presentation.screens.main;

import android.content.Context;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelper;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class z implements InstallStateUpdatedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f37720a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f37721b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f37722c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppUpdateHelper f37723d;

    public /* synthetic */ z(CoroutineScope coroutineScope, Context context, AbtSnackbarHostState abtSnackbarHostState, AppUpdateHelper appUpdateHelper) {
        this.f37720a = coroutineScope;
        this.f37721b = context;
        this.f37722c = abtSnackbarHostState;
        this.f37723d = appUpdateHelper;
    }

    public final void a(Object obj) {
        MainScreenKt$SoftUpdateWarning$1$1.C(this.f37720a, this.f37721b, this.f37722c, this.f37723d, (InstallState) obj);
    }
}
