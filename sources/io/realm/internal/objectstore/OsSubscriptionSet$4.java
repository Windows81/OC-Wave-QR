package io.realm.internal.objectstore;

import io.realm.mongodb.sync.Subscription;
import java.util.Iterator;
import java.util.NoSuchElementException;

class OsSubscriptionSet$4 implements Iterator<Subscription> {

    /* renamed from: A  reason: collision with root package name */
    public final int f40368A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ OsSubscriptionSet f40369B;

    /* renamed from: z  reason: collision with root package name */
    public int f40370z;

    /* renamed from: b */
    public Subscription next() {
        if (this.f40370z < this.f40368A) {
            long access$200 = OsSubscriptionSet.access$200(OsSubscriptionSet.access$100(this.f40369B), this.f40370z);
            this.f40370z++;
            return new OsSubscription(access$200);
        }
        throw new NoSuchElementException("Iterator has no more elements. Tried index " + this.f40370z + ". Size is " + this.f40368A + ".");
    }

    public boolean hasNext() {
        return this.f40370z < this.f40368A;
    }
}
