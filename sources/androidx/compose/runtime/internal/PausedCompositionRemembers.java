package androidx.compose.runtime.internal;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Set;
import kotlin.Metadata;

@Metadata
public final class PausedCompositionRemembers implements RememberObserver {

    /* renamed from: A  reason: collision with root package name */
    public final MutableVector f15134A = new MutableVector(new RememberObserverHolder[16], 0);

    /* renamed from: z  reason: collision with root package name */
    public final Set f15135z;

    public PausedCompositionRemembers(Set set) {
        this.f15135z = set;
    }

    public final MutableVector a() {
        return this.f15134A;
    }

    public void e() {
    }

    public void f() {
    }

    public void h() {
        MutableVector mutableVector = this.f15134A;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            RememberObserver b2 = ((RememberObserverHolder) objArr[i2]).b();
            this.f15135z.remove(b2);
            b2.h();
        }
    }
}
