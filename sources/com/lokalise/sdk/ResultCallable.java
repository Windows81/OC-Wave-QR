package com.lokalise.sdk;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ResultCallable implements Callable<Object> {
    private final Function0<Object> func;

    public ResultCallable(Function0<? extends Object> function0) {
        Intrinsics.i(function0, "func");
        this.func = function0;
    }

    public Object call() {
        return this.func.invoke();
    }
}
