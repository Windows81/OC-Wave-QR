package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class CharArrayPoolBase {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f42360a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public int f42361b;

    public final void a(char[] cArr) {
        Intrinsics.i(cArr, "array");
        synchronized (this) {
            try {
                if (this.f42361b + cArr.length < ArrayPoolsKt.f42355a) {
                    this.f42361b += cArr.length;
                    this.f42360a.addLast(cArr);
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] b(int i2) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f42360a.A();
            if (cArr != null) {
                this.f42361b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i2] : cArr;
    }
}
