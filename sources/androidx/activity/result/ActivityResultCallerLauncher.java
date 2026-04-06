package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final ActivityResultLauncher f219a;

    /* renamed from: b  reason: collision with root package name */
    public final ActivityResultContract f220b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f221c;

    public void c() {
        this.f219a.c();
    }

    public final ActivityResultContract d() {
        return this.f220b;
    }

    public final Object e() {
        return this.f221c;
    }

    /* renamed from: f */
    public void b(Unit unit, ActivityOptionsCompat activityOptionsCompat) {
        Intrinsics.i(unit, "input");
        this.f219a.b(this.f221c, activityOptionsCompat);
    }
}
