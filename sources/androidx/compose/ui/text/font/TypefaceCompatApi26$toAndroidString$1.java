package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TypefaceCompatApi26$toAndroidString$1 extends Lambda implements Function1<FontVariation.Setting, CharSequence> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f18764z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypefaceCompatApi26$toAndroidString$1(Density density) {
        super(1);
        this.f18764z = density;
    }

    /* renamed from: b */
    public final CharSequence invoke(FontVariation.Setting setting) {
        return '\'' + setting.c() + "' " + setting.b(this.f18764z);
    }
}
