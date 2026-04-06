package androidx.activity;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SystemBarStyle$Companion$auto$1 extends Lambda implements Function1<Resources, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final SystemBarStyle$Companion$auto$1 f119z = new SystemBarStyle$Companion$auto$1();

    public SystemBarStyle$Companion$auto$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(Resources resources) {
        Intrinsics.i(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
