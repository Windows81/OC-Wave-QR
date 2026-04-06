package androidx.browser.customtabs;

import android.os.Bundle;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f1678A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Bundle f1679B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f1680z;

    public /* synthetic */ e(EngagementSignalsCallback engagementSignalsCallback, boolean z2, Bundle bundle) {
        this.f1680z = engagementSignalsCallback;
        this.f1678A = z2;
        this.f1679B = bundle;
    }

    public final void run() {
        this.f1680z.F(this.f1678A, this.f1679B);
    }
}
