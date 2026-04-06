package androidx.activity;

import android.content.IntentSender;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f207A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f208B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity$activityResultRegistry$1 f209z;

    public /* synthetic */ i(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i2, IntentSender.SendIntentException sendIntentException) {
        this.f209z = componentActivity$activityResultRegistry$1;
        this.f207A = i2;
        this.f208B = sendIntentException;
    }

    public final void run() {
        ComponentActivity$activityResultRegistry$1.t(this.f209z, this.f207A, this.f208B);
    }
}
