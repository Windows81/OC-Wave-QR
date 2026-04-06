package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata
public final class WeakCache<T> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f17919a = new MutableVector(new Reference[16], 0);

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue f17920b = new ReferenceQueue();

    public final void a() {
        Reference poll;
        do {
            poll = this.f17920b.poll();
            if (poll != null) {
                this.f17919a.v(poll);
                continue;
            }
        } while (poll != null);
    }

    public final Object b() {
        a();
        while (this.f17919a.p() != 0) {
            MutableVector mutableVector = this.f17919a;
            Object obj = ((Reference) mutableVector.y(mutableVector.p() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void c(Object obj) {
        a();
        this.f17919a.d(new WeakReference(obj, this.f17920b));
    }
}
