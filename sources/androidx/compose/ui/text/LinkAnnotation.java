package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class LinkAnnotation implements AnnotatedString.Annotation {

    @Metadata
    public static final class Clickable extends LinkAnnotation {

        /* renamed from: a  reason: collision with root package name */
        public final String f18281a;

        /* renamed from: b  reason: collision with root package name */
        public final TextLinkStyles f18282b;

        /* renamed from: c  reason: collision with root package name */
        public final LinkInteractionListener f18283c;

        public Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            super((DefaultConstructorMarker) null);
            this.f18281a = str;
            this.f18282b = textLinkStyles;
            this.f18283c = linkInteractionListener;
        }

        public static /* synthetic */ Clickable d(Clickable clickable, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = clickable.f18281a;
            }
            if ((i2 & 2) != 0) {
                textLinkStyles = clickable.b();
            }
            if ((i2 & 4) != 0) {
                linkInteractionListener = clickable.a();
            }
            return clickable.c(str, textLinkStyles, linkInteractionListener);
        }

        public LinkInteractionListener a() {
            return this.f18283c;
        }

        public TextLinkStyles b() {
            return this.f18282b;
        }

        public final Clickable c(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            return new Clickable(str, textLinkStyles, linkInteractionListener);
        }

        public final String e() {
            return this.f18281a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            return Intrinsics.d(this.f18281a, clickable.f18281a) && Intrinsics.d(b(), clickable.b()) && Intrinsics.d(a(), clickable.a());
        }

        public int hashCode() {
            int hashCode = this.f18281a.hashCode() * 31;
            TextLinkStyles b2 = b();
            int i2 = 0;
            int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
            LinkInteractionListener a2 = a();
            if (a2 != null) {
                i2 = a2.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f18281a + ')';
        }
    }

    @Metadata
    public static final class Url extends LinkAnnotation {

        /* renamed from: a  reason: collision with root package name */
        public final String f18284a;

        /* renamed from: b  reason: collision with root package name */
        public final TextLinkStyles f18285b;

        /* renamed from: c  reason: collision with root package name */
        public final LinkInteractionListener f18286c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : textLinkStyles, (i2 & 4) != 0 ? null : linkInteractionListener);
        }

        public static /* synthetic */ Url d(Url url, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = url.f18284a;
            }
            if ((i2 & 2) != 0) {
                textLinkStyles = url.b();
            }
            if ((i2 & 4) != 0) {
                linkInteractionListener = url.a();
            }
            return url.c(str, textLinkStyles, linkInteractionListener);
        }

        public LinkInteractionListener a() {
            return this.f18286c;
        }

        public TextLinkStyles b() {
            return this.f18285b;
        }

        public final Url c(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            return new Url(str, textLinkStyles, linkInteractionListener);
        }

        public final String e() {
            return this.f18284a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return Intrinsics.d(this.f18284a, url.f18284a) && Intrinsics.d(b(), url.b()) && Intrinsics.d(a(), url.a());
        }

        public int hashCode() {
            int hashCode = this.f18284a.hashCode() * 31;
            TextLinkStyles b2 = b();
            int i2 = 0;
            int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
            LinkInteractionListener a2 = a();
            if (a2 != null) {
                i2 = a2.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f18284a + ')';
        }

        public Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            super((DefaultConstructorMarker) null);
            this.f18284a = str;
            this.f18285b = textLinkStyles;
            this.f18286c = linkInteractionListener;
        }
    }

    public /* synthetic */ LinkAnnotation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract LinkInteractionListener a();

    public abstract TextLinkStyles b();

    public LinkAnnotation() {
    }
}
