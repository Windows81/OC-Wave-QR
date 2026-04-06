package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt", f = "TimePicker.kt", l = {920, 923}, m = "onTap-uYHVD98")
public final class TimePickerKt$onTap$1 extends ContinuationImpl {
    public Object C;
    public boolean D;
    public /* synthetic */ Object E;
    public int F;

    public TimePickerKt$onTap$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return TimePickerKt.D0((AnalogTimePickerState) null, 0.0f, 0.0f, 0.0f, false, 0, (AnimationSpec) null, this);
    }
}
