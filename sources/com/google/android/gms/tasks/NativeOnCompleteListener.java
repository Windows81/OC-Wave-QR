package com.google.android.gms.tasks;

public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final long f27182z;

    public void a(Task task) {
        String str;
        Object obj;
        Exception j2;
        if (task.n()) {
            obj = task.k();
            str = null;
        } else if (task.l() || (j2 = task.j()) == null) {
            obj = null;
            str = null;
        } else {
            str = j2.getMessage();
            obj = null;
        }
        nativeOnComplete(this.f27182z, obj, task.n(), task.l(), str);
    }

    public native void nativeOnComplete(long j2, Object obj, boolean z2, boolean z3, String str);
}
