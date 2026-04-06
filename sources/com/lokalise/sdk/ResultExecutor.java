package com.lokalise.sdk;

import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;

@Metadata
public final class ResultExecutor implements ThreadFactory {
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "Result Executor");
    }
}
