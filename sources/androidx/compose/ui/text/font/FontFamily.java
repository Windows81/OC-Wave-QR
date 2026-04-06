package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class FontFamily {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f18695A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final SystemFontFamily f18696B = new DefaultFontFamily();
    public static final GenericFontFamily C = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
    public static final GenericFontFamily D = new GenericFontFamily("serif", "FontFamily.Serif");
    public static final GenericFontFamily E = new GenericFontFamily("monospace", "FontFamily.Monospace");
    public static final GenericFontFamily F = new GenericFontFamily("cursive", "FontFamily.Cursive");

    /* renamed from: z  reason: collision with root package name */
    public final boolean f18697z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GenericFontFamily a() {
            return FontFamily.F;
        }

        public final SystemFontFamily b() {
            return FontFamily.f18696B;
        }

        public final GenericFontFamily c() {
            return FontFamily.E;
        }

        public final GenericFontFamily d() {
            return FontFamily.C;
        }

        public final GenericFontFamily e() {
            return FontFamily.D;
        }

        public Companion() {
        }
    }

    @Metadata
    public interface Resolver {
        static /* synthetic */ State b(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    fontFamily = null;
                }
                if ((i4 & 2) != 0) {
                    fontWeight = FontWeight.f18746A.g();
                }
                if ((i4 & 4) != 0) {
                    i2 = FontStyle.f18724b.b();
                }
                if ((i4 & 8) != 0) {
                    i3 = FontSynthesis.f18728b.a();
                }
                return resolver.a(fontFamily, fontWeight, i2, i3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }

        State a(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3);
    }

    public /* synthetic */ FontFamily(boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2);
    }

    public FontFamily(boolean z2) {
        this.f18697z = z2;
    }
}
