package f;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Violation f34110A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FragmentStrictMode.Policy f34111z;

    public /* synthetic */ a(FragmentStrictMode.Policy policy, Violation violation) {
        this.f34111z = policy;
        this.f34110A = violation;
    }

    public final void run() {
        FragmentStrictMode.e(this.f34111z, this.f34110A);
    }
}
