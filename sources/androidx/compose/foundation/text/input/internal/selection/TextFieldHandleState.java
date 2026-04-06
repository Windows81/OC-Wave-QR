package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextFieldHandleState {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f6437f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final TextFieldHandleState f6438g = new TextFieldHandleState(false, Offset.f15855b.b(), 0.0f, ResolvedTextDirection.Ltr, false, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6439a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6440b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6441c;

    /* renamed from: d  reason: collision with root package name */
    public final ResolvedTextDirection f6442d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6443e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextFieldHandleState a() {
            return TextFieldHandleState.f6438g;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextFieldHandleState(boolean z2, long j2, float f2, ResolvedTextDirection resolvedTextDirection, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, j2, f2, resolvedTextDirection, z3);
    }

    public final ResolvedTextDirection b() {
        return this.f6442d;
    }

    public final boolean c() {
        return this.f6443e;
    }

    public final float d() {
        return this.f6441c;
    }

    public final long e() {
        return this.f6440b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.f6439a == textFieldHandleState.f6439a && Offset.j(this.f6440b, textFieldHandleState.f6440b) && Float.compare(this.f6441c, textFieldHandleState.f6441c) == 0 && this.f6442d == textFieldHandleState.f6442d && this.f6443e == textFieldHandleState.f6443e;
    }

    public final boolean f() {
        return this.f6439a;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f6439a) * 31) + Offset.o(this.f6440b)) * 31) + Float.hashCode(this.f6441c)) * 31) + this.f6442d.hashCode()) * 31) + Boolean.hashCode(this.f6443e);
    }

    public String toString() {
        return "TextFieldHandleState(visible=" + this.f6439a + ", position=" + Offset.s(this.f6440b) + ", lineHeight=" + this.f6441c + ", direction=" + this.f6442d + ", handlesCrossed=" + this.f6443e + ')';
    }

    public TextFieldHandleState(boolean z2, long j2, float f2, ResolvedTextDirection resolvedTextDirection, boolean z3) {
        this.f6439a = z2;
        this.f6440b = j2;
        this.f6441c = f2;
        this.f6442d = resolvedTextDirection;
        this.f6443e = z3;
    }
}
