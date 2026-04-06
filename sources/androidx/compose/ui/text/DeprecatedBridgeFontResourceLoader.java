package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18267b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static Map f18268c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final SynchronizedObject f18269d = new SynchronizedObject();

    /* renamed from: a  reason: collision with root package name */
    public final FontFamily.Resolver f18270a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public Object a(Font font) {
        return FontFamily.Resolver.b(this.f18270a, FontKt.c(font), font.a(), font.c(), 0, 8, (Object) null).getValue();
    }
}
