package androidx.browser.customtabs;

import android.os.Bundle;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f1675A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Bundle f1676B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f1677z;

    public /* synthetic */ d(EngagementSignalsCallback engagementSignalsCallback, boolean z2, Bundle bundle) {
        this.f1677z = engagementSignalsCallback;
        this.f1675A = z2;
        this.f1676B = bundle;
    }

    public final void run() {
        this.f1677z.F(this.f1675A, this.f1676B);
    }
}
