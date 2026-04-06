package com.hansecom.abt.data.preferences.base;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import kotlin.Metadata;

@Metadata
public final class CacheValueKt {
    public static final boolean c(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        try {
            return localDateTime.isBefore(localDateTime2);
        } catch (NullPointerException unused) {
            return true;
        }
    }

    public static final LocalDateTime d(long j2) {
        try {
            return LocalDateTime.ofEpochSecond(j2, 0, ZoneOffset.UTC);
        } catch (DateTimeException unused) {
            return LocalDateTime.MIN;
        }
    }
}
