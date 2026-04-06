package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final /* synthetic */ class a implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f256A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ActivityResultCallback f257B;
    public final /* synthetic */ ActivityResultContract C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ActivityResultRegistry f258z;

    public /* synthetic */ a(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract) {
        this.f258z = activityResultRegistry;
        this.f256A = str;
        this.f257B = activityResultCallback;
        this.C = activityResultContract;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ActivityResultRegistry.n(this.f258z, this.f256A, this.f257B, this.C, lifecycleOwner, event);
    }
}
