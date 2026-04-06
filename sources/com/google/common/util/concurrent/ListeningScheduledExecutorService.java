package com.google.common.util.concurrent;

import java.util.concurrent.ScheduledExecutorService;

@ElementTypesAreNonnullByDefault
public interface ListeningScheduledExecutorService extends ScheduledExecutorService, ListeningExecutorService {
}
