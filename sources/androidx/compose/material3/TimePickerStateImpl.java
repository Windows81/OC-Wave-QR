package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class TimePickerStateImpl implements TimePickerState {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f11525e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public boolean f11526a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f11527b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableIntState f11528c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableIntState f11529d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public void a(int i2) {
        this.f11528c.k(i2);
    }

    public void b(int i2) {
        this.f11529d.k(i2);
    }

    public int c() {
        return this.f11529d.e();
    }

    public void d(int i2) {
        this.f11527b.setValue(TimePickerSelectionMode.c(i2));
    }

    public int e() {
        return ((TimePickerSelectionMode) this.f11527b.getValue()).i();
    }

    public boolean f() {
        return this.f11526a;
    }

    public int g() {
        return this.f11528c.e();
    }
}
