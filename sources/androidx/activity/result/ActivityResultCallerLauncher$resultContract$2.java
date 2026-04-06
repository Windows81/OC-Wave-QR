package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class ActivityResultCallerLauncher$resultContract$2 extends Lambda implements Function0<AnonymousClass1> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ActivityResultCallerLauncher f222z;

    /* renamed from: b */
    public final AnonymousClass1 invoke() {
        final ActivityResultCallerLauncher activityResultCallerLauncher = this.f222z;
        return new ActivityResultContract<Unit, Object>() {
            public Object c(int i2, Intent intent) {
                return activityResultCallerLauncher.d().c(i2, intent);
            }

            /* renamed from: d */
            public Intent a(Context context, Unit unit) {
                Intrinsics.i(context, "context");
                Intrinsics.i(unit, "input");
                return activityResultCallerLauncher.d().a(context, activityResultCallerLauncher.e());
            }
        };
    }
}
