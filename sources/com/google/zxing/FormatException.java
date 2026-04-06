package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: B  reason: collision with root package name */
    public static final FormatException f32447B;

    static {
        FormatException formatException = new FormatException();
        f32447B = formatException;
        formatException.setStackTrace(ReaderException.f32464A);
    }

    public static FormatException a() {
        return ReaderException.f32465z ? new FormatException() : f32447B;
    }
}
