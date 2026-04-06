package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {

    /* renamed from: a  reason: collision with root package name */
    public final int f15723a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15724b;

    public /* synthetic */ CancelIndicatingFocusBoundaryScope(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public int a() {
        return this.f15723a;
    }

    public void b() {
        this.f15724b = true;
    }

    public final boolean c() {
        return this.f15724b;
    }

    public CancelIndicatingFocusBoundaryScope(int i2) {
        this.f15723a = i2;
    }
}
