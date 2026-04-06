package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

public class MediatorLiveData<T> extends MutableLiveData<T> {

    /* renamed from: l  reason: collision with root package name */
    public SafeIterableMap f21942l;

    public static class Source<V> implements Observer<V> {

        /* renamed from: A  reason: collision with root package name */
        public final Observer f21943A;

        /* renamed from: B  reason: collision with root package name */
        public int f21944B = -1;

        /* renamed from: z  reason: collision with root package name */
        public final LiveData f21945z;

        public Source(LiveData liveData, Observer observer) {
            this.f21945z = liveData;
            this.f21943A = observer;
        }

        public void a(Object obj) {
            if (this.f21944B != this.f21945z.g()) {
                this.f21944B = this.f21945z.g();
                this.f21943A.a(obj);
            }
        }

        public void b() {
            this.f21945z.j(this);
        }

        public void c() {
            this.f21945z.n(this);
        }
    }

    public void k() {
        Iterator it = this.f21942l.iterator();
        while (it.hasNext()) {
            ((Source) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    public void l() {
        Iterator it = this.f21942l.iterator();
        while (it.hasNext()) {
            ((Source) ((Map.Entry) it.next()).getValue()).c();
        }
    }

    public void p(LiveData liveData, Observer observer) {
        if (liveData != null) {
            Source source = new Source(liveData, observer);
            Source source2 = (Source) this.f21942l.n(liveData, source);
            if (source2 != null && source2.f21943A != observer) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (source2 == null && h()) {
                source.b();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }

    public void q(LiveData liveData) {
        Source source = (Source) this.f21942l.o(liveData);
        if (source != null) {
            source.c();
        }
    }
}
