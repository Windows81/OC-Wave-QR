package com.lokalise.sdk.utils;

import android.util.Log;
import com.lokalise.sdk.Lokalise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Logger {
    public static final Logger INSTANCE = new Logger();
    private static final String NAME = "LokaliseLogs";

    private Logger() {
    }

    public final void printDebug(LogType logType, String str) {
        Intrinsics.i(logType, "type");
        Intrinsics.i(str, "msg");
    }

    public final void printError(LogType logType, String str) {
        Intrinsics.i(logType, "type");
        Intrinsics.i(str, "msg");
        if (Lokalise.logsEnabled) {
            String name = logType.name();
            Log.e(NAME, name + "   |   " + str);
        }
    }

    public final void printInfo(LogType logType, String str) {
        Intrinsics.i(logType, "type");
        Intrinsics.i(str, "msg");
        if (Lokalise.logsEnabled) {
            String name = logType.name();
            Log.i(NAME, name + "   |   " + str);
        }
    }
}
