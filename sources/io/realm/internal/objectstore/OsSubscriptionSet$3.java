package io.realm.internal.objectstore;

import io.realm.mongodb.sync.SubscriptionSet;
import io.realm.mongodb.sync.SubscriptionSet$UpdateAsyncCallback;

class OsSubscriptionSet$3 implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ OsSubscriptionSet f40362A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SubscriptionSet$UpdateAsyncCallback f40363z;

    public void run() {
        try {
            final SubscriptionSet update = this.f40362A.update(this.f40363z);
            OsSubscriptionSet.access$000(this.f40362A).post(new Runnable() {
                public void run() {
                    OsSubscriptionSet$3.this.f40363z.a(update);
                }
            });
        } catch (Throwable th) {
            OsSubscriptionSet.access$000(this.f40362A).post(new Runnable() {
                public void run() {
                    OsSubscriptionSet$3.this.f40363z.onError(th);
                }
            });
        }
    }
}
