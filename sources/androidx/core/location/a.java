package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Location f19897A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Consumer f19898z;

    public /* synthetic */ a(Consumer consumer, Location location) {
        this.f19898z = consumer;
        this.f19897A = location;
    }

    public final void run() {
        this.f19898z.accept(this.f19897A);
    }
}
