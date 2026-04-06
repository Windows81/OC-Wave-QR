package p;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RolloutsState f34128A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f34129z;

    public /* synthetic */ c(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState) {
        this.f34129z = rolloutsStateSubscriber;
        this.f34128A = rolloutsState;
    }

    public final void run() {
        this.f34129z.a(this.f34128A);
    }
}
