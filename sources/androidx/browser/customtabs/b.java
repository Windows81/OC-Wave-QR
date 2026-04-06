package androidx.browser.customtabs;

import android.os.Bundle;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f1669A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Bundle f1670B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f1671z;

    public /* synthetic */ b(EngagementSignalsCallback engagementSignalsCallback, boolean z2, Bundle bundle) {
        this.f1671z = engagementSignalsCallback;
        this.f1669A = z2;
        this.f1670B = bundle;
    }

    public final void run() {
        this.f1671z.E(this.f1669A, this.f1670B);
    }
}
