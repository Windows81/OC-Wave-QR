package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 extends Lambda implements Function0<TextFieldScrollerPosition> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Orientation f5711z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(Orientation orientation) {
        super(0);
        this.f5711z = orientation;
    }

    /* renamed from: b */
    public final TextFieldScrollerPosition invoke() {
        return new TextFieldScrollerPosition(this.f5711z, 0.0f, 2, (DefaultConstructorMarker) null);
    }
}
