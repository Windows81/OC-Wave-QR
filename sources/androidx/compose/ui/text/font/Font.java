package androidx.compose.ui.text.font;

import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
public interface Font {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f18693a = Companion.f18694a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f18694a = new Companion();
    }

    @Metadata
    @Deprecated
    public interface ResourceLoader {
        Object a(Font font);
    }

    FontWeight a();

    int b() {
        return FontLoadingStrategy.f18719b.b();
    }

    int c();
}
