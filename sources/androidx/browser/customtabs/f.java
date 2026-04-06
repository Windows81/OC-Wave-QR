package androidx.browser.customtabs;

import android.os.Bundle;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f1681A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Bundle f1682B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f1683z;

    public /* synthetic */ f(EngagementSignalsCallback engagementSignalsCallback, int i2, Bundle bundle) {
        this.f1683z = engagementSignalsCallback;
        this.f1681A = i2;
        this.f1682B = bundle;
    }

    public final void run() {
        this.f1683z.M(this.f1681A, this.f1682B);
    }
}
