package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModalBottomSheetState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, ModalBottomSheetState, ModalBottomSheetValue> {

    /* renamed from: z  reason: collision with root package name */
    public static final ModalBottomSheetState$Companion$Saver$1 f8029z = new ModalBottomSheetState$Companion$Saver$1();

    public ModalBottomSheetState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final ModalBottomSheetValue m(SaverScope saverScope, ModalBottomSheetState modalBottomSheetState) {
        return modalBottomSheetState.e();
    }
}
