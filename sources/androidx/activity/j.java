package androidx.activity;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f210z;

    public /* synthetic */ j(ComponentActivity componentActivity) {
        this.f210z = componentActivity;
    }

    public final void run() {
        ComponentActivity$onBackPressedDispatcher$2.f(this.f210z);
    }
}
