package androidx.browser.customtabs;

import android.os.Bundle;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f1684A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Bundle f1685B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f1686z;

    public /* synthetic */ g(EngagementSignalsCallback engagementSignalsCallback, boolean z2, Bundle bundle) {
        this.f1686z = engagementSignalsCallback;
        this.f1684A = z2;
        this.f1685B = bundle;
    }

    public final void run() {
        this.f1686z.E(this.f1684A, this.f1685B);
    }
}
