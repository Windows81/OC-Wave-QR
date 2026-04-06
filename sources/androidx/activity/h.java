package androidx.activity;

import androidx.activity.result.contract.ActivityResultContract;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f204A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ActivityResultContract.SynchronousResult f205B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity$activityResultRegistry$1 f206z;

    public /* synthetic */ h(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i2, ActivityResultContract.SynchronousResult synchronousResult) {
        this.f206z = componentActivity$activityResultRegistry$1;
        this.f204A = i2;
        this.f205B = synchronousResult;
    }

    public final void run() {
        ComponentActivity$activityResultRegistry$1.s(this.f206z, this.f204A, this.f205B);
    }
}
