package com.google.common.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

@ElementTypesAreNonnullByDefault
public final class PatternFilenameFilter implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f29029a;

    public boolean accept(File file, String str) {
        return this.f29029a.matcher(str).matches();
    }
}
