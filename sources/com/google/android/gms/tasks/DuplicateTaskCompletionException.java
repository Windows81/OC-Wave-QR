package com.google.android.gms.tasks;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(Task task) {
        if (!task.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception j2 = task.j();
        return new DuplicateTaskCompletionException("Complete with: ".concat(j2 != null ? "failure" : task.n() ? "result ".concat(String.valueOf(task.k())) : task.l() ? "cancellation" : "unknown issue"), j2);
    }
}
