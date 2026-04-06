package f;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Violation f34112A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f34113z;

    public /* synthetic */ b(String str, Violation violation) {
        this.f34113z = str;
        this.f34112A = violation;
    }

    public final void run() {
        FragmentStrictMode.f(this.f34113z, this.f34112A);
    }
}
