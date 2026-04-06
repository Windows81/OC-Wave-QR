package androidx.biometric;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f1549A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CharSequence f1550B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f1551z;

    public /* synthetic */ l(BiometricFragment biometricFragment, int i2, CharSequence charSequence) {
        this.f1551z = biometricFragment;
        this.f1549A = i2;
        this.f1550B = charSequence;
    }

    public final void run() {
        this.f1551z.M2(this.f1549A, this.f1550B);
    }
}
