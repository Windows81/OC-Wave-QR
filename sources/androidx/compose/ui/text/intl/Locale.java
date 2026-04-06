package androidx.compose.ui.text.intl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Locale {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18939b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final java.util.Locale f18940a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Locale a() {
            return PlatformLocaleKt.a().b().h(0);
        }

        public Companion() {
        }
    }

    public Locale(java.util.Locale locale) {
        this.f18940a = locale;
    }

    public final java.util.Locale a() {
        return this.f18940a;
    }

    public final String b() {
        return PlatformLocale_jvmKt.a(this.f18940a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.d(b(), ((Locale) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    public Locale(String str) {
        this(PlatformLocaleKt.a().a(str));
    }
}
