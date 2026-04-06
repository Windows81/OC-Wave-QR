package p;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

public final /* synthetic */ class a implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriptionsHandler f34123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f34124b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f34125c;

    public /* synthetic */ a(RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler, Task task, RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.f34123a = rolloutsStateSubscriptionsHandler;
        this.f34124b = task;
        this.f34125c = rolloutsStateSubscriber;
    }

    public final void a(Object obj) {
        this.f34123a.f(this.f34124b, this.f34125c, (ConfigContainer) obj);
    }
}
