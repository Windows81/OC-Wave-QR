package androidx.savedstate;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SavedStateKt__SavedState_androidKt$savedState$1 implements Function1<SavedStateWriter, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final SavedStateKt__SavedState_androidKt$savedState$1 f22821z = new SavedStateKt__SavedState_androidKt$savedState$1();

    public final void b(Bundle bundle) {
        Intrinsics.i(bundle, "<this>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((SavedStateWriter) obj).J());
        return Unit.f40552a;
    }
}
