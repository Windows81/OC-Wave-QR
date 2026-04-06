package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextForegroundStyle$merge$1 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextForegroundStyle f19105z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextForegroundStyle$merge$1(TextForegroundStyle textForegroundStyle) {
        super(0);
        this.f19105z = textForegroundStyle;
    }

    /* renamed from: b */
    public final Float invoke() {
        return Float.valueOf(this.f19105z.c());
    }
}
