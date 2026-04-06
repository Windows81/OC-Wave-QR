package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class CompletedContinuation<R> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41370a;

    /* renamed from: b  reason: collision with root package name */
    public final CancelHandler f41371b;

    /* renamed from: c  reason: collision with root package name */
    public final Function3 f41372c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f41373d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f41374e;

    public CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th) {
        this.f41370a = obj;
        this.f41371b = cancelHandler;
        this.f41372c = function3;
        this.f41373d = obj2;
        this.f41374e = th;
    }

    public static /* synthetic */ CompletedContinuation b(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = completedContinuation.f41370a;
        }
        if ((i2 & 2) != 0) {
            cancelHandler = completedContinuation.f41371b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        if ((i2 & 4) != 0) {
            function3 = completedContinuation.f41372c;
        }
        Function3 function32 = function3;
        if ((i2 & 8) != 0) {
            obj2 = completedContinuation.f41373d;
        }
        Object obj4 = obj2;
        if ((i2 & 16) != 0) {
            th = completedContinuation.f41374e;
        }
        return completedContinuation.a(obj, cancelHandler2, function32, obj4, th);
    }

    public final CompletedContinuation a(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th) {
        return new CompletedContinuation(obj, cancelHandler, function3, obj2, th);
    }

    public final boolean c() {
        return this.f41374e != null;
    }

    public final void d(CancellableContinuationImpl cancellableContinuationImpl, Throwable th) {
        CancelHandler cancelHandler = this.f41371b;
        if (cancelHandler != null) {
            cancellableContinuationImpl.m(cancelHandler, th);
        }
        Function3 function3 = this.f41372c;
        if (function3 != null) {
            cancellableContinuationImpl.n(function3, th, this.f41370a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return Intrinsics.d(this.f41370a, completedContinuation.f41370a) && Intrinsics.d(this.f41371b, completedContinuation.f41371b) && Intrinsics.d(this.f41372c, completedContinuation.f41372c) && Intrinsics.d(this.f41373d, completedContinuation.f41373d) && Intrinsics.d(this.f41374e, completedContinuation.f41374e);
    }

    public int hashCode() {
        Object obj = this.f41370a;
        int i2 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CancelHandler cancelHandler = this.f41371b;
        int hashCode2 = (hashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        Function3 function3 = this.f41372c;
        int hashCode3 = (hashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.f41373d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f41374e;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f41370a + ", cancelHandler=" + this.f41371b + ", onCancellation=" + this.f41372c + ", idempotentResume=" + this.f41373d + ", cancelCause=" + this.f41374e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? null : cancelHandler, (i2 & 4) != 0 ? null : function3, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }
}
