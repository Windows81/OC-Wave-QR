package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class Operations extends OperationsDebugStringFormattable {

    /* renamed from: a  reason: collision with root package name */
    public Operation[] f14989a = new Operation[16];

    /* renamed from: b  reason: collision with root package name */
    public int f14990b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f14991c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int f14992d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f14993e = new Object[16];

    /* renamed from: f  reason: collision with root package name */
    public int f14994f;

    /* renamed from: g  reason: collision with root package name */
    public int f14995g;

    @Metadata
    public final class OpIterator implements OperationArgContainer {

        /* renamed from: a  reason: collision with root package name */
        public int f14996a;

        /* renamed from: b  reason: collision with root package name */
        public int f14997b;

        /* renamed from: c  reason: collision with root package name */
        public int f14998c;

        public OpIterator() {
        }

        public Object a(int i2) {
            return Operations.this.f14993e[this.f14998c + i2];
        }

        public final Operation b() {
            return Operations.this.f14989a[this.f14996a];
        }

        public final boolean c() {
            if (this.f14996a >= Operations.this.f14990b) {
                return false;
            }
            Operation b2 = b();
            this.f14997b += b2.d();
            this.f14998c += b2.f();
            int i2 = this.f14996a + 1;
            this.f14996a = i2;
            return i2 < Operations.this.f14990b;
        }

        public int getInt(int i2) {
            return Operations.this.f14991c[this.f14997b + i2];
        }
    }

    @JvmInline
    @Metadata
    public static final class WriteScope {

        /* renamed from: a  reason: collision with root package name */
        public final Operations f15000a;

        public static Operations a(Operations operations) {
            return operations;
        }

        public static boolean b(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && Intrinsics.d(operations, ((WriteScope) obj).i());
        }

        public static int c(Operations operations) {
            return operations.hashCode();
        }

        public static final void d(Operations operations, int i2, Object obj) {
            operations.f14993e[(operations.f14994f - operations.f14989a[operations.f14990b - 1].f()) + i2] = obj;
        }

        public static final void e(Operations operations, int i2, Object obj, int i3, Object obj2) {
            int f2 = operations.f14994f - operations.f14989a[operations.f14990b - 1].f();
            Object[] objArr = operations.f14993e;
            objArr[i2 + f2] = obj;
            objArr[f2 + i3] = obj2;
        }

        public static final void f(Operations operations, int i2, Object obj, int i3, Object obj2, int i4, Object obj3, int i5, Object obj4) {
            int f2 = operations.f14994f - operations.f14989a[operations.f14990b - 1].f();
            Object[] objArr = operations.f14993e;
            objArr[i2 + f2] = obj;
            objArr[i3 + f2] = obj2;
            objArr[i4 + f2] = obj3;
            objArr[f2 + i5] = obj4;
        }

        public static final void g(Operations operations, int i2, Object obj, int i3, Object obj2, int i4, Object obj3) {
            int f2 = operations.f14994f - operations.f14989a[operations.f14990b - 1].f();
            Object[] objArr = operations.f14993e;
            objArr[i2 + f2] = obj;
            objArr[i3 + f2] = obj2;
            objArr[f2 + i4] = obj3;
        }

        public static String h(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return b(this.f15000a, obj);
        }

        public int hashCode() {
            return c(this.f15000a);
        }

        public final /* synthetic */ Operations i() {
            return this.f15000a;
        }

        public String toString() {
            return h(this.f15000a);
        }
    }

    public final void a() {
        this.f14990b = 0;
        this.f14992d = 0;
        ArraysKt.w(this.f14993e, (Object) null, 0, this.f14994f);
        this.f14994f = 0;
    }

    public final int b(int i2, int i3) {
        return RangesKt.e(i2 + RangesKt.j(i2, 1024), i3);
    }

    public final void c(Operation operation) {
        int i2 = this.f14995g;
        int d2 = operation.d();
        if (i2 == ((d2 == 0 ? 0 : -1) >>> (32 - d2))) {
            operation.f();
        }
    }

    public final void d(Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        if (g()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.b().b(opIterator, applier, slotWriter, rememberManager, operationErrorContext);
            } while (opIterator.c());
        }
        a();
    }

    public final int e() {
        return this.f14990b;
    }

    public final boolean f() {
        return e() == 0;
    }

    public final boolean g() {
        return e() != 0;
    }

    public final void h(Operations operations) {
        Operation[] operationArr = this.f14989a;
        int i2 = this.f14990b - 1;
        this.f14990b = i2;
        Operation operation = operationArr[i2];
        operationArr[i2] = null;
        operations.j(operation);
        Object[] objArr = this.f14993e;
        Object[] objArr2 = operations.f14993e;
        int f2 = operations.f14994f - operation.f();
        int f3 = this.f14994f - operation.f();
        System.arraycopy(objArr, f3, objArr2, f2, this.f14994f - f3);
        ArraysKt.w(this.f14993e, (Object) null, this.f14994f - operation.f(), this.f14994f);
        ArraysKt.j(this.f14991c, operations.f14991c, operations.f14992d - operation.d(), this.f14992d - operation.d(), this.f14992d);
        this.f14994f -= operation.f();
        this.f14992d -= operation.d();
    }

    public final void i(Operation operation) {
        j(operation);
    }

    public final void j(Operation operation) {
        if (this.f14990b == this.f14989a.length) {
            m();
        }
        int d2 = this.f14992d + operation.d();
        int length = this.f14991c.length;
        if (d2 > length) {
            k(length, d2);
        }
        int f2 = this.f14994f + operation.f();
        int length2 = this.f14993e.length;
        if (f2 > length2) {
            l(length2, f2);
        }
        Operation[] operationArr = this.f14989a;
        int i2 = this.f14990b;
        this.f14990b = i2 + 1;
        operationArr[i2] = operation;
        this.f14992d += operation.d();
        this.f14994f += operation.f();
    }

    public final void k(int i2, int i3) {
        int[] iArr = new int[b(i2, i3)];
        ArraysKt.j(this.f14991c, iArr, 0, 0, i2);
        this.f14991c = iArr;
    }

    public final void l(int i2, int i3) {
        Object[] objArr = new Object[b(i2, i3)];
        System.arraycopy(this.f14993e, 0, objArr, 0, i2);
        this.f14993e = objArr;
    }

    public final void m() {
        int j2 = RangesKt.j(this.f14990b, 1024);
        int i2 = this.f14990b;
        Operation[] operationArr = new Operation[(j2 + i2)];
        System.arraycopy(this.f14989a, 0, operationArr, 0, i2);
        this.f14989a = operationArr;
    }

    public String toString() {
        return super.toString();
    }
}
