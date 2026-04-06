package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomSheetState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, BottomSheetState, BottomSheetValue> {

    /* renamed from: z  reason: collision with root package name */
    public static final BottomSheetState$Companion$Saver$1 f7413z = new BottomSheetState$Companion$Saver$1();

    public BottomSheetState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final BottomSheetValue m(SaverScope saverScope, BottomSheetState bottomSheetState) {
        return (BottomSheetValue) bottomSheetState.c().s();
    }
}
