package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class ExposedDropdownMenuAnchorType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f9935b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f9936c = e("PrimaryNotEditable");

    /* renamed from: d  reason: collision with root package name */
    public static final String f9937d = e("PrimaryEditable");

    /* renamed from: e  reason: collision with root package name */
    public static final String f9938e = e("SecondaryEditable");

    /* renamed from: a  reason: collision with root package name */
    public final String f9939a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return ExposedDropdownMenuAnchorType.f9937d;
        }

        public final String b() {
            return ExposedDropdownMenuAnchorType.f9936c;
        }

        public final String c() {
            return ExposedDropdownMenuAnchorType.f9938e;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ExposedDropdownMenuAnchorType(String str) {
        this.f9939a = str;
    }

    public static final /* synthetic */ ExposedDropdownMenuAnchorType d(String str) {
        return new ExposedDropdownMenuAnchorType(str);
    }

    public static String e(String str) {
        return str;
    }

    public static boolean f(String str, Object obj) {
        return (obj instanceof ExposedDropdownMenuAnchorType) && Intrinsics.d(str, ((ExposedDropdownMenuAnchorType) obj).j());
    }

    public static final boolean g(String str, String str2) {
        return Intrinsics.d(str, str2);
    }

    public static int h(String str) {
        return str.hashCode();
    }

    public static String i(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return f(this.f9939a, obj);
    }

    public int hashCode() {
        return h(this.f9939a);
    }

    public final /* synthetic */ String j() {
        return this.f9939a;
    }

    public String toString() {
        return i(this.f9939a);
    }
}
