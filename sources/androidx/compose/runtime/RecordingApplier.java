package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RecordingApplier<N> implements Applier<N> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f14824d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f14825e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntList f14826a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableObjectList f14827b;

    /* renamed from: c  reason: collision with root package name */
    public Object f14828c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public void a(int i2, int i3) {
        this.f14826a.k(2);
        this.f14826a.k(i2);
        this.f14826a.k(i3);
    }

    public Object b() {
        return this.f14828c;
    }

    public void c(int i2, Object obj) {
        this.f14826a.k(5);
        this.f14826a.k(i2);
        this.f14827b.n(obj);
    }

    public void clear() {
        this.f14826a.k(4);
    }

    public void d(Object obj) {
        this.f14826a.k(1);
        this.f14827b.n(obj);
    }

    public void e() {
        this.f14826a.k(8);
    }

    public void g(int i2, int i3, int i4) {
        this.f14826a.k(3);
        this.f14826a.k(i2);
        this.f14826a.k(i3);
        this.f14826a.k(i4);
    }

    public void h() {
        this.f14826a.k(0);
    }

    public void i(Function2 function2, Object obj) {
        this.f14826a.k(7);
        this.f14827b.n(function2);
        this.f14827b.n(obj);
    }

    public void j(int i2, Object obj) {
        this.f14826a.k(6);
        this.f14826a.k(i2);
        this.f14827b.n(obj);
    }
}
