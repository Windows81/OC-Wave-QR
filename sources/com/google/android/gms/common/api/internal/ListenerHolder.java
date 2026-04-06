package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;

public final class ListenerHolder<L> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f24502a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f24503b;

    /* renamed from: c  reason: collision with root package name */
    public volatile ListenerKey f24504c;

    public static final class ListenerKey<L> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f24505a;

        /* renamed from: b  reason: collision with root package name */
        public final String f24506b;

        public ListenerKey(Object obj, String str) {
            this.f24505a = obj;
            this.f24506b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.f24505a == listenerKey.f24505a && this.f24506b.equals(listenerKey.f24506b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f24505a) * 31) + this.f24506b.hashCode();
        }
    }

    public interface Notifier<L> {
        void a(Object obj);

        void b();
    }

    public void a() {
        this.f24503b = null;
        this.f24504c = null;
    }

    public ListenerKey b() {
        return this.f24504c;
    }

    public void c(Notifier notifier) {
        Preconditions.n(notifier, "Notifier must not be null");
        this.f24502a.execute(new zacb(this, notifier));
    }

    public final void d(Notifier notifier) {
        Object obj = this.f24503b;
        if (obj == null) {
            notifier.b();
            return;
        }
        try {
            notifier.a(obj);
        } catch (RuntimeException e2) {
            notifier.b();
            throw e2;
        }
    }
}
