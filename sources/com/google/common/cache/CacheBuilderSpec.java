package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public final class CacheBuilderSpec {

    /* renamed from: o  reason: collision with root package name */
    public static final Splitter f27839o = Splitter.f(',').l();

    /* renamed from: p  reason: collision with root package name */
    public static final Splitter f27840p = Splitter.f('=').l();

    /* renamed from: q  reason: collision with root package name */
    public static final ImmutableMap f27841q;

    /* renamed from: a  reason: collision with root package name */
    public Integer f27842a;

    /* renamed from: b  reason: collision with root package name */
    public Long f27843b;

    /* renamed from: c  reason: collision with root package name */
    public Long f27844c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f27845d;

    /* renamed from: e  reason: collision with root package name */
    public LocalCache.Strength f27846e;

    /* renamed from: f  reason: collision with root package name */
    public LocalCache.Strength f27847f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f27848g;

    /* renamed from: h  reason: collision with root package name */
    public long f27849h;

    /* renamed from: i  reason: collision with root package name */
    public TimeUnit f27850i;

    /* renamed from: j  reason: collision with root package name */
    public long f27851j;

    /* renamed from: k  reason: collision with root package name */
    public TimeUnit f27852k;

    /* renamed from: l  reason: collision with root package name */
    public long f27853l;

    /* renamed from: m  reason: collision with root package name */
    public TimeUnit f27854m;

    /* renamed from: n  reason: collision with root package name */
    public final String f27855n;

    /* renamed from: com.google.common.cache.CacheBuilderSpec$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27856a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.cache.LocalCache$Strength[] r0 = com.google.common.cache.LocalCache.Strength.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27856a = r0
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.WEAK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27856a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.SOFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.CacheBuilderSpec.AnonymousClass1.<clinit>():void");
        }
    }

    public static class AccessDurationParser extends DurationParser {
    }

    public static class ConcurrencyLevelParser extends IntegerParser {
    }

    public static abstract class DurationParser implements ValueParser {
    }

    public static class InitialCapacityParser extends IntegerParser {
    }

    public static abstract class IntegerParser implements ValueParser {
    }

    public static class KeyStrengthParser implements ValueParser {

        /* renamed from: a  reason: collision with root package name */
        public final LocalCache.Strength f27857a;

        public KeyStrengthParser(LocalCache.Strength strength) {
            this.f27857a = strength;
        }
    }

    public static abstract class LongParser implements ValueParser {
    }

    public static class MaximumSizeParser extends LongParser {
    }

    public static class MaximumWeightParser extends LongParser {
    }

    public static class RecordStatsParser implements ValueParser {
    }

    public static class RefreshDurationParser extends DurationParser {
    }

    public interface ValueParser {
    }

    public static class ValueStrengthParser implements ValueParser {

        /* renamed from: a  reason: collision with root package name */
        public final LocalCache.Strength f27858a;

        public ValueStrengthParser(LocalCache.Strength strength) {
            this.f27858a = strength;
        }
    }

    public static class WriteDurationParser extends DurationParser {
    }

    static {
        ImmutableMap.Builder g2 = ImmutableMap.a().g("initialCapacity", new InitialCapacityParser()).g("maximumSize", new MaximumSizeParser()).g("maximumWeight", new MaximumWeightParser()).g("concurrencyLevel", new ConcurrencyLevelParser());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        f27841q = g2.g("weakKeys", new KeyStrengthParser(strength)).g("softValues", new ValueStrengthParser(LocalCache.Strength.SOFT)).g("weakValues", new ValueStrengthParser(strength)).g("recordStats", new RecordStatsParser()).g("expireAfterAccess", new AccessDurationParser()).g("expireAfterWrite", new WriteDurationParser()).g("refreshAfterWrite", new RefreshDurationParser()).g("refreshInterval", new RefreshDurationParser()).d();
    }

    public static Long a(long j2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j2));
    }

    public String b() {
        return this.f27855n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        CacheBuilderSpec cacheBuilderSpec = (CacheBuilderSpec) obj;
        return Objects.a(this.f27842a, cacheBuilderSpec.f27842a) && Objects.a(this.f27843b, cacheBuilderSpec.f27843b) && Objects.a(this.f27844c, cacheBuilderSpec.f27844c) && Objects.a(this.f27845d, cacheBuilderSpec.f27845d) && Objects.a(this.f27846e, cacheBuilderSpec.f27846e) && Objects.a(this.f27847f, cacheBuilderSpec.f27847f) && Objects.a(this.f27848g, cacheBuilderSpec.f27848g) && Objects.a(a(this.f27849h, this.f27850i), a(cacheBuilderSpec.f27849h, cacheBuilderSpec.f27850i)) && Objects.a(a(this.f27851j, this.f27852k), a(cacheBuilderSpec.f27851j, cacheBuilderSpec.f27852k)) && Objects.a(a(this.f27853l, this.f27854m), a(cacheBuilderSpec.f27853l, cacheBuilderSpec.f27854m));
    }

    public int hashCode() {
        return Objects.b(this.f27842a, this.f27843b, this.f27844c, this.f27845d, this.f27846e, this.f27847f, this.f27848g, a(this.f27849h, this.f27850i), a(this.f27851j, this.f27852k), a(this.f27853l, this.f27854m));
    }

    public String toString() {
        return MoreObjects.c(this).j(b()).toString();
    }
}
