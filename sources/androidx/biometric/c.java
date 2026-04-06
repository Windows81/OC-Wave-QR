package androidx.biometric;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f1537A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CharSequence f1538B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f1539z;

    public /* synthetic */ c(BiometricFragment biometricFragment, int i2, CharSequence charSequence) {
        this.f1539z = biometricFragment;
        this.f1537A = i2;
        this.f1538B = charSequence;
    }

    public final void run() {
        this.f1539z.L2(this.f1537A, this.f1538B);
    }
}
