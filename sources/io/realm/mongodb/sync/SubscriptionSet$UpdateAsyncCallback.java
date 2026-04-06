package io.realm.mongodb.sync;

public interface SubscriptionSet$UpdateAsyncCallback extends SubscriptionSet$UpdateCallback {
    void a(SubscriptionSet subscriptionSet);

    void onError(Throwable th);
}
