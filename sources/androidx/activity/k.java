package androidx.activity;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f211A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f212z;

    public /* synthetic */ k(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f212z = componentActivity;
        this.f211A = onBackPressedDispatcher;
    }

    public final void run() {
        ComponentActivity$onBackPressedDispatcher$2.g(this.f212z, this.f211A);
    }
}
