package com.google.common.cache;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.LocalCache;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public final class CacheBuilder<K, V> {

    /* renamed from: q  reason: collision with root package name */
    public static final Supplier f27814q = Suppliers.b(new AbstractCache.StatsCounter() {
        public void a() {
        }

        public void b(int i2) {
        }

        public void c(int i2) {
        }

        public void d(long j2) {
        }

        public void e(long j2) {
        }
    });

    /* renamed from: r  reason: collision with root package name */
    public static final CacheStats f27815r = new CacheStats(0, 0, 0, 0, 0, 0);

    /* renamed from: s  reason: collision with root package name */
    public static final Supplier f27816s = new Supplier<AbstractCache.StatsCounter>() {
        /* renamed from: a */
        public AbstractCache.StatsCounter get() {
            return new AbstractCache.SimpleStatsCounter();
        }
    };

    /* renamed from: t  reason: collision with root package name */
    public static final Ticker f27817t = new Ticker() {
        public long a() {
            return 0;
        }
    };

    /* renamed from: u  reason: collision with root package name */
    public static final Logger f27818u = Logger.getLogger(CacheBuilder.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public boolean f27819a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f27820b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f27821c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f27822d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f27823e = -1;

    /* renamed from: f  reason: collision with root package name */
    public Weigher f27824f;

    /* renamed from: g  reason: collision with root package name */
    public LocalCache.Strength f27825g;

    /* renamed from: h  reason: collision with root package name */
    public LocalCache.Strength f27826h;

    /* renamed from: i  reason: collision with root package name */
    public long f27827i = -1;

    /* renamed from: j  reason: collision with root package name */
    public long f27828j = -1;

    /* renamed from: k  reason: collision with root package name */
    public long f27829k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Equivalence f27830l;

    /* renamed from: m  reason: collision with root package name */
    public Equivalence f27831m;

    /* renamed from: n  reason: collision with root package name */
    public RemovalListener f27832n;

    /* renamed from: o  reason: collision with root package name */
    public Ticker f27833o;

    /* renamed from: p  reason: collision with root package name */
    public Supplier f27834p = f27814q;

    public enum NullListener implements RemovalListener<Object, Object> {
        INSTANCE;

        public void d(RemovalNotification removalNotification) {
        }
    }

    public enum OneWeigher implements Weigher<Object, Object> {
        INSTANCE;

        public int d(Object obj, Object obj2) {
            return 1;
        }
    }

    public static CacheBuilder q() {
        return new CacheBuilder();
    }

    public LoadingCache a(CacheLoader cacheLoader) {
        b();
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    public final void b() {
        boolean z2 = false;
        if (this.f27824f == null) {
            if (this.f27823e == -1) {
                z2 = true;
            }
            Preconditions.x(z2, "maximumWeight requires weigher");
        } else if (this.f27819a) {
            if (this.f27823e != -1) {
                z2 = true;
            }
            Preconditions.x(z2, "weigher requires maximumWeight");
        } else if (this.f27823e == -1) {
            f27818u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public int c() {
        int i2 = this.f27821c;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    public long d() {
        long j2 = this.f27828j;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    public long e() {
        long j2 = this.f27827i;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    public int f() {
        int i2 = this.f27820b;
        if (i2 == -1) {
            return 16;
        }
        return i2;
    }

    public Equivalence g() {
        return (Equivalence) MoreObjects.a(this.f27830l, h().f());
    }

    public LocalCache.Strength h() {
        return (LocalCache.Strength) MoreObjects.a(this.f27825g, LocalCache.Strength.STRONG);
    }

    public long i() {
        if (this.f27827i == 0 || this.f27828j == 0) {
            return 0;
        }
        return this.f27824f == null ? this.f27822d : this.f27823e;
    }

    public long j() {
        long j2 = this.f27829k;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    public RemovalListener k() {
        return (RemovalListener) MoreObjects.a(this.f27832n, NullListener.INSTANCE);
    }

    public Supplier l() {
        return this.f27834p;
    }

    public Ticker m(boolean z2) {
        Ticker ticker = this.f27833o;
        return ticker != null ? ticker : z2 ? Ticker.b() : f27817t;
    }

    public Equivalence n() {
        return (Equivalence) MoreObjects.a(this.f27831m, o().f());
    }

    public LocalCache.Strength o() {
        return (LocalCache.Strength) MoreObjects.a(this.f27826h, LocalCache.Strength.STRONG);
    }

    public Weigher p() {
        return (Weigher) MoreObjects.a(this.f27824f, OneWeigher.INSTANCE);
    }

    public CacheBuilder r(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f27825g;
        Preconditions.z(strength2 == null, "Key strength was already set to %s", strength2);
        this.f27825g = (LocalCache.Strength) Preconditions.q(strength);
        return this;
    }

    public CacheBuilder s() {
        return r(LocalCache.Strength.WEAK);
    }

    public String toString() {
        MoreObjects.ToStringHelper c2 = MoreObjects.c(this);
        int i2 = this.f27820b;
        if (i2 != -1) {
            c2.b("initialCapacity", i2);
        }
        int i3 = this.f27821c;
        if (i3 != -1) {
            c2.b("concurrencyLevel", i3);
        }
        long j2 = this.f27822d;
        if (j2 != -1) {
            c2.c("maximumSize", j2);
        }
        long j3 = this.f27823e;
        if (j3 != -1) {
            c2.c("maximumWeight", j3);
        }
        long j4 = this.f27827i;
        if (j4 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j4);
            sb.append("ns");
            c2.d("expireAfterWrite", sb.toString());
        }
        long j5 = this.f27828j;
        if (j5 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j5);
            sb2.append("ns");
            c2.d("expireAfterAccess", sb2.toString());
        }
        LocalCache.Strength strength = this.f27825g;
        if (strength != null) {
            c2.d("keyStrength", Ascii.c(strength.toString()));
        }
        LocalCache.Strength strength2 = this.f27826h;
        if (strength2 != null) {
            c2.d("valueStrength", Ascii.c(strength2.toString()));
        }
        if (this.f27830l != null) {
            c2.j("keyEquivalence");
        }
        if (this.f27831m != null) {
            c2.j("valueEquivalence");
        }
        if (this.f27832n != null) {
            c2.j("removalListener");
        }
        return c2.toString();
    }
}
