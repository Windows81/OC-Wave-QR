package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomDrawerState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, BottomDrawerState, BottomDrawerValue> {

    /* renamed from: z  reason: collision with root package name */
    public static final BottomDrawerState$Companion$Saver$1 f7307z = new BottomDrawerState$Companion$Saver$1();

    public BottomDrawerState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final BottomDrawerValue m(SaverScope saverScope, BottomDrawerState bottomDrawerState) {
        return (BottomDrawerValue) bottomDrawerState.c().s();
    }
}
