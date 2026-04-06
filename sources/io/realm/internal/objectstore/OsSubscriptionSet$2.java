package io.realm.internal.objectstore;

import io.realm.mongodb.sync.SubscriptionSet$StateChangeCallback;
import java.util.concurrent.TimeUnit;

class OsSubscriptionSet$2 implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f40356A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SubscriptionSet$StateChangeCallback f40357B;
    public final /* synthetic */ OsSubscriptionSet C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f40358z;

    public void run() {
        try {
            this.C.waitForSynchronization(this.f40358z, this.f40356A);
            OsSubscriptionSet.access$000(this.C).post(new Runnable() {
                public void run() {
                    OsSubscriptionSet$2 osSubscriptionSet$2 = OsSubscriptionSet$2.this;
                    osSubscriptionSet$2.f40357B.onStateChange(osSubscriptionSet$2.C);
                }
            });
        } catch (Exception e2) {
            OsSubscriptionSet.access$000(this.C).post(new Runnable() {
                public void run() {
                    OsSubscriptionSet$2.this.f40357B.onError(e2);
                }
            });
        }
    }
}
