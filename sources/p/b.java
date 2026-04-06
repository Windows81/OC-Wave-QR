package p;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RolloutsState f34126A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f34127z;

    public /* synthetic */ b(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState) {
        this.f34127z = rolloutsStateSubscriber;
        this.f34126A = rolloutsState;
    }

    public final void run() {
        this.f34127z.a(this.f34126A);
    }
}
