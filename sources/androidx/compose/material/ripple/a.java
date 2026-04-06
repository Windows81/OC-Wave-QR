package androidx.compose.material.ripple;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RippleHostView f9105z;

    public /* synthetic */ a(RippleHostView rippleHostView) {
        this.f9105z = rippleHostView;
    }

    public final void run() {
        RippleHostView.setRippleState$lambda$2(this.f9105z);
    }
}
