package com.google.common.cache;

@ElementTypesAreNonnullByDefault
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    public static final class SimpleStatsCounter implements StatsCounter {

        /* renamed from: a  reason: collision with root package name */
        public final LongAddable f27808a = LongAddables.a();

        /* renamed from: b  reason: collision with root package name */
        public final LongAddable f27809b = LongAddables.a();

        /* renamed from: c  reason: collision with root package name */
        public final LongAddable f27810c = LongAddables.a();

        /* renamed from: d  reason: collision with root package name */
        public final LongAddable f27811d = LongAddables.a();

        /* renamed from: e  reason: collision with root package name */
        public final LongAddable f27812e = LongAddables.a();

        /* renamed from: f  reason: collision with root package name */
        public final LongAddable f27813f = LongAddables.a();

        public void a() {
            this.f27813f.a();
        }

        public void b(int i2) {
            this.f27808a.b((long) i2);
        }

        public void c(int i2) {
            this.f27809b.b((long) i2);
        }

        public void d(long j2) {
            this.f27811d.a();
            this.f27812e.b(j2);
        }

        public void e(long j2) {
            this.f27810c.a();
            this.f27812e.b(j2);
        }
    }

    public interface StatsCounter {
        void a();

        void b(int i2);

        void c(int i2);

        void d(long j2);

        void e(long j2);
    }
}
