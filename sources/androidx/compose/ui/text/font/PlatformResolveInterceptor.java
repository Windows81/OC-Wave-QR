package androidx.compose.ui.text.font;

import kotlin.Metadata;

@Metadata
public interface PlatformResolveInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f18753a = Companion.f18754a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f18754a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final PlatformResolveInterceptor f18755b = new PlatformResolveInterceptor$Companion$Default$1();

        public final PlatformResolveInterceptor a() {
            return f18755b;
        }
    }

    FontWeight a(FontWeight fontWeight) {
        return fontWeight;
    }

    int b(int i2) {
        return i2;
    }

    int c(int i2) {
        return i2;
    }

    FontFamily d(FontFamily fontFamily) {
        return fontFamily;
    }
}
