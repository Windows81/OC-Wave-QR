package androidx.browser.customtabs;

import android.os.Bundle;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f1672A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Bundle f1673B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f1674z;

    public /* synthetic */ c(EngagementSignalsCallback engagementSignalsCallback, int i2, Bundle bundle) {
        this.f1674z = engagementSignalsCallback;
        this.f1672A = i2;
        this.f1673B = bundle;
    }

    public final void run() {
        this.f1674z.M(this.f1672A, this.f1673B);
    }
}
