package org.slf4j.helpers;

public class FormattingTuple {

    /* renamed from: d  reason: collision with root package name */
    public static FormattingTuple f44108d = new FormattingTuple((String) null);

    /* renamed from: a  reason: collision with root package name */
    public String f44109a;

    /* renamed from: b  reason: collision with root package name */
    public Throwable f44110b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f44111c;

    public FormattingTuple(String str) {
        this(str, (Object[]) null, (Throwable) null);
    }

    public static Object[] a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    public FormattingTuple(String str, Object[] objArr, Throwable th) {
        this.f44109a = str;
        this.f44110b = th;
        if (th == null) {
            this.f44111c = objArr;
        } else {
            this.f44111c = a(objArr);
        }
    }
}
