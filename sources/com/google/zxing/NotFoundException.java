package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: B  reason: collision with root package name */
    public static final NotFoundException f32453B;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f32453B = notFoundException;
        notFoundException.setStackTrace(ReaderException.f32464A);
    }

    public static NotFoundException a() {
        return f32453B;
    }
}
