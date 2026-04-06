package androidx.profileinstaller;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f22807A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f22808B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DeviceProfileWriter f22809z;

    public /* synthetic */ a(DeviceProfileWriter deviceProfileWriter, int i2, Object obj) {
        this.f22809z = deviceProfileWriter;
        this.f22807A = i2;
        this.f22808B = obj;
    }

    public final void run() {
        this.f22809z.g(this.f22807A, this.f22808B);
    }
}
