package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
final class GroupInfo {

    /* renamed from: a  reason: collision with root package name */
    public int f14663a;

    /* renamed from: b  reason: collision with root package name */
    public int f14664b;

    /* renamed from: c  reason: collision with root package name */
    public int f14665c;

    public GroupInfo(int i2, int i3, int i4) {
        this.f14663a = i2;
        this.f14664b = i3;
        this.f14665c = i4;
    }

    public final int a() {
        return this.f14665c;
    }

    public final int b() {
        return this.f14664b;
    }

    public final int c() {
        return this.f14663a;
    }

    public final void d(int i2) {
        this.f14665c = i2;
    }

    public final void e(int i2) {
        this.f14664b = i2;
    }

    public final void f(int i2) {
        this.f14663a = i2;
    }
}
