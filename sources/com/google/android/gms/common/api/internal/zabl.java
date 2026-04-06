package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

final class zabl implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f24652a;

    public zabl(GoogleApiManager googleApiManager) {
        this.f24652a = googleApiManager;
    }

    public final void a(boolean z2) {
        GoogleApiManager googleApiManager = this.f24652a;
        googleApiManager.f24497n.sendMessage(googleApiManager.f24497n.obtainMessage(1, Boolean.valueOf(z2)));
    }
}
