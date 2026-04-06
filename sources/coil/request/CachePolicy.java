package coil.request;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum CachePolicy {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);
    

    /* renamed from: A  reason: collision with root package name */
    public final boolean f23540A;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f23541z;

    static {
        CachePolicy[] d2;
        G = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    CachePolicy(boolean z2, boolean z3) {
        this.f23541z = z2;
        this.f23540A = z3;
    }

    public final boolean f() {
        return this.f23541z;
    }

    public final boolean h() {
        return this.f23540A;
    }
}
